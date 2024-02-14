package com.prueba.trivia;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionPrueba {
    // Declarar las credenciales de la base de datos
    static Dotenv dotenv = Dotenv.load();
    static final String DB_URL = dotenv.get("MY_ENV_DB_URL");
    static final String USER = dotenv.get("MY_EVV_USER");
    static final String PASS = dotenv.get("MY_EVV_PASS");

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Paso 1: Registrar el controlador JDBC
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Paso 2: Abrir una conexión
            System.out.println("Conectándose a la base de datos...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Paso 3: Crear un statement
            stmt = conn.createStatement();

            // Paso 4: Ejecutar la consulta
            String sql = "SELECT * FROM regions";
            ResultSet rs = stmt.executeQuery(sql);

            // Paso 5: Procesar los resultados
            while (rs.next()) {
                // Obtener datos por columna
                int id = rs.getInt("REGION_ID");
                String nombre = rs.getString("REGION_NAME");
                // Imprimir resultados
                System.out.println("REGION_ID: " + id + ", REGION_NAME: " + nombre);
            }

            // Paso 6: Cerrar recursos
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Errores de JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Errores generales
            e.printStackTrace();
        } finally {
            // Cerrar recursos en un bloque finally
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("¡Adiós!");
    }
}
