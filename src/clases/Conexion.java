package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    static Connection conexion;   
    
    public Connection getConexion(){
        return conexion;
    }
    
    public boolean crearConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //CONEXION ESTANDAR - JASON//
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cpl","root","");
            //CONEXION SEBA//
            //conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.36:3306/BG","ratsata","toor");
            //conexion = DriverManager.getConnection("jdbc:mysql://defweb.ddns.net:3306/BG","ratsata","toor");
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean ejecutarSQL(String sql){
        try {
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
       return true;
    }

    public ResultSet ejecutarSQLSelect(String sql){
        ResultSet resultado;
        try {
            Statement sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return resultado;
    }
    public boolean cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}
