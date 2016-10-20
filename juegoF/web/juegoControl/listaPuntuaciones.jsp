<%-- 
    Document   : prueba
    Created on : 06-ago-2016, 17:53:25
    Author     : chris
--%>


<%@page import="model.ConsultarPuntuaciones"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
            ConsultarPuntuaciones p=new ConsultarPuntuaciones();
            List<String> list=p.partidas();

            out.write("{");
            out.write("\"puntuaciones\":");
            out.write("[");

            for (int i = 0; i < list.size(); i++) {
                        out.write(list.get(i));
            }

            out.write("]");
            out.write("}");
			
			
        %>