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
 * @author chris
 */
public class DAO_Juego {
    String partida_id;
    String jugador_id;  

    public DAO_Juego(String partida_id, String jugador_id) {
        this.partida_id = partida_id;
        this.jugador_id = jugador_id;
    }
    
    public void ingresar(){
        Connection con=new Conexion().getConnection(); 
        String insertString1 = "insert into juego(partida_id,jugador_id) values("+partida_id+","+jugador_id+")";
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

