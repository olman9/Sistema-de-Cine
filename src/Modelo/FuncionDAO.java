package Modelo;

import java.sql.*;
import java.util.*;
import vista.Panel_funciones;
public class FuncionDAO {

    // Método para abrir conexión usando tu clase conexion
    private Connection abrirConexion() {
        return new conexion().conectar();
    }

    // Listar todas las funciones
    public List<Funcion> listar() {
        List<Funcion> lista = new ArrayList<>();
        String sql = "SELECT * FROM funciones";

        try (Connection con = abrirConexion();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Funcion f = new Funcion(
                    rs.getInt("funcion_id"),
                    rs.getTimestamp("fecha_hora"), // DATETIME de MySQL
                    rs.getInt("sala_id"),
                    rs.getInt("pelicula_id")
                );
                lista.add(f);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar funciones: " + e.getMessage());
        }
        return lista;
    }

    // Agregar una nueva función
    public boolean agregar(Funcion f) {
        String sql = "INSERT INTO funciones (fecha_hora, sala_id, pelicula_id) VALUES (?, ?, ?)";

        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setTimestamp(1, new java.sql.Timestamp(f.getFechaHora().getTime()));
            stmt.setInt(2, f.getSala_id());
            stmt.setInt(3, f.getPelicula_id());

            int filas = stmt.executeUpdate();

            if (filas > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        f.setFuncion_id(rs.getInt(1)); // ID autogenerado
                    }
                }
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al agregar función: " + e.getMessage());
        }
        return false;
    }

    // Eliminar función
    public boolean eliminar(int id) {
        String sql = "DELETE FROM funciones WHERE funcion_id = ?";

        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar función: " + e.getMessage());
            return false;
        }
    }

    // Editar función
    public boolean editar(Funcion f) {
        String sql = "UPDATE funciones SET fecha_hora = ?, sala_id = ?, pelicula_id = ? WHERE funcion_id = ?";

        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setTimestamp(1, new java.sql.Timestamp(f.getFechaHora().getTime()));
            stmt.setInt(2, f.getSala_id());
            stmt.setInt(3, f.getPelicula_id());
            stmt.setInt(4, f.getFuncion_id());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al editar función: " + e.getMessage());
            return false;
        }
    }

    // Método para refrescar tabla en Panel_funciones
    public void cargarTablaEn(Panel_funciones panel) {
        List<Funcion> funciones = listar();
        panel.setTablaFunciones(funciones);
    }
}
