
package model;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Conexion {
  
    private static String user="app", password = "mujer_amante";
    private static String connectString = "jdbc:mysql://localhost/juego?user="+user+"&password="+password+"&autoReconnect=true&useSSL=false";
             
    static Connection con=null;

    public Conexion() {
      
    }

    public Connection getConnection(){
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectString);
            if(con!=null){
                //System.out.println("Conexion a la base de datos realizada con exito! ");
            }
        }catch(SQLException e){
         System.out.println(e);
        }catch(ClassNotFoundException e){
           System.out.println(e);
        }catch(Exception e){
           System.out.println(e);
        }
       
        return con;
    }
    
     

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    

