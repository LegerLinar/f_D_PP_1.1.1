package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static String USER = "root";
    private static final String PASSWORD = "кщще";
    private static Connection conn;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Не удалось загрузить драйвер JDBC", e);
        }

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection created");
        } catch (SQLException e) {
            e.getMessage();
        }
    }



    public static Connection getConnection() {
        return conn;
    }
    // реализуйте настройку соединения с БД
}
