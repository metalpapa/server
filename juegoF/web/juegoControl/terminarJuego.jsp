<%-- 
    Document   : actualizarMovimientos
    Created on : 06-ago-2016, 16:21:34
    Author     : chris
--%>



<%@page import="model.DAO_Partida"%>
<%@page import="model.Vo_Partida"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat"%>

         <%
              
               String jugador_id=request.getParameter("jugador_id");
               String partida_id=request.getParameter("partida_id");
               String nivel=request.getParameter("nivel");
               String tiempo=request.getParameter("tiempo");
               String puntuacion=request.getParameter("puntuacion");
               String completada=request.getParameter("completada");
               
               Vo_Partida partida=new Vo_Partida(partida_id, nivel,tiempo,"1",completada);
               new DAO_Partida(partida).actualizar();
               
               //System.out.println(completada);
                

               //agregar completada
        %>