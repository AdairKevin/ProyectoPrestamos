package features.menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CConexion {
    Connection conectar = null;
    String usuario = "root";
    String contraseña= "010200"; 
    String bd="prestamos";
    String ip="localhost";
    String puerto="3306";
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;

    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena,usuario,contraseña);
            System.out.println("Se conecto");           
        } catch (Exception e) {
            System.out.println("No se conecto " + e.toString());     
        }
        return conectar;
    }

    public PreparedStatement prepareStatement(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void conectarInterfaz(){
        CConexion objetoConexion = new CConexion();
        Connection conectar = objetoConexion.estableceConexion();
        PreparedStatement ps;
        ResultSet rs;
    }

    Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
