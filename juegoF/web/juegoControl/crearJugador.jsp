<%-- 
    Document   : crearJugador
    Created on : 07-ago-2016, 23:30:05
    Author     : chris
--%>



<%@page import="model.DAO_Jugador"%>
<%@page import="model.Vo_Jugador"%>
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
               apodo=request.getParameter("apodo").trim().toString();
               
              }catch(NullPointerException e){
                  apodo="unknown";
              }
               
               Vo_Jugador jugador =new Vo_Jugador(jugador_id,genero,edad,apodo);
               new DAO_Jugador(jugador).ingresar();
     
        %>