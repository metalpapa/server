/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author chris
 */
public class Vo_Jugador {
    
   private  String jugador_id;
   private  String genero;
   private  String edad;
   private  String apodo;

    
     public Vo_Jugador() {

    }

    public Vo_Jugador(String jugador_id, String genero, String edad, String apodo) {
        this.jugador_id = jugador_id;
        this.genero = genero;
        this.edad = edad;
        this.apodo = apodo;
    }

    
  
    public String getApodo() {
        return apodo;
    }

    public void setJugador_id(String jugador_id) {
        this.jugador_id = jugador_id;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    
    public String getGenero() {
        return genero;
    }

    public String getJugador_id() {
        return jugador_id;
    }

    public String getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
}
