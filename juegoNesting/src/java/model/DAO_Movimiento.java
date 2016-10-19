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
public class DAO_Movimiento {
    Vo_Movimiento mov;

    public DAO_Movimiento(Vo_Movimiento mov) {
        this.mov = mov;
    }
    
    public void ingresar(){
        Connection con=new Conexion().getConnection(); 
        String insertString1 = "insert into movimientos(movimiento_id,partida_id,posicion_x,posicion_y,rotacion,pieza,figura_id) values('"+mov.getMovimiento_id()+"',"+mov.getPartida_id()+","+mov.getPosicion_x()+","+mov.getPosicion_y()+","+mov.getRotacion()+",'"+mov.getPieza()+"',"+mov.getFigura_id()+")";
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
