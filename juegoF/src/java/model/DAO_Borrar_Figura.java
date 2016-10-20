/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author SANTELICESMUÑOZCHRIS
 */
public class DAO_Borrar_Figura {
    String partida_id;
    String figura_id;

    public DAO_Borrar_Figura(String partida_id, String figura_id) {
        this.partida_id = partida_id;
        this.figura_id = figura_id;
    }
  
    
    public void borrar(){
        Connection con=new Conexion().getConnection(); 
        String insertString1 = "delete from movimientos where partida_id="+partida_id+" and figura_id="+figura_id;
        try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate(insertString1);
                stmt.close();
		con.close();
          System.out.println(insertString1);
        } catch(SQLException ex) {
                System.err.println("SQLException_inserts: " + ex.getMessage());
        }
        
    }  
    
}
