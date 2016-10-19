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
public class DAO_Partida {  
     Vo_Partida partida;

    public DAO_Partida(Vo_Partida partida) {
        this.partida = partida;
    }
  
    public void ingresar(){
        Connection con=new Conexion().getConnection(); 
        String insertString1 = "insert into partida(partida_id, nivel)values("+partida.getPartida_id()+",'"+partida.getNivel()+"')";
        try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate(insertString1);
                stmt.close();
                con.close();
           System.out.println(insertString1);
        } catch(SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
        }
    }    

    public void actualizar(){
        Connection con=new Conexion().getConnection(); 
        String insertString1 = "UPDATE partida SET duracion="+partida.getDuracion()+",terminada="+partida.getTerminada() +",completa="+partida.getCompletada()+" WHERE partida_id="+partida.getPartida_id();
        try {
                Statement stmt = con.createStatement();
                stmt.executeUpdate(insertString1);
                stmt.close();
                con.close();
           System.out.println(insertString1);
        } catch(SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
        }
    } 
}
