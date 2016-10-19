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
public class Vo_Movimiento {
 
   private  String movimiento_id;
   private  String partida_id;
   private  String posicion_x;
   private  String posicion_y;
   private  String rotacion;
   private  String tiempo;
   private  String pieza;
   private  String figura_id;

    public Vo_Movimiento() {
    }

    public Vo_Movimiento(String movimiento_id, String partida_id, String posicion_x, String posicion_y, String rotacion, String pieza, String figura_id) {
        this.movimiento_id = movimiento_id;
        this.partida_id = partida_id;
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
        this.rotacion = rotacion;
        this.pieza = pieza;
        this.figura_id = figura_id;
    }

    

    public String getRotacion() {
        return rotacion;
    }

    public void setFigura_id(String figura_id) {
        this.figura_id = figura_id;
    }

    public String getFigura_id() {
        return figura_id;
    }

    public void setMovimiento_id(String movimiento_id) {
        this.movimiento_id = movimiento_id;
    }

    public void setRotacion(String rotacion) {
        this.rotacion = rotacion;
    }

    public String getMovimiento_id() {
        return movimiento_id;
    }

    public String getPosicion_x() {
        return posicion_x;
    }

    public String getPosicion_y() {
        return posicion_y;
    }

    public String getPartida_id() {
        return partida_id;
    }


    public String getTiempo() {
        return tiempo;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPosicion_x(String posicion_x) {
        this.posicion_x = posicion_x;
    }

    public void setPosicion_y(String posicion_y) {
        this.posicion_y = posicion_y;
    }

    public void setPartida_id(String partida_id) {
        this.partida_id = partida_id;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }
    
    
}
