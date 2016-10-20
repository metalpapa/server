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
public class Vo_Partida {
    
    private String partida_id;
    private String nivel;
    private String fecha;
    private String duracion;
    private String terminada;
    private String completada;
    

    public Vo_Partida() {
    }

    public Vo_Partida(String partida_id,String nivel, String duracion, String terminada, String completada) {
        this.partida_id = partida_id;
        this.nivel=nivel;
        this.duracion = duracion;
        this.terminada = terminada;
        this.completada = completada;
    }

    public Vo_Partida(String partida_id, String nivel) {
        this.partida_id = partida_id;
        this.nivel = nivel;
    }   

    public String getPartida_id() {
        return partida_id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getNivel() {
        return nivel;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTerminada() {
        return terminada;
    }

    public String getCompletada() {
        return completada;
    }

    public void setPartida_id(String partida_id) {
        this.partida_id = partida_id;
    }

    public void setTerminada(String terminada) {
        this.terminada = terminada;
    }

    public void setCompletada(String completada) {
        this.completada = completada;
    }
    
    
}
