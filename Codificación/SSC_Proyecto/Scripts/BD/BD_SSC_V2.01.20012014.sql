-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 21-01-2014 a las 08:15:58
-- Versión del servidor: 5.5.34
-- Versión de PHP: 5.3.10-1ubuntu3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `BD_SSC`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `anuncios`
--

CREATE TABLE IF NOT EXISTS `anuncios` (
  `idAnuncio` int(11) NOT NULL AUTO_INCREMENT,
  `textoMensaje` varchar(1000) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `estado` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `membrete` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idAnuncio`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE IF NOT EXISTS `categorias` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idCategoria`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AVG_ROW_LENGTH=1092 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `especialidad` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipo` tinyint(1) DEFAULT NULL,
  `direccion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `telefono` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idCliente`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AVG_ROW_LENGTH=180 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes_anuncios`
--

CREATE TABLE IF NOT EXISTS `clientes_anuncios` (
  `idCliente` int(11) NOT NULL,
  `idAnuncio` int(11) NOT NULL,
  PRIMARY KEY (`idCliente`,`idAnuncio`) USING BTREE,
  KEY `idCliente` (`idCliente`) USING BTREE,
  KEY `idAnuncio` (`idAnuncio`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lineaDePedido`
--

CREATE TABLE IF NOT EXISTS `lineaDePedido` (
  `idLinea` int(11) NOT NULL AUTO_INCREMENT,
  `cantidad` int(11) DEFAULT NULL,
  `idPedido` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  PRIMARY KEY (`idLinea`,`idPedido`),
  KEY `idPedido` (`idPedido`) USING BTREE,
  KEY `idProducto` (`idProducto`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lineasDeVentas`
--

CREATE TABLE IF NOT EXISTS `lineasDeVentas` (
  `idLinea` int(11) NOT NULL AUTO_INCREMENT,
  `subtotal` float(11,0) DEFAULT NULL,
  `cantidad` int(11) unsigned DEFAULT NULL,
  `idVenta` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  PRIMARY KEY (`idLinea`,`idVenta`),
  KEY `idVenta` (`idVenta`) USING BTREE,
  KEY `idProducto` (`idProducto`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AVG_ROW_LENGTH=41 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parametrosNegocio`
--

CREATE TABLE IF NOT EXISTS `parametrosNegocio` (
  `membrete` varchar(500) DEFAULT NULL,
  `ultIdPedido` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE IF NOT EXISTS `pedidos` (
  `idPedido` int(11) NOT NULL AUTO_INCREMENT,
  `total` float(9,3) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `estado` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPedido`) USING BTREE,
  KEY `idCliente` (`idCliente`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precios`
--

CREATE TABLE IF NOT EXISTS `precios` (
  `idPrecio` int(11) NOT NULL AUTO_INCREMENT,
  `idProducto` int(11) NOT NULL DEFAULT '0',
  `fechaDesde` datetime DEFAULT NULL,
  `fechaHasta` datetime DEFAULT NULL,
  `precio` float(8,2) DEFAULT NULL,
  `precioPromocional` float(15,3) DEFAULT NULL,
  PRIMARY KEY (`idPrecio`,`idProducto`),
  KEY `idProducto` (`idProducto`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AVG_ROW_LENGTH=83 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `codProducto` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `stock` int(11) unsigned DEFAULT NULL,
  `idSubcategoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProducto`) USING BTREE,
  UNIQUE KEY `codProducto` (`codProducto`) USING BTREE,
  KEY `idSubcategoria` (`idSubcategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AVG_ROW_LENGTH=95 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos_anuncios`
--

CREATE TABLE IF NOT EXISTS `productos_anuncios` (
  `idProducto` int(11) NOT NULL,
  `idAnuncio` int(11) NOT NULL,
  PRIMARY KEY (`idAnuncio`,`idProducto`) USING BTREE,
  KEY `idProducto` (`idProducto`) USING BTREE,
  KEY `idAnuncio` (`idAnuncio`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategorias`
--

CREATE TABLE IF NOT EXISTS `subcategorias` (
  `idCategoria` int(11) NOT NULL,
  `idSubcategoria` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idSubcategoria`),
  KEY `idCategoria` (`idCategoria`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AVG_ROW_LENGTH=138 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE IF NOT EXISTS `ventas` (
  `idVenta` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `total` float(9,3) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`idVenta`) USING BTREE,
  KEY `idCliente` (`idCliente`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AVG_ROW_LENGTH=83 AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes_anuncios`
--
ALTER TABLE `clientes_anuncios`
  ADD CONSTRAINT `clientes_anuncios_anuncio_fk2` FOREIGN KEY (`idAnuncio`) REFERENCES `anuncios` (`idAnuncio`) ON UPDATE CASCADE,
  ADD CONSTRAINT `clientes_anuncios_cliente_fk1` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `lineaDePedido`
--
ALTER TABLE `lineaDePedido`
  ADD CONSTRAINT `lineaDePedido_fk1` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`) ON UPDATE CASCADE,
  ADD CONSTRAINT `lineaDePedido_pedido_fk1` FOREIGN KEY (`idPedido`) REFERENCES `pedidos` (`idPedido`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `lineasDeVentas`
--
ALTER TABLE `lineasDeVentas`
  ADD CONSTRAINT `lineasDeVentas_producto_fk2` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`) ON UPDATE CASCADE,
  ADD CONSTRAINT `lineasDeVentas_venta_fk1` FOREIGN KEY (`idVenta`) REFERENCES `ventas` (`idVenta`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_cliente_fk1` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `precios`
--
ALTER TABLE `precios`
  ADD CONSTRAINT `precios_producto_fk1` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`) ON DELETE CASCADE;

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`idSubcategoria`) REFERENCES `subcategorias` (`idSubcategoria`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `productos_anuncios`
--
ALTER TABLE `productos_anuncios`
  ADD CONSTRAINT `productos_anuncios_anuncio_fk2` FOREIGN KEY (`idAnuncio`) REFERENCES `anuncios` (`idAnuncio`) ON UPDATE CASCADE,
  ADD CONSTRAINT `productos_anuncios_producto_fk1` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `subcategorias`
--
ALTER TABLE `subcategorias`
  ADD CONSTRAINT `subcategorias_fk1` FOREIGN KEY (`idCategoria`) REFERENCES `categorias` (`idCategoria`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD CONSTRAINT `ventas_cliente_fk1` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
