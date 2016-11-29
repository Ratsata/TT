package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    static Connection conexion;
    private String [][] matrizConexiones ={{"jdbc:mysql://localhost:3306/cpl","root",""},//CONEXION ESTANDAR - JASON//
                                           {"jdbc:mysql://192.168.1.36:3306/BG","ratsata","toor"},//CONEXION SEBA//
                                           {"jdbc:mysql://defweb.ddns.net:3306/BG","ratsata","toor"}};//CONEXION SEBA//
    public Connection getConexion(){
        return conexion;
    }
    
    
    //Sistema Directo//
    public boolean crearConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Conexion JASON
            //conexion = DriverManager.getConnection(matrizConexiones[0][0], matrizConexiones[0][1], matrizConexiones[0][2]);

            //Conexion SEBA
            //conexion = DriverManager.getConnection(matrizConexiones[1][0], matrizConexiones[1][1], matrizConexiones[1][2]);
            conexion = DriverManager.getConnection(matrizConexiones[2][0], matrizConexiones[2][1], matrizConexiones[2][2]);
        } catch (SQLException exxx) {
            return false;
        } catch (ClassNotFoundException ex) {
            return false;
        }
        return true;
    }
    
    //Sistema de Intentos//
//    public boolean crearConexion(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            try{
//                conexion = DriverManager.getConnection(matrizConexiones[0][0], matrizConexiones[0][1], matrizConexiones[0][2]);
//            }catch (SQLException ex) {
//                try{
//                    conexion = DriverManager.getConnection(matrizConexiones[1][0], matrizConexiones[1][1], matrizConexiones[1][2]);
//                }catch (SQLException exx) {
//                    try{
//                        conexion = DriverManager.getConnection(matrizConexiones[2][0], matrizConexiones[2][1], matrizConexiones[2][2]);
//                    }catch (SQLException exxx) {
//                        return false;
//                    }
//                }
//            }
//        }catch (ClassNotFoundException ex) {
//            return false;
//        }
//        return true;
//    }

    public boolean ejecutarSQL(String sql){
        try {
            Statement sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
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
            return null;
        }
        return resultado;
    }
    public boolean cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
}
