package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPuntuaciones {
    String nivel;

    public ConsultarPuntuaciones(String nivel) {
        this.nivel = nivel;
    }
    
    public List<String> partidas(){
                Connection con=new Conexion().getConnection(); 
                List<String> Dbase = new ArrayList<String>();
               	//String selectString = "select j.jugador_id, p.duracion, p.puntuacion, j.apodo from jugador j, partida p, juego g where j.jugador_id=g.jugador_id and g.partida_id=p.partida_id and p.nivel='"+nivel+"' order by p.puntuacion desc, duracion limit 15 ;";
                String selectString ="select p.nivel, j.jugador_id, p.duracion, p.puntuacion, j.apodo from jugador j, partida p, juego g where j.jugador_id=g.jugador_id and g.partida_id=p.partida_id and p.completa=1 and p.terminada=1 and p.nivel='"+nivel+"'  order by p.puntuacion asc  limit 15 ";
                System.out.println(selectString);
                try {
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(selectString);
                    while (rs.next()) {
                        if (Dbase.isEmpty()){
                            Dbase.add("{");
                            Dbase.add("\"jugador_id\":\""+rs.getString("jugador_id")+"\",\"duracion\":\""+rs.getString("duracion")+"\",\"puntuacion\":\""+rs.getString("puntuacion")+"\",\"apodo\":\""+rs.getString("apodo")+"\"");                
                            Dbase.add("}");
                        }else{
                            Dbase.add(",{");
                            Dbase.add("\"jugador_id\":\""+rs.getString("jugador_id")+"\",\"duracion\":\""+rs.getString("duracion")+"\",\"puntuacion\":\""+rs.getString("puntuacion")+"\",\"apodo\":\""+rs.getString("apodo")+"\"");                
                            Dbase.add("}");
                        }
                    }
                        stmt.close();
			//con.close();
          
                } catch(SQLException ex) {
                        System.err.println("SQLException_delete_DAO_Borrar_Figura: " + ex.getMessage());
                }  
                finally {
                    try {
                        con.close();
                    } catch (SQLException e) { /* ignored */}
                }
    return Dbase ;
    }
    
  
    
}
