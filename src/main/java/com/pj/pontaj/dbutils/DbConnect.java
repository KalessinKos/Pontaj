package com.pj.pontaj.dbutils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pontapp", "root", "admin");
            return con;
        } catch (Exception ex) {
            System.out.println("Database.getConnection() Error -->"
                    + ex.getMessage());
            ex.printStackTrace();
            return null;
        }
    }

    public static void close(Connection con) {
        try {
            con.close();
        } catch (Exception ex) {
            System.out.println("Database.close() Error -->"
                    + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
