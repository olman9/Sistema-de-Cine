package Modelo;

import Modelo.usuario;
import Modelo.usuarioDAO;

public class usuarioinicial {

    public static void main(String[] args) {
        usuarioDAO dao = new usuarioDAO();

        // Creamos un objeto Usuario para el administrador
        usuario adminUser = new usuario();
        adminUser.setUsername("venta");
        adminUser.setRol("admin");

        String password = "1234"; // Contraseña en texto plano

        // Llamamos al método para agregar el usuario. 
        // Este método se encarga de encriptar la contraseña.
        if (dao.agregarUsuario(adminUser, password)) {
            System.out.println("Usuario 'admin' creado con éxito.");
        } else {
            System.out.println("Error al crear el usuario. Verifique la conexión a la base de datos.");
        }
    }
}
