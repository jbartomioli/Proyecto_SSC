<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset=UTF-8">
		<!-- 	<link rel="stylesheet" type="text/css"	href="${pageContext.request.contextPath}/assets/bootstrap/3.3.4/css/bootstrap.min.css" media="all"/>
				<script type="text/javascript"	src="${pageContext.request.contextPath}/assets/jquery/2.1.3/jquery.min.js"></script>
				<script type="text/javascript"	src="${pageContext.request.contextPath}/assets/bootstrap/3.3.4/js/bootstrap.min.js"></script>
		 
		  <link href="<spring:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
		 <script type="text/javascript" src="<spring:url value="/resources/js/jquery.min.js"/>"></script>	
		 <script type="text/javascript" src="<spring:url value="/resources/js/bootstrap.min.js"/>"></script>	
		-->	
		<spring:url value="/resources/css/bootstrap.min.css" var="boostrapCss" />
		<spring:url value="/resources/js/jquery.min.js" var="jqueryJs" />
		<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
		
		<link href="${boostrapCss}" rel="stylesheet" />
   		<script src="${jqueryJs}"></script>
    	<script src="${bootstrapJs}"></script>
		
		<title><spring:message code="pedido.title"/></title>
	</head>
	<body>
		<nav class="navbar navbar-default" role="navegation">
			<div class="navbar-header"><a class="navbar-brand" href="#"><spring:message code="pedido.title.nav"/></a></div>	
		</nav>
		<section>
			<div>
				 <div class="panel-group" id="accordion">
					 <div class="panel panel-default">
					 	 <div class="panel-heading">
						 	<h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseCategoria"><spring:message code="pedido.nav.panel.title.category"/></a></h4>
						 </div>
						 <div id="collapseCategoria" class="panel-collapse collapse in">
						 	<div class="panel-body">
								<p>lista desplegable de categorias</p>
							</div>
						 </div>
					 </div>
					<div class="panel panel-default">
            			<div class="panel-heading">
						<h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseSubcategorias"><spring:message code="pedido.nav.panel.title.subCategory"/></a></h4>
						</div>
						<div id="collapseSubcategorias" class="panel-collapse collapse in">
						 	<div class="panel-body">
								<p>lista desplegable de sub categorias</p>
							</div>
						 </div>
            		</div>
					<div class="panel panel-default">
            			<div class="panel-heading">
							<h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapseProductos"><spring:message code="pedido.nav.panel.title.product"/></a></h4>
						</div>
						<div id="collapseProductos" class="panel-collapse collapse in">
						 	<div class="panel-body">
								<p>tabla con productos / precios / stocks </p>
							</div>
						 </div>
            		</div>
				</div>
			</div>
		</section>
		
	</body>
</html>