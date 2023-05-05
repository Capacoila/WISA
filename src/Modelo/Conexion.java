package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            //String myBD = "jdbc:mysql://localhost:3306/bdwisa?serverTimezone=UTC";
           
            // con = DriverManager.getConnection(myBD, "root", "");
            
            con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10616052","sql10616052","cvQfMKy4dF");
            return con;
             
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
