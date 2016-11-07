package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    static Connection conexion;
    
    /**
    * Método utilizado para recuperar el valor del atributo conexion
    * @return conexion contiene el estado de la conexión
    *
    */
    public Connection getConexion(){
        return conexion;
    }

    /**
    * Método utilizado para establecer la conexión con la base de datos
    * @return estado regresa el estado de la conexión, true si se estableció la conexión,
    * falso en caso contrario
    */
    public boolean crearConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //CONEXION ESTANDAR - JASON//
            //conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cpl","root","");
            //CONEXION SEBA//
            //conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.36:3306/cpl","ratsata","toor");
            
            // --//
            conexion = DriverManager.getConnection("jdbc:mysql://defweb.ddns.net:3306/BG","ratsata","toor");
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }

    /**
    *
    *Método utilizado para realizar las instrucciones: INSERT, DELETE y UPDATE
    *@return estado regresa el estado de la ejecución, true(éxito) o false(error)
    *
    */
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

    /**
    *
    *Método utilizado para realizar la instrucción SELECT
    *@param sql Cadena que contiene la instrucción SQL a ejecutar
    *@return resultado regresa los registros generados por la consulta
    *
    */
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
