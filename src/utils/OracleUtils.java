package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alejandro Escobedo
 */
public class OracleUtils {
    
    private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final  String usuario ="labs";
    private static final String contrasena = "abcd1234";
    private static Connection con;
    private static Statement st;
    private static String query = null;
    
    
    
    /**
     * Metodo que conecta a la base de datos con la aplicacion.
     * @return conexion a la base de datos para poder interactuar con ella
     */
    public static Connection getDBConexion(){
        try {
            con= DriverManager.getConnection(url,usuario,contrasena);
        } catch (SQLException ex) {
            con = null;
        }
        return con;
    }
}
