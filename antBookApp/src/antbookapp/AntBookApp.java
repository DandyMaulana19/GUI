/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antbookapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ACER
 */
public class AntBookApp {

    public class koneksi{
        private static Connection conn;
        private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
        private static final String DB_NAME = "db_desktop";
        private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/" + DB_NAME;
        private static final String DB_UserName = "root";
        private static final String DB_PASS = "";
        
        public static Connection bukuKoneksi(){
            if(conn == null){
                try{
                    Class.forName(DB_DRIVER);
                    conn = DriverManager.getConnection(DB_URL, DB_UserName, DB_PASS);
                } catch (ClassNotFoundException e) {
                    System.err.format("Class not found");
                } catch (SQLException e){
                    System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
            return conn;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

