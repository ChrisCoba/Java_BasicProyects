/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author juans
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/BancoPinasur";
    private static final String USER = "postgres"; // Usuario default de PostgreSQL
    private static final String PASSWORD = "20213123Juan"; // Contraseña que mencionaste

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


