package Modelo;

import java.sql.*;
import java.util.*;

public class BoletoDAO {

    private Connection abrirConexion() {
        return new conexion().conectar();
    }

    // Listar todos los boletos
    public List<Boleto> listar() {
        List<Boleto> lista = new ArrayList<>();
        String sql = "SELECT boleto_id, asientos, compra_id, promocion_id, precio_final, funcion_id FROM boletos";

        try (Connection con = abrirConexion();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Boleto b = new Boleto(
                    rs.getInt("boleto_id"),
                    rs.getString("asientos"),
                    rs.getInt("compra_id"),
                    rs.getInt("promocion_id"),
                    rs.getDouble("precio_final"),
                    rs.getInt("funcion_id")
                );
                lista.add(b);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar boletos: " + e.getMessage());
        }
        return lista;
    }

    // Agregar boleto
    public boolean agregar(Boleto b) {
        String sql = "INSERT INTO boletos (asientos, compra_id, promocion_id, precio_final, funcion_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, b.getAsientos());
            stmt.setInt(2, b.getCompra_id());
            stmt.setInt(3, b.getPromocion_id());
            stmt.setDouble(4, b.getPrecio_final());
            stmt.setInt(5, b.getFuncion_id());

            int filas = stmt.executeUpdate();
            if (filas > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        b.setBoleto_id(rs.getInt(1));
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar boleto: " + e.getMessage());
        }
        return false;
    }

    // Editar boleto
    public boolean editar(Boleto b) {
        String sql = "UPDATE boletos SET asientos = ?, compra_id = ?, promocion_id = ?, precio_final = ?, funcion_id = ? WHERE boleto_id = ?";
        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, b.getAsientos());
            stmt.setInt(2, b.getCompra_id());
            stmt.setInt(3, b.getPromocion_id());
            stmt.setDouble(4, b.getPrecio_final());
            stmt.setInt(5, b.getFuncion_id());
            stmt.setInt(6, b.getBoleto_id());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al editar boleto: " + e.getMessage());
        }
        return false;
    }

    // Eliminar boleto
    public boolean eliminar(int id) {
        String sql = "DELETE FROM boletos WHERE boleto_id = ?";
        try (Connection con = abrirConexion();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al eliminar boleto: " + e.getMessage());
        }
        return false;
    }
}
