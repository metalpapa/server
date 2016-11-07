<%-- 
    Document   : actualizarMovimientos
    Created on : 06-ago-2016, 16:21:34
    Author     : chris
--%>



<%@page import="model.DAO_Jugador"%>
<%@page import="model.Vo_Jugador"%>
<%@page import="model.DAO_Partida"%>
<%@page import="model.DAO_Juego"%>
<%@page import="model.Vo_Partida"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat"%>

         <%
              
             String apodo;
              String edad;
              String genero;
              String jugador_id;
              try{ 
               jugador_id=request.getParameter("jugador_id");
               genero=request.getParameter("genero").trim();
               edad=request.getParameter("edad");
               apodo=request.getParameter("apodo").trim();
               
              }catch(NullPointerException e){
                  jugador_id=request.getParameter("jugador_id");
                  genero=request.getParameter("genero").trim();
                  edad=request.getParameter("edad");
                  apodo="unknown";
              }
               
               Vo_Jugador jugador =new Vo_Jugador(jugador_id,genero,edad,apodo);
               new DAO_Jugador(jugador).ingresar();
             
               String partida_id=request.getParameter("partida_id");
               String nivel=request.getParameter("nivel");
               
               
               Vo_Partida partida=new  Vo_Partida(partida_id, nivel);
               new DAO_Partida(partida).ingresar();
               
               new DAO_Juego(partida_id,jugador_id).ingresar();
                
               
     
        %>