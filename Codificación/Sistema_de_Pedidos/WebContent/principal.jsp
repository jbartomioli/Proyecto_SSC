<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<img alt="Imágen encabezado" src="img/imgInicioSup.jpg">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pedido</title>
</head>
<body>
<h2>Pedido</h2>
<form name="form1" method="get" action="servlet/PrintResultsServlet">   
  
<select name="Events">  
<option value="0" selected>Categoría</option>  
<option value="1">Anestesia</option>  
<option value="2">Descartables</option>    
</select>  
<input type="text" name="choicetext"> 
 <br />
 <br />
  <select name="Events">  
<option value="0" selected>Subcategoría</option>  
<option value="1">Anestesia</option>  
<option value="2">Descartables</option>    
</select>  
<input type="text" name="choicetext">
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