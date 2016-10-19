<%-- 
    Document   : borrarFigura
    Created on : 05-10-2016, 2:10:21
    Author     : SANTELICESMUÑOZCHRIS
--%>


<%@page import="model.DAO_Borrar_Figura"%>
<%                

               String partida_id=request.getParameter("partida_id");
               String figura_id=request.getParameter("figura_id");
     
               new DAO_Borrar_Figura(partida_id,figura_id).borrar();
             
        %>