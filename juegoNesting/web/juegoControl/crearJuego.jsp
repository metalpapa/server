<%-- 
    Document   : actualizarMovimientos
    Created on : 06-ago-2016, 16:21:34
    Author     : chris
--%>



<%@page import="model.DAO_Partida"%>
<%@page import="model.DAO_Juego"%>
<%@page import="model.Vo_Partida"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat"%>

         <%
              
               String jugador_id=request.getParameter("jugador_id");
               String partida_id=request.getParameter("partida_id");
               String nivel=request.getParameter("nivel");
               
               
               Vo_Partida partida=new  Vo_Partida(partida_id, nivel);
               new DAO_Partida(partida).ingresar();
               
               new DAO_Juego(partida_id,jugador_id).ingresar();
                

     
        %>