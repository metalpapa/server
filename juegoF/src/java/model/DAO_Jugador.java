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
public class DAO_Jugador {
    
    Vo_Jugador jugador;

    public DAO_Jugador(Vo_Jugador jugador) {
        this.jugador = jugador;
    }
      
    
    public void ingresar(){
        Connection con=new Conexion().getConnection(); 
        String insertString1 = "insert into jugador(jugador_id,genero,edad,apodo) values("+jugador.getJugador_id()+",'"+jugador.getGenero()+"',"+jugador.getEdad()+",'"+jugador.getApodo()+"')";
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
