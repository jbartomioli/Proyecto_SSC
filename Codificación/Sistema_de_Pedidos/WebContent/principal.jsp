<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "dbconnectionlib.Dbconnection"%>
<%@ page import = "java.sql.Connection"%>
<%@page import ="java.sql.*" %>

<img alt="Imágen encabezado" src="img/imgInicioSup.jpg">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pedido</title>
</head>
<body>
	<% 
	Connection theConnection = Dbconnection.main();
	ResultSet rs = null;
	Statement stmt = theConnection.createStatement();;
	%>
<h2>Pedido</h2>
<form name="form1" method="get" action="servlet/PrintResultsServlet">   
  
<select name="comboCategoria">  
	<option>Seleccionar Categoría</option>
	<%
		rs = stmt.executeQuery("select descripcion from categorias");
		while(rs.next())
		{
			out.write("<option value=" + rs.getString("descripcion") + ">" + rs.getString("descripcion") + "</option>");
	    
		}
	%>
</select>  
 
 <br />
 <br />
<select name="comboSubCategoria">  
	<option>Seleccionar Subcategoría</option>
	<%
		rs = stmt.executeQuery("select descripcion from subcategorias");
		while(rs.next())
		{
			out.write("<option value=" + rs.getString("descripcion") + ">" + rs.getString("descripcion") + "</option>");
	    
		}
	%>
</select>   

<br />
<br />
<table width="50%" border="1" align="left">
  <tr>
    <th>Producto</th>
    <th>Stock</th>
    <th>Precio</th>
    <th>Check</th>
  </tr>
  <tr>
    <td>Contenido</td>
    <td>Contenido</td>
    <td>Contenido</td>
    <td>Contenido</td>
  </tr>
  <tr>
    <td>Contenido</td>
    <td>Contenido</td>
    <td>Contenido</td>
    <td>Contenido</td>
  </tr>
</table>
<br />
<br />
<br />
<br />   
<p align="center">  
<input type="submit" name="Submit" value="Buscar">  
</p>    
      
</form>  
</body>
<img alt="Imágen pie" src="img/imgInicioInf.jpg">
</html>