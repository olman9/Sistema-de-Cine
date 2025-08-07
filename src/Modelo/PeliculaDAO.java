package Modelo;

import java.sql.*;
import java.util.*;

public class PeliculaDAO {

    // Método para abrir conexión (puedes modificar según tu clase conexion)
    private Connection abrirConexion() {
        return new conexion().conectar();
    }

    public List<Pelicula> listar() {
        List<Pelicula> lista = new ArrayList<>();
        String sql = "SELECT * FROM peliculas";

        try (Connection con = abrirConexion();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Pelicula p = new Pelicula(
                    rs.getInt("pelicula_id"),
                    rs.getString("titulo"),
                    rs.getInt("duracion"),
                    rs.getString("clasificacion")
                );
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar películas: " + e.getMessage());
        }

        return lista;
    }

    public boolean agregar(Pelicula p) {
        String sql = "INSERT INTO peliculas (titulo, duracion, clasificacion) VALUES (?, ?, ?)";

        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, p.getTitulo());
            stmt.setInt(2, p.getDuracion());
            stmt.setString(3, p.getClasificacion());

            int filas = stmt.executeUpdate();

            if (filas > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        p.setPelicula_id(rs.getInt(1));  // Asignar id generado
                    }
                }
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error al agregar: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int id) {
        String sql = "DELETE FROM peliculas WHERE pelicula_id = ?";

        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return false;
        }
    }

    public boolean editar(Pelicula p) {
        String sql = "UPDATE peliculas SET titulo = ?, duracion = ?, clasificacion = ? WHERE pelicula_id = ?";

        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, p.getTitulo());
            stmt.setInt(2, p.getDuracion());
            stmt.setString(3, p.getClasificacion());
            stmt.setInt(4, p.getPelicula_id());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al editar: " + e.getMessage());
            return false;
        }
    }

    // Método para cargar tabla desde el DAO
    public void cargarTablaEn(vista.Panel_Peliculas panel) {
        List<Pelicula> peliculas = listar();
        panel.setTablaPeliculas(peliculas);
    }
}
