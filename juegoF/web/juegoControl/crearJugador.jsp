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
              
               
               String jugador_id=request.getParameter("jugador_id");
               String genero=request.getParameter("genero");
               String edad=request.getParameter("edad");
               String apodo=request.getParameter("apodo").trim();
               
               Vo_Jugador jugador =new Vo_Jugador(jugador_id,genero,edad,apodo);
               new DAO_Jugador(jugador).ingresar();
     
        %>