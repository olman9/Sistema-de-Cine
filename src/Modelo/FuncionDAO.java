package Modelo;

import java.sql.*;
import java.util.*;
import vista.Panel_funciones;

public class FuncionDAO {

    private Connection abrirConexion() {
        return new conexion().conectar();
    }

    // Listar funciones
    public List<Funcion> listar() {
        List<Funcion> lista = new ArrayList<>();
        String sql = "SELECT f.funcion_id, f.fecha_hora, f.sala_id, f.pelicula_id, f.precio_base, p.titulo " +
                     "FROM funciones f " +
                     "JOIN peliculas p ON f.pelicula_id = p.pelicula_id";

        try (Connection con = abrirConexion();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Funcion f = new Funcion(
                    rs.getInt("funcion_id"),
                    rs.getString("fecha_hora"),
                    rs.getInt("sala_id"),
                    rs.getInt("pelicula_id")
                );
                f.setPrecio_base(rs.getFloat("precio_base"));
                f.setTituloPelicula(rs.getString("titulo"));  // Agregas el título
                lista.add(f);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar funciones: " + e.getMessage());
        }
        return lista;
    }

    // Agregar función
    public boolean agregar(Funcion f) {
        String sql = "INSERT INTO funciones (fecha_hora, sala_id, pelicula_id, precio_base) VALUES (?, ?, ?, ?)";

        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, f.getFecha_hora());
            stmt.setInt(2, f.getSala_id());
            stmt.setInt(3, f.getPelicula_id());
            stmt.setFloat(4, f.getPrecio_base());

            int filas = stmt.executeUpdate();

            if (filas > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        f.setFuncion_id(rs.getInt(1));
                    }
                }
                return true;
            }

        } catch (SQLException e) {
            System.out.println("Error al agregar función: " + e.getMessage());
        }
        return false;
    }

    // Editar función
    public boolean editar(Funcion f) {
        String sql = "UPDATE funciones SET fecha_hora = ?, sala_id = ?, pelicula_id = ?, precio_base = ? WHERE funcion_id = ?";

        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, f.getFecha_hora());
            stmt.setInt(2, f.getSala_id());
            stmt.setInt(3, f.getPelicula_id());
            stmt.setFloat(4, f.getPrecio_base());
            stmt.setInt(5, f.getFuncion_id());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al editar función: " + e.getMessage());
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
        }
        return false;
    }

    // Método para actualizar tabla en interfaz
    public void cargarTablaEn(Panel_funciones panel) {
        List<Funcion> funciones = listar();
        panel.setTablaFunciones(funciones);
    }
}
