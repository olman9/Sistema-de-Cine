package Modelo;

import java.sql.*;
import java.util.*;
import vista.Panel_Clientes;

public class ClienteDAO {
    private Connection con;

    public ClienteDAO() {
        con = new conexion().conectar();
    }

    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM clientes";

        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Cliente c = new Cliente(
                    rs.getInt("clientes_id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("email"),
                    rs.getString("telefono")
                );
                lista.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        }

        return lista;
    }

    public void cargarTablaEn(Panel_Clientes panel) {
        List<Cliente> clientes = listar();
        panel.setTablaClientes(clientes);
    }
}
