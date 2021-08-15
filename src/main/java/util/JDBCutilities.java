package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutilities {
    
    private final static String UBICACION_BD = "C:/Users/Yinet/Downloads/ProyectosConstruccion.db";
    //private final static String UBICACION_BD = "ProyectosConstruccion.db";
    
    public static Connection getConnection() throws SQLException{
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }

}