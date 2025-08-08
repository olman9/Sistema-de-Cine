package Modelo;

import org.mindrot.jbcrypt.BCrypt;
import java.sql.*;

public class usuarioDAO {
    // Método de conexión (asume que ya lo tienes)
    private Connection abrirConexion() {
        return new conexion().conectar();
    }

    /**
     * Valida las credenciales de un usuario.
     * @param username El nombre de usuario.
     * @param password La contraseña en texto plano.
     * @return Un objeto Usuario si el login es exitoso, o null si falla.
     */
    public usuario validarLogin(String username, String password) {
        // La consulta solo busca el usuario por su nombre
        String sql = "SELECT id, username, password_hash, rol FROM usuarios WHERE username = ?";
        usuario usuario = null;

        try (Connection con = abrirConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String storedHash = rs.getString("password_hash");
                    // Usa BCrypt.checkpw() para comparar la contraseña en texto plano con el hash almacenado
                    if (BCrypt.checkpw(password, storedHash)) {
                        usuario = new usuario();
                        usuario.setId(rs.getInt("id"));
                        usuario.setUsername(rs.getString("username"));
                        usuario.setRol(rs.getString("rol"));
                        // No guardamos la contraseña en el objeto, solo el hash
                        usuario.setPassword_hash(storedHash); 
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al validar el login: " + e.getMessage());
        }
        return usuario;
    }

    /**
     * Método para insertar un nuevo usuario con la contraseña encriptada.
     * @param usuario El objeto Usuario a guardar.
     * @param password La contraseña en texto plano para encriptar.
     * @return true si se agregó con éxito, false en caso contrario.
     */
    public boolean agregarUsuario(usuario usuario, String password) {
        String sql = "INSERT INTO usuarios (username, password_hash, rol) VALUES (?, ?, ?)";
        // Encriptar la contraseña antes de guardarla
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        try (Connection con = abrirConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, usuario.getUsername());
            ps.setString(2, hashedPassword);
            ps.setString(3, usuario.getRol());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al agregar usuario: " + e.getMessage());
            return false;
        }
    }

    
}