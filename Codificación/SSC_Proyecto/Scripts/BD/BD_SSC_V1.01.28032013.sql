-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 28-03-2013 a las 16:51:13
-- Versión del servidor: 5.5.24
-- Versión de PHP: 5.3.10-1ubuntu3.4

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

DROP TABLE IF EXISTS `anuncios`;
CREATE TABLE IF NOT EXISTS `anuncios` (
  `idAnuncio` int(11) NOT NULL,
  `textoMensaje` varchar(1000) COLLATE utf8_spanish_ci DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `estado` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idAnuncio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

DROP TABLE IF EXISTS `categorias`;
CREATE TABLE IF NOT EXISTS `categorias` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellido` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `especialidad` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipo` tinyint(1) DEFAULT NULL,
  `direccion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `telefono` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes_anuncios`
--

DROP TABLE IF EXISTS `clientes_anuncios`;
CREATE TABLE IF NOT EXISTS `clientes_anuncios` (
  `idCliente` int(11) NOT NULL,
  `idAnuncio` int(11) NOT NULL,
  PRIMARY KEY (`idCliente`,`idAnuncio`),
  KEY `idCliente` (`idCliente`),
  KEY `idAnuncio` (`idAnuncio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `descuentos`
--

DROP TABLE IF EXISTS `descuentos`;
CREATE TABLE IF NOT EXISTS `descuentos` (
  `idDescuento` int(11) NOT NULL AUTO_INCREMENT,
  `fechaDesde` datetime DEFAULT NULL,
  `fechaHasta` datetime DEFAULT NULL,
  `descuento` float(9,3) DEFAULT NULL,
  `montoDesde` float(9,3) DEFAULT NULL,
  `montoHasta` float(9,3) DEFAULT NULL,
  PRIMARY KEY (`idDescuento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lineaDePedido`
--

DROP TABLE IF EXISTS `lineaDePedido`;
CREATE TABLE IF NOT EXISTS `lineaDePedido` (
  `cantidad` int(11) DEFAULT NULL,
  `idPedido` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  PRIMARY KEY (`idPedido`,`idProducto`),
  KEY `idPedido` (`idPedido`),
  KEY `idProducto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lineasDeVentas`
--

DROP TABLE IF EXISTS `lineasDeVentas`;
CREATE TABLE IF NOT EXISTS `lineasDeVentas` (
  `subtotal` float(11,0) DEFAULT NULL,
  `cantidad` int(11) unsigned DEFAULT NULL,
  `idVenta` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  PRIMARY KEY (`idVenta`,`idProducto`),
  KEY `idVenta` (`idVenta`),
  KEY `idProducto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

DROP TABLE IF EXISTS `pedidos`;
CREATE TABLE IF NOT EXISTS `pedidos` (
  `idPedido` int(11) NOT NULL AUTO_INCREMENT,
  `total` float(9,3) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `estado` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `idCliente` (`idCliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `precios`
--

DROP TABLE IF EXISTS `precios`;
CREATE TABLE IF NOT EXISTS `precios` (
  `idPrecio` int(11) NOT NULL AUTO_INCREMENT,
  `precio` float(9,3) DEFAULT NULL,
  `fechaDesde` datetime DEFAULT NULL,
  `fechaHasta` datetime DEFAULT NULL,
  `precioPromocional` double(15,3) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPrecio`),
  KEY `idProducto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `stock` int(11) unsigned DEFAULT NULL,
  `idSubcategoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `idSubcategoria` (`idSubcategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos_anuncios`
--

DROP TABLE IF EXISTS `productos_anuncios`;
CREATE TABLE IF NOT EXISTS `productos_anuncios` (
  `idProducto` int(11) NOT NULL,
  `idAnuncio` int(11) NOT NULL,
  PRIMARY KEY (`idAnuncio`,`idProducto`),
  KEY `idProducto` (`idProducto`),
  KEY `idAnuncio` (`idAnuncio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subcategorias`
--

DROP TABLE IF EXISTS `subcategorias`;
CREATE TABLE IF NOT EXISTS `subcategorias` (
  `idSubcategoria` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `idCategoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`idSubcategoria`),
  KEY `idCategoria` (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

DROP TABLE IF EXISTS `ventas`;
CREATE TABLE IF NOT EXISTS `ventas` (
  `idVenta` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime DEFAULT NULL,
  `total` float(9,3) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `idDescuento` int(11) DEFAULT NULL,
  PRIMARY KEY (`idVenta`),
  KEY `idCliente` (`idCliente`),
  KEY `idDescuento` (`idDescuento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci PACK_KEYS=0 AUTO_INCREMENT=1 ;

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
  ADD CONSTRAINT `productos_subcategorias_fk1` FOREIGN KEY (`idSubcategoria`) REFERENCES `subcategorias` (`idSubcategoria`) ON UPDATE CASCADE;

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
  ADD CONSTRAINT `ventas_descuento_fk2` FOREIGN KEY (`idDescuento`) REFERENCES `descuentos` (`idDescuento`) ON UPDATE CASCADE,
  ADD CONSTRAINT `ventas_cliente_fk1` FOREIGN KEY (`idCliente`) REFERENCES `clientes` (`idCliente`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
