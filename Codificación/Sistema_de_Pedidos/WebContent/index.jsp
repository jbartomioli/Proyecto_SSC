<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.sql.*" %>
<%@page import ="java.io.IOException" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@page import="java.io.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<img alt="Imágen encabezado" src="C:\Users\PCRodrigo\Desktop\Codificación\SSC_Proyecto\recursos\presentacion\imgInicioSup.jpg">
    <HEAD>
        <TITLE>Login Sistema de Pedidos</TITLE>
    </HEAD>
 
    <BODY>
        <H2>Sistema de Pedidos</H2>
        <%
        String myname =  (String)session.getAttribute("username");
        
        if(myname!=null)
            {
             out.println("Welcome  "+myname+"  , <a href=\"logout.jsp\" >Logout</a>");
            }
        else 
            {
            %>
            <form action="login.jsp">
                <table>
                    <tr>
                        <td> Usuario: </td><td> <input name="username" size=15 type="text" /> </td> 
                    </tr>
                    <tr>
                        <td> Password: </td><td> <input name="password" type="password" size=15 type="text" /> </td> 
                    </tr>
                </table>
                <br>
                <input type="submit" value="Login" />
            </form>
            <% 
            }
         
             
            %>
         
    </BODY>
<img alt="Imágen pie" src="C:\Users\PCRodrigo\Desktop\Codificación\SSC_Proyecto\recursos\presentacion\imgInicioInf.jpg">
</HTML> 