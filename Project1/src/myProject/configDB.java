package myProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class configDB {
    private static Connection mysqlConfig;
    
    public static Connection koneksi(){
        try{
            String url = "jdbc:mysql://localhost:/pemrograman_2";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlConfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e){
            System.err.println("gagal koneksi "+e.getMessage());
        }
        return mysqlConfig;
    }
}
