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
              String genero=request.getParameter("genero");
              String edad=request.getParameter("edad");
              String jugador_id=request.getParameter("jugador_id");
              String partida_id=request.getParameter("partida_id");   
              String nivel=request.getParameter("nivel");
              
              if (edad==null){
                  edad="10";
              }
              if (genero==null){
                  genero="Hombre";
              }
              try{ 
                 apodo=request.getParameter("apodo").trim();
              }catch(Exception e){              
                 apodo="unknown";
              }
              
              try{
                  
               Vo_Jugador jugador =new Vo_Jugador(jugador_id,genero,edad,apodo);
               new DAO_Jugador(jugador).ingresar();   
                  
               Vo_Partida partida=new  Vo_Partida(partida_id, nivel);
               new DAO_Partida(partida).ingresar();
               
               new DAO_Juego(partida_id,jugador_id).ingresar();
               
              }catch(NullPointerException e){      
                  System.out.println("Error en crearJuego.jsp:"+e.toString());
               }


        %>