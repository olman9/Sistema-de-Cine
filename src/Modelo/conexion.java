/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;

/**
 *
 * @author jr245
 */
public class conexion {
    
    static String url = "jdbc:mysql://localhost:3306/cine";
    static String user="cineapp";
    static String pass="furiosoHN123";
    
    public static Connection conectar(){
        Connection con = null;
        try{
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion exitosa");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    
}
