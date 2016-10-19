<%-- 
    Document   : actualizarMovimientos
    Created on : 06-ago-2016, 16:21:34
    Author     : chris
--%>




<%@page import="model.DAO_Movimiento"%>
<%@page import="model.Vo_Movimiento"%>
<%                
               String posicion_x=request.getParameter("posicion_x");
               String posicion_y=request.getParameter("posicion_y");
              // String jugador_id=request.getParameter("jugador_id");
               String partida_id=request.getParameter("partida_id");
               String pieza=request.getParameter("tipo");
               String rotacion=request.getParameter("rotacion");
               String movimiento=request.getParameter("movimiento");
               String figura_id=request.getParameter("figura_id");
               
               Vo_Movimiento mov= new Vo_Movimiento(partida_id+"M"+movimiento,partida_id,posicion_x,posicion_y,rotacion,pieza,figura_id);
               new DAO_Movimiento(mov).ingresar();
             
        %>