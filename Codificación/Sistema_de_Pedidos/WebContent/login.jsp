<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import ="java.sql.*" %>
<%@ page import = "dbconnectionlib.Dbconnection"%>
<%@ page import = "java.sql.Connection"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<%
			Connection theConnection = Dbconnection.main();         

			String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            PreparedStatement theStatement = null;
            
            try{   
                theStatement = theConnection.prepareStatement("select * from userdetail where username=? and password=?");
                theStatement.setString(1,request.getParameter("username"));
                theStatement.setString(2,request.getParameter("password"));
                ResultSet theResult = theStatement.executeQuery();

                if(theResult.next())
                {
                    response.sendRedirect("principal.jsp");
                }
                else
                {
                	request.setAttribute("errorMessage", "Invalid username or password");
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
                    dispatcher.forward(request, response);
                }
                    

                }catch(Exception e){
                    System.out.println("Exception occured! "+e.getMessage()+" "+e.getStackTrace());
                }
%> 
</body>
</html>