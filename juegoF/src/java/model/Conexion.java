
package model;


import java.sql.*;


public class Conexion {
  
    private static String user="app", password = "mysql_server-12345";
    private static String connectString = "jdbc:mysql://localhost:5823/juego?user="+user+"&password="+password+"&useSSL=false";// &autoReconnect=true&useSSL=false";
             
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
    
    
    
    
    
    
    
    

