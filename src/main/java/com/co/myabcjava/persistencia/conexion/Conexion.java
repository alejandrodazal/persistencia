package com.co.myabcjava.persistencia.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/PERSISTENCIA","root", "PfLwLvUzYu");
            if(connection != null){
                System.out.println("Conexión Exitosa");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
