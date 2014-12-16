<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<img alt="Imágen encabezado" src="C:\Users\PCRodrigo\Desktop\Codificación\SSC_Proyecto\recursos\presentacion\imgInicioSup.jpg">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pedido</title>
</head>
<body>
<h2>Pedido</h2>
<form name="form1" method="get" action="servlet/PrintResultsServlet">   
  
<select name="Events">  
<option value="0" selected>Categoría</option>  
<option value="100M Run">Anestesia</option>  
<option value="200M Run">Descartables</option>    
</select>  
<input type="text" name="choicetext"> 
 </br>
 </br>
  <select name="Events">  
<option value="0" selected>Subcategoría</option>  
<option value="100M Run">Anestesia</option>  
<option value="200M Run">Descartables</option>    
</select>  
<input type="text" name="choicetext">
   <p align="center">  
    <input type="submit" name="Submit" value="Search">  
  </p>  
        <br><br><br><br><br><br><br><br><br><br><br>  
      
</form>  
</body>
<img alt="Imágen pie" src="C:\Users\PCRodrigo\Desktop\Codificación\SSC_Proyecto\recursos\presentacion\imgInicioInf.jpg">
</html>