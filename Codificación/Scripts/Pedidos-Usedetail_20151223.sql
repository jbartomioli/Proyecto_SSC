-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.41


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO,MYSQL323' */;


USE bd_ssc;

--
-- Dumping data for table `anuncios`
--

/*!40000 ALTER TABLE `anuncios` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (1,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          1        </td>        <td>          ANESTESIA ANESCART FORTR X50.        </td>        <td>          $ 40.0        </td>        <td>          $ 8.0        </td>      </tr>      <tr>        <td>          8        </td>        <td>          XYLOCAINA DENTSPLY X 50        </td>        <td>          $ 85.0        </td>        <td>          $ 60.0        </td>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--aaaaaaa-->','2014-10-06 20:56:34','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (2,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          <div>            INDICAN GEL          </div>          <div>            <img src=\"file:D:\\downloads\\Different-Types-of-Wine-Infographic-Chart3.png\">                      </div>        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>      <tr>        <td>          5        </td>        <td>          <div>            ANESTESIA SPRAY INDICAN          </div>          <div>                      </div>        </td>        <td>          $ 22.0        </td>        <td>          $ 19.8        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--ieurfiujsdaf-->','2014-10-06 21:04:41','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (3,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          5        </td>        <td>          ANESTESIA SPRAY INDICAN        </td>        <td>          $ 22.0        </td>        <td>          $ 19.8        </td>      </tr>      <tr>        <td>          7        </td>        <td>          <div>            INDICAN GEL          </div>          <div>            <img src=\"file:D:\\downloads\\Different-Types-of-Wine-Infographic-Chart3.png\">                      </div>        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--dsxfcgvbnm,-->','2014-10-06 21:23:52','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (4,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          8        </td>        <td>          XYLOCAINA DENTSPLY X 50        </td>        <td>          $ 90.0        </td>        <td>          $ 75.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>    <!--Prueba-->    <!--Prueba-->','2014-10-08 21:13:01','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (5,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          2        </td>        <td>          ANESTESIA KLEPP TOPICAL        </td>        <td>          $ 30.5        </td>        <td>          $ 27.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--aaaaaa-->','2014-10-08 21:27:42','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (6,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          2        </td>        <td>          ANESTESIA KLEPP TOPICAL        </td>        <td>          $ 30.5        </td>        <td>          $ 27.0        </td>      </tr>      <tr>        <td>          4        </td>        <td>          ANESTESIA SCANDONEST 3% S.V.C.        </td>        <td>          $ 73.2        </td>        <td>          $ 55.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--Enero 2015-->','2014-10-13 11:09:57','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (7,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          1        </td>        <td>          ANESTESIA ANESCART FORTR X50.        </td>        <td>          $ 40.0        </td>        <td>          $ 8.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--bdfbdbg-->','2014-10-17 18:45:00','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (8,'<h1>      <font face=\"Courier New\">T&#237;tulo del anuncio</font>    </h1>    <p>      <font face=\"Courier New\">P&#225;rrafo 1</font>    </p>    <table>      <tr>        <th>          <font face=\"Courier New\">Cod.</font>        </th>        <th>          <font face=\"Courier New\">Producto</font>        </th>        <th>          <font face=\"Courier New\">Precio Vigente</font>        </th>        <th>          <font face=\"Courier New\">Precio Promocional</font>        </th>      </tr>      <tr>        <td>          <font face=\"Courier New\">6</font>        </td>        <td>          <font face=\"Courier New\">ANESTESIA TOTALCAINA X 50</font>        </td>        <td>          <font face=\"Courier New\">$ 93.6</font>        </td>        <td>          <font face=\"Courier New\">$ 84.24</font>        </td>      </tr>      <tr>        <td>          <font face=\"Courier New\">5</font>        </td>        <td>          <font face=\"Courier New\">ANESTESIA SPRAY INDICAN</font>        </td>        <td>          <font face=\"Courier New\">$ 22.0</font>        </td>        <td>          <font face=\"Courier New\">$ 20.0</font>        </td>      </tr>      <tr>        <td>          <font face=\"Courier New\">188</font>        </td>        <td>          <font face=\"Courier New\">MONOMERO X 500 SUBITON</font>        </td>        <td>          <font face=\"Courier New\">$ 42.3</font>        </td>        <td>          <font face=\"Courier New\">$ 38.07</font>        </td>      </tr>    </table>    <p>      <font face=\"Courier New\">P&#225;rrafo 2</font>    </p>  <!--probando-->','2014-10-17 22:57:27','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (9,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--Prueba-->','2014-10-18 20:22:32','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (10,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--Probando-->','2014-11-02 11:05:06','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (11,'<h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--poszrrs-->','2014-11-02 11:25:05','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (12,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--gn sga--><img src=\"cid:IMG1\"/></body></html>','2014-11-02 11:28:37','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (13,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--rthhaethaeth--><img src=\"cid:IMG1\"/></body></html>','2014-11-02 11:34:19','PENDIENTE','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (14,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      T&#237;tulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!--gnsdbabaeb--><img src=\"cid:IMG1\"/></body></html>','2014-11-02 11:38:29','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (15,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>      <tr>        <td>          5        </td>        <td>          ANESTESIA SPRAY INDICAN        </td>        <td>          $ 22.0        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- 451 --><img src=\"cid:IMG1\"/></body></html>','2014-11-02 19:35:33','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (16,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- 87464 --><img src=\"cid:IMG1\"/></body></html>','2014-11-21 19:15:55','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (17,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- erqwgrg --><img src=\"cid:IMG1\"/></body></html>','2014-11-21 19:17:55','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (18,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>      <tr>        <td>          4        </td>        <td>          ANESTESIA SCANDONEST 3% S.V.C.        </td>        <td>          $ 73.2        </td>        <td>          $ 55.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- SdgfaHDjh --><img src=\"cid:IMG1\"/></body></html>','2014-11-21 19:25:11','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (19,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>      <tr>        <td>          8        </td>        <td>          XYLOCAINA DENTSPLY X 50        </td>        <td>          $ 90.0        </td>        <td>          $ 78.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- aaaaa --><img src=\"cid:IMG1\"/></body></html>','2014-11-21 19:28:56','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (20,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- xfgnsgnagmn --><img src=\"cid:IMG1\"/></body></html>','2014-11-21 19:42:36','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (21,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          1        </td>        <td>          ANESTESIA ANESCART FORTR X50.        </td>        <td>          $ 40.0        </td>        <td>          $ 25.0        </td>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- sggngnsgfnsdg --><img src=\"cid:IMG1\"/></body></html>','2014-11-21 19:45:27','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (22,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- xzfgadfhah --><img src=\"cid:IMG1\"/></body></html>','2014-11-21 19:47:56','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (23,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- fhmsfjs --><img src=\"cid:IMG1\"/></body></html>','2014-11-21 19:51:41','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (24,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- tuiltkfk --><img src=\"cid:IMG1\"/></body></html>','2014-11-22 21:12:01','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (25,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- SDFSFaf --><img src=\"cid:IMG1\"/></body></html>','2014-11-23 09:45:58','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (26,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          6        </td>        <td>          ANESTESIA TOTALCAINA X 50        </td>        <td>          $ 93.6        </td>        <td>          $ 84.24        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- dfffbbdfb --><img src=\"cid:IMG1\"/></body></html>','2014-11-23 09:51:57','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (27,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 23.2        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- fwefwf --><img src=\"cid:IMG1\"/></body></html>','2014-11-23 09:56:00','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (28,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          59        </td>        <td>          SOTENEDORES ROLLOS ALG. MET.        </td>        <td>          $ 14.6        </td>        <td>          $ 13.14        </td>      </tr>      <tr>        <td>          358        </td>        <td>          ATACADOR P/COMPOSITE N&#165; 1 Y 2        </td>        <td>          $ 10.0        </td>        <td>          $ 8.0        </td>      </tr>      <tr>        <td>          193        </td>        <td>          ACOND.SOFT DENT EGEO        </td>        <td>          $ 43.7        </td>        <td>          $ 39.33        </td>      </tr>      <tr>        <td>          220        </td>        <td>          INDIVIDO LUX C/SOBRE        </td>        <td>          $ 12.9        </td>        <td>          $ 11.61        </td>      </tr>      <tr>        <td>          12        </td>        <td>          ALGODON EN ROLLOS X 2        </td>        <td>          $ 4.0        </td>        <td>          $ 3.6        </td>      </tr>      <tr>        <td>          57        </td>        <td>          ROLLO P/ESTERILIZAR X 15CM.        </td>        <td>          $ 48.8        </td>        <td>          $ 43.92        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>    <!-- Prueba -->    <!-- Prueba --><img src=\"cid:IMG1\"/></body></html>','2014-12-10 21:28:36','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (29,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          8        </td>        <td>          XYLOCAINA DENTSPLY X 50        </td>        <td>          $ 150.0        </td>        <td>          $ 100.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- PRUEBA --><img src=\"cid:IMG1\"/></body></html>','2014-12-14 20:20:06','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (30,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- sefsfwef --><img src=\"cid:IMG1\"/></body></html>','2014-12-14 20:36:06','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (31,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- efwefwef --><img src=\"cid:IMG1\"/></body></html>','2014-12-14 20:37:29','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (32,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- efwefwefwefwf --><img src=\"cid:IMG1\"/></body></html>','2014-12-16 18:15:29','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (33,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- +952 --><img src=\"cid:IMG1\"/></body></html>','2014-12-16 18:23:10','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (34,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- zcbb --><img src=\"cid:IMG1\"/></body></html>','2014-12-16 18:48:57','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (35,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- efafaf --><img src=\"cid:IMG1\"/></body></html>','2014-12-16 19:01:02','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (36,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- fgnsfgn --><img src=\"cid:IMG1\"/></body></html>','2014-12-16 19:09:26','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (37,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          8        </td>        <td>          XYLOCAINA DENTSPLY X 50        </td>        <td>          $ 150.0        </td>        <td>          $ 100.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- bzx --><img src=\"cid:IMG1\"/></body></html>','2014-12-17 21:43:59','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (38,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          8        </td>        <td>          XYLOCAINA DENTSPLY X 50        </td>        <td>          $ 150.0        </td>        <td>          $ 100.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- xasfSG --><img src=\"cid:IMG1\"/></body></html>','2014-12-22 18:11:38','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (39,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>      <tr>        <td>          5        </td>        <td>          ANESTESIA SPRAY INDICAN        </td>        <td>          $ 22.0        </td>        <td>          $ 20.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- zdfsdfsdfdd --><img src=\"cid:IMG1\"/></body></html>','2014-12-22 18:27:07','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (40,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          1        </td>        <td>          ANESTESIA ANESCART FORTR X50.        </td>        <td>          $ 40.0        </td>        <td>          $ 35.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- DAS --><img src=\"cid:IMG1\"/></body></html>','2014-12-23 20:57:17','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (41,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          1        </td>        <td>          ANESTESIA ANESCART FORTR X50.        </td>        <td>          $ 40.0        </td>        <td>          $ 35.0        </td>      </tr>      <tr>        <td>          7        </td>        <td>          INDICAN GEL        </td>        <td>          $ 24.0        </td>        <td>          $ 18.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- SSSSS --><img src=\"cid:IMG1\"/></body></html>','2014-12-23 21:12:33','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (42,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          8        </td>        <td>          XYLOCAINA DENTSPLY X 50        </td>        <td>          $ 150.0        </td>        <td>          $ 100.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- `jolljm --><img src=\"cid:IMG1\"/></body></html>','2014-12-23 22:46:34','ENVIADO','');
INSERT INTO `anuncios` (`idAnuncio`,`textoMensaje`,`fecha`,`estado`,`membrete`) VALUES 
  (43,'<html><body><img src=\"cid:IMG0\"/><br/><br/><h1>      Titulo del anuncio    </h1>    <p>      P&#225;rrafo 1    </p>    <table>      <tr>        <th>          Cod.        </th>        <th>          Producto        </th>        <th>          Precio Vigente        </th>        <th>          Precio Promocional        </th>      </tr>      <tr>        <td>          8        </td>        <td>          XYLOCAINA DENTSPLY X 50        </td>        <td>          $ 150.0        </td>        <td>          $ 100.0        </td>      </tr>    </table>    <p>      P&#225;rrafo 2    </p>  <!-- xbbhzdhb --><img src=\"cid:IMG1\"/></body></html>','2015-02-27 15:54:09','ENVIADO','');
COMMIT;
/*!40000 ALTER TABLE `anuncios` ENABLE KEYS */;


--
-- Dumping data for table `categorias`
--

/*!40000 ALTER TABLE `categorias` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (1,'Anestesia');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (2,'Descartables');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (3,'Materiales P/Obturacion');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (4,'Cementos/Prov./Acrilicos');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (5,'Materiales P/Impresion');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (6,'Endodoncia');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (7,'Radiologia');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (8,'Instrumental');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (9,'Aparatologia');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (10,'Rotatorio');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (11,'Papeleria');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (12,'Medicamentos');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (13,'Varios');
INSERT INTO `categorias` (`idCategoria`,`descripcion`) VALUES 
  (14,'Ortodoncia');
COMMIT;
/*!40000 ALTER TABLE `categorias` ENABLE KEYS */;


--
-- Dumping data for table `clientes`
--

/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (1,'Maria','Anders','javierbartomioli@gmail.com','Periodoncia',1,'Obere Str. 57','030-0074321');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (2,'Ana','Trujillo','javierbartomioli@gmail.com','Periodoncia',1,'Avda. de la Constitucion 2222','(5) 555-4729');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (3,'Antonio','Moreno','javierbartomioli@gmail.com','Periodoncia',1,'Mataderos  2312','(5) 555-3932');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (4,'Thomas','Hardy','javierbartomioli@gmail.com','Gnatologia',1,'120 Hanover Sq.','(171) 555-7788');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (5,'Christina','Berglund','javierbartomioli@gmail.com','Gnatologia',1,'Watson 1300','0921-12 34 65');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (6,'Hanna','Moos','javierbartomioli@gmail.com','Gnatologia',1,'Forsterstr. 57','0621-08460');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (7,'Friderique','Citeaux','javierbartomioli@gmail.com','Endodoncia',1,'Sherlo Holmes 1256','88.60.15.31');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (8,'Martin','Sommer','javierbartomioli@gmail.com','Gnatologia',1,'C/ Araquil, 67','(91) 555 22 82');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (9,'Laurence','Lebihan','javierbartomioli@gmail.com','Odontologia General',1,'12, rue des Bouchers','91.24.45.40');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (10,'Elizabeth','Lincoln','javierbartomioli@gmail.com','Protesista',1,'23 Tsawassen Blvd.','(604) 555-4729');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (11,'Victoria','Ashworth','javierbartomioli@gmail.com','Odontologia General',1,'Fauntleroy Circus','(171) 555-1212');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (12,'Patricio','Simpson','javierbartomioli@gmail.com','Odontologia General',1,'Cerrito 333','(1) 135-5555');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (13,'Francisco','Chang','javierbartomioli@gmail.com','Endodoncia',1,'Sierras de Granada 9993','(5) 555-3392');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (14,'Yang','Wang','javierbartomioli@gmail.com','Odontologia General',1,'Hauptstr. 29','0452-076545');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (15,'Pedro','Afonso','javierbartomioli@gmail.com','Odontologia General',1,'Jose Ingenieros 25','(11) 555-7647');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (16,'Elizabeth','Brown','javierbartomioli@gmail.com','Odontologia General',1,'Berkeley Gardens 12  Brewery','(171) 555-2282');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (17,'Sven','Ottlieb','javierbartomioli@gmail.com','Odontologia General',1,'Walserweg 21','0241-039123');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (18,'Janine','Labrune','javierbartomioli@gmail.com','Odontologia General',1,'67, rue des Cinquante Otages','40.67.88.88');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (19,'Ann','Devon','javierbartomioli@gmail.com','Odontologia General',1,'35 King George','(171) 555-0297');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (20,'Roland','Mendel','javierbartomioli@gmail.com','Odontologia General',1,'Kirchgasse 6','7675-3425');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (21,'Aria','Cruz','javierbartomioli@gmail.com','Distribuidor',1,'Rua Ores 23','(11) 555-9857');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (22,'Diego','Roel','javierbartomioli@gmail.com','Protesista',1,'C/ Moralzarzal, 86','(91) 555 94 44');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (23,'Martine','Rance','javierbartomioli@gmail.com','Odontologia General',1,'Sarmientos 858','20.16.10.16');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (24,'Maria','Larsson','javierbartomioli@gmail.com','Odontologia General',1,'Jose Hernandez 1569','0695-34 67 21');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (25,'Peter','Franken','javierbartomioli@gmail.com','Endodoncia',1,'Berliner Platz 43','089-0877310');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (26,'Carine','Schmitt','carineschmitt@gmail.com','Endodoncia',1,'54, rue Royale','40.32.21.21');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (27,'Paolo','Accorti','jbartom@hotmail.com','Odontologia General',1,'Via Monte Bianco 34','011-4988260');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (28,'Lino','Rodriguez','jbartom@hotmail.com','Odontologia General',1,'Jardim das rosas n. 32','(1) 354-2534');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (29,'Eduardo','Saavedra','jbartom@hotmail.com','Endodoncia',1,'Miguel de Cervantes Saavedrea 1779','(93) 203 4560');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (30,'Jose','Pedro','jbartom@hotmail.com','Odontologia General',1,'C/ Romero, 33','(95) 555 82 82');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (31,'Andres','Fonseca','jbartom@hotmail.com','Odontologia General',1,'Av. Brasil, 442','(11) 555-9482');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (32,'Howard','Snyder','jbartom@hotmail.com','Endodoncia',1,'2732 Baker Blvd.','(503) 555-7555');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (33,'Manuel','Pereira','jbartom@hotmail.com','Odontologia General',1,'Isaac Asimov 1987','(2) 283-2951');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (34,'Mario','Pontes','jbartom@hotmail.com','Protesista',1,'George Orwell 1984','(21) 555-0091');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (35,'Carlos','Hernandez','jbartom@hotmail.com','Odontologia General',1,'Carrera 22 con Ave. Carlos Soublette #8-35','(5) 555-1340');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (36,'Yoshi','Latimer','jbartom@hotmail.com','Odontologia General',1,'City Center Plaza 516 Main St.','(503) 555-6874');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (37,'Patricia','McKenna','jbartom@hotmail.com','Odontologia General',1,'8 Johnstown Road','2967 542');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (38,'Helen','Bennett','jbartom@hotmail.com','Endodoncia',1,'Garden House Crowther Way','(198) 555-8888');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (39,'Philip','Cramer','jbartom@hotmail.com','Odontologia General',1,'Maubelstr. 90','0555-09876');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (40,'Daniel','Tonini','jbartom@hotmail.com','Odontologia General',1,'67, avenue de l\'Europe','30.59.84.10');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (41,'Annette','Roulet','jbartom@hotmail.com','Odontologia General',1,'1 rue Alsace-Lorraine','61.77.61.10');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (42,'Yoshi','Tannamuri','jbartom@hotmail.com','Distribuidor',1,'1900 Oak St.','(604) 555-3392');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (43,'John','Steel','jbartom@hotmail.com','Endodoncia',1,'12 Orchestra Terrace','(509) 555-7969');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (44,'Renate','Messner','jbartom@hotmail.com','Ortodoncia',1,'Magazinweg 7','069-0245984');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (45,'Jaime','Yorres','jbartom@hotmail.com','Odontologia General',1,'87 Polk St. Suite 5','(415) 555-5938');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (46,'Carlos','Gonzales','jbartom@hotmail.com','Protesista',1,'Simon Bolivar 794','(9) 331-6954');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (47,'Felipe','Izquierdo','jbartom@hotmail.com','Odontologia General',1,'Ave. 5 de Mayo Porlamar','(8) 34-56-12');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (48,'Fran','Wilson','jbartom@hotmail.com','Ortodoncia',1,'89 Chiaroscuro Rd.','(503) 555-9573');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (49,'Giovanni','Rovelli','jbartom@hotmail.com','Endodoncia',1,'Via Ludovico il Moro 22','035-640230');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (50,'Catherine','Dewey','jbartom@hotmail.com','Ortodoncia',1,'Rue Joseph-Bens 532','(02) 201 24 67');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (51,'Jean','Dobua','rnaredo_4@hotmail.com','Distribuidor',1,'43 rue St. Laurent','(514) 555-8054');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (52,'Alexander','Feuer','rnaredo_4@hotmail.com','Distribuidor',1,'Heerstr. 22','0342-023176');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (53,'Simon','Crowther','rnaredo_4@hotmail.com','Ortodoncia',1,'South House 300 Queensbridge','(171) 555-7733');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (54,'Yvonne','Moncada','rnaredo_4@hotmail.com','Ortodoncia',1,'Ing. Gustavo Moncada 8585 Piso 20-A','(1) 135-5333');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (55,'Rene','Phillips','rnaredo_4@hotmail.com','Ortodoncia',1,'2743 Bering St.','(907) 555-7584');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (56,'Henriette','Pfalzheim','rnaredo_4@hotmail.com','Odontologia General',1,'Mehrheimerstr. 369','0221-0644327');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (57,'Marie','Bertrand','rnaredo_4@hotmail.com','Odontologia General',1,'265, boulevard Charonne','(1) 42.34.22.66');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (58,'Guillermo','Fernandez','rnaredo_4@hotmail.com','Ortodoncia',1,'Calle Dr. Jorge Cash 321','(5) 552-3745');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (59,'Georg','Pipps','rnaredo_4@hotmail.com','Ortodoncia',1,'Geislweg 14','6562-9722');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (60,'Isabel','Suarez','rnaredo_4@hotmail.com','Ortodoncia',1,'Jean Paul Sartre 679','(1) 356-5634');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (61,'Bernardo','Batista','rnaredo_4@hotmail.com','Protesista',1,'Rua da Panificadora, 12','(21) 555-4252');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (62,'Lucia','Carvalho','rnaredo_4@hotmail.com','Distribuidor',1,'Ken Follet 3975','(11) 555-1189');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (63,'Horst','Kloss','rnaredo_4@hotmail.com','Protesista',1,'Pablo Neruda 588','0372-035188');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (64,'Sergio','Gutierrez','rnaredo_4@hotmail.com','Ortodoncia',1,'Av. del Libertador 900','(1) 123-5555');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (65,'Paula','Wilson','rnaredo_4@hotmail.com','Ortodoncia',1,'2817 Milton Dr.','(505) 555-5939');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (66,'Maurizio','Moroni','rnaredo_4@hotmail.com','Ortodoncia',1,'Strada Provinciale 124','0522-556721');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (67,'Janete','Limeira','rnaredo_4@hotmail.com','Ortodoncia',1,'Av. Copacabana, 267','(21) 555-3412');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (68,'Michael','Holz','rnaredo_4@hotmail.com','Ortodoncia',1,'Grenzacherweg 237','0897-034214');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (69,'Alejandra','Camino','rnaredo_4@hotmail.com','Protesista',1,'Gran via 1','(91) 745 6200');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (70,'Jonas','Bergulfsen','rnaredo_4@hotmail.com','Odontologia General',1,'Erling Skakkes gate 78','07-98 92 35');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (71,'Jose','Pavarotti','rnaredo_4@hotmail.com','Ortodoncia',1,'187 Suffolk Ln.','(208) 555-8097');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (72,'Hari','Kumar','rnaredo_4@hotmail.com','Ortodoncia',1,'90 Wadhurst Rd.','(171) 555-1717');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (73,'Jytte','Petersen','rnaredo_4@hotmail.com','Odontologia General',1,'Wagner 7923','31 12 34 56');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (74,'Dominique','Perrier','rnaredo_4@hotmail.com','Endodoncia',1,'25, rue Lauriston','(1) 47.55.60.10');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (75,'Art','Braunschweiger','rnaredo_4@hotmail.com','Ortodoncia',1,'P.O. Box 555','(307) 555-4680');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (76,'Pascale','Cartrain','sscproyecto@gmail.com','Protesista',1,'Boulevard Tirou, 255','(071) 23 67 22 20');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (77,'Liz','Nixon','sscproyecto@gmail.com','Endodoncia',1,'89 Jefferson Way Suite 2','(503) 555-3612');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (78,'Liu','Wong','sscproyecto@gmail.com','Distribuidor',1,'55 Grizzly Peak Rd.','(406) 555-5834');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (79,'Karin','Josephs','sscproyecto@gmail.com','Endodoncia',1,'Luisenstr. 48','0251-031259');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (80,'Miguel','Angel','sscproyecto@gmail.com','Odontologia General',1,'Avda. Azteca 123','(5) 555-2933');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (81,'Anabela','Dominguez','sscproyecto@gmail.com','Ortodoncia',1,'Av. San Martin 1988','(11) 555-2167');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (82,'Helvetius','Nagy','sscproyecto@gmail.com','Ortodoncia',1,'722 DaVinci Blvd.','(206) 555-8257');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (83,'Palle','Ibsen','sscproyecto@gmail.com','Ortodoncia',1,'Smagsloget 45','86 21 32 43');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (84,'Mary','Saveley','sscproyecto@gmail.com','Ortodoncia',1,'2, rue du Commerce','78.32.54.86');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (85,'Paul','Henriot','sscproyecto@gmail.com','Protesista',1,'59 rue de l\'Abbaye','26.47.15.10');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (86,'Rita','Miller','sscproyecto@gmail.com','Ortodoncia',1,'Adenauerallee 900','0711-020361');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (87,'Pirkko','Koskitalo','sscproyecto@gmail.com','Protesista',1,'Torikatu 38','981-443655');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (88,'Paula','Parente','sscproyecto@gmail.com','Ortodoncia',1,'Rua do Mercado, 12','(14) 555-8122');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (89,'Karl','Jablonski','sscproyecto@gmail.com','Odontologia General',1,'305 - 14th Ave. S. Suite 3B','(206) 555-4112');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (90,'Matti','Karttunen','sscproyecto@gmail.com','Ortodoncia',1,'Keskuskatu 45','90-224 8858');
INSERT INTO `clientes` (`idCliente`,`nombre`,`apellido`,`email`,`especialidad`,`tipo`,`direccion`,`telefono`) VALUES 
  (91,'Zbyszek','Piestrzeniewicz','sscproyecto@gmail.com','Odontologia General',1,'ul. Filtrowa 68','(26) 642-7012');
COMMIT;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;


--
-- Dumping data for table `clientes_anuncios`
--

/*!40000 ALTER TABLE `clientes_anuncios` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (3,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (5,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (6,4);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (7,38);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (8,4);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (8,38);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (9,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (10,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (10,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (10,29);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (10,37);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (10,38);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (10,40);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (10,42);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (10,43);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (14,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (17,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,4);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,29);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,37);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,38);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,40);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,42);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (19,43);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (20,8);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (20,26);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (20,40);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (21,5);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,2);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,3);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,9);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,10);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,11);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,12);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,13);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,14);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,15);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,16);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,17);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,18);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,20);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,21);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,22);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,23);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,24);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,25);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,27);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,30);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,31);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,32);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,33);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,34);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,35);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,36);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,39);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (24,41);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (25,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (39,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (42,5);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (43,38);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (47,8);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (47,26);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (47,40);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,2);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,3);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,6);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,9);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,10);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,11);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,12);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,13);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,14);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,15);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,16);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,17);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,18);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,20);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,21);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,22);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,23);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,24);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,25);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,27);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,30);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,31);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,34);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,35);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,36);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,39);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (50,41);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (51,5);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (52,5);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (56,6);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (58,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (58,4);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (58,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (58,29);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (58,37);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (58,38);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (58,42);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (58,43);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,2);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,3);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,9);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,10);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,11);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,12);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,13);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,14);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,15);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,16);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,17);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,18);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,20);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,21);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,22);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,23);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,24);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,25);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,27);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,30);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,31);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,34);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,35);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (61,36);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,5);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,29);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,37);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,38);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,40);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,42);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (62,43);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (63,2);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (63,3);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (63,8);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (63,15);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (65,2);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (65,3);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (65,8);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (65,15);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (65,26);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (67,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (67,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (67,29);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (67,37);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (67,38);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (67,40);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (67,42);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (67,43);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (71,6);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (71,18);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,2);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,3);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,9);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,10);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,11);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,12);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,13);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,14);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,15);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,16);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,17);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,18);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,20);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,21);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,22);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,23);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,24);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,25);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,27);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,30);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,31);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,34);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,35);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,36);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (76,41);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (78,5);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (78,6);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (79,6);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,1);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,2);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,3);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,9);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,10);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,11);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,12);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,13);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,14);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,15);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,16);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,17);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,18);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,19);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,20);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,21);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,22);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,23);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,24);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,25);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,27);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,30);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,31);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,34);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,35);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,36);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (84,41);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (86,6);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (87,6);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (87,18);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (87,28);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (89,6);
INSERT INTO `clientes_anuncios` (`idCliente`,`idAnuncio`) VALUES 
  (90,28);
COMMIT;
/*!40000 ALTER TABLE `clientes_anuncios` ENABLE KEYS */;


--
-- Dumping data for table `lineadepedido`
--

/*!40000 ALTER TABLE `lineadepedido` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `lineadepedido` (`idLinea`,`cantidad`,`idPedido`,`idProducto`) VALUES 
  (1,20,1,10);
INSERT INTO `lineadepedido` (`idLinea`,`cantidad`,`idPedido`,`idProducto`) VALUES 
  (2,15,1,22);
INSERT INTO `lineadepedido` (`idLinea`,`cantidad`,`idPedido`,`idProducto`) VALUES 
  (3,5,1,62);
INSERT INTO `lineadepedido` (`idLinea`,`cantidad`,`idPedido`,`idProducto`) VALUES 
  (4,5,2,5);
INSERT INTO `lineadepedido` (`idLinea`,`cantidad`,`idPedido`,`idProducto`) VALUES 
  (5,5,2,88);
COMMIT;
/*!40000 ALTER TABLE `lineadepedido` ENABLE KEYS */;


--
-- Dumping data for table `lineasdeventas`
--

/*!40000 ALTER TABLE `lineasdeventas` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1,15,5,10248,427);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2,72,10,10248,720);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (3,262,12,10248,824);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (4,679,9,10249,195);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (5,3060,40,10249,863);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (6,476,15,10250,154);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (7,1708,10,10250,470);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (8,15585,35,10250,514);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (9,1310,20,10251,104);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (10,326,6,10251,135);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (11,74,15,10251,461);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (12,880,40,10252,658);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (13,124,40,10252,776);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (14,1007,25,10252,819);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (15,168,42,10253,60);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (16,2808,40,10253,616);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (17,221,20,10253,724);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (18,302,15,10254,3);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (19,397,21,10254,177);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (20,1637,21,10254,882);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (21,366,20,10255,206);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (22,8001,35,10255,333);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (23,80,30,10255,376);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (24,1525,25,10255,781);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (25,298,15,10256,561);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (26,1318,12,10256,861);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (27,421,6,10257,299);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (28,15,25,10257,318);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (29,95,15,10257,631);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (30,22,6,10258,394);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (31,365,65,10258,773);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (32,6050,50,10258,881);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (33,939,1,10259,518);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (34,122,10,10259,667);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (35,556,15,10260,269);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (36,1659,16,10260,621);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (37,461,50,10260,638);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (38,176,21,10260,834);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (39,774,20,10261,313);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (40,440,20,10261,322);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (41,498,12,10262,101);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (42,1014,15,10262,123);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (43,4706,2,10262,488);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (44,499,36,10263,64);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (45,12150,60,10263,117);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (46,4190,60,10263,353);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (47,2064,28,10263,459);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (48,3447,25,10264,182);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (49,45,35,10264,826);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (50,384,20,10265,393);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (51,228,30,10265,608);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (52,174,12,10266,449);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (53,9737,70,10267,160);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (54,915,50,10267,577);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (55,1222,15,10267,884);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (56,6222,10,10268,536);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (57,68,4,10268,788);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (58,218,20,10269,214);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (59,329,60,10269,744);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (60,1864,25,10270,15);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (61,3381,30,10270,86);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (62,4303,24,10271,107);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (63,2928,40,10272,268);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (64,1295,6,10272,344);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (65,1354,24,10272,620);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (66,7,33,10273,48);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (67,4866,60,10273,75);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (68,319,15,10273,308);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (69,235,24,10273,331);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (70,2684,20,10273,442);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (71,982,7,10274,697);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (72,1024,20,10274,801);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (73,119,6,10275,561);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (74,179,12,10275,713);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (75,558,10,10276,216);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (76,56,15,10276,878);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (77,1830,12,10277,222);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (78,290,20,10277,680);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (79,146,16,10278,179);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (80,960,25,10278,290);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (81,39,8,10278,426);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (82,1006,15,10278,619);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (83,1407,15,10279,865);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (84,786,12,10280,70);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (85,1008,30,10280,244);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (86,220,20,10280,602);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (87,329,6,10281,171);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (88,31,1,10281,587);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (89,9,4,10281,767);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (90,73,6,10282,418);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (91,20,2,10282,741);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (92,326,20,10283,37);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (93,2335,18,10283,119);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (94,170,3,10283,292);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (95,605,35,10283,887);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (96,24,20,10284,339);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (97,11571,15,10284,524);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (98,46,5,10284,638);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (99,130,21,10284,827);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (100,1368,40,10285,143);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (101,60476,36,10285,504);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (102,139,45,10285,752);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (103,1503,100,10286,296);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (104,2440,40,10286,779);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (105,446,15,10287,200);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (106,548,20,10287,369);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (107,620,40,10287,847);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (108,146,10,10288,283);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (109,32,3,10288,712);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (110,5715,30,10289,126);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (111,457,9,10289,409);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (112,46,15,10290,49);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (113,1391,10,10290,118);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (114,844,15,10290,223);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (115,288,20,10290,264);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (116,32,2,10291,21);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (117,4526,24,10291,116);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (118,722,20,10291,831);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (119,1638,20,10292,91);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (120,214,5,10293,144);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (121,793,10,10293,348);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (122,8052,12,10293,512);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (123,362,6,10293,531);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (124,4325,18,10294,167);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (125,160,15,10294,380);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (126,271,6,10294,665);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (127,230,15,10294,772);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (128,784,21,10294,795);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (129,489,4,10295,112);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (130,3891,30,10296,119);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (131,180,15,10296,575);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (132,55,12,10296,841);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (133,5368,20,10297,100);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (134,1026,60,10297,788);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (135,2536,40,10298,41);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (136,531,30,10298,284);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (137,368,40,10298,401);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (138,10980,15,10298,533);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (139,24,20,10299,340);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (140,607,15,10299,622);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (141,1586,20,10300,113);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (142,4119,30,10300,282);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (143,214,20,10301,380);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (144,17,10,10301,846);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (145,498,12,10302,101);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (146,376,28,10302,320);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (147,732,40,10302,888);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (148,2268,15,10303,243);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (149,2768,40,10303,439);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (150,354,30,10303,839);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (151,549,30,10304,271);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (152,122,10,10304,842);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (153,27,2,10304,880);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (154,1885,25,10305,195);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (155,1677,25,10305,619);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (156,1536,30,10305,801);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (157,85,10,10306,32);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (158,87,10,10306,879);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (159,28,5,10306,896);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (160,194,3,10307,79);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (161,573,10,10307,430);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (162,40,1,10308,152);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (163,13,5,10308,894);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (164,114,20,10309,166);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (165,61,2,10309,279);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (166,100,20,10309,457);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (167,171,30,10309,607);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (168,220,3,10309,733);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (169,220,10,10310,199);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (170,20,5,10310,892);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (171,239,7,10311,203);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (172,176,6,10311,669);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (173,33598,20,10312,504);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (174,74,24,10312,564);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (175,95,10,10312,571);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (176,264,4,10312,871);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (177,161,12,10313,320);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (178,780,40,10314,589);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (179,735,25,10314,706);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (180,558,30,10314,844);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (181,642,30,10315,183);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (182,451,14,10315,229);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (183,13664,70,10316,522);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (184,98,10,10316,728);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (185,806,20,10317,819);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (186,319,6,10318,574);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (187,156,20,10318,578);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (188,293,30,10319,24);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (189,223,8,10319,205);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (190,43,14,10319,352);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (191,1737,30,10320,757);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (192,33,10,10321,341);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (193,2225,20,10322,672);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (194,244,5,10323,57);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (195,219,4,10323,215);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (196,1586,4,10323,485);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (197,11416,80,10324,238);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (198,1344,40,10324,244);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (199,48,21,10324,371);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (200,13908,30,10324,484);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (201,39025,70,10324,540);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (202,1175,6,10325,72);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (203,732,40,10325,336);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (204,96,12,10325,399);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (205,198,4,10325,630);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (206,110,9,10325,736);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (207,714,16,10326,743);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (208,2904,24,10326,881);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (209,1340,50,10326,900);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (210,630,35,10327,38);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (211,6115,50,10327,112);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (212,2975,25,10327,387);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (213,66,30,10327,767);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (214,293,10,10328,226);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (215,1208,9,10328,769);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (216,620,40,10328,847);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (217,528,20,10329,34);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (218,815,8,10329,232);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (219,56,12,10329,392);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (220,98,10,10329,438);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (221,3675,25,10330,69);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (222,7320,50,10330,699);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (223,1690,15,10331,86);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (224,2419,16,10332,243);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (225,371,10,10332,269);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (226,100576,40,10332,473);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (227,177,10,10333,284);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (228,387,10,10333,313);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (229,988,40,10333,469);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (230,351,8,10334,174);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (231,195,10,10334,191);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (232,1070,7,10335,347);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (233,60010,48,10335,521);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (234,280,25,10335,626);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (235,3022,6,10335,852);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (236,1208,18,10336,181);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (237,18300,25,10337,533);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (238,187,24,10337,768);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (239,1128,28,10337,819);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (240,4860,40,10337,843);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (241,196,20,10337,868);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (242,418,20,10338,27);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (243,528,15,10338,573);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (244,416,10,10339,74);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (245,350,70,10339,609);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (246,1086,28,10339,799);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (247,107,40,10340,376);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (248,102,12,10340,640);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (249,10126,20,10340,832);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (250,1659,8,10341,435);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (251,406,9,10341,665);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (252,82,24,10342,25);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (253,1664,40,10342,74);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (254,264,40,10342,338);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (255,1596,56,10342,651);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (256,302,4,10343,195);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (257,1415,50,10343,355);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (258,127,15,10343,552);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (259,2135,70,10344,2);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (260,178,35,10344,579);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (261,294,70,10345,406);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (262,5369,9,10345,480);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (263,44600,80,10345,540);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (264,1012,36,10346,96);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (265,486,20,10346,447);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (266,10,6,10347,43);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (267,51,10,10347,576);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (268,46,4,10347,687);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (269,245,50,10347,789);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (270,1760,25,10348,280);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (271,439,15,10348,669);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (272,122,24,10349,579);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (273,22,18,10350,209);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (274,765,15,10350,691);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (275,4019,77,10351,190);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (276,2286,10,10351,333);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (277,645,13,10351,630);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (278,110,20,10351,744);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (279,112,20,10352,604);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (280,224,10,10352,649);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (281,1830,12,10353,222);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (282,734,50,10353,278);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (283,146,4,10354,71);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (284,15,12,10354,748);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (285,855,25,10355,140);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (286,108,25,10355,745);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (287,3353,12,10356,235);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (288,267,30,10356,385);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (289,34,20,10356,846);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (290,1206,16,10357,195);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (291,255,30,10357,285);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (292,590,8,10357,459);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (293,372,10,10358,560);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (294,145,10,10358,680);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (295,220,20,10358,686);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (296,1168,80,10359,246);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (297,409,56,10359,790);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (298,1537,70,10359,870);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (299,1701,35,10360,310);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (300,7,30,10360,342);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (301,390,10,10360,629);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (302,154,28,10360,693);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (303,143,35,10360,722);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (304,1058,55,10361,256);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (305,2743,54,10361,409);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (306,730,50,10362,59);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (307,1435,24,10362,684);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (308,372,20,10362,844);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (309,74,12,10363,396);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (310,512,20,10363,586);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (311,234,12,10363,589);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (312,875,30,10364,372);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (313,11,5,10364,558);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (314,14054,24,10365,857);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (315,219,5,10366,55);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (316,91,5,10366,671);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (317,1004,18,10367,216);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (318,3902,7,10367,540);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (319,140,15,10367,600);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (320,263,36,10367,823);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (321,626,35,10368,263);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (322,1189,5,10368,493);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (323,1774,13,10368,800);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (324,640,25,10368,845);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (325,351,18,10369,565);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (326,328,20,10369,641);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (327,549,30,10370,300);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (328,14091,15,10370,518);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (329,114,20,10370,607);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (330,230,6,10371,290);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (331,2041,70,10372,372);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (332,732,40,10372,577);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (333,6149,42,10372,612);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (334,248,12,10372,654);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (335,2489,80,10373,794);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (336,15860,50,10373,856);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (337,970,15,10374,146);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (338,1977,30,10374,871);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (339,1708,10,10375,129);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (340,124,15,10375,718);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (341,2083,42,10376,630);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (342,952,20,10377,82);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (343,308,20,10377,710);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (344,59,6,10378,331);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (345,186,8,10379,7);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (346,59,16,10379,597);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (347,24,20,10379,784);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (348,6832,20,10380,80);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (349,1474,18,10380,91);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (350,435,30,10380,449);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (351,242,6,10380,889);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (352,906,14,10381,146);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (353,2166,60,10382,44);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (354,1366,32,10382,170);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (355,131,9,10382,413);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (356,550,50,10382,602);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (357,854,14,10382,781);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (358,2562,15,10383,129);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (359,188,20,10383,606);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (360,268,20,10383,709);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (361,1897,15,10384,307);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (362,1845,28,10384,871);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (363,44,10,10385,46);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (364,2940,20,10385,69);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (365,74,8,10385,601);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (366,95,15,10386,252);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (367,202,10,10386,811);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (368,243,6,10387,368);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (369,55,15,10387,431);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (370,7320,12,10387,498);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (371,970,15,10387,897);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (372,1684,20,10388,111);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (373,1172,40,10388,669);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (374,516,15,10388,683);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (375,246,16,10389,262);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (376,849,30,10389,355);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (377,2684,20,10389,442);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (378,9333,15,10389,536);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (379,170,24,10390,464);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (380,176264,40,10390,519);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (381,1206,45,10390,662);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (382,60,60,10390,876);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (383,30744,18,10391,500);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (384,9430,50,10392,116);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (385,2512,42,10393,684);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (386,1043,25,10393,688);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (387,393,70,10393,773);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (388,13,7,10393,798);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (389,1181,32,10393,849);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (390,2,10,10394,48);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (391,1391,10,10394,118);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (392,439,8,10395,162);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (393,104,28,10395,210);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (394,42700,70,10395,543);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (395,1764,60,10396,706);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (396,256,21,10396,714);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (397,22704,40,10396,797);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (398,671,10,10397,812);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (399,2187,18,10397,843);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (400,8112,120,10398,123);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (401,147,30,10398,792);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (402,294,60,10399,31);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (403,119,14,10399,730);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (404,261,30,10399,879);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (405,665,35,10399,890);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (406,200,21,10400,176);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (407,234,35,10400,258);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (408,150,30,10400,455);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (409,1540,70,10401,5);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (410,5052,60,10401,111);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (411,292,20,10401,420);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (412,76,18,10401,774);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (413,872,65,10402,320);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (414,39084,60,10402,542);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (415,338,21,10403,21);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (416,1045,70,10403,424);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (417,804,30,10404,408);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (418,94131,30,10404,486);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (419,2048,40,10404,801);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (420,490,50,10405,466);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (421,1464,30,10406,68);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (422,327,5,10406,254);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (423,140,2,10406,616);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (424,98,10,10406,719);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (425,23839,42,10406,797);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (426,5037,15,10407,127);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (427,260,30,10407,523);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (428,266,15,10407,729);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (429,119,6,10408,561);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (430,17,35,10408,816);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (431,434,10,10408,821);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (432,659,12,10409,162);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (433,146,12,10409,418);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (434,1651,49,10410,415);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (435,70,16,10410,422);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (436,880,40,10411,199);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (437,193,9,10411,315);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (438,137,25,10411,363);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (439,878,20,10412,42);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (440,89,14,10413,252);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (441,65,24,10413,562);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (442,732,40,10413,663);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (443,3395,18,10414,116);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (444,1620,50,10414,364);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (445,756,20,10415,337);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (446,134,2,10415,619);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (447,1373,10,10416,282);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (448,768,20,10416,290);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (449,96,20,10416,591);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (450,10065,50,10417,419);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (451,220,36,10417,627);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (452,46,2,10417,676);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (453,115,35,10417,875);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (454,9910,16,10418,547);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (455,141,15,10418,606);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (456,23,60,10418,750);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (457,5703,55,10418,771);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (458,4758,60,10419,113);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (459,744,20,10419,172);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (460,85,20,10420,50);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (461,66,2,10420,642);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (462,54,8,10420,646);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (463,3464,20,10420,696);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (464,780,15,10421,230);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (465,438,30,10421,413);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (466,805,10,10421,624);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (467,17,4,10421,867);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (468,131,2,10422,70);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (469,230,14,10423,641);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (470,414,20,10423,654);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (471,14001,30,10424,483);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (472,152,49,10424,815);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (473,1116,60,10424,844);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (474,134,20,10425,598);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (475,73,10,10425,682);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (476,1202,5,10426,167);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (477,570,7,10426,884);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (478,175,35,10427,609);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (479,48458,20,10428,491);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (480,12040,40,10429,84);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (481,581,35,10429,584);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (482,33550,50,10430,512);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (483,194,45,10430,867);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (484,231,70,10430,875);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (485,1194,30,10430,898);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (486,10790,50,10431,344);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (487,66,30,10431,767);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (488,460,50,10431,813);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (489,244,10,10432,26);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (490,448,40,10432,626);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (491,1264,28,10433,665);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (492,30,6,10434,186);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (493,2471,18,10434,282);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (494,283,10,10435,355);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (495,1712,10,10435,389);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (496,22,12,10435,835);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (497,943,5,10436,116);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (498,545,24,10436,198);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (499,4076,40,10436,232);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (500,1062,30,10436,737);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (501,19,15,10437,826);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (502,366,15,10438,26);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (503,580,20,10438,212);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (504,528,15,10438,573);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (505,10980,15,10439,533);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (506,53,6,10439,580);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (507,1536,30,10439,636);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (508,429,16,10439,662);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (509,849,90,10440,54);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (510,3338,24,10440,160);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (511,55,45,10440,340);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (512,478,49,10440,731);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (513,4085,50,10441,58);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (514,2808,30,10442,6);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (515,252,60,10442,406);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (516,48800,80,10442,543);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (517,538,12,10443,151);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (518,103,6,10443,446);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (519,60,15,10444,12);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (520,234,30,10444,173);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (521,92,10,10444,332);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (522,98,8,10444,452);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (523,87,15,10445,400);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (524,56,6,10445,601);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (525,444,20,10446,29);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (526,1062,15,10446,133);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (527,165,3,10446,171);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (528,2050,12,10446,470);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (529,40,2,10447,3);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (530,640,35,10447,301);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (531,26840,40,10447,512);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (532,1003,6,10448,120);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (533,432,20,10448,639);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (534,444,20,10449,29);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (535,896,35,10449,161);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (536,20257,14,10449,505);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (537,139,6,10450,7);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (538,780,20,10450,40);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (539,2202,28,10451,110);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (540,5604,120,10451,287);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (541,24491,55,10451,514);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (542,2852,35,10451,884);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (543,274,15,10452,336);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (544,1830,100,10452,346);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (545,1229,15,10453,91);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (546,703,25,10453,96);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (547,6076,20,10454,527);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (548,41,10,10454,605);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (549,1010,20,10454,860);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (550,1317,30,10455,42);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (551,292,20,10455,59);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (552,6100,50,10455,156);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (553,1648,25,10455,871);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (554,416,21,10456,90);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (555,101356,40,10456,478);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (556,1382,36,10457,290);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (557,1160,50,10458,7);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (558,594,30,10458,388);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (559,186,15,10458,397);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (560,423,30,10458,440);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (561,146,20,10458,689);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (562,2794,20,10459,87);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (563,174,16,10459,653);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (564,872,40,10459,824);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (565,16199,21,10460,524);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (566,49,4,10460,637);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (567,10272,60,10461,389);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (568,756,40,10461,445);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (569,238,28,10461,552);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (570,146,1,10462,699);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (571,118,21,10462,896);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (572,342,21,10463,37);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (573,962,50,10463,256);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (574,594,16,10464,137);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (575,1134,30,10464,233);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (576,1062,20,10464,574);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (577,34,3,10464,626);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (578,535,25,10465,183);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (579,87,25,10465,251);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (580,165,30,10465,395);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (581,100,20,10465,456);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (582,99,18,10465,556);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (583,976,10,10466,147);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (584,290,5,10466,566);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (585,3912,28,10467,87);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (586,7,12,10467,318);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (587,1056,15,10468,280);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (588,62,8,10468,578);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (589,2307,35,10469,141);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (590,132,2,10469,255);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (591,200,40,10469,455);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (592,438,30,10470,59);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (593,165,15,10470,652);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (594,1291,8,10470,820);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (595,585,30,10471,265);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (596,1069,20,10471,822);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (597,7906,18,10472,526);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (598,1328,80,10472,584);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (599,190,12,10473,67);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (600,9560,12,10473,481);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (601,1319,21,10474,8);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (602,64,10,10474,377);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (603,194,12,10474,468);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (604,1753,18,10474,474);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (605,8562,60,10475,238);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (606,155,42,10475,759);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (607,45,35,10475,826);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (608,310,2,10476,76);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (609,303,12,10476,362);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (610,82,15,10477,556);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (611,244,20,10477,637);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (612,1203,21,10477,694);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (613,122,20,10478,358);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (614,283,30,10479,54);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (615,12516,30,10479,515);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (616,556,28,10479,561);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (617,438,60,10479,790);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (618,198,30,10480,338);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (619,637,12,10480,574);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (620,398,24,10481,584);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (621,684,40,10481,788);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (622,1347,10,10482,114);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (623,4173,30,10483,118);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (624,647,35,10483,705);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (625,659,10,10484,255);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (626,983,14,10484,616);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (627,421,3,10484,697);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (628,854,20,10485,170);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (629,446,20,10485,373);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (630,125538,60,10485,503);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (631,279,30,10485,601);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (632,201,5,10486,152);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (633,128,16,10486,399);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (634,1336,25,10486,822);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (635,262,5,10487,266);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (636,729,30,10487,447);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (637,58150,24,10487,491);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (638,332,20,10488,582);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (639,768,30,10488,845);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (640,1339,18,10489,674);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (641,388,15,10489,808);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (642,40260,60,10490,512);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (643,1056,30,10490,573);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (644,1274,36,10490,737);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (645,682,7,10491,474);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (646,333,15,10491,679);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (647,366,60,10492,407);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (648,34,20,10492,846);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (649,262,10,10493,39);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (650,378,10,10493,233);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (651,58560,15,10493,545);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (652,37,30,10494,339);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (653,111,5,10495,373);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (654,55,10,10495,556);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (655,346,20,10495,887);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (656,1952,20,10496,130);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (657,747,25,10497,257);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (658,711,14,10497,409);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (659,270,25,10497,837);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (660,1008,5,10498,180);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (661,290,14,10498,583);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (662,326,30,10498,653);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (663,4392,25,10499,213);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (664,366,20,10499,336);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (665,238,12,10500,561);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (666,706,8,10500,618);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (667,216,20,10501,837);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (668,74,6,10502,581);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (669,300,30,10502,700);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (670,36,21,10502,846);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (671,245,70,10503,251);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (672,402,20,10503,326);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (673,365,25,10504,323);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (674,140,12,10504,557);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (675,11,10,10504,740);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (676,714,12,10504,805);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (677,10980,3,10505,513);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (678,479,14,10506,203);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (679,401,18,10506,373);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (680,915,15,10507,109);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (681,150,15,10507,625);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (682,305,10,10508,2);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (683,220,10,10508,870);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (684,37,3,10509,581);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (685,1669,36,10510,128);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (686,259,36,10510,720);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (687,730,50,10511,30);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (688,25620,10,10511,508);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (689,250,50,10511,609);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (690,498,9,10512,53);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (691,388,6,10512,146);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (692,26352,12,10512,501);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (693,108,10,10512,837);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (694,372,15,10513,596);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (695,281,50,10513,773);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (696,15,40,10513,817);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (697,1092,39,10514,169);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (698,10248,70,10514,218);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (699,12200,50,10514,410);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (700,801,35,10514,676);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (701,281,39,10514,720);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (702,307,84,10515,563);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (703,149,16,10515,601);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (704,1344,120,10515,626);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (705,1100,50,10515,658);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (706,1054,16,10515,871);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (707,4058,25,10516,145);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (708,86,20,10516,334);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (709,2048,80,10516,692);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (710,259,4,10517,79);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (711,249,6,10517,101);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (712,11639,6,10517,490);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (713,248,5,10518,630);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (714,327,15,10518,824);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (715,355,9,10518,886);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (716,311,10,10519,275);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (717,59,16,10519,451);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (718,2380,40,10519,805);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (719,35,8,10520,422);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (720,86,5,10520,570);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (721,732,6,10521,124);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (722,137,10,10521,807);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (723,112,3,10521,873);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (724,1160,40,10522,212);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (725,414,20,10522,530);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (726,538,24,10522,666);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (727,487,25,10522,783);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (728,567,15,10523,233);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (729,220,18,10523,418);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (730,116,6,10523,555);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (731,488,25,10523,565);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (732,68,2,10524,140);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (733,294,60,10524,217);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (734,205,10,10524,590);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (735,117,15,10524,768);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (736,1977,30,10525,255);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (737,333,15,10525,679);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (738,4173,30,10526,118);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (739,156,8,10526,297);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (740,633,10,10526,416);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (741,1710,50,10527,143);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (742,150,30,10527,455);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (743,49,8,10528,407);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (744,37,3,10528,581);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (745,186,9,10528,654);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (746,894,20,10529,208);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (747,390,10,10529,629);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (748,52,14,10529,726);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (749,1912,40,10530,286);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (750,36173,25,10530,505);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (751,62,20,10530,564);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (752,9760,50,10530,698);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (753,159,2,10531,348);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (754,966,24,10532,152);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (755,137,15,10532,895);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (756,907,24,10533,233);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (757,785,50,10533,276);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (758,89,24,10533,878);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (759,67,10,10534,598);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (760,574,10,10534,623);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (761,13,10,10534,826);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (762,1263,15,10535,111);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (763,10370,50,10535,224);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (764,1397,5,10535,235);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (765,114,10,10535,687);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (766,777,35,10536,29);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (767,2222,20,10536,189);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (768,1572,30,10536,266);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (769,108,15,10536,720);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (770,264,6,10537,73);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (771,3246,20,10537,145);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (772,37,30,10537,209);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (773,462,21,10537,322);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (774,209,9,10537,525);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (775,713,7,10538,232);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (776,8,1,10538,274);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (777,2650,6,10539,482);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (778,130,15,10539,523);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (779,263,8,10539,642);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (780,183,15,10539,659);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (781,1166,40,10540,372);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (782,972,60,10540,468);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (783,420,35,10540,575);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (784,264,30,10540,838);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (785,219,9,10541,447);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (786,208,4,10541,462);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (787,16031,36,10541,514);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (788,256,35,10541,790);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (789,386,24,10542,21);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (790,126,15,10542,81);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (791,153,30,10543,576);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (792,1708,70,10543,739);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (793,59,7,10544,81);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (794,38,7,10544,441);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (795,205,10,10545,572);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (796,525,10,10546,108);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (797,5856,40,10546,417);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (798,1719,30,10546,430);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (799,1049,24,10547,55);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (800,329,60,10547,693);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (801,305,10,10548,2);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (802,5551,14,10548,485);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (803,5200,100,10549,230);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (804,8052,55,10549,612);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (805,15226,48,10549,856);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (806,104,6,10550,14);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (807,445,10,10550,95);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (808,742,8,10550,365);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (809,43,10,10550,867);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (810,2220,20,10551,93);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (811,146400,40,10551,477);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (812,820,40,10551,572);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (813,19764,30,10552,539);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (814,1098,18,10552,781);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (815,48,15,10553,89);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (816,48,30,10553,335);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (817,693,14,10553,366);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (818,288,24,10553,575);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (819,59,6,10553,868);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (820,247,10,10554,469);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (821,732,30,10554,548);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (822,551,20,10554,681);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (823,342,20,10554,883);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (824,88,18,10555,217);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (825,5898,20,10555,383);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (826,448,30,10555,424);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (827,30856,40,10555,524);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (828,147,35,10555,774);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (829,634,24,10556,34);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (830,2318,20,10557,760);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (831,1119,30,10557,873);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (832,20,3,10558,338);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (833,112,20,10558,604);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (834,2592,25,10558,771);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (835,219,30,10558,823);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (836,164,18,10558,895);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (837,378,18,10559,261);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (838,70,12,10559,840);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (839,5,20,10560,342);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (840,279,15,10560,844);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (841,675,50,10561,444);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (842,369,10,10561,849);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (843,1347,10,10562,114);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (844,634,20,10562,139);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (845,31171,70,10563,514);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (846,180,25,10563,720);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (847,113,6,10564,177);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (848,331,16,10564,567);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (849,220,25,10564,838);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (850,137,25,10565,593);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (851,74,18,10565,605);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (852,3416,35,10566,147);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (853,2471,18,10566,282);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (854,369,10,10566,849);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (855,209,3,10567,94);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (856,615,40,10567,262);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (857,1188,60,10567,388);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (858,26,5,10568,370);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (859,770,35,10569,5);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (860,6222,30,10569,435);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (861,1428,60,10570,17);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (862,183,15,10570,714);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (863,171,28,10571,187);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (864,427,11,10571,799);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (865,311,15,10572,23);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (866,335,12,10572,205);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (867,915,50,10572,301);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (868,55,10,10572,395);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (869,1952,40,10573,57);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (870,1012,25,10573,368);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (871,241,18,10573,701);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (872,481,10,10574,159);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (873,1208,6,10574,419);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (874,6,2,10574,628);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (875,49,14,10574,633);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (876,146,6,10575,62);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (877,3294,30,10575,88);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (878,59,12,10575,461);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (879,17080,10,10575,532);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (880,1480,20,10576,163);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (881,974,10,10576,474);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (882,13,21,10576,874);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (883,324,18,10577,38);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (884,189,20,10577,54);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (885,616,10,10577,149);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (886,366,20,10578,271);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (887,52,6,10578,879);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (888,779,21,10579,269);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (889,116,10,10579,725);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (890,202,9,10580,138);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (891,2094,15,10580,231);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (892,228,30,10580,608);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (893,31,50,10581,595);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (894,559,4,10582,87);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (895,650,14,10582,192);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (896,535,10,10583,78);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (897,598,10,10583,684);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (898,3989,24,10583,830);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (899,460,50,10584,332);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (900,165,15,10585,652);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (901,200,4,10586,291);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (902,4564,20,10587,241);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (903,278,6,10587,450);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (904,220,20,10587,758);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (905,152256,40,10588,472);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (906,2196,100,10588,870);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (907,1757,4,10589,535);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (908,2166,60,10590,44);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (909,1196,20,10590,684);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (910,3050,10,10591,225);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (911,7645,50,10591,347);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (912,346,14,10591,469);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (913,22,5,10592,529);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (914,793,25,10592,859);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (915,148,4,10593,137);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (916,63,20,10593,467);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (917,653,21,10593,794);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (918,61488,24,10594,508);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (919,150,30,10594,609);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (920,1391,65,10595,183);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (921,2342,120,10595,565);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (922,558,30,10595,844);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (923,1644,30,10596,215);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (924,14,5,10596,562);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (925,187,24,10596,578);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (926,256,20,10597,165);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (927,791,12,10597,255);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (928,1620,35,10597,450);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (929,1257,9,10598,87);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (930,4095,50,10598,194);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (931,671,10,10599,181);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (932,360,30,10600,361);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (933,342,4,10600,511);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (934,3348,60,10601,216);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (935,222,35,10601,252);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (936,549,5,10602,88);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (937,1432,25,10603,430);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (938,2779,48,10603,757);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (939,194,10,10604,248);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (940,4780,6,10604,481);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (941,237,15,10605,67);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (942,123403,70,10605,544);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (943,1530,30,10605,691);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (944,2730,20,10605,800);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (945,1268,20,10606,98);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (946,2660,20,10606,495);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (947,403,10,10606,819);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (948,4612,42,10607,88);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (949,3220,100,10607,229);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (950,6179,45,10607,282);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (951,444,14,10607,550);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (952,484,12,10607,819);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (953,76,28,10608,402);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (954,171,10,10609,309);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (955,62,3,10609,583);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (956,55,6,10609,813);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (957,1554,21,10610,163);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (958,47,6,10611,288);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (959,238,15,10611,360);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (960,6222,10,10611,536);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (961,872,80,10612,52);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (962,3040,55,10612,53);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (963,224,40,10612,604);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (964,241,18,10612,701);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (965,2527,70,10612,831);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (966,107,8,10613,320);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (967,768,40,10613,393);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (968,435,14,10614,275);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (969,83,5,10614,584);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (970,1291,8,10614,820);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (971,15,5,10615,752);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (972,459,15,10616,204);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (973,549,15,10616,270);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (974,110,15,10616,735);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (975,283,14,10616,811);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (976,14955,30,10617,537);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (977,34160,70,10618,63);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (978,861,15,10618,623);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (979,146,20,10618,678);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (980,575,42,10619,807);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (981,6648,40,10619,830);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (982,2226,5,10620,514);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (983,46,5,10620,813);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (984,133,15,10621,580);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (985,25,5,10621,594);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (986,598,20,10621,833);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (987,122,10,10621,842);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (988,4316,20,10622,344);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (989,79319,18,10622,519);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (990,1395,25,10623,216);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (991,243,15,10623,468);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (992,13,21,10623,595);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (993,45,3,10623,713);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (994,66,30,10623,767);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (995,427,10,10624,170);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (996,145,10,10624,449);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (997,91,6,10624,711);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (998,260,5,10625,230);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (999,106,3,10625,737);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1000,1210,10,10625,881);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1001,454,12,10626,233);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1002,2530,20,10626,307);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1003,166,20,10626,718);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1004,5124,35,10627,417);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1005,201,15,10627,701);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1006,137,25,10628,556);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1007,85,9,10629,54);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1008,586,20,10629,669);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1009,560,12,10630,298);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1010,749,35,10630,315);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1011,522,8,10631,643);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1012,915,30,10632,2);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1013,1822,20,10632,460);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1014,7247,36,10633,419);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1015,143,13,10633,453);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1016,865,35,10633,469);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1017,680,80,10633,552);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1018,16,2,10634,288);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1019,2613,50,10634,356);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1020,906,15,10634,531);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1021,574,35,10634,641);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1022,480,40,10635,575);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1023,100,15,10635,598);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1024,281,10,10635,746);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1025,22,6,10636,451);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1026,732,25,10636,669);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1027,12444,60,10637,224);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1028,336,10,10637,244);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1029,366,25,10637,267);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1030,34,20,10638,375);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1031,937,21,10638,743);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1032,90,60,10638,775);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1033,1868,8,10639,465);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1034,366,15,10640,62);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1035,236,20,10640,839);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1036,6980,50,10641,231);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1037,474,60,10641,390);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1038,1902,30,10642,41);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1039,722,20,10642,831);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1040,7,2,10643,25);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1041,4026,15,10643,100);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1042,384,21,10643,295);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1043,2724,21,10644,119);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1044,15,4,10644,210);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1045,768,20,10644,290);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1046,494,20,10645,469);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1047,24980,15,10645,471);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1048,731,35,10646,27);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1049,2646,18,10646,69);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1050,2435,15,10646,145);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1051,2220,30,10646,163);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1052,512,20,10647,161);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1053,861,30,10647,585);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1054,333,15,10648,679);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1055,232,15,10648,847);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1056,5,20,10649,342);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1057,230,15,10649,772);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1058,640,25,10650,201);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1059,2049,30,10650,294);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1060,75,30,10650,854);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1061,2921,12,10651,122);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1062,302,20,10651,711);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1063,98,20,10652,31);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1064,40,2,10652,388);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1065,98,20,10653,594);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1066,696,30,10653,707);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1067,586,6,10654,130);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1068,634,20,10654,550);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1069,266,12,10654,679);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1070,495,20,10655,596);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1071,286,6,10656,82);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1072,205,3,10656,294);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1073,27,28,10656,354);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1074,102,30,10657,25);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1075,2493,45,10657,260);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1076,110,10,10657,453);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1077,729,45,10657,468);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1078,12941,24,10657,497);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1079,2590,50,10657,778);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1080,1540,70,10658,5);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1081,181,55,10658,341);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1082,686,70,10658,466);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1083,150864,60,10658,473);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1084,1048,20,10659,266);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1085,996,24,10659,411);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1086,156,40,10659,892);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1087,7174,21,10660,80);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1088,152,49,10661,49);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1089,22,3,10661,735);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1090,85,10,10662,274);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1091,316,20,10663,67);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1092,2286,30,10663,314);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1093,7149,30,10663,324);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1094,689,12,10664,623);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1095,269,24,10664,626);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1096,205,15,10664,807);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1097,85,10,10665,10);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1098,2038,20,10665,232);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1099,12,1,10665,736);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1100,1012,36,10666,96);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1101,21960,10,10666,501);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1102,6862,45,10667,222);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1103,939,14,10667,765);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1104,274,15,10668,301);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1105,171,8,10668,311);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1106,204,4,10668,691);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1107,111,30,10669,632);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1108,1220,25,10670,57);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1109,115,50,10670,371);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1110,95,25,10670,592);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1111,2419,32,10670,615);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1112,1458,60,10670,742);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1113,449,12,10671,437);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1114,19,10,10671,551);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1115,732,10,10671,617);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1116,1616,12,10672,114);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1117,6771,15,10672,489);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1118,26,6,10673,334);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1119,88,3,10673,706);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1120,82,6,10673,807);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1121,40,5,10674,288);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1122,1209,30,10675,202);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1123,463,10,10675,450);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1124,615,30,10675,572);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1125,381,2,10676,126);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1126,15,21,10676,559);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1127,41,7,10676,840);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1128,293,8,10677,270);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1129,147,30,10677,378);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1130,58560,120,10678,63);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1131,4119,30,10678,282);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1132,25620,100,10678,494);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1133,294,30,10678,719);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1134,107,12,10679,385);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1135,1830,50,10680,71);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1136,9272,20,10680,484);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1137,352,40,10680,838);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1138,844,12,10681,106);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1139,61488,28,10681,501);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1140,99,30,10681,875);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1141,4869,30,10682,145);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1142,360,30,10682,361);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1143,6832,4,10682,532);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1144,110,9,10683,384);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1145,2792,20,10684,231);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1146,186,30,10684,396);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1147,548,40,10684,807);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1148,78,4,10685,248);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1149,506,20,10685,362);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1150,476,15,10685,859);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1151,787,30,10686,329);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1152,56,15,10686,878);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1153,43,10,10687,50);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1154,850,50,10687,196);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1155,223,6,10687,747);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1156,145,18,10688,51);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1157,119,14,10688,274);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1158,220,60,10688,563);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1159,770,35,10689,658);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1160,7149,30,10690,324);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1161,110,20,10690,556);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1162,718,24,10691,257);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1163,293,48,10691,407);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1164,1660,40,10691,411);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1165,888,40,10691,673);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1166,51,30,10691,846);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1167,195,20,10692,250);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1168,501,30,10693,28);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1169,44,6,10693,249);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1170,978,60,10693,650);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1171,110,15,10693,790);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1172,43,25,10694,425);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1173,396594,90,10694,519);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1174,560,50,10694,814);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1175,342,4,10695,148);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1176,1232,20,10695,149);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1177,708,10,10695,273);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1178,600,18,10696,304);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1179,9970,20,10696,537);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1180,2654,9,10697,383);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1181,732,30,10697,548);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1182,3337,30,10697,672);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1183,30,7,10697,867);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1184,35,8,10698,46);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1185,87,8,10698,214);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1186,791,12,10698,255);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1187,3867,65,10698,805);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1188,177,15,10698,839);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1189,412,12,10699,131);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1190,644,12,10700,239);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1191,480,60,10700,399);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1192,15,5,10700,564);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1193,2684,40,10700,619);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1194,21,35,10701,47);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1195,1172,42,10701,205);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1196,195,20,10701,731);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1197,77,6,10702,165);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1198,364,15,10702,742);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1199,867,5,10703,121);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1200,15585,35,10703,534);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1201,197,35,10703,773);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1202,204,24,10704,10);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1203,1495,35,10704,144);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1204,86,6,10704,264);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1205,6,4,10705,335);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1206,78,20,10705,892);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1207,1200,24,10706,103);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1208,30451,8,10706,472);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1209,414,20,10706,530);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1210,512,21,10707,11);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1211,1188,40,10707,200);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1212,509,28,10707,303);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1213,131,4,10708,115);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1214,172,5,10708,683);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1215,34,28,10709,349);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1216,222,10,10709,673);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1217,768,40,10709,685);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1218,164,5,10710,115);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1219,556,5,10710,672);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1220,33228,120,10711,105);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1221,19984,12,10711,471);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1222,63,42,10711,775);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1223,172,3,10712,430);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1224,1536,30,10712,801);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1225,2013,30,10713,181);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1226,38,24,10713,335);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1227,1342,110,10713,418);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1228,482,18,10713,900);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1229,630,30,10714,261);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1230,865,50,10714,570);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1231,194,18,10714,703);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1232,67,12,10714,773);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1233,1647,27,10714,779);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1234,2829,21,10715,114);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1235,16725,30,10715,540);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1236,12,7,10716,43);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1237,708,10,10716,273);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1238,91,5,10716,301);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1239,21082,32,10717,539);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1240,2421,15,10717,820);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1241,1002,25,10717,893);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1242,2440,20,10718,124);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1243,2995,36,10718,379);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1244,109,20,10718,553);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1245,148,40,10718,632);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1246,68,12,10719,166);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1247,587,40,10719,278);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1248,46,3,10719,772);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1249,298,8,10720,560);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1250,78,21,10720,726);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1251,2655,50,10721,574);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1252,382,45,10722,10);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1253,286,3,10722,164);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1254,610,50,10722,452);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1255,974,42,10722,525);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1256,31385,15,10723,503);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1257,20,16,10724,339);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1258,8400,5,10724,504);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1259,60,4,10725,424);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1260,200,6,10725,644);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1261,120,12,10725,702);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1262,1525,25,10726,779);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1263,256,5,10726,801);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1264,195,10,10727,297);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1265,80,10,10727,399);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1266,134,20,10727,598);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1267,1118,15,10728,15);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1268,107,12,10728,385);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1269,59,6,10728,719);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1270,1555,15,10728,771);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1271,93,30,10729,352);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1272,420,50,10729,834);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1273,68,40,10729,846);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1274,88,3,10730,36);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1275,420,15,10730,169);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1276,109,10,10730,429);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1277,576,30,10731,393);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1278,376,40,10731,606);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1279,512,20,10732,692);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1280,732,20,10733,153);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1281,293,16,10733,206);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1282,3878,25,10733,237);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1283,1244,30,10734,101);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1284,1078,20,10734,675);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1285,7594,15,10734,832);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1286,340,20,10735,196);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1287,27,2,10735,738);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1288,183,20,10736,179);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1289,148,40,10736,451);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1290,863,4,10737,344);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1291,264,12,10737,658);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1292,1318,3,10738,535);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1293,10,6,10739,425);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1294,14341,18,10739,481);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1295,323,5,10740,146);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1296,24,14,10740,425);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1297,7259,35,10740,435);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1298,172,40,10740,529);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1299,19764,15,10741,507);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1300,4685,50,10742,234);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1301,384,20,10742,685);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1302,470,35,10742,738);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1303,34,28,10743,33);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1304,4880,50,10744,147);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1305,432,24,10745,38);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1306,893,16,10745,216);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1307,1530,45,10745,405);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1308,939,7,10745,442);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1309,88,6,10746,59);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1310,388,28,10746,64);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1311,57876,40,10746,505);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1312,130,9,10746,680);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1313,22,9,10747,22);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1314,58,8,10747,689);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1315,405,30,10747,891);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1316,938,35,10747,900);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1317,2050,28,10748,4);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1318,1332,40,10748,304);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1319,20398,44,10748,484);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1320,279,10,10749,205);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1321,257,15,10749,309);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1322,134,6,10749,373);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1323,2740,40,10750,150);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1324,1012,25,10750,368);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1325,122,5,10750,548);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1326,101,12,10751,81);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1327,147,15,10751,331);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1328,804,30,10751,408);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1329,299,20,10751,424);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1330,6,8,10752,428);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1331,11,3,10752,759);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1332,8540,5,10753,532);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1333,22,4,10753,693);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1334,12,3,10754,605);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1335,14640,30,10755,63);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1336,1098,30,10755,153);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1337,333,25,10755,454);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1338,278,14,10755,561);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1339,195,20,10756,24);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1340,7906,6,10756,507);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1341,220,20,10756,602);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1342,653,21,10756,794);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1343,1500,30,10757,103);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1344,7149,30,10757,324);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1345,136,7,10757,463);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1346,1836,24,10757,863);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1347,1098,60,10758,301);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1348,44,20,10758,558);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1349,15,40,10758,750);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1350,238,10,10759,312);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1351,804,30,10760,211);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1352,1318,40,10760,599);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1353,1742,12,10760,864);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1354,151,35,10761,240);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1355,29,18,10761,335);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1356,501,30,10762,28);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1357,5052,60,10762,111);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1358,375,28,10762,709);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1359,819,16,10762,801);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1360,512,6,10763,148);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1361,24,20,10763,209);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1362,52704,40,10763,507);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1363,189,20,10764,54);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1364,494,130,10764,592);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1365,1440,80,10765,38);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1366,3792,40,10766,157);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1367,3940,40,10766,862);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1368,1379,35,10766,886);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1369,33,2,10767,37);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1370,1700,50,10768,405);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1371,537,4,10768,496);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1372,264,12,10768,658);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1373,19,15,10768,826);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1374,924,15,10769,149);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1375,6222,30,10769,224);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1376,4557,15,10769,527);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1377,310,20,10769,847);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1378,447,15,10770,828);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1379,1014,16,10771,98);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1380,457,25,10772,302);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1381,461,18,10772,692);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1382,12,7,10773,43);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1383,21350,70,10773,225);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1384,122,33,10773,374);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1385,671,50,10774,320);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1386,3,2,10774,775);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1387,538,3,10775,107);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1388,16,6,10775,402);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1389,1318,27,10776,134);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1390,560,12,10776,287);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1391,292800,120,10776,502);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1392,1123,16,10776,616);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1393,1491,20,10777,15);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1394,403,10,10778,202);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1395,366,20,10779,206);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1396,1220,20,10779,779);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1397,65,15,10780,240);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1398,238,35,10780,569);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1399,2562,35,10781,4);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1400,228,20,10781,687);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1401,4,3,10781,748);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1402,18,1,10782,549);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1403,195,5,10783,40);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1404,137,10,10783,807);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1405,127,2,10784,41);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1406,1662,30,10784,260);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1407,14823,30,10784,538);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1408,17,10,10785,375);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1409,1712,10,10785,389);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1410,4587,30,10786,347);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1411,74,15,10786,792);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1412,1252,42,10786,828);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1413,1116,15,10787,83);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1414,4670,20,10787,465);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1415,4508,40,10788,86);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1416,445,50,10788,580);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1417,255,30,10789,10);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1418,18,15,10789,339);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1419,56,18,10789,352);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1420,174,30,10789,840);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1421,62,3,10790,583);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1422,36,20,10790,798);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1423,342,14,10791,548);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1424,112,20,10791,756);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1425,831,3,10792,105);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1426,298,15,10792,561);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1427,1037,10,10792,621);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1428,392,14,10793,169);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1429,234,8,10793,829);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1430,65,6,10794,429);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1431,2013,15,10794,496);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1432,1508,65,10795,707);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1433,1347,35,10795,754);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1434,2264,35,10796,79);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1435,220,10,10796,199);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1436,259,24,10796,703);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1437,815,21,10796,799);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1438,5,20,10797,342);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1439,4,2,10798,558);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1440,5676,10,10798,797);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1441,395,25,10799,67);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1442,98,20,10799,378);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1443,1136,20,10799,825);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1444,390,50,10800,173);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1445,489,7,10800,353);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1446,192,10,10800,685);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1447,195,20,10801,250);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1448,88,40,10801,785);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1449,132,5,10802,34);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1450,49194,60,10802,517);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1451,1295,25,10802,778);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1452,174,30,10802,872);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1453,1219,24,10803,409);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1454,55,15,10803,431);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1455,11951,15,10803,481);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1456,3341,36,10804,365);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1457,58150,24,10804,491);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1458,61,4,10804,772);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1459,683,10,10805,294);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1460,1037,10,10805,621);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1461,684,20,10806,293);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1462,476,2,10806,382);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1463,6,15,10806,817);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1464,52,1,10807,266);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1465,1074,20,10808,239);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1466,915,50,10808,549);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1467,1508,20,10809,195);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1468,220,5,10810,42);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1469,223,5,10810,743);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1470,108,7,10810,847);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1471,1685,18,10811,6);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1472,1683,30,10811,178);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1473,777,15,10811,778);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1474,1634,20,10812,58);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1475,898,16,10812,178);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1476,888,40,10812,679);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1477,3660,12,10813,225);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1478,472,35,10813,444);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1479,312,8,10814,40);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1480,666,20,10814,304);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1481,13176,30,10814,492);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1482,62,20,10814,776);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1483,86,16,10815,869);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1484,2073,30,10816,102);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1485,73200,20,10816,477);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1486,49,40,10817,33);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1487,26718,60,10817,514);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1488,2592,25,10817,621);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1489,252,30,10817,834);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1490,694,20,10818,142);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1491,248,20,10818,581);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1492,43,7,10819,187);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1493,742,20,10819,747);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1494,216,30,10820,720);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1495,24,20,10821,349);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1496,119,6,10821,388);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1497,16,3,10822,553);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1498,489,6,10822,884);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1499,488,20,10823,62);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1500,1025,15,10823,294);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1501,60,40,10823,775);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1502,232,15,10823,847);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1503,337,12,10824,96);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1504,5369,9,10824,480);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1505,131,12,10825,429);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1506,226,20,10825,732);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1507,128,15,10826,640);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1508,479,35,10826,807);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1509,311,15,10827,35);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1510,2045,21,10827,474);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1511,54,2,10828,197);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1512,73,5,10828,283);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1513,198,10,10829,90);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1514,1096,20,10829,215);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1515,183,10,10829,367);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1516,235,21,10829,626);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1517,717,30,10830,45);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1518,3156,28,10830,86);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1519,72,6,10830,361);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1520,3514,24,10830,699);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1521,312,8,10831,40);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1522,1647,9,10831,125);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1523,166,2,10831,379);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1524,68,8,10831,552);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1525,2674,16,10832,120);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1526,54,3,10832,263);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1527,361,10,10832,831);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1528,27,3,10832,895);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1529,498,9,10833,53);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1530,122,20,10833,404);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1531,22805,9,10833,479);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1532,178,8,10834,29);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1533,200,20,10834,625);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1534,1055,15,10835,106);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1535,166,2,10835,379);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1536,2015,6,10836,127);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1537,171,30,10836,166);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1538,1544,52,10836,200);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1539,122,24,10836,717);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1540,1458,60,10836,742);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1541,19,6,10837,564);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1542,380,40,10837,571);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1543,260,25,10837,661);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1544,876,21,10837,688);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1545,425,50,10838,10);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1546,1220,4,10838,225);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1547,93,25,10838,632);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1548,366,30,10839,637);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1549,2421,15,10839,820);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1550,85,10,10840,274);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1551,7,6,10840,339);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1552,758,16,10841,316);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1553,215,50,10841,529);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1554,28,15,10841,551);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1555,366,30,10841,667);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1556,402,20,10842,3);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1557,421,5,10842,111);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1558,175,15,10842,557);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1559,184,12,10842,657);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1560,532,4,10843,495);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1561,595,35,10844,196);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1562,1953,70,10845,205);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1563,5955,25,10845,382);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1564,4373,48,10845,460);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1565,98822,42,10845,488);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1566,222,60,10845,878);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1567,1026,30,10846,203);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1568,688,20,10846,443);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1569,37021,21,10846,544);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1570,894,12,10847,15);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1571,4320,60,10847,92);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1572,2684,55,10847,134);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1573,528,36,10847,278);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1574,43920,80,10847,506);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1575,324,45,10847,720);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1576,279,30,10848,601);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1577,194,3,10848,897);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1578,985,49,10849,326);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1579,130,18,10849,720);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1580,112,4,10850,96);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1581,778,20,10850,228);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1582,7320,30,10850,410);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1583,628,10,10851,8);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1584,464,10,10851,192);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1585,8198,42,10851,522);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1586,121,5,10851,742);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1587,120,15,10852,56);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1588,11430,50,10852,333);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1589,3235,6,10852,497);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1590,91,10,10853,660);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1591,781,100,10854,173);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1592,952,65,10854,267);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1593,2635,24,10855,88);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1594,451,14,10855,229);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1595,130,15,10855,523);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1596,360,50,10855,603);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1597,74,20,10856,210);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1598,1069,20,10856,822);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1599,222,10,10857,29);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1600,21,30,10857,428);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1601,665,35,10857,890);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1602,342,10,10858,203);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1603,698,5,10858,716);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1604,23,4,10858,840);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1605,518,35,10859,328);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1606,531,30,10859,729);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1607,4840,40,10859,881);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1608,586,20,10860,669);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1609,9,3,10860,815);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1610,454,20,10861,198);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1611,938,35,10861,211);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1612,3048,40,10861,314);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1613,244,42,10861,400);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1614,112,3,10861,437);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1615,487,25,10862,783);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1616,70,8,10862,879);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1617,1098,20,10863,162);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1618,647,12,10863,675);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1619,98,4,10864,739);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1620,7554,15,10864,852);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1621,1098,60,10865,19);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1622,5952,80,10865,674);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1623,157,6,10866,39);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1624,2050,21,10866,147);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1625,1268,40,10866,155);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1626,5,3,10867,425);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1627,1884,30,10868,8);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1628,420,20,10868,261);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1629,133,42,10868,467);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1630,1671,10,10869,120);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1631,584,40,10869,246);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1632,1474,20,10869,459);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1633,272,50,10869,553);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1634,443,2,10870,751);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1635,26,3,10870,838);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1636,547,16,10871,143);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1637,272,50,10871,553);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1638,175,12,10871,677);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1639,47058,20,10872,488);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1640,51240,21,10872,502);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1641,1098,15,10872,617);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1642,938,10,10872,865);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1643,634,20,10873,139);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1644,13,3,10873,343);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1645,138,10,10874,802);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1646,390,25,10875,259);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1647,995,21,10875,316);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1648,26,15,10875,425);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1649,1384,21,10876,255);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1650,495,20,10876,596);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1651,522,25,10877,27);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1652,403,30,10877,320);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1653,48,20,10878,22);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1654,685,10,10879,150);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1655,52,12,10879,240);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1656,586,10,10879,855);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1657,1464,30,10880,325);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1658,13176,30,10880,526);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1659,543,50,10880,653);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1660,488,10,10881,68);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1661,915,25,10882,270);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1662,562,20,10882,350);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1663,186,32,10882,400);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1664,159,8,10883,561);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1665,36,21,10884,43);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1666,900,40,10884,138);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1667,1244,12,10884,621);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1668,1669,12,10885,118);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1669,2074,20,10885,771);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1670,4842,30,10885,820);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1671,428,25,10885,883);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1672,21350,70,10886,225);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1673,346,40,10886,523);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1674,266,35,10886,608);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1675,1586,5,10887,856);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1676,184,20,10888,332);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1677,67,18,10888,374);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1678,1560,40,10889,40);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1679,3680,40,10889,610);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1680,6,10,10890,318);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1681,171,14,10890,755);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1682,26,15,10890,846);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1683,1835,15,10891,112);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1684,1220,40,10892,412);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1685,525,10,10893,108);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1686,843,30,10893,350);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1687,9882,20,10893,538);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1688,5124,35,10893,612);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1689,74,24,10893,815);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1690,620,50,10894,581);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1691,1320,120,10894,602);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1692,204,28,10894,682);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1693,198,45,10895,422);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1694,496,91,10895,553);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1695,803,110,10895,682);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1696,11590,100,10895,760);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1697,371,16,10896,7);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1698,147,15,10896,398);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1699,11712,80,10897,699);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1700,875,36,10897,742);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1701,402,5,10898,624);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1702,176,8,10899,199);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1703,216,3,10900,92);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1704,339,30,10901,732);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1705,1062,30,10901,737);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1706,422,6,10902,106);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1707,7146,30,10902,382);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1708,84,40,10903,568);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1709,1024,20,10903,636);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1710,26,21,10903,784);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1711,639,15,10904,305);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1712,2027,35,10904,757);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1713,217,20,10905,653);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1714,3651,15,10906,122);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1715,325,14,10907,421);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1716,615,14,10908,73);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1717,170,20,10908,274);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1718,1186,12,10909,175);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1719,4191,15,10909,235);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1720,67,5,10909,880);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1721,586,12,10910,57);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1722,98,10,10910,250);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1723,33,5,10910,598);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1724,1080,15,10911,92);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1725,110,10,10911,602);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1726,35,12,10911,628);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1727,3000,60,10912,291);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1728,6016,40,10912,345);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1729,2094,15,10913,231);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1730,743,30,10913,596);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1731,2392,40,10913,684);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1732,145,25,10914,840);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1733,976,10,10915,147);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1734,146,10,10915,242);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1735,429,30,10915,359);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1736,95,6,10916,360);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1737,165,6,10916,681);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1738,867,20,10916,821);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1739,81,1,10917,75);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1740,179,10,10917,263);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1741,3768,60,10918,8);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1742,105,25,10918,406);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1743,4099,24,10919,129);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1744,536,20,10919,211);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1745,84,24,10919,251);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1746,240,24,10920,700);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1747,173,10,10921,570);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1748,3752,40,10921,865);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1749,234,15,10922,259);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1750,3758,35,10922,391);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1751,520,10,10923,230);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1752,377,24,10923,276);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1753,36600,10,10923,477);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1754,4766,20,10924,324);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1755,2379,6,10924,485);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1756,204,30,10924,569);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1757,1068,25,10925,144);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1758,264,12,10925,322);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1759,167,7,10926,17);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1760,72,10,10926,603);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1761,268,2,10926,769);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1762,49,10,10926,789);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1763,73,5,10927,30);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1764,410,5,10927,91);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1765,12,20,10927,318);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1766,1037,5,10928,224);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1767,128,5,10928,845);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1768,2562,15,10929,470);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1769,118722,49,10929,491);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1770,652,60,10929,653);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1771,793,25,10930,139);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1772,4943,36,10930,282);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1773,729,25,10930,372);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1774,49959,30,10930,471);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1775,1170,30,10931,40);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1776,3935,42,10931,234);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1777,732,14,10932,356);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1778,1780,16,10932,672);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1779,1281,30,10932,806);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1780,184,20,10932,813);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1781,43,2,10933,311);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1782,219,30,10933,682);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1783,4026,20,10934,499);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1784,1720,21,10935,91);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1785,379,4,10935,157);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1786,13,8,10935,317);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1787,260,30,10936,523);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1788,358,20,10937,99);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1789,194,8,10937,447);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1790,277,20,10938,64);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1791,553,35,10938,67);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1792,6875,49,10938,697);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1793,322,24,10938,701);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1794,32,10,10939,89);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1795,292,40,10939,790);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1796,293,8,10940,71);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1797,2254,20,10940,86);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1798,1310,50,10941,39);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1799,1932,44,10941,174);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1800,21,30,10941,428);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1801,9720,80,10941,843);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1802,67,28,10942,22);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1803,7052,21,10943,127);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1804,859,15,10943,430);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1805,384,15,10943,845);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1806,284,18,10944,67);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1807,96,5,10944,645);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1808,709,18,10944,886);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1809,464,10,10945,128);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1810,558,20,10945,205);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1811,1610,40,10946,152);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1812,397,25,10946,360);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1813,36173,25,10946,505);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1814,18,4,10947,803);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1815,84,4,10948,27);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1816,4486,9,10948,537);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1817,7808,40,10948,698);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1818,113,6,10949,177);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1819,1025,12,10949,245);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1820,23142,30,10949,524);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1821,19032,60,10949,856);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1822,1397,5,10950,235);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1823,620,50,10951,397);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1824,116,6,10951,555);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1825,1830,15,10951,766);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1826,11,2,10952,604);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1827,195,16,10952,659);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1828,2620,50,10953,266);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1829,1940,50,10953,799);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1830,610,25,10954,26);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1831,438,30,10954,242);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1832,258,28,10954,638);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1833,370,24,10954,708);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1834,1391,12,10955,760);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1835,1708,14,10956,124);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1836,784,12,10956,254);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1837,10002,8,10956,521);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1838,1757,40,10957,73);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1839,358,8,10957,208);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1840,293,30,10957,731);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1841,189,5,10958,233);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1842,58,20,10958,628);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1843,44,6,10958,678);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1844,98,20,10959,461);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1845,740,10,10960,163);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1846,3310,24,10960,182);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1847,10542,60,10961,213);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1848,148,6,10961,469);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1849,1709,77,10962,29);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1850,3758,44,10962,245);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1851,292,20,10962,289);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1852,383,9,10962,305);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1853,604,45,10962,738);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1854,16,2,10963,761);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1855,827,6,10964,182);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1856,143,10,10964,359);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1857,402,5,10964,624);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1858,336,16,10965,261);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1859,527,12,10966,73);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1860,110,12,10966,813);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1861,94,8,10966,839);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1862,401,12,10967,644);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1863,40,40,10967,876);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1864,729,30,10968,65);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1865,227,4,10968,292);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1866,1422,30,10968,316);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1867,571,9,10969,41);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1868,1704,40,10970,305);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1869,204,14,10971,323);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1870,271,6,10972,665);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1871,206,7,10972,706);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1872,171,5,10973,203);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1873,329,6,10973,357);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1874,573,10,10973,430);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1875,988,10,10974,175);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1876,57,10,10975,166);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1877,312,16,10975,191);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1878,73,20,10976,563);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1879,696,30,10977,7);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1880,10,10,10977,354);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1881,696,30,10977,525);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1882,458,20,10977,676);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1883,305,10,10978,2);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1884,1948,20,10978,474);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1885,57876,40,10978,505);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1886,55,6,10978,813);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1887,303,35,10979,158);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1888,104,20,10979,370);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1889,235,24,10979,466);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1890,7137,18,10979,485);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1891,232,80,10979,628);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1892,146,30,10979,804);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1893,244,40,10980,627);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1894,2558,60,10981,327);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1895,184,20,10982,332);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1896,33,9,10982,759);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1897,1131,15,10983,195);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1898,3252,84,10983,313);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1899,292,20,10984,246);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1900,3220,40,10984,624);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1901,671,55,10984,667);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1902,750,8,10985,234);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1903,4427,35,10985,307);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1904,8784,36,10985,410);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1905,3440,10,10986,219);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1906,8382,30,10986,235);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1907,694,15,10986,450);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1908,257,15,10986,883);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1909,5636,6,10987,518);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1910,332,20,10987,582);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1911,582,60,10987,715);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1912,668,40,10988,28);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1913,42,60,10988,428);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1914,121,15,10989,51);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1915,2416,40,10989,531);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1916,25,4,10989,631);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1917,1098,60,10990,301);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1918,32909,65,10990,832);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1919,2462,66,10990,873);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1920,3711,65,10990,885);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1921,15813,90,10991,213);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1922,1710,50,10991,293);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1923,62,20,10991,427);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1924,21,2,10992,380);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1925,1585,50,10993,154);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1926,470,35,10993,320);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1927,2000,18,10994,189);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1928,418,20,10995,27);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1929,805,4,10995,499);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1930,1852,40,10996,450);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1931,10370,50,10997,224);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1932,84,20,10997,406);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1933,520,20,10997,656);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1934,89,20,10998,16);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1935,470,7,10998,181);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1936,66,12,10998,395);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1937,2196,30,10998,733);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1938,1097,21,10999,356);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1939,494,15,10999,642);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1940,244,20,10999,736);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1941,522,30,11000,14);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1942,1830,25,11000,611);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1943,6642,30,11000,751);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1944,3020,25,11001,168);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1945,1158,60,11001,645);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1946,19,6,11001,752);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1947,37,25,11001,775);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1948,1333,56,11002,312);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1949,256,40,11002,377);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1950,2562,15,11002,470);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1951,79,24,11002,875);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1952,86,4,11003,315);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1953,1708,10,11003,470);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1954,1952,10,11003,698);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1955,119,6,11004,247);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1956,73,6,11004,667);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1957,683,2,11005,80);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1958,253,10,11005,362);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1959,13439,8,11006,504);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1960,273,2,11006,800);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1961,1147,14,11007,91);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1962,951,30,11007,155);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1963,5856,10,11007,857);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1964,6709,90,11008,15);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1965,3122,70,11008,763);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1966,2050,21,11008,786);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1967,4831,18,11009,100);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1968,72,9,11009,399);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1969,1610,12,11009,496);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1970,37,10,11010,451);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1971,84,20,11010,774);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1972,4148,20,11011,224);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1973,616,40,11011,710);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1974,2304,60,11012,290);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1975,600,50,11012,361);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1976,54,36,11012,775);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1977,5538,20,11013,105);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1978,42,10,11013,406);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1979,3360,2,11013,504);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1980,49,4,11013,755);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1981,8506,28,11014,527);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1982,219,15,11015,413);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1983,1656,18,11015,610);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1984,137,16,11016,32);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1985,2105,15,11016,697);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1986,1134,30,11017,337);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1987,762,25,11017,412);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1988,2123,110,11017,645);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1989,322,20,11018,21);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1990,708,10,11018,133);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1991,72,5,11018,449);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1992,73,3,11019,548);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1993,3,2,11019,826);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1994,1049,24,11020,55);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1995,2857,15,11021,126);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1996,493,44,11021,626);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1997,110,11,11021,700);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1998,69,63,11021,740);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (1999,1403,35,11021,893);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2000,523,35,11022,424);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2001,129,30,11022,867);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2002,531,30,11023,284);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2003,268,4,11023,619);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2004,3140,50,11024,8);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2005,5490,30,11024,125);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2006,178,21,11024,285);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2007,784,12,11024,381);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2008,132,20,11025,338);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2009,6194,10,11025,547);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2010,186,8,11026,525);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2011,372,10,11026,560);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2012,714,30,11027,312);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2013,1025,21,11027,325);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2014,907,24,11028,588);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2015,213,35,11028,627);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2016,234,12,11029,589);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2017,302,20,11029,711);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2018,610,100,11030,404);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2019,310,100,11030,770);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2020,2905,70,11030,853);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2021,336,60,11030,896);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2022,1776,16,11031,93);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2023,193,21,11031,332);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2024,4026,20,11031,499);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2025,976,80,11031,667);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2026,139,45,11031,752);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2027,237,30,11032,288);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2028,18872,35,11032,497);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2029,95,25,11032,592);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2030,1098,36,11033,412);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2031,245,70,11033,633);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2032,3020,15,11034,419);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2033,1596,12,11034,495);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2034,53,6,11034,838);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2035,745,10,11035,15);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2036,40,10,11035,60);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2037,6588,60,11035,88);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2038,294,30,11035,741);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2039,28,7,11036,12);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2040,1704,30,11036,825);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2041,29,4,11037,790);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2042,102,2,11038,409);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2043,854,5,11038,470);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2044,1903,30,11038,866);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2045,316,20,11039,67);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2046,3895,24,11039,145);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2047,1098,60,11039,295);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2048,235,28,11039,834);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2049,8906,20,11040,514);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2050,2526,30,11041,111);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2051,336,30,11041,626);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2052,162,4,11042,368);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2053,217,15,11042,680);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2054,227,10,11043,198);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2055,365,12,11044,279);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2056,1887,24,11045,110);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2057,468,15,11045,587);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2058,167,18,11046,600);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2059,289,15,11046,645);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2060,146,20,11046,790);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2061,495,25,11047,247);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2062,1120,30,11047,795);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2063,727,42,11048,570);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2064,65,4,11049,664);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2065,31,10,11049,752);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2066,2012,50,11050,152);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2067,31,10,11051,49);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2068,732,30,11052,26);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2069,474,10,11052,316);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2070,1281,35,11053,71);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2071,2530,20,11053,307);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2072,260,25,11053,661);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2073,111,10,11054,724);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2074,2440,20,11054,766);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2075,64,20,11055,89);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2076,3111,15,11055,435);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2077,95,15,11055,634);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2078,244,20,11055,714);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2079,2074,50,11056,101);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2080,1827,35,11056,190);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2081,620,40,11056,847);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2082,51,3,11057,788);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2083,64,3,11058,311);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2084,115,21,11058,395);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2085,31,4,11058,761);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2086,330,35,11059,54);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2087,19984,12,11059,471);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2088,267,30,11059,580);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2089,7714,10,11060,524);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2090,29,4,11060,682);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2091,476,15,11061,139);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2092,195,10,11062,297);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2093,246,12,11062,590);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2094,286,30,11063,176);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2095,268,40,11063,646);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2096,4095,30,11063,800);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2097,1648,77,11064,183);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2098,220,12,11064,301);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2099,62,25,11064,854);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2100,1006,55,11064,888);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2101,160,4,11064,893);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2102,1266,20,11065,416);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2103,342,4,11065,899);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2104,1372,3,11066,510);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2105,479,42,11066,687);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2106,308,35,11066,838);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2107,40,9,11067,422);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2108,4241,36,11068,85);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2109,410,28,11068,283);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2110,244,8,11068,412);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2111,52,20,11069,894);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2112,488,20,11070,11);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2113,621,30,11070,23);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2114,2148,40,11070,239);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2115,308,20,11070,710);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2116,87,10,11071,158);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2117,183,15,11071,185);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2118,622,22,11072,355);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2119,5856,40,11072,699);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2120,463,8,11072,757);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2121,234,130,11072,798);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2122,60,10,11073,734);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2123,70,20,11073,753);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2124,171,14,11074,755);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2125,114,2,11075,292);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2126,58194,30,11075,490);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2127,4880,10,11075,546);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2128,2769,10,11076,105);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2129,170,20,11076,274);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2130,196,20,11076,741);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2131,374,4,11077,6);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2132,2,1,11077,43);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2133,107,2,11077,78);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2134,377,2,11077,116);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2135,129,2,11077,146);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2136,64,2,11077,229);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2137,93,2,11077,287);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2138,170,3,11077,292);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2139,153,1,11077,347);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2140,16,1,11077,360);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2141,9,4,11077,371);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2142,3,1,11077,402);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2143,488,2,11077,410);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2144,1732,1,11077,516);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2145,70,3,11077,525);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2146,5,1,11077,593);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2147,1,1,11077,595);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2148,1757,24,11077,611);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2149,40,1,11077,622);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2150,131,2,11077,643);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2151,61,4,11077,657);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2152,115,2,11077,694);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2153,20,2,11077,695);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2154,2,2,11077,876);
INSERT INTO `lineasdeventas` (`idLinea`,`subtotal`,`cantidad`,`idVenta`,`idProducto`) VALUES 
  (2155,242,2,11077,881);
COMMIT;
/*!40000 ALTER TABLE `lineasdeventas` ENABLE KEYS */;


--
-- Dumping data for table `parametrosnegocio`
--

/*!40000 ALTER TABLE `parametrosnegocio` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `parametrosnegocio` (`idParametro`,`membrete`,`ultIdPedido`) VALUES 
  (1,'aaaaaaaaaa',0);
COMMIT;
/*!40000 ALTER TABLE `parametrosnegocio` ENABLE KEYS */;


--
-- Dumping data for table `pedidos`
--

/*!40000 ALTER TABLE `pedidos` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `pedidos` (`idPedido`,`total`,`fecha`,`estado`,`idCliente`,`codPedido`) VALUES 
  (1,328.000,'2015-12-18 00:00:00','Listo',1,0x4D532D323031352D303030303031);
INSERT INTO `pedidos` (`idPedido`,`total`,`fecha`,`estado`,`idCliente`,`codPedido`) VALUES 
  (2,659.000,'2015-12-21 00:00:00','Pendiente',1,0x4D532D323031352D303030303032);
COMMIT;
/*!40000 ALTER TABLE `pedidos` ENABLE KEYS */;


--
-- Dumping data for table `precios`
--

/*!40000 ALTER TABLE `precios` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (1,1,'2011-12-01 00:00:00',NULL,40.00,35.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (2,2,'2011-12-01 00:00:00',NULL,40.00,30.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (3,3,'2011-12-01 00:00:00',NULL,20.10,18.090);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (4,4,'2011-12-01 00:00:00',NULL,73.20,55.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (5,5,'2011-12-01 00:00:00',NULL,22.00,20.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (6,6,'2011-12-01 00:00:00',NULL,93.60,84.240);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (7,7,'2011-12-01 00:00:00',NULL,24.00,18.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (8,8,'2011-12-01 00:00:00',NULL,150.00,100.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (9,9,'2011-12-01 00:00:00',NULL,10.00,7.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (10,10,'2011-12-01 00:00:00',NULL,8.50,7.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (11,11,'2011-12-01 00:00:00',NULL,24.40,21.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (12,12,'2011-12-01 00:00:00',NULL,4.00,3.600);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (13,13,'2011-12-01 00:00:00',NULL,59.60,53.640);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (14,14,'2011-12-01 00:00:00',NULL,17.40,15.660);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (15,15,'2011-12-01 00:00:00',NULL,74.54,67.086);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (16,16,'2011-12-01 00:00:00',NULL,4.44,3.996);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (17,17,'2011-12-01 00:00:00',NULL,23.80,21.420);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (18,18,'2011-12-01 00:00:00',NULL,14.10,12.690);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (19,19,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (20,20,'2011-12-01 00:00:00',NULL,42.60,38.340);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (21,21,'2011-12-01 00:00:00',NULL,16.10,14.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (22,22,'2011-12-01 00:00:00',NULL,2.40,2.160);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (23,23,'2011-12-01 00:00:00',NULL,20.70,18.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (24,24,'2011-12-01 00:00:00',NULL,9.76,8.784);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (25,25,'2011-12-01 00:00:00',NULL,3.40,3.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (26,26,'2011-12-01 00:00:00',NULL,24.40,21.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (27,27,'2011-12-01 00:00:00',NULL,20.90,18.810);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (28,28,'2011-12-01 00:00:00',NULL,16.70,15.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (29,29,'2011-12-01 00:00:00',NULL,22.20,19.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (30,30,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (31,31,'2011-12-01 00:00:00',NULL,4.90,4.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (32,32,'2011-12-01 00:00:00',NULL,8.54,7.686);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (33,33,'2011-12-01 00:00:00',NULL,1.22,1.098);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (34,34,'2011-12-01 00:00:00',NULL,26.40,23.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (35,35,'2011-12-01 00:00:00',NULL,20.70,18.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (36,36,'2011-12-01 00:00:00',NULL,29.30,26.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (37,37,'2011-12-01 00:00:00',NULL,16.30,14.670);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (38,38,'2011-12-01 00:00:00',NULL,18.00,16.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (39,39,'2011-12-01 00:00:00',NULL,26.20,23.580);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (40,40,'2011-12-01 00:00:00',NULL,39.00,35.100);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (41,41,'2011-12-01 00:00:00',NULL,63.40,57.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (42,42,'2011-12-01 00:00:00',NULL,43.90,39.510);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (43,43,'2011-12-01 00:00:00',NULL,1.70,1.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (44,44,'2011-12-01 00:00:00',NULL,36.10,32.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (45,45,'2011-12-01 00:00:00',NULL,100.00,80.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (46,46,'2011-12-01 00:00:00',NULL,4.40,3.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (47,47,'2011-12-01 00:00:00',NULL,0.60,0.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (48,48,'2011-12-01 00:00:00',NULL,0.20,0.190);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (49,49,'2011-12-01 00:00:00',NULL,3.10,2.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (50,50,'2011-12-01 00:00:00',NULL,4.27,3.843);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (51,51,'2011-12-01 00:00:00',NULL,8.06,7.254);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (52,52,'2011-12-01 00:00:00',NULL,10.90,9.810);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (53,53,'2011-12-01 00:00:00',NULL,55.28,49.752);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (54,54,'2011-12-01 00:00:00',NULL,9.43,8.487);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (55,55,'2011-12-01 00:00:00',NULL,43.70,39.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (56,56,'2011-12-01 00:00:00',NULL,8.00,7.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (57,57,'2011-12-01 00:00:00',NULL,48.80,43.920);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (58,58,'2011-12-01 00:00:00',NULL,81.70,73.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (59,59,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (60,60,'2011-12-01 00:00:00',NULL,4.00,3.600);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (61,61,'2011-12-01 00:00:00',NULL,28.10,25.290);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (62,62,'2011-12-01 00:00:00',NULL,24.40,21.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (63,63,'2011-12-01 00:00:00',NULL,488.00,439.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (64,64,'2011-12-01 00:00:00',NULL,13.86,12.474);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (65,65,'2011-12-01 00:00:00',NULL,24.30,21.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (66,66,'2011-12-01 00:00:00',NULL,7.30,6.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (67,67,'2011-12-01 00:00:00',NULL,15.80,14.220);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (68,68,'2011-12-01 00:00:00',NULL,48.80,43.920);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (69,69,'2011-12-01 00:00:00',NULL,147.00,132.300);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (70,70,'2011-12-01 00:00:00',NULL,65.50,58.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (71,71,'2011-12-01 00:00:00',NULL,36.60,32.940);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (72,72,'2011-12-01 00:00:00',NULL,195.80,176.220);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (73,73,'2011-12-01 00:00:00',NULL,43.92,39.528);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (74,74,'2011-12-01 00:00:00',NULL,41.60,37.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (75,75,'2011-12-01 00:00:00',NULL,81.10,72.990);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (76,76,'2011-12-01 00:00:00',NULL,154.90,120.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (77,77,'2011-12-01 00:00:00',NULL,157.60,141.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (78,78,'2011-12-01 00:00:00',NULL,53.50,48.150);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (79,79,'2011-12-01 00:00:00',NULL,64.70,58.230);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (80,80,'2011-12-01 00:00:00',NULL,341.60,307.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (81,81,'2011-12-01 00:00:00',NULL,8.40,7.560);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (82,82,'2011-12-01 00:00:00',NULL,47.60,42.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (83,83,'2011-12-01 00:00:00',NULL,74.40,66.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (84,84,'2011-12-01 00:00:00',NULL,301.00,270.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (85,85,'2011-12-01 00:00:00',NULL,117.80,106.020);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (86,86,'2011-12-01 00:00:00',NULL,112.70,101.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (87,87,'2011-12-01 00:00:00',NULL,139.70,125.730);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (88,88,'2011-12-01 00:00:00',NULL,109.80,98.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (89,89,'2011-12-01 00:00:00',NULL,3.20,2.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (90,90,'2011-12-01 00:00:00',NULL,19.80,17.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (91,91,'2011-12-01 00:00:00',NULL,81.90,73.710);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (92,92,'2011-12-01 00:00:00',NULL,72.00,64.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (93,93,'2011-12-01 00:00:00',NULL,111.00,99.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (94,94,'2011-12-01 00:00:00',NULL,69.70,62.730);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (95,95,'2011-12-01 00:00:00',NULL,44.50,40.050);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (96,96,'2011-12-01 00:00:00',NULL,28.10,25.290);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (97,97,'2011-12-01 00:00:00',NULL,134.20,120.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (98,98,'2011-12-01 00:00:00',NULL,63.40,57.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (99,99,'2011-12-01 00:00:00',NULL,17.91,16.119);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (100,100,'2011-12-01 00:00:00',NULL,268.40,241.560);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (101,101,'2011-12-01 00:00:00',NULL,41.48,37.332);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (102,102,'2011-12-01 00:00:00',NULL,69.11,62.199);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (103,103,'2011-12-01 00:00:00',NULL,50.00,45.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (104,104,'2011-12-01 00:00:00',NULL,65.50,58.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (105,105,'2011-12-01 00:00:00',NULL,276.90,249.210);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (106,106,'2011-12-01 00:00:00',NULL,70.30,63.270);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (107,107,'2011-12-01 00:00:00',NULL,179.30,161.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (108,108,'2011-12-01 00:00:00',NULL,52.50,47.250);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (109,109,'2011-12-01 00:00:00',NULL,61.00,54.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (110,110,'2011-12-01 00:00:00',NULL,78.64,70.776);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (111,111,'2011-12-01 00:00:00',NULL,84.20,75.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (112,112,'2011-12-01 00:00:00',NULL,122.30,110.070);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (113,113,'2011-12-01 00:00:00',NULL,79.30,71.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (114,114,'2011-12-01 00:00:00',NULL,134.70,121.230);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (115,115,'2011-12-01 00:00:00',NULL,32.82,29.538);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (116,116,'2011-12-01 00:00:00',NULL,188.60,169.740);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (117,117,'2011-12-01 00:00:00',NULL,202.50,182.250);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (118,118,'2011-12-01 00:00:00',NULL,139.10,125.190);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (119,119,'2011-12-01 00:00:00',NULL,129.70,116.730);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (120,120,'2011-12-01 00:00:00',NULL,167.10,150.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (121,121,'2011-12-01 00:00:00',NULL,173.50,156.150);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (122,122,'2011-12-01 00:00:00',NULL,243.40,219.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (123,123,'2011-12-01 00:00:00',NULL,67.60,60.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (124,124,'2011-12-01 00:00:00',NULL,122.00,109.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (125,125,'2011-12-01 00:00:00',NULL,183.00,164.700);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (126,126,'2011-12-01 00:00:00',NULL,190.50,171.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (127,127,'2011-12-01 00:00:00',NULL,335.80,302.220);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (128,128,'2011-12-01 00:00:00',NULL,46.36,41.724);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (129,129,'2011-12-01 00:00:00',NULL,170.80,153.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (130,130,'2011-12-01 00:00:00',NULL,97.60,87.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (131,131,'2011-12-01 00:00:00',NULL,34.30,30.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (132,132,'2011-12-01 00:00:00',NULL,39.00,35.100);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (133,133,'2011-12-01 00:00:00',NULL,70.80,63.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (134,134,'2011-12-01 00:00:00',NULL,48.80,43.920);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (135,135,'2011-12-01 00:00:00',NULL,54.30,48.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (136,136,'2011-12-01 00:00:00',NULL,30.50,27.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (137,137,'2011-12-01 00:00:00',NULL,37.10,33.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (138,138,'2011-12-01 00:00:00',NULL,22.50,20.250);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (139,139,'2011-12-01 00:00:00',NULL,31.70,28.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (140,140,'2011-12-01 00:00:00',NULL,34.20,30.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (141,141,'2011-12-01 00:00:00',NULL,65.90,59.310);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (142,142,'2011-12-01 00:00:00',NULL,34.70,31.230);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (143,143,'2011-12-01 00:00:00',NULL,34.20,30.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (144,144,'2011-12-01 00:00:00',NULL,42.70,38.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (145,145,'2011-12-01 00:00:00',NULL,162.30,146.070);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (146,146,'2011-12-01 00:00:00',NULL,64.70,58.230);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (147,147,'2011-12-01 00:00:00',NULL,97.60,87.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (148,148,'2011-12-01 00:00:00',NULL,85.40,76.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (149,149,'2011-12-01 00:00:00',NULL,61.60,55.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (150,150,'2011-12-01 00:00:00',NULL,68.50,61.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (151,151,'2011-12-01 00:00:00',NULL,44.80,40.320);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (152,152,'2011-12-01 00:00:00',NULL,40.25,36.225);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (153,153,'2011-12-01 00:00:00',NULL,36.60,32.940);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (154,154,'2011-12-01 00:00:00',NULL,31.70,28.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (155,155,'2011-12-01 00:00:00',NULL,31.70,28.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (156,156,'2011-12-01 00:00:00',NULL,122.00,109.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (157,157,'2011-12-01 00:00:00',NULL,94.79,85.311);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (158,158,'2011-12-01 00:00:00',NULL,8.66,7.794);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (159,159,'2011-12-01 00:00:00',NULL,48.10,43.290);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (160,160,'2011-12-01 00:00:00',NULL,139.10,125.190);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (161,161,'2011-12-01 00:00:00',NULL,25.60,23.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (162,162,'2011-12-01 00:00:00',NULL,54.90,49.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (163,163,'2011-12-01 00:00:00',NULL,74.00,66.600);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (164,164,'2011-12-01 00:00:00',NULL,95.20,85.680);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (165,165,'2011-12-01 00:00:00',NULL,12.80,11.520);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (166,166,'2011-12-01 00:00:00',NULL,5.70,5.130);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (167,167,'2011-12-01 00:00:00',NULL,240.30,216.270);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (168,168,'2011-12-01 00:00:00',NULL,120.80,108.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (169,169,'2011-12-01 00:00:00',NULL,28.00,25.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (170,170,'2011-12-01 00:00:00',NULL,42.70,38.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (171,171,'2011-12-01 00:00:00',NULL,54.90,49.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (172,172,'2011-12-01 00:00:00',NULL,37.20,33.480);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (173,173,'2011-12-01 00:00:00',NULL,7.81,7.029);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (174,174,'2011-12-01 00:00:00',NULL,43.90,39.510);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (175,175,'2011-12-01 00:00:00',NULL,98.80,88.920);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (176,176,'2011-12-01 00:00:00',NULL,9.52,8.568);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (177,177,'2011-12-01 00:00:00',NULL,18.90,17.010);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (178,178,'2011-12-01 00:00:00',NULL,56.10,50.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (179,179,'2011-12-01 00:00:00',NULL,9.15,8.235);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (180,180,'2011-12-01 00:00:00',NULL,201.60,181.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (181,181,'2011-12-01 00:00:00',NULL,67.10,60.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (182,182,'2011-12-01 00:00:00',NULL,137.90,124.110);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (183,183,'2011-12-01 00:00:00',NULL,21.40,19.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (184,184,'2011-12-01 00:00:00',NULL,10.86,9.774);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (185,185,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (186,186,'2011-12-01 00:00:00',NULL,5.00,4.500);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (187,187,'2011-12-01 00:00:00',NULL,6.10,5.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (188,188,'2011-12-01 00:00:00',NULL,42.30,38.070);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (189,189,'2011-12-01 00:00:00',NULL,111.10,99.990);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (190,190,'2011-12-01 00:00:00',NULL,52.20,46.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (191,191,'2011-12-01 00:00:00',NULL,19.50,17.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (192,192,'2011-12-01 00:00:00',NULL,46.40,41.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (193,193,'2011-12-01 00:00:00',NULL,43.70,39.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (194,194,'2011-12-01 00:00:00',NULL,81.90,73.710);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (195,195,'2011-12-01 00:00:00',NULL,75.40,67.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (196,196,'2011-12-01 00:00:00',NULL,17.00,15.300);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (197,197,'2011-12-01 00:00:00',NULL,26.80,24.120);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (198,198,'2011-12-01 00:00:00',NULL,22.70,20.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (199,199,'2011-12-01 00:00:00',NULL,22.00,19.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (200,200,'2011-12-01 00:00:00',NULL,29.70,26.730);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (201,201,'2011-12-01 00:00:00',NULL,25.60,23.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (202,202,'2011-12-01 00:00:00',NULL,40.30,36.270);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (203,203,'2011-12-01 00:00:00',NULL,34.20,30.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (204,204,'2011-12-01 00:00:00',NULL,30.60,27.540);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (205,205,'2011-12-01 00:00:00',NULL,27.90,25.110);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (206,206,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (207,207,'2011-12-01 00:00:00',NULL,1.46,1.314);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (208,208,'2011-12-01 00:00:00',NULL,44.70,40.230);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (209,209,'2011-12-01 00:00:00',NULL,1.22,1.098);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (210,210,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (211,211,'2011-12-01 00:00:00',NULL,26.80,24.120);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (212,212,'2011-12-01 00:00:00',NULL,29.00,26.100);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (213,213,'2011-12-01 00:00:00',NULL,175.70,158.130);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (214,214,'2011-12-01 00:00:00',NULL,10.90,9.810);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (215,215,'2011-12-01 00:00:00',NULL,54.80,49.320);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (216,216,'2011-12-01 00:00:00',NULL,55.80,50.220);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (217,217,'2011-12-01 00:00:00',NULL,4.90,4.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (218,218,'2011-12-01 00:00:00',NULL,146.40,131.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (219,219,'2011-12-01 00:00:00',NULL,344.00,309.600);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (220,220,'2011-12-01 00:00:00',NULL,12.90,11.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (221,221,'2011-12-01 00:00:00',NULL,0.90,0.810);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (222,222,'2011-12-01 00:00:00',NULL,152.50,137.250);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (223,223,'2011-12-01 00:00:00',NULL,56.30,50.670);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (224,224,'2011-12-01 00:00:00',NULL,207.40,186.660);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (225,225,'2011-12-01 00:00:00',NULL,305.00,274.500);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (226,226,'2011-12-01 00:00:00',NULL,29.30,26.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (227,227,'2011-12-01 00:00:00',NULL,37.80,34.020);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (228,228,'2011-12-01 00:00:00',NULL,38.90,35.010);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (229,229,'2011-12-01 00:00:00',NULL,32.20,28.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (230,230,'2011-12-01 00:00:00',NULL,52.00,46.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (231,231,'2011-12-01 00:00:00',NULL,139.60,125.640);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (232,232,'2011-12-01 00:00:00',NULL,101.90,91.710);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (233,233,'2011-12-01 00:00:00',NULL,37.80,34.020);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (234,234,'2011-12-01 00:00:00',NULL,93.70,84.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (235,235,'2011-12-01 00:00:00',NULL,279.40,251.460);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (236,236,'2011-12-01 00:00:00',NULL,60.70,54.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (237,237,'2011-12-01 00:00:00',NULL,155.10,139.590);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (238,238,'2011-12-01 00:00:00',NULL,142.70,128.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (239,239,'2011-12-01 00:00:00',NULL,53.70,48.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (240,240,'2011-12-01 00:00:00',NULL,4.30,3.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (241,241,'2011-12-01 00:00:00',NULL,228.20,205.380);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (242,242,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (243,243,'2011-12-01 00:00:00',NULL,151.20,136.080);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (244,244,'2011-12-01 00:00:00',NULL,33.60,30.240);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (245,245,'2011-12-01 00:00:00',NULL,85.40,76.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (246,246,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (247,247,'2011-12-01 00:00:00',NULL,19.80,17.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (248,248,'2011-12-01 00:00:00',NULL,19.40,17.460);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (249,249,'2011-12-01 00:00:00',NULL,7.30,6.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (250,250,'2011-12-01 00:00:00',NULL,9.76,8.784);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (251,251,'2011-12-01 00:00:00',NULL,3.50,3.150);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (252,252,'2011-12-01 00:00:00',NULL,6.34,5.706);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (253,253,'2011-12-01 00:00:00',NULL,181.30,163.170);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (254,254,'2011-12-01 00:00:00',NULL,65.30,58.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (255,255,'2011-12-01 00:00:00',NULL,65.90,59.310);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (256,256,'2011-12-01 00:00:00',NULL,19.24,17.316);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (257,257,'2011-12-01 00:00:00',NULL,29.90,26.910);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (258,258,'2011-12-01 00:00:00',NULL,6.70,6.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (259,259,'2011-12-01 00:00:00',NULL,15.60,14.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (260,260,'2011-12-01 00:00:00',NULL,55.40,49.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (261,261,'2011-12-01 00:00:00',NULL,21.00,18.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (262,262,'2011-12-01 00:00:00',NULL,15.37,13.833);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (263,263,'2011-12-01 00:00:00',NULL,17.90,16.110);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (264,264,'2011-12-01 00:00:00',NULL,14.40,12.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (265,265,'2011-12-01 00:00:00',NULL,19.50,17.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (266,266,'2011-12-01 00:00:00',NULL,52.40,47.160);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (267,267,'2011-12-01 00:00:00',NULL,14.64,13.176);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (268,268,'2011-12-01 00:00:00',NULL,73.20,65.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (269,269,'2011-12-01 00:00:00',NULL,37.10,33.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (270,270,'2011-12-01 00:00:00',NULL,36.60,32.940);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (271,271,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (272,272,'2011-12-01 00:00:00',NULL,20.90,18.810);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (273,273,'2011-12-01 00:00:00',NULL,70.80,63.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (274,274,'2011-12-01 00:00:00',NULL,8.50,7.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (275,275,'2011-12-01 00:00:00',NULL,31.10,27.990);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (276,276,'2011-12-01 00:00:00',NULL,15.70,14.130);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (277,277,'2011-12-01 00:00:00',NULL,7.98,7.182);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (278,278,'2011-12-01 00:00:00',NULL,14.68,13.212);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (279,279,'2011-12-01 00:00:00',NULL,30.40,27.360);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (280,280,'2011-12-01 00:00:00',NULL,70.40,63.360);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (281,281,'2011-12-01 00:00:00',NULL,24.60,22.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (282,282,'2011-12-01 00:00:00',NULL,137.30,123.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (283,283,'2011-12-01 00:00:00',NULL,14.64,13.176);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (284,284,'2011-12-01 00:00:00',NULL,17.70,15.930);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (285,285,'2011-12-01 00:00:00',NULL,8.50,7.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (286,286,'2011-12-01 00:00:00',NULL,47.80,43.020);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (287,287,'2011-12-01 00:00:00',NULL,46.70,42.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (288,288,'2011-12-01 00:00:00',NULL,7.90,7.110);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (289,289,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (290,290,'2011-12-01 00:00:00',NULL,38.40,34.560);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (291,291,'2011-12-01 00:00:00',NULL,50.00,45.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (292,292,'2011-12-01 00:00:00',NULL,56.80,51.120);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (293,293,'2011-12-01 00:00:00',NULL,34.20,30.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (294,294,'2011-12-01 00:00:00',NULL,68.30,61.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (295,295,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (296,296,'2011-12-01 00:00:00',NULL,15.03,13.527);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (297,297,'2011-12-01 00:00:00',NULL,19.52,17.568);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (298,298,'2011-12-01 00:00:00',NULL,46.70,42.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (299,299,'2011-12-01 00:00:00',NULL,70.20,63.180);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (300,300,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (301,301,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (302,302,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (303,303,'2011-12-01 00:00:00',NULL,18.18,16.362);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (304,304,'2011-12-01 00:00:00',NULL,33.31,29.979);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (305,305,'2011-12-01 00:00:00',NULL,42.60,38.340);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (306,306,'2011-12-01 00:00:00',NULL,55.30,49.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (307,307,'2011-12-01 00:00:00',NULL,126.50,113.850);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (308,308,'2011-12-01 00:00:00',NULL,21.30,19.170);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (309,309,'2011-12-01 00:00:00',NULL,17.10,15.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (310,310,'2011-12-01 00:00:00',NULL,48.60,43.740);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (311,311,'2011-12-01 00:00:00',NULL,21.40,19.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (312,312,'2011-12-01 00:00:00',NULL,23.80,21.420);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (313,313,'2011-12-01 00:00:00',NULL,38.71,34.839);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (314,314,'2011-12-01 00:00:00',NULL,76.20,68.580);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (315,315,'2011-12-01 00:00:00',NULL,21.40,19.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (316,316,'2011-12-01 00:00:00',NULL,47.40,42.660);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (317,317,'2011-12-01 00:00:00',NULL,1.60,1.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (318,318,'2011-12-01 00:00:00',NULL,0.60,0.540);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (319,319,'2011-12-01 00:00:00',NULL,30.50,27.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (320,320,'2011-12-01 00:00:00',NULL,13.42,12.078);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (321,321,'2011-12-01 00:00:00',NULL,63.40,57.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (322,322,'2011-12-01 00:00:00',NULL,22.00,19.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (323,323,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (324,324,'2011-12-01 00:00:00',NULL,238.30,214.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (325,325,'2011-12-01 00:00:00',NULL,48.80,43.920);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (326,326,'2011-12-01 00:00:00',NULL,20.10,18.090);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (327,327,'2011-12-01 00:00:00',NULL,42.63,38.367);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (328,328,'2011-12-01 00:00:00',NULL,14.80,13.320);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (329,329,'2011-12-01 00:00:00',NULL,26.23,23.607);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (330,330,'2011-12-01 00:00:00',NULL,50.60,45.540);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (331,331,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (332,332,'2011-12-01 00:00:00',NULL,9.20,8.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (333,333,'2011-12-01 00:00:00',NULL,228.60,205.740);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (334,334,'2011-12-01 00:00:00',NULL,4.30,3.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (335,335,'2011-12-01 00:00:00',NULL,1.60,1.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (336,336,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (337,337,'2011-12-01 00:00:00',NULL,40.00,30.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (338,338,'2011-12-01 00:00:00',NULL,6.59,5.931);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (339,339,'2011-12-01 00:00:00',NULL,1.22,1.098);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (340,340,'2011-12-01 00:00:00',NULL,1.22,1.098);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (341,341,'2011-12-01 00:00:00',NULL,3.29,2.961);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (342,342,'2011-12-01 00:00:00',NULL,0.24,0.216);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (343,343,'2011-12-01 00:00:00',NULL,4.30,3.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (344,344,'2011-12-01 00:00:00',NULL,215.80,194.220);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (345,345,'2011-12-01 00:00:00',NULL,150.40,135.360);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (346,346,'2011-12-01 00:00:00',NULL,18.30,15.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (347,347,'2011-12-01 00:00:00',NULL,152.90,137.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (348,348,'2011-12-01 00:00:00',NULL,79.30,71.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (349,349,'2011-12-01 00:00:00',NULL,1.20,1.080);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (350,350,'2011-12-01 00:00:00',NULL,28.10,25.290);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (351,351,'2011-12-01 00:00:00',NULL,39.70,35.730);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (352,352,'2011-12-01 00:00:00',NULL,3.10,2.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (353,353,'2011-12-01 00:00:00',NULL,69.84,62.856);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (354,354,'2011-12-01 00:00:00',NULL,0.98,0.882);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (355,355,'2011-12-01 00:00:00',NULL,28.29,25.461);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (356,356,'2011-12-01 00:00:00',NULL,52.26,47.034);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (357,357,'2011-12-01 00:00:00',NULL,54.90,49.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (358,358,'2011-12-01 00:00:00',NULL,10.00,8.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (359,359,'2011-12-01 00:00:00',NULL,14.30,12.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (360,360,'2011-12-01 00:00:00',NULL,15.90,14.310);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (361,361,'2011-12-01 00:00:00',NULL,12.00,10.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (362,362,'2011-12-01 00:00:00',NULL,25.28,22.752);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (363,363,'2011-12-01 00:00:00',NULL,5.50,4.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (364,364,'2011-12-01 00:00:00',NULL,32.40,29.160);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (365,365,'2011-12-01 00:00:00',NULL,92.80,83.520);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (366,366,'2011-12-01 00:00:00',NULL,49.50,44.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (367,367,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (368,368,'2011-12-01 00:00:00',NULL,40.50,36.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (369,369,'2011-12-01 00:00:00',NULL,27.40,24.660);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (370,370,'2011-12-01 00:00:00',NULL,5.20,4.680);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (371,371,'2011-12-01 00:00:00',NULL,2.30,2.070);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (372,372,'2011-12-01 00:00:00',NULL,29.16,26.244);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (373,373,'2011-12-01 00:00:00',NULL,22.30,20.070);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (374,374,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (375,375,'2011-12-01 00:00:00',NULL,1.70,1.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (376,376,'2011-12-01 00:00:00',NULL,2.68,2.412);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (377,377,'2011-12-01 00:00:00',NULL,6.40,5.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (378,378,'2011-12-01 00:00:00',NULL,4.90,4.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (379,379,'2011-12-01 00:00:00',NULL,83.20,74.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (380,380,'2011-12-01 00:00:00',NULL,10.70,9.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (381,381,'2011-12-01 00:00:00',NULL,65.30,58.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (382,382,'2011-12-01 00:00:00',NULL,238.20,214.380);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (383,383,'2011-12-01 00:00:00',NULL,294.90,265.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (384,384,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (385,385,'2011-12-01 00:00:00',NULL,8.90,8.010);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (386,386,'2011-12-01 00:00:00',NULL,35.60,32.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (387,387,'2011-12-01 00:00:00',NULL,119.00,107.100);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (388,388,'2011-12-01 00:00:00',NULL,19.80,17.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (389,389,'2011-12-01 00:00:00',NULL,171.20,154.080);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (390,390,'2011-12-01 00:00:00',NULL,7.90,7.110);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (391,391,'2011-12-01 00:00:00',NULL,107.36,96.624);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (392,392,'2011-12-01 00:00:00',NULL,4.64,4.176);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (393,393,'2011-12-01 00:00:00',NULL,19.20,17.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (394,394,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (395,395,'2011-12-01 00:00:00',NULL,5.50,4.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (396,396,'2011-12-01 00:00:00',NULL,6.20,5.580);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (397,397,'2011-12-01 00:00:00',NULL,12.40,11.160);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (398,398,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (399,399,'2011-12-01 00:00:00',NULL,8.00,7.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (400,400,'2011-12-01 00:00:00',NULL,5.80,5.220);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (401,401,'2011-12-01 00:00:00',NULL,9.20,8.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (402,402,'2011-12-01 00:00:00',NULL,2.70,2.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (403,403,'2011-12-01 00:00:00',NULL,72.00,64.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (404,404,'2011-12-01 00:00:00',NULL,6.10,5.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (405,405,'2011-12-01 00:00:00',NULL,33.99,30.591);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (406,406,'2011-12-01 00:00:00',NULL,4.20,3.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (407,407,'2011-12-01 00:00:00',NULL,6.10,5.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (408,408,'2011-12-01 00:00:00',NULL,26.80,24.120);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (409,409,'2011-12-01 00:00:00',NULL,50.80,45.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (410,410,'2011-12-01 00:00:00',NULL,244.00,219.600);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (411,411,'2011-12-01 00:00:00',NULL,41.50,37.350);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (412,412,'2011-12-01 00:00:00',NULL,30.50,27.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (413,413,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (414,414,'2011-12-01 00:00:00',NULL,28.98,26.082);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (415,415,'2011-12-01 00:00:00',NULL,33.70,30.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (416,416,'2011-12-01 00:00:00',NULL,63.30,60.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (417,417,'2011-12-01 00:00:00',NULL,146.40,131.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (418,418,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (419,419,'2011-12-01 00:00:00',NULL,201.30,181.170);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (420,420,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (421,421,'2011-12-01 00:00:00',NULL,23.20,20.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (422,422,'2011-12-01 00:00:00',NULL,4.40,3.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (423,423,'2011-12-01 00:00:00',NULL,6.20,5.580);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (424,424,'2011-12-01 00:00:00',NULL,14.93,13.437);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (425,425,'2011-12-01 00:00:00',NULL,1.71,1.539);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (426,426,'2011-12-01 00:00:00',NULL,4.88,4.392);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (427,427,'2011-12-01 00:00:00',NULL,3.10,2.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (428,428,'2011-12-01 00:00:00',NULL,0.70,0.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (429,429,'2011-12-01 00:00:00',NULL,10.90,9.810);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (430,430,'2011-12-01 00:00:00',NULL,57.30,51.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (431,431,'2011-12-01 00:00:00',NULL,3.66,3.294);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (432,432,'2011-12-01 00:00:00',NULL,5.30,4.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (433,433,'2011-12-01 00:00:00',NULL,15.10,13.590);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (434,434,'2011-12-01 00:00:00',NULL,35.30,31.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (435,435,'2011-12-01 00:00:00',NULL,207.40,186.660);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (436,436,'2011-12-01 00:00:00',NULL,549.00,494.100);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (437,437,'2011-12-01 00:00:00',NULL,37.40,33.660);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (438,438,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (439,439,'2011-12-01 00:00:00',NULL,69.20,62.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (440,440,'2011-12-01 00:00:00',NULL,14.10,12.690);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (441,441,'2011-12-01 00:00:00',NULL,5.40,4.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (442,442,'2011-12-01 00:00:00',NULL,134.20,120.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (443,443,'2011-12-01 00:00:00',NULL,34.40,30.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (444,444,'2011-12-01 00:00:00',NULL,13.50,12.150);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (445,445,'2011-12-01 00:00:00',NULL,18.90,17.010);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (446,446,'2011-12-01 00:00:00',NULL,17.20,15.480);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (447,447,'2011-12-01 00:00:00',NULL,24.30,21.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (448,448,'2011-12-01 00:00:00',NULL,35.00,31.500);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (449,449,'2011-12-01 00:00:00',NULL,14.50,13.050);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (450,450,'2011-12-01 00:00:00',NULL,46.30,41.670);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (451,451,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (452,452,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (453,453,'2011-12-01 00:00:00',NULL,11.00,9.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (454,454,'2011-12-01 00:00:00',NULL,13.30,11.970);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (455,455,'2011-12-01 00:00:00',NULL,5.00,4.500);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (456,456,'2011-12-01 00:00:00',NULL,5.00,4.500);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (457,457,'2011-12-01 00:00:00',NULL,5.00,4.500);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (458,458,'2011-12-01 00:00:00',NULL,4.88,4.392);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (459,459,'2011-12-01 00:00:00',NULL,73.70,66.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (460,460,'2011-12-01 00:00:00',NULL,91.10,81.990);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (461,461,'2011-12-01 00:00:00',NULL,4.90,4.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (462,462,'2011-12-01 00:00:00',NULL,51.90,46.710);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (463,463,'2011-12-01 00:00:00',NULL,19.50,17.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (464,464,'2011-12-01 00:00:00',NULL,7.10,6.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (465,465,'2011-12-01 00:00:00',NULL,233.50,210.150);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (466,466,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (467,467,'2011-12-01 00:00:00',NULL,3.17,2.853);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (468,468,'2011-12-01 00:00:00',NULL,16.20,14.580);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (469,469,'2011-12-01 00:00:00',NULL,24.70,22.230);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (470,470,'2011-12-01 00:00:00',NULL,170.80,153.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (471,471,'2011-12-01 00:00:00',NULL,1665.30,1498.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (472,472,'2011-12-01 00:00:00',NULL,3806.40,3425.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (473,473,'2011-12-01 00:00:00',NULL,2514.40,2262.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (474,474,'2011-12-01 00:00:00',NULL,97.40,87.660);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (475,475,'2011-12-01 00:00:00',NULL,1552.70,1397.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (476,476,'2011-12-01 00:00:00',NULL,1017.50,915.750);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (477,477,'2011-12-01 00:00:00',NULL,3660.00,3294.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (478,478,'2011-12-01 00:00:00',NULL,2533.90,2280.510);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (479,479,'2011-12-01 00:00:00',NULL,2533.90,2280.510);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (480,480,'2011-12-01 00:00:00',NULL,596.60,536.940);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (481,481,'2011-12-01 00:00:00',NULL,796.70,717.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (482,482,'2011-12-01 00:00:00',NULL,441.60,397.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (483,483,'2011-12-01 00:00:00',NULL,466.70,420.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (484,484,'2011-12-01 00:00:00',NULL,463.60,417.240);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (485,485,'2011-12-01 00:00:00',NULL,396.50,356.850);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (486,486,'2011-12-01 00:00:00',NULL,3137.70,2823.930);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (487,487,'2011-12-01 00:00:00',NULL,427.00,384.300);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (488,488,'2011-12-01 00:00:00',NULL,2352.90,2117.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (489,489,'2011-12-01 00:00:00',NULL,451.40,406.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (490,490,'2011-12-01 00:00:00',NULL,1939.80,1745.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (491,491,'2011-12-01 00:00:00',NULL,2422.90,2180.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (492,492,'2011-12-01 00:00:00',NULL,439.20,395.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (493,493,'2011-12-01 00:00:00',NULL,237.90,214.110);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (494,494,'2011-12-01 00:00:00',NULL,256.20,230.580);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (495,495,'2011-12-01 00:00:00',NULL,133.00,119.700);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (496,496,'2011-12-01 00:00:00',NULL,134.20,120.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (497,497,'2011-12-01 00:00:00',NULL,539.20,485.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (498,498,'2011-12-01 00:00:00',NULL,610.00,549.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (499,499,'2011-12-01 00:00:00',NULL,201.30,181.170);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (500,500,'2011-12-01 00:00:00',NULL,1708.00,1537.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (501,501,'2011-12-01 00:00:00',NULL,2196.00,1976.400);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (502,502,'2011-12-01 00:00:00',NULL,2440.00,2196.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (503,503,'2011-12-01 00:00:00',NULL,2092.30,1883.070);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (504,504,'2011-12-01 00:00:00',NULL,1679.90,1511.910);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (505,505,'2011-12-01 00:00:00',NULL,1446.90,1302.210);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (506,506,'2011-12-01 00:00:00',NULL,549.00,494.100);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (507,507,'2011-12-01 00:00:00',NULL,1317.60,1185.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (508,508,'2011-12-01 00:00:00',NULL,2562.00,2305.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (509,509,'2011-12-01 00:00:00',NULL,1098.00,988.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (510,510,'2011-12-01 00:00:00',NULL,457.50,411.750);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (511,511,'2011-12-01 00:00:00',NULL,85.40,76.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (512,512,'2011-12-01 00:00:00',NULL,671.00,603.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (513,513,'2011-12-01 00:00:00',NULL,3660.00,3294.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (514,514,'2011-12-01 00:00:00',NULL,445.30,400.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (515,515,'2011-12-01 00:00:00',NULL,417.20,375.480);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (516,516,'2011-12-01 00:00:00',NULL,1732.40,1559.160);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (517,517,'2011-12-01 00:00:00',NULL,819.90,737.910);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (518,518,'2011-12-01 00:00:00',NULL,939.40,845.460);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (519,519,'2011-12-01 00:00:00',NULL,4406.60,3965.940);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (520,520,'2011-12-01 00:00:00',NULL,1895.50,1705.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (521,521,'2011-12-01 00:00:00',NULL,1250.20,1125.180);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (522,522,'2011-12-01 00:00:00',NULL,195.20,175.680);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (523,523,'2011-12-01 00:00:00',NULL,8.66,7.794);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (524,524,'2011-12-01 00:00:00',NULL,771.40,694.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (525,525,'2011-12-01 00:00:00',NULL,23.20,20.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (526,526,'2011-12-01 00:00:00',NULL,439.20,395.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (527,527,'2011-12-01 00:00:00',NULL,303.80,273.420);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (528,528,'2011-12-01 00:00:00',NULL,1586.00,1427.400);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (529,529,'2011-12-01 00:00:00',NULL,4.30,3.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (530,530,'2011-12-01 00:00:00',NULL,20.70,18.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (531,531,'2011-12-01 00:00:00',NULL,60.39,54.351);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (532,532,'2011-12-01 00:00:00',NULL,1708.00,1537.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (533,533,'2011-12-01 00:00:00',NULL,732.00,658.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (534,534,'2011-12-01 00:00:00',NULL,445.30,400.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (535,535,'2011-12-01 00:00:00',NULL,439.20,395.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (536,536,'2011-12-01 00:00:00',NULL,622.20,559.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (537,537,'2011-12-01 00:00:00',NULL,498.50,448.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (538,538,'2011-12-01 00:00:00',NULL,494.10,444.690);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (539,539,'2011-12-01 00:00:00',NULL,658.80,592.920);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (540,540,'2011-12-01 00:00:00',NULL,557.50,501.750);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (541,541,'2011-12-01 00:00:00',NULL,796.70,717.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (542,542,'2011-12-01 00:00:00',NULL,651.40,586.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (543,543,'2011-12-01 00:00:00',NULL,610.00,549.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (544,544,'2011-12-01 00:00:00',NULL,1762.90,1586.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (545,545,'2011-12-01 00:00:00',NULL,3904.00,3513.600);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (546,546,'2011-12-01 00:00:00',NULL,488.00,439.200);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (547,547,'2011-12-01 00:00:00',NULL,619.40,557.460);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (548,548,'2011-12-01 00:00:00',NULL,24.40,21.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (549,549,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (550,550,'2011-12-01 00:00:00',NULL,31.72,28.548);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (551,551,'2011-12-01 00:00:00',NULL,1.90,1.710);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (552,552,'2011-12-01 00:00:00',NULL,8.50,7.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (553,553,'2011-12-01 00:00:00',NULL,5.45,4.905);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (554,554,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (555,555,'2011-12-01 00:00:00',NULL,19.30,17.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (556,556,'2011-12-01 00:00:00',NULL,5.50,4.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (557,557,'2011-12-01 00:00:00',NULL,11.70,10.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (558,558,'2011-12-01 00:00:00',NULL,2.20,1.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (559,559,'2011-12-01 00:00:00',NULL,0.70,0.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (560,560,'2011-12-01 00:00:00',NULL,37.21,33.489);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (561,561,'2011-12-01 00:00:00',NULL,19.84,17.856);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (562,562,'2011-12-01 00:00:00',NULL,2.70,2.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (563,563,'2011-12-01 00:00:00',NULL,3.66,3.294);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (564,564,'2011-12-01 00:00:00',NULL,3.10,2.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (565,565,'2011-12-01 00:00:00',NULL,19.52,17.568);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (566,566,'2011-12-01 00:00:00',NULL,58.10,52.290);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (567,567,'2011-12-01 00:00:00',NULL,20.70,18.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (568,568,'2011-12-01 00:00:00',NULL,2.10,1.890);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (569,569,'2011-12-01 00:00:00',NULL,6.80,6.120);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (570,570,'2011-12-01 00:00:00',NULL,17.30,15.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (571,571,'2011-12-01 00:00:00',NULL,9.50,8.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (572,572,'2011-12-01 00:00:00',NULL,20.50,18.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (573,573,'2011-12-01 00:00:00',NULL,35.20,31.680);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (574,574,'2011-12-01 00:00:00',NULL,53.10,47.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (575,575,'2011-12-01 00:00:00',NULL,12.00,10.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (576,576,'2011-12-01 00:00:00',NULL,5.10,4.590);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (577,577,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (578,578,'2011-12-01 00:00:00',NULL,7.80,7.020);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (579,579,'2011-12-01 00:00:00',NULL,5.10,4.590);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (580,580,'2011-12-01 00:00:00',NULL,8.90,8.010);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (581,581,'2011-12-01 00:00:00',NULL,12.40,11.160);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (582,582,'2011-12-01 00:00:00',NULL,16.60,14.940);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (583,583,'2011-12-01 00:00:00',NULL,20.70,18.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (584,584,'2011-12-01 00:00:00',NULL,16.60,14.940);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (585,585,'2011-12-01 00:00:00',NULL,28.70,25.830);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (586,586,'2011-12-01 00:00:00',NULL,25.60,23.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (587,587,'2011-12-01 00:00:00',NULL,31.20,28.080);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (588,588,'2011-12-01 00:00:00',NULL,37.80,34.020);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (589,589,'2011-12-01 00:00:00',NULL,19.50,17.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (590,590,'2011-12-01 00:00:00',NULL,20.50,18.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (591,591,'2011-12-01 00:00:00',NULL,4.80,4.320);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (592,592,'2011-12-01 00:00:00',NULL,3.80,3.420);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (593,593,'2011-12-01 00:00:00',NULL,5.50,4.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (594,594,'2011-12-01 00:00:00',NULL,4.90,4.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (595,595,'2011-12-01 00:00:00',NULL,0.61,0.549);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (596,596,'2011-12-01 00:00:00',NULL,24.77,22.293);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (597,597,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (598,598,'2011-12-01 00:00:00',NULL,6.70,6.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (599,599,'2011-12-01 00:00:00',NULL,32.96,29.664);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (600,600,'2011-12-01 00:00:00',NULL,9.30,8.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (601,601,'2011-12-01 00:00:00',NULL,9.30,8.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (602,602,'2011-12-01 00:00:00',NULL,11.00,9.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (603,603,'2011-12-01 00:00:00',NULL,7.20,6.480);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (604,604,'2011-12-01 00:00:00',NULL,5.59,5.031);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (605,605,'2011-12-01 00:00:00',NULL,4.10,3.690);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (606,606,'2011-12-01 00:00:00',NULL,9.40,8.460);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (607,607,'2011-12-01 00:00:00',NULL,5.70,5.130);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (608,608,'2011-12-01 00:00:00',NULL,7.60,6.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (609,609,'2011-12-01 00:00:00',NULL,5.00,4.500);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (610,610,'2011-12-01 00:00:00',NULL,92.00,82.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (611,611,'2011-12-01 00:00:00',NULL,73.20,65.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (612,612,'2011-12-01 00:00:00',NULL,146.40,131.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (613,613,'2011-12-01 00:00:00',NULL,9.10,8.190);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (614,614,'2011-12-01 00:00:00',NULL,10.50,9.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (615,615,'2011-12-01 00:00:00',NULL,75.60,68.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (616,616,'2011-12-01 00:00:00',NULL,70.20,63.180);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (617,617,'2011-12-01 00:00:00',NULL,73.20,65.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (618,618,'2011-12-01 00:00:00',NULL,88.20,79.380);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (619,619,'2011-12-01 00:00:00',NULL,67.10,60.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (620,620,'2011-12-01 00:00:00',NULL,56.40,50.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (621,621,'2011-12-01 00:00:00',NULL,103.70,93.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (622,622,'2011-12-01 00:00:00',NULL,40.50,36.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (623,623,'2011-12-01 00:00:00',NULL,57.40,51.660);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (624,624,'2011-12-01 00:00:00',NULL,80.50,72.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (625,625,'2011-12-01 00:00:00',NULL,10.00,9.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (626,626,'2011-12-01 00:00:00',NULL,11.20,10.080);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (627,627,'2011-12-01 00:00:00',NULL,6.10,5.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (628,628,'2011-12-01 00:00:00',NULL,2.90,2.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (629,629,'2011-12-01 00:00:00',NULL,39.04,35.136);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (630,630,'2011-12-01 00:00:00',NULL,49.60,44.640);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (631,631,'2011-12-01 00:00:00',NULL,6.30,5.670);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (632,632,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (633,633,'2011-12-01 00:00:00',NULL,3.50,3.150);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (634,634,'2011-12-01 00:00:00',NULL,6.30,5.670);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (635,635,'2011-12-01 00:00:00',NULL,23.80,21.420);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (636,636,'2011-12-01 00:00:00',NULL,51.20,46.080);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (637,637,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (638,638,'2011-12-01 00:00:00',NULL,9.21,8.289);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (639,639,'2011-12-01 00:00:00',NULL,21.60,19.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (640,640,'2011-12-01 00:00:00',NULL,8.54,7.686);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (641,641,'2011-12-01 00:00:00',NULL,16.40,14.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (642,642,'2011-12-01 00:00:00',NULL,32.90,29.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (643,643,'2011-12-01 00:00:00',NULL,65.30,58.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (644,644,'2011-12-01 00:00:00',NULL,33.40,30.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (645,645,'2011-12-01 00:00:00',NULL,19.30,17.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (646,646,'2011-12-01 00:00:00',NULL,6.70,6.030);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (647,647,'2011-12-01 00:00:00',NULL,26.50,23.850);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (648,648,'2011-12-01 00:00:00',NULL,78.08,70.272);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (649,649,'2011-12-01 00:00:00',NULL,22.40,20.160);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (650,650,'2011-12-01 00:00:00',NULL,16.30,14.670);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (651,651,'2011-12-01 00:00:00',NULL,28.50,25.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (652,652,'2011-12-01 00:00:00',NULL,10.98,9.882);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (653,653,'2011-12-01 00:00:00',NULL,10.86,9.774);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (654,654,'2011-12-01 00:00:00',NULL,20.70,18.630);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (655,655,'2011-12-01 00:00:00',NULL,19.50,17.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (656,656,'2011-12-01 00:00:00',NULL,26.00,23.400);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (657,657,'2011-12-01 00:00:00',NULL,15.30,13.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (658,658,'2011-12-01 00:00:00',NULL,22.00,19.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (659,659,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (660,660,'2011-12-01 00:00:00',NULL,9.10,8.190);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (661,661,'2011-12-01 00:00:00',NULL,10.40,9.360);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (662,662,'2011-12-01 00:00:00',NULL,26.80,24.120);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (663,663,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (664,664,'2011-12-01 00:00:00',NULL,16.30,14.670);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (665,665,'2011-12-01 00:00:00',NULL,45.14,40.626);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (666,666,'2011-12-01 00:00:00',NULL,22.40,20.160);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (667,667,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (668,668,'2011-12-01 00:00:00',NULL,26.60,23.940);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (669,669,'2011-12-01 00:00:00',NULL,29.30,26.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (670,670,'2011-12-01 00:00:00',NULL,73.20,65.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (671,671,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (672,672,'2011-12-01 00:00:00',NULL,111.23,100.107);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (673,673,'2011-12-01 00:00:00',NULL,22.20,19.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (674,674,'2011-12-01 00:00:00',NULL,74.40,66.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (675,675,'2011-12-01 00:00:00',NULL,53.90,48.510);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (676,676,'2011-12-01 00:00:00',NULL,22.90,20.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (677,677,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (678,678,'2011-12-01 00:00:00',NULL,7.32,6.588);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (679,679,'2011-12-01 00:00:00',NULL,22.20,19.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (680,680,'2011-12-01 00:00:00',NULL,14.50,13.050);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (681,681,'2011-12-01 00:00:00',NULL,27.57,24.813);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (682,682,'2011-12-01 00:00:00',NULL,7.30,6.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (683,683,'2011-12-01 00:00:00',NULL,34.40,30.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (684,684,'2011-12-01 00:00:00',NULL,59.80,53.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (685,685,'2011-12-01 00:00:00',NULL,19.20,17.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (686,686,'2011-12-01 00:00:00',NULL,11.00,9.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (687,687,'2011-12-01 00:00:00',NULL,11.40,10.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (688,688,'2011-12-01 00:00:00',NULL,41.70,37.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (689,689,'2011-12-01 00:00:00',NULL,7.30,6.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (690,690,'2011-12-01 00:00:00',NULL,18.60,16.740);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (691,691,'2011-12-01 00:00:00',NULL,51.00,45.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (692,692,'2011-12-01 00:00:00',NULL,25.60,23.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (693,693,'2011-12-01 00:00:00',NULL,5.49,4.941);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (694,694,'2011-12-01 00:00:00',NULL,57.30,51.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (695,695,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (696,696,'2011-12-01 00:00:00',NULL,173.20,155.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (697,697,'2011-12-01 00:00:00',NULL,140.30,126.270);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (698,698,'2011-12-01 00:00:00',NULL,195.20,175.680);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (699,699,'2011-12-01 00:00:00',NULL,146.40,131.760);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (700,700,'2011-12-01 00:00:00',NULL,10.00,9.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (701,701,'2011-12-01 00:00:00',NULL,13.40,12.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (702,702,'2011-12-01 00:00:00',NULL,10.00,9.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (703,703,'2011-12-01 00:00:00',NULL,10.80,9.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (704,704,'2011-12-01 00:00:00',NULL,15.40,13.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (705,705,'2011-12-01 00:00:00',NULL,18.50,16.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (706,706,'2011-12-01 00:00:00',NULL,29.40,26.460);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (707,707,'2011-12-01 00:00:00',NULL,23.20,20.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (708,708,'2011-12-01 00:00:00',NULL,15.40,13.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (709,709,'2011-12-01 00:00:00',NULL,13.40,12.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (710,710,'2011-12-01 00:00:00',NULL,15.40,13.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (711,711,'2011-12-01 00:00:00',NULL,15.10,13.590);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (712,712,'2011-12-01 00:00:00',NULL,10.80,9.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (713,713,'2011-12-01 00:00:00',NULL,14.90,13.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (714,714,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (715,715,'2011-12-01 00:00:00',NULL,9.70,8.730);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (716,716,'2011-12-01 00:00:00',NULL,139.60,125.640);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (717,717,'2011-12-01 00:00:00',NULL,5.10,4.590);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (718,718,'2011-12-01 00:00:00',NULL,8.28,7.452);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (719,719,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (720,720,'2011-12-01 00:00:00',NULL,7.20,6.480);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (721,721,'2011-12-01 00:00:00',NULL,2.90,2.610);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (722,722,'2011-12-01 00:00:00',NULL,4.10,3.690);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (723,723,'2011-12-01 00:00:00',NULL,3.99,3.591);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (724,724,'2011-12-01 00:00:00',NULL,11.05,9.945);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (725,725,'2011-12-01 00:00:00',NULL,11.64,10.476);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (726,726,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (727,727,'2011-12-01 00:00:00',NULL,7.30,6.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (728,728,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (729,729,'2011-12-01 00:00:00',NULL,17.70,15.930);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (730,730,'2011-12-01 00:00:00',NULL,8.50,7.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (731,731,'2011-12-01 00:00:00',NULL,9.76,8.784);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (732,732,'2011-12-01 00:00:00',NULL,11.30,10.170);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (733,733,'2011-12-01 00:00:00',NULL,73.20,65.880);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (734,734,'2011-12-01 00:00:00',NULL,6.00,5.400);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (735,735,'2011-12-01 00:00:00',NULL,7.32,6.588);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (736,736,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (737,737,'2011-12-01 00:00:00',NULL,35.40,31.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (738,738,'2011-12-01 00:00:00',NULL,13.42,12.078);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (739,739,'2011-12-01 00:00:00',NULL,24.40,21.960);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (740,740,'2011-12-01 00:00:00',NULL,1.10,0.990);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (741,741,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (742,742,'2011-12-01 00:00:00',NULL,24.30,21.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (743,743,'2011-12-01 00:00:00',NULL,44.60,40.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (744,744,'2011-12-01 00:00:00',NULL,5.49,4.941);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (745,745,'2011-12-01 00:00:00',NULL,4.30,3.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (746,746,'2011-12-01 00:00:00',NULL,28.10,25.290);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (747,747,'2011-12-01 00:00:00',NULL,37.10,33.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (748,748,'2011-12-01 00:00:00',NULL,1.22,1.098);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (749,749,'2011-12-01 00:00:00',NULL,17.10,15.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (750,750,'2011-12-01 00:00:00',NULL,0.38,0.342);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (751,751,'2011-12-01 00:00:00',NULL,221.40,199.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (752,752,'2011-12-01 00:00:00',NULL,3.10,2.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (753,753,'2011-12-01 00:00:00',NULL,3.48,3.132);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (754,754,'2011-12-01 00:00:00',NULL,38.50,34.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (755,755,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (756,756,'2011-12-01 00:00:00',NULL,5.61,5.049);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (757,757,'2011-12-01 00:00:00',NULL,57.90,52.110);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (758,758,'2011-12-01 00:00:00',NULL,11.00,9.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (759,759,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (760,760,'2011-12-01 00:00:00',NULL,115.90,104.310);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (761,761,'2011-12-01 00:00:00',NULL,7.80,7.020);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (762,762,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (763,763,'2011-12-01 00:00:00',NULL,44.60,40.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (764,764,'2011-12-01 00:00:00',NULL,50.00,45.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (765,765,'2011-12-01 00:00:00',NULL,67.10,60.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (766,766,'2011-12-01 00:00:00',NULL,122.00,109.800);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (767,767,'2011-12-01 00:00:00',NULL,2.20,1.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (768,768,'2011-12-01 00:00:00',NULL,7.80,7.020);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (769,769,'2011-12-01 00:00:00',NULL,134.20,120.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (770,770,'2011-12-01 00:00:00',NULL,3.10,2.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (771,771,'2011-12-01 00:00:00',NULL,103.70,93.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (772,772,'2011-12-01 00:00:00',NULL,15.30,13.770);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (773,773,'2011-12-01 00:00:00',NULL,5.62,5.058);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (774,774,'2011-12-01 00:00:00',NULL,4.20,3.780);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (775,775,'2011-12-01 00:00:00',NULL,1.50,1.350);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (776,776,'2011-12-01 00:00:00',NULL,3.10,2.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (777,777,'2011-12-01 00:00:00',NULL,16.50,14.850);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (778,778,'2011-12-01 00:00:00',NULL,51.80,46.620);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (779,779,'2011-12-01 00:00:00',NULL,61.00,54.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (780,780,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (781,781,'2011-12-01 00:00:00',NULL,61.00,54.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (782,782,'2011-12-01 00:00:00',NULL,36.00,32.400);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (783,783,'2011-12-01 00:00:00',NULL,19.50,17.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (784,784,'2011-12-01 00:00:00',NULL,1.22,1.098);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (785,785,'2011-12-01 00:00:00',NULL,2.20,1.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (786,786,'2011-12-01 00:00:00',NULL,97.60,87.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (787,787,'2011-12-01 00:00:00',NULL,11.60,10.440);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (788,788,'2011-12-01 00:00:00',NULL,17.10,15.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (789,789,'2011-12-01 00:00:00',NULL,4.90,4.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (790,790,'2011-12-01 00:00:00',NULL,7.30,6.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (791,791,'2011-12-01 00:00:00',NULL,7.30,6.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (792,792,'2011-12-01 00:00:00',NULL,4.90,4.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (793,793,'2011-12-01 00:00:00',NULL,6.10,5.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (794,794,'2011-12-01 00:00:00',NULL,31.11,27.999);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (795,795,'2011-12-01 00:00:00',NULL,37.33,33.597);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (796,796,'2011-12-01 00:00:00',NULL,35.40,31.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (797,797,'2011-12-01 00:00:00',NULL,567.60,510.840);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (798,798,'2011-12-01 00:00:00',NULL,1.80,1.620);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (799,799,'2011-12-01 00:00:00',NULL,38.80,34.920);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (800,800,'2011-12-01 00:00:00',NULL,136.50,122.850);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (801,801,'2011-12-01 00:00:00',NULL,51.20,46.080);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (802,802,'2011-12-01 00:00:00',NULL,13.80,12.420);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (803,803,'2011-12-01 00:00:00',NULL,4.39,3.951);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (804,804,'2011-12-01 00:00:00',NULL,4.88,4.392);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (805,805,'2011-12-01 00:00:00',NULL,59.50,53.550);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (806,806,'2011-12-01 00:00:00',NULL,42.70,38.430);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (807,807,'2011-12-01 00:00:00',NULL,13.70,12.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (808,808,'2011-12-01 00:00:00',NULL,25.90,23.310);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (809,809,'2011-12-01 00:00:00',NULL,6.10,5.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (810,810,'2011-12-01 00:00:00',NULL,8.30,7.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (811,811,'2011-12-01 00:00:00',NULL,20.20,18.180);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (812,812,'2011-12-01 00:00:00',NULL,67.10,60.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (813,813,'2011-12-01 00:00:00',NULL,9.20,8.280);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (814,814,'2011-12-01 00:00:00',NULL,11.20,10.080);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (815,815,'2011-12-01 00:00:00',NULL,3.10,2.790);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (816,816,'2011-12-01 00:00:00',NULL,0.49,0.441);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (817,817,'2011-12-01 00:00:00',NULL,0.37,0.333);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (818,818,'2011-12-01 00:00:00',NULL,14.60,13.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (819,819,'2011-12-01 00:00:00',NULL,40.30,36.270);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (820,820,'2011-12-01 00:00:00',NULL,161.40,145.260);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (821,821,'2011-12-01 00:00:00',NULL,43.36,39.024);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (822,822,'2011-12-01 00:00:00',NULL,53.44,48.096);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (823,823,'2011-12-01 00:00:00',NULL,7.30,6.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (824,824,'2011-12-01 00:00:00',NULL,21.80,19.620);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (825,825,'2011-12-01 00:00:00',NULL,56.80,51.120);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (826,826,'2011-12-01 00:00:00',NULL,1.30,1.170);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (827,827,'2011-12-01 00:00:00',NULL,6.20,5.580);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (828,828,'2011-12-01 00:00:00',NULL,29.80,26.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (829,829,'2011-12-01 00:00:00',NULL,29.30,26.370);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (830,830,'2011-12-01 00:00:00',NULL,166.20,149.580);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (831,831,'2011-12-01 00:00:00',NULL,36.10,32.490);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (832,832,'2011-12-01 00:00:00',NULL,506.30,455.670);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (833,833,'2011-12-01 00:00:00',NULL,29.90,26.910);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (834,834,'2011-12-01 00:00:00',NULL,8.40,7.500);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (835,835,'2011-12-01 00:00:00',NULL,7.00,8.000);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (836,836,'2011-12-01 00:00:00',NULL,1.10,0.990);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (837,837,'2011-12-01 00:00:00',NULL,10.80,9.720);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (838,838,'2011-12-01 00:00:00',NULL,8.80,7.920);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (839,839,'2011-12-01 00:00:00',NULL,11.80,10.620);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (840,840,'2011-12-01 00:00:00',NULL,5.80,5.220);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (841,841,'2011-12-01 00:00:00',NULL,4.60,4.140);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (842,842,'2011-12-01 00:00:00',NULL,12.20,10.980);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (843,843,'2011-12-01 00:00:00',NULL,121.50,109.350);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (844,844,'2011-12-01 00:00:00',NULL,18.60,16.740);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (845,845,'2011-12-01 00:00:00',NULL,25.60,23.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (846,846,'2011-12-01 00:00:00',NULL,1.71,1.539);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (847,847,'2011-12-01 00:00:00',NULL,15.50,13.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (848,848,'2011-12-01 00:00:00',NULL,54.90,49.410);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (849,849,'2011-12-01 00:00:00',NULL,36.90,33.210);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (850,850,'2011-12-01 00:00:00',NULL,5.50,4.950);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (851,851,'2011-12-01 00:00:00',NULL,31.00,27.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (852,852,'2011-12-01 00:00:00',NULL,503.60,453.240);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (853,853,'2011-12-01 00:00:00',NULL,41.50,37.350);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (854,854,'2011-12-01 00:00:00',NULL,2.50,2.250);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (855,855,'2011-12-01 00:00:00',NULL,58.60,52.740);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (856,856,'2011-12-01 00:00:00',NULL,317.20,285.480);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (857,857,'2011-12-01 00:00:00',NULL,585.60,527.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (858,858,'2011-12-01 00:00:00',NULL,45.10,40.590);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (859,859,'2011-12-01 00:00:00',NULL,31.70,28.530);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (860,860,'2011-12-01 00:00:00',NULL,50.50,45.450);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (861,861,'2011-12-01 00:00:00',NULL,109.80,98.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (862,862,'2011-12-01 00:00:00',NULL,98.50,88.650);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (863,863,'2011-12-01 00:00:00',NULL,76.50,68.850);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (864,864,'2011-12-01 00:00:00',NULL,145.20,130.680);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (865,865,'2011-12-01 00:00:00',NULL,93.80,84.420);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (866,866,'2011-12-01 00:00:00',NULL,63.44,57.096);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (867,867,'2011-12-01 00:00:00',NULL,4.30,3.870);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (868,868,'2011-12-01 00:00:00',NULL,9.80,8.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (869,869,'2011-12-01 00:00:00',NULL,5.40,4.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (870,870,'2011-12-01 00:00:00',NULL,21.96,19.764);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (871,871,'2011-12-01 00:00:00',NULL,65.90,59.310);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (872,872,'2011-12-01 00:00:00',NULL,5.80,5.220);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (873,873,'2011-12-01 00:00:00',NULL,37.30,33.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (874,874,'2011-12-01 00:00:00',NULL,0.60,0.540);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (875,875,'2011-12-01 00:00:00',NULL,3.30,2.970);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (876,876,'2011-12-01 00:00:00',NULL,1.00,0.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (877,877,'2011-12-01 00:00:00',NULL,139.70,125.730);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (878,878,'2011-12-01 00:00:00',NULL,3.70,3.330);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (879,879,'2011-12-01 00:00:00',NULL,8.70,7.830);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (880,880,'2011-12-01 00:00:00',NULL,13.40,12.060);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (881,881,'2011-12-01 00:00:00',NULL,121.00,108.900);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (882,882,'2011-12-01 00:00:00',NULL,77.96,70.164);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (883,883,'2011-12-01 00:00:00',NULL,17.10,15.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (884,884,'2011-12-01 00:00:00',NULL,81.50,73.350);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (885,885,'2011-12-01 00:00:00',NULL,57.10,51.390);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (886,886,'2011-12-01 00:00:00',NULL,39.40,35.460);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (887,887,'2011-12-01 00:00:00',NULL,17.30,15.570);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (888,888,'2011-12-01 00:00:00',NULL,18.30,16.470);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (889,889,'2011-12-01 00:00:00',NULL,40.30,36.270);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (890,890,'2011-12-01 00:00:00',NULL,19.00,17.100);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (891,891,'2011-12-01 00:00:00',NULL,13.50,12.150);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (892,892,'2011-12-01 00:00:00',NULL,3.90,3.510);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (893,893,'2011-12-01 00:00:00',NULL,40.10,36.090);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (894,894,'2011-12-01 00:00:00',NULL,2.60,2.340);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (895,895,'2011-12-01 00:00:00',NULL,9.10,8.190);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (896,896,'2011-12-01 00:00:00',NULL,5.60,5.040);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (897,897,'2011-12-01 00:00:00',NULL,64.70,58.230);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (898,898,'2011-12-01 00:00:00',NULL,39.80,35.820);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (899,899,'2011-12-01 00:00:00',NULL,85.40,76.860);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (900,900,'2011-12-01 00:00:00',NULL,26.80,24.120);
INSERT INTO `precios` (`idPrecio`,`idProducto`,`fechaDesde`,`fechaHasta`,`precio`,`precioPromocional`) VALUES 
  (901,901,'2011-12-01 00:00:00',NULL,10.20,9.180);
COMMIT;
/*!40000 ALTER TABLE `precios` ENABLE KEYS */;


--
-- Dumping data for table `productos`
--

/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (1,'A0103','ANESTESIA ANESCART FORTR X50.',331,1,1);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (2,'A0111','ANESTESIA KLEPP TOPICAL',110,1,1);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (3,'4','ANESTESIA MUCO-ANESTYL GEL 50G',373,1,1);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (4,'A0107','ANESTESIA SCANDONEST 3% S.V.C.',246,1,1);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (5,'245','ANESTESIA SPRAY INDICAN',106,1,1);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (6,'69','ANESTESIA TOTALCAINA X 50',449,1,1);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (7,'A4','INDICAN GEL',62,1,1);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (8,'1','XYLOCAINA DENTSPLY X 50',381,1,1);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (9,'C1485','AGUJAS C/HILO KEEPER',461,1,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (10,'A1485','AGUJAS CON HILO',409,1,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (11,'A0203','AGUJAS NIPRO/MISAWA/DELTAJET',307,1,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (12,'196','ALGODON EN ROLLOS X 2',182,2,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (13,'A1531','ALGODON PAROTISROLL ROEKOLIMPI',275,2,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (14,'B202','APLICADORES DESC. X 100',261,3,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (15,'A1462','APLICADORES INTRAORAL 3M X96 E',468,3,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (16,'B363','APLICADORES X 25 MICROBRUSH',121,3,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (17,'A1468','BABEROS COMPRESAS X 125 CROSS',137,4,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (18,'A1476','BABEROS LISOS X 100',89,4,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (19,'B206','BARBIJO 3M. MASCARILLA',22,4,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (20,'A1466','BARBIJOS CROSSTEX X 50',1,5,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (21,'A1427','BARBIJOS PAQUETE X 50',328,5,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (22,'E205','BOLSAS AUTOCLAVE 30X46 X 100',354,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (23,'D205','BOLSAS P/ESTERILIZAR BANDEJA',148,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (24,'B154','CADENAS P/ BABEROS NIÂ¥OS',270,4,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (25,'154','CADENAS P/BABEROS METALICA',62,4,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (26,'A846','CANULA DE ACERO',435,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (27,'846','CANULAS CROSSTEX X 100',147,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (28,'C1463','CEPILLITOS ULTABRUSH C/MANGO',83,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (29,'B205','COMPRESAS X 100',324,2,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (30,'A205','COMPRESAS X100 QUALITY',355,2,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (31,'B212','CUBETAS P/FLUOR TERG.',414,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (32,'C0205','DESCARTADOR AGUJAS A BOTON',67,1,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (33,'B0205','DESCARTADOR DE AGUJAS',465,1,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (34,'B1476','EQUIPO ODONT. DESC. P/CIRUGIA',430,7,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (35,'C1476','EQUIPO P/IMPLANTE BLANCO',144,7,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (36,'D1476','EQUIPO P/IMPLANTE AZUL',4,7,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (37,'199','EYECTORES DESCARTABLES X 100',49,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (38,'A199','EYECTORES ESPIRALADOS',280,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (39,'A1401','GASA EN TROZOS 1/2K. IRREGULAR',359,2,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (40,'A1404','GOMA DIQUE DENSELL',458,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (41,'A1443','GOMA DIQUE NACIONAL',80,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (42,'572','GUANTES DE NITRILO',312,8,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (43,'A570','GUANTES ESTERILES',263,8,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (44,'570','GUANTES PRIMEX/DENSELL S/TALCO',187,8,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (45,'571','GUANTES VICTORIA LISO',328,8,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (46,'161','HILO SUTURA NEGRO FARMADENTAL',134,1,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (47,'219','HOJAS BISTURI Nro 15 IMPORTADAS',199,1,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (48,'A219','HOJAS DE BISTURI Nro 15 XINDA',499,1,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (49,'A1482','KIT DESC. ESPEJO EXPLORADOR',223,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (50,'E1446','LABIA-EX ABRE LABIOS',213,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (51,'B846','MIRASUCTO PTA. DE ASPIRACION',93,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (52,'A1463','PINCELES DESCARTABLES X 50',376,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (53,'C846','POLIMATIC PTAS. ASPIRACION',456,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (54,'D846','POLYSUC ASPIRACION REDONDA',470,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (55,'B502','PUNTAS ORAL TIPS X 48',332,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (56,'B1340','REP. TOALLAS CLEAN-UP',215,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (57,'A0006','ROLLO P/ESTERILIZAR X 15CM.',39,2,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (58,'A0007','ROLLO P/ESTERILIZAR X 20 CM.',27,2,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (59,'C1440','SOTENEDORES ROLLOS ALG. MET.',432,2,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (60,'A1407','TIRAS ACETATO GABRICEL',259,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (61,'150','TIRAS DE ACERO P/AMALGAMA DMG',217,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (62,'A1423','TIRAS P/PULIR COMP.NOWET X 100',481,6,2);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (63,'A1020','ABSOLUTE DENTIN PARKELL',405,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (64,'A19','ACIDO COLTENE JER. 2.5 ML.',411,1,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (65,'B244','ACIDO FLUORIDRICO',13,1,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (66,'A244','ACIDO JER. X 2 O 3 GRS',100,1,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (67,'244','ACONDIC. JERINGA ACIDO X 12 GS',499,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (68,'A1041','ADH.TE ECONOM X5ML.',261,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (69,'C1044','ADHESIVO ADPER EASY ONE 3M.',185,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (70,'A1075','ADHESIVO DE FOTO ONE COAT BOND',362,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (71,'B1073','ADHESIVO EASYBOND-ONE STEP',139,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (72,'841','ADHESIVO MULTIPROPOSITO',303,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (73,'442','ADHESIVO OPTIBOND S KERR',182,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (74,'346','ADHESIVO PRIMA&BOND X 4ML.',479,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (75,'B1044','ADHESIVO SINGLE BOND II X 3ML.',464,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (76,'181','ALEACION CONTOUR KERR 30 GRS.',23,3,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (77,'74','ALEACION EXIDENT X30 GRS.',150,3,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (78,'75','AMALGAMA BELKYS',344,3,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (79,'188','AMALGAMA CAP.X 10',242,3,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (80,'B182','AMALGAMA NU ALLOY X 80',228,3,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (81,'277','BARNIZ BAXIM. X 20ML.DICKINSON',254,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (82,'D0010','BIOCLIP FOTO C/U JER. TEMPORAL',276,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (83,'A1052','C0MP. JER. FILTEK Z250 3M',244,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (84,'A1067','CEMENTO ARC CLIKER REFILL 3M.',481,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (85,'A0300','CEMENTO C&B BISCO AUTO',199,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (86,'A301','CEMENTO DUAL ALLCEM FGM. X5GRS',437,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (87,'A300','CEMENTO DUAL DUOLINK',464,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (88,'B0300','CEMENTO RESINA DUAL VENTURA JE',139,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (89,'B0312','CEMENTO TEMP.TEMP-BOND',215,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (90,'B306','COMP. FLUIDO BISCO- AELITEFLOW',54,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (91,'A1053','COMP. JER. FILTEK P60 3M',405,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (92,'A1083','COMP. SER. BIOFIX P/ BRAQUETES',463,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (93,'A1021','COMP. TETRIC CERAM. JER. X 4GR',346,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (94,'A1016','COMP. Z 100 JER X 4 GRS.',56,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (95,'D0008','COMPOSITE FLOW MASTER FLOW',116,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (96,'D0009','COMPOSITE FOTO. JER. X 4GRS.',397,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (97,'A1002','COMPOSITE HELIOSIT ORTHOD.C/U',263,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (98,'A1073','COMPOSITE JER. ROK',262,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (99,'B1053','COMPOSITE SUREFIL X 5',41,2,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (100,'A1038','DURATEMP',488,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (101,'D0300','ENFORCE CORE KIT',94,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (102,'B1047','ESTHET-X JERINGA REP.',89,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (103,'D0001','HIDROX. DE CALCIO FOTO.BIOCAL',434,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (104,'A0339','IONO. DENSELL AUTOCURADO IYII',103,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (105,'A0327','IONO. KETAC MOLAR ESPE AVIO',364,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (106,'B0339','IONOM. GAMMA O EGEO I Y II',403,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (107,'B0340','IONOM. KETAC CEN 15 GR.',499,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (108,'A0329','IONOM. MAXXION RESTAURACION',140,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (109,'A0301','IONOM. RIVA CAPSULAS X 10 SDI',298,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (110,'A0325','IONOM. VITREMER POLVO AZUL',436,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (111,'A0305','IONOM. VITRO FILL Y CEM.',452,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (112,'A0314','IONOMERO AVIO MERON P. Y LIQ.',103,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (113,'A0482','IONOMERO DENSELL A.R.T.',261,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (114,'A0481','IONOMERO DENSELL MP LC. REST.',148,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (115,'B302','IONOMERO DMG LINER P/BASE',334,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (116,'A0326','IONOMERO FUJI II FOTOCURADO',232,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (117,'A0312','IONOMERO FUJI TIPO I CEMENTADO',438,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (118,'A0313','IONOMERO FUJI TIPO II OBTURACI',305,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (119,'C0339','IONOMERO GAMMA FOTO.X10 AVIO',480,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (120,'A0315','IONOMERO IONOFIL AVIO',58,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (121,'B0315','IONOMERO IONOFIL MOLAR AVIO',74,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (122,'A0340','IONOMERO KETAC CEM AVIO',419,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (123,'A0304','IONOMERO MEGA X 10 GR.',189,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (124,'A0318','IONOMERO RIVA LUTING PLUS X25',379,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (125,'A0317','IONOMERO SECURAFIL LC',15,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (126,'A0316','IONOMERO VITREBOND DE FOTO.',408,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (127,'A0321','IONOMERO VITREMER AVIO',136,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (128,'A0309','IONOMERO VITREMER PRIMER',205,4,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (129,'B0307','IONOSEAL VOCO',289,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (130,'62','JER. FILTEX Z 350',99,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (131,'A1061','JER.FLOW KRYSTAL X 2 GR.',367,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (132,'A1084','JERINGA 1GR. COMP. FLUIDO WAVE',207,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (133,'A1082','JERINGA 1GR. COMP. FLUIDO WAVE',431,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (134,'A1079','JERINGA BRILLANT NEWLINE',306,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (135,'A1039','JERINGA COMP. ECO-FLOW',233,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (136,'A1015','JERINGA LLIS 4 GRS.',327,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (137,'B1015','JERINGA OPALLIIS OPACO',26,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (138,'A1003','JERINGA PRIMEDENT COMP.',9,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (139,'A1000','JERINGA PRODIGY',240,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (140,'A1069','JERINGA SUPER COOR X 5 GRS.',309,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (141,'A1026','JERINGA TETRIC X 4 GRS.',253,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (142,'A1046','JERINGA TPH 3',174,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (143,'B1017','JERINGA VENTURA FLOWLUX FLUIDO',273,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (144,'C1017','JERINGA VENTURA NANOLUX X4.5 G',189,5,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (145,'D0002','KIT X 4 MASTER FILL BOND AC. A',269,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (146,'B1045','OPACIFICADOR OPAK P/METAL-DENT',363,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (147,'B0308','PROVICOL / Q-TEMP',179,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (148,'D0011','RESTAURADOR DE FOTO CLIP F X1',68,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (149,'A0343','SEALER 26',254,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (150,'A258','SELLADOR CLINPRO 3M JERINGA',427,6,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (151,'D0004','SELLADOR DE AUTO',381,6,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (152,'B304','SELLADOR DENSELL AUTOCURADO',291,6,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (153,'D0005','SELLADOR JER.FOT.X 2.5 GRS',59,6,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (154,'B1085','SELLADOR JERIN. CONSEAL - KLEP',398,6,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (155,'18','SILANO',499,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (156,'B0325','VITREMER POLVO X 9 GR.',363,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (157,'A1054','VTREMER LIQUIDO REPUESTO',431,7,3);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (158,'208','ACRILICO BERA . COLOR 62-45GR',177,1,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (159,'A0703','ACRILICO CRILENE X 60 GR',77,1,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (160,'209','ACRILICO DURALAY PROVISORIO',450,1,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (161,'A0709','ACRILICO NEWCRYL X 40 GRS C YP',113,1,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (162,'170','ACRILICO SUBITON CRISTAL X200',117,1,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (163,'42','ACRILICO SUBITON ROSA X 400',387,1,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (164,'A0710','ACRILICO VAICEL CORONA X 100GR',491,1,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (165,'169','ACRILICO VAICEL ROSA X 40',442,1,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (166,'B171','CEM. FOSF. DE ZINC LIQ. PROTHO',142,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (167,'377','CEM. FOSF. HARVARD AVIO CLINIC',307,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (168,'376','CEM. FOSF. HARVARD AVIO NORMAL',92,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (169,'A0506','CEM. PROV. PROVIS',264,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (170,'279','CEM. QUIRURGICO AVIO DICKINSON',417,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (171,'174','CEM. ZOER CARYOSAN X 85GRS.',422,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (172,'312','CEM.GROSSMAN AVIO DICKINSON',320,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (173,'281','CEM.QUIRURGICO LIQ.DICKINSON',29,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (174,'A172','CEMEN. IRC OXIDO DE ZINC EUG.',271,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (175,'A376','CEMENTO DE FOSFATO FUYI',221,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (176,'25','CEMENTO FOSFATO DENSELL',227,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (177,'A365','CEMENTO GROSSMAN LIQUIDO',131,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (178,'B376','CEMENTO OXIFOSF. MASTER-DENT',46,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (179,'B1312','CEMENTO QUIRURGICO POLVO',197,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (180,'A379','CEMENTO TEMPORARIO 3M',266,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (181,'172','CEMENTO ZOER S DE O. DE ZINC.',32,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (182,'A400','DURALAY ROJO AVIO 1 OZ.',261,4,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (183,'313','EUGENOL DICKINSON',197,4,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (184,'B401','MONOMERO P/CUBETAS X200',305,3,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (185,'A207','MONOMERO SUBITON X 60 ML',118,3,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (186,'A45','MONOMERO VAICEL X 45 CC',110,3,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (187,'C45','MONOMERO X 20 ML',378,3,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (188,'A0702','MONOMERO X 500 SUBITON',245,3,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (189,'A279','PERIOBOND',246,4,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (190,'A0502','PROVISORIO 3M',47,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (191,'406','PROVISORIO DMG',429,2,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (192,'A1037','RESTAURADOR TEMP. DENSELL FOTO',125,4,4);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (193,'D1106','ACOND.SOFT DENT EGEO',223,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (194,'A1103','ACONDIC. DENTUFLEX AVIO',409,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (195,'A1106','ACONDIC. DENTUSOF AVIO',203,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (196,'229','ACTIVADOR COLTEX O DENSELL',291,1,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (197,'A1155','ACTIVADOR INDURENT',138,1,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (198,'A1156','ACTIVADOR LASTIC X 60ML.',312,1,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (199,'80','ACTIVADOR PRECISE',11,1,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (200,'A1121','ACTIVADOR VENTURA X 20ML.',499,1,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (201,'B1111','ALGINATO ALGIMAX',67,2,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (202,'A1115','ALGINATO CA 37 PINK BOLSA X 1',109,2,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (203,'B511','ALGINATO HIDROGUM SOFT',118,2,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (204,'A73','ALGINATO JELTRATE PLUS',133,2,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (205,'A1111','ALGINATO KROMOPAN',221,2,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (206,'A111','ALGINATO MILENIUM',102,2,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (207,'755','ALGINATO SOBRE X 18 GRS. PHASE',388,2,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (208,'A1172','ALGINATO VIVAL DE VIVADENT X 5',177,2,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (209,'D212','CERA AZUL EN BARRA C/U',459,3,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (210,'B1124','CERA BEAUTY PINK C/U',457,3,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (211,'A1124','CERA VAICRIL X 200GRS.',487,3,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (212,'89','COLTEX FINE S/CATALIZADOR',473,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (213,'C310','COMBO ELITE P&P TRIAL KIT',7,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (214,'B503','COMP. P/MODELAR X 12 LAPICES',109,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (215,'A1130','COMP.P/MOD.PLANCHAS- LAPIZ HAR',7,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (216,'213','COMPUESTO BERA PLANCHAS ROJAS',245,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (217,'B1129','COMPUESTO VERDE LAPIZ C/U',80,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (218,'B506','ELITE REG./FLUIDA X 180 POMO',22,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (219,'A1128','HYDROXTREME PUTTY SOFT',356,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (220,'A1114','INDIVIDO LUX C/SOBRE',336,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (221,'A1363','JERINGA DESC. P/SILICONAS',84,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (222,'B1168','PANASIL INITIAL CARTUCHO 2',108,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (223,'83','PASTA COLTOFLAX X 1000 GRS.',345,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (224,'A1161','PASTA ELITE HD LIGHT X 96ML FL',45,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (225,'A1162','PASTA ELITE P&PMASA PUTTY NORM',374,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (226,'78','PASTA FLUIDA PRECISE',29,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (227,'A1152','PASTA FLUIDA THIXOFLEX',205,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (228,'A1120','PASTA FLUIDA VENTURA',420,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (229,'A1158','PASTA LASTIC 90 X 155',484,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (230,'79','PASTA MASA PRECESI X 750 GRS',402,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (231,'A1112','PASTA MASA ZETALABOR X 2.6 KG.',378,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (232,'A1154','PASTA MASA ZETAPLUS X 900 ML.',30,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (233,'A1153','PASTA ORANWASH FLUIDA',222,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (234,'A1168','PASTA PANASIL INITIAL POMO',189,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (235,'88','PASTA PANASIL PUTTY GDE X900',94,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (236,'A1157','PASTA PUTTY LASTIC X 582 ML.',278,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (237,'A1167','PASTA PUTTY PANASIL',153,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (238,'A1147','PASTA VENTURA IMPRESS P(MASA)',318,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (239,'B1112','PASTA ZETALABOR X 900GRS',338,4,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (240,'B1101','PIEDRA POMEZ X 1',195,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (241,'A1149','PISTOLA ZERMACK',70,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (242,'B1130','PLACA BASE X 10',31,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (243,'B1103','RESIL AVIO P/REBASADO',264,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (244,'B0505','SPEEDEX FLUIDA X 120 ML.',216,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (245,'B0504','SPEEDEX MASA X 1 KG.',187,6,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (246,'A1126','YESO DE IMPRESION XANTANO',177,5,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (247,'C500','YESO DENSITA C/RESINA',183,5,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (248,'393','YESO DENSITA VEL-MIX 1KG.',168,5,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (249,'B393','YESO ELITE STONE 1 K. TIPO 4',474,5,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (250,'B1126','YESO IMP. XANTANO',122,5,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (251,'A1113','YESO TALLER',101,5,5);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (252,'A1552','ARCO DE YOUNG PORTA GOMA DIGUE',51,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (253,'A0855','AVIO MANUAL PROTAPER',114,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (254,'B0831','C+FILE CATETERIZACION SURTIDO',186,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (255,'412','CAJITA MINIENDO PARA LIMAS',275,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (256,'B608','CEMENTO DE GROSSMAN DENSELL',49,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (257,'A1422','CLAMP KERR HAWE C/U',173,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (258,'B604','CLAMPS ECO.',86,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (259,'B605','CLAMPS HU-FRIEDY C/U',131,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (260,'A0853','CONDENSADOR BOER 1-4 MAILLEFER',0,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (261,'B0602','CONOS ACCESORIOS DMG',111,1,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (262,'317','CONOS DE GUTA MAILLEFER',378,1,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (263,'185','CONOS DE GUTA SURE-ENDO/META',243,1,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (264,'B0601','CONOS DE PAPEL DMG',378,1,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (265,'A086','CONOS DENTSPLY',455,1,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (266,'B086','CONOS GUTA PROTAPER',286,1,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (267,'A0826','CUÂ¥AS ELASTICAS',276,2,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (268,'B0820','CUÂ¥AS TRANSPARENTES',185,2,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (269,'A0820','CUÂ¥ITAS DE MADERA DMG X 100',123,2,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (270,'A0601','DENTIN CONDITIONER',427,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (271,'B296','DEVITEX X 15 GR',398,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (272,'236','DOSARSEN X 40 DICKINSON',134,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (273,'39','DYCAL AUTOCURADO',130,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (274,'124','EDTAC DICKINSON',184,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (275,'291','ENDOPREP DENSELL',462,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (276,'A0817','ENSAN. DE LARGO MAILLEFER C/U',4,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (277,'A0835','ENSCH. DE LARGO O GATES C/U',212,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (278,'B609','ESCAREADOR KERR',406,3,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (279,'314','ESCAREADORES X 6 - 7/12 - 25 M',109,3,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (280,'A0819','ESPACIADOR DIGITAL FINGER X 6',366,4,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (281,'B602','ESPACIADOR Y ATACADOR DIGITAL',292,4,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (282,'A0848','ESPACIDOR NIQUEL TITANIO MAILL',331,4,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (283,'272','ESPIGA DE TITANIO FLEXI-FLANGE',364,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (284,'127','EUCALIPTOL DICKINSON',129,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (285,'A0809','FIL-PIN C/U TITANIO',147,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (286,'B271','FLEXOFILE K GOLDEN MEDIUM',64,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (287,'B612','GUTTA CONDENSER C/U',307,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (288,'5','H. DE SODIO X 100 DICKINSON',177,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (289,'315','HIDROXIDO DE CALCIO AVIO DICKI',74,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (290,'126','IODOFORMO DICKINSON',468,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (291,'B1363','JERINGA P/IRRIG. DE CONDUCTOS',190,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (292,'A0816','LENTULOS MAILLEFER X 4.',287,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (293,'268','LENTULOS X 4 U. BROACH 1/4',279,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (294,'B168','LIFE KERR HIDROXIDO DE CALCIO',318,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (295,'267','LIMA HEDFSTRON 7/12THOMAS/KERR',495,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (296,'B603','LIMA TRIPLE FLEX 10/35 KERR',208,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (297,'A0845','LIMAS H UNION BROACH 1/6 O IND',215,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (298,'A0815','LIMAS HEDSTROM 1/3-1/6 X6',67,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (299,'A0814','LIMAS HEDSTROM MAILLEFER 7/12',73,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (300,'A0806','LIMAS K BEUR.1/6/ HED.Y THOMAS',20,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (301,'A0802','LIMAS K BEURTELROK 10 X 21MM',335,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (302,'A0804','LIMAS K BEURTELROK 20 X 21MM',109,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (303,'A0843','LIMAS K UNION BROACH 1/6 INDIV',135,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (304,'A0844','LIMAS K UNION BROACH 7/12 -0-0',240,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (305,'A0812','LIMAS LISAS MAILLEFER 1/3-1/6-',252,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (306,'A0813','LIMAS MAILLEFER 7/12-0-00X6',225,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (307,'A0842','LIMAS MAILLEFER NITIFLEX NIQ-T',456,5,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (308,'A1465','MANGO P/PERNOS DENTATUS',48,6,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (309,'273','MANGO PARA FIL-PIN',150,6,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (310,'A0847','MINI ENDO KIT DENSTPLY',357,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (311,'464','MOMITRIX P/MOMIFICANTE',12,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (312,'282','P.M.C.F.ALCANFORADO DICKINSON',214,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (313,'131','PARAPOST FIBER LUX C/U T',428,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (314,'A0822','PASTA ENDOFORM',129,7,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (315,'296','PASTA LENT.REABS.DICKINSON',340,7,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (316,'A2208','PERFORADOR GOMA DIQUE PAKISTAN',11,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (317,'B610','PERNO MUÂ¥ON C/U',315,8,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (318,'A602','PERNOS DAVIS',369,8,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (319,'A0829','PERNOS DENTATUS X 12',327,8,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (320,'A0865','PERNOS TENAX TITANIO C/U',25,8,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (321,'B0805','POSTES FILPOST - FRESA',180,9,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (322,'C0805','POSTES FILPOST C/U TITANIO',394,9,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (323,'B0865','POSTES FORM AR',318,9,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (324,'B0812','PROTAPER STARTER KIT 025',244,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (325,'B1803','REGLA MILIMETRADA DIA-GP GAUGE',221,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (326,'A1803','REGLITA MILIMETRADA DE ACERO',26,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (327,'B131','TALADRO PARAPOST 1.14 1.25',211,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (328,'A0825','TIRANERVIOS MAILLEFER',114,10,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (329,'269','TIRANERVIOS U.BROACH MOYCO X 1',482,10,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (330,'B0827','TOPES DE GOMA C/DISP. MAILLEFE',390,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (331,'A0852','TORNILLOS DENTATUS TITANIO C/U',152,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (332,'152','XILOL DICKINSON',422,11,6);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (333,'96','CAJA DE RX OCLUSAL KODAK',169,4,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (334,'A157','CLIPS P/RX SHARPYS',153,4,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (335,'157','CLIPS P/RX.',17,4,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (336,'90','FIJADOR ROMEK',299,3,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (337,'A1200','PARRILLA X 14 P/ RADIOGRAFIA',212,4,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (338,'A1206','PORTA PELICULAS DOBLES',484,1,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (339,'A1208','PORTA PELICULAS PLASTICAS',353,1,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (340,'A1207','PORTA PELICULAS SERIADAS',185,1,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (341,'B702','PORTA PELICULAS SERIADAS',438,1,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (342,'A702','PORTA PELICULAS TRANSPARENTE',495,1,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (343,'C702','PORTA PELICULAS X 14',232,1,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (344,'94','RADIOGRAFIAS KODAK DOBLES',46,2,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (345,'95','RADIOGRAFIAS KODAK NIÂ¥OS',28,2,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (346,'91','REVELADOR RADIOGRAFICO ROMEK',152,3,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (347,'C93','RX KODAK X 150 *E* SPEED',167,2,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (348,'P93','RX PANORAMICA X 100',387,2,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (349,'A1203','RX SUELTAS -DOBLES-',258,2,7);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (350,'A1405','AGUJAS SUTURA X 10',363,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (351,'B2204','ALGODONERO DE ACRILICO',486,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (352,'A1564','APLICADOR DYCAL',406,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (353,'B809','APLICADORES X 25',196,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (354,'A1426','AROS DE COBRE IMPORTADOS C/U',302,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (355,'A1519','ATACADOR DOBLE HELIOMOLAR COMP',275,1,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (356,'A1829','ATACADOR MARKLEY LM',215,1,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (357,'C1820','ATACADOR P/ COMP. FOTOPLUS AVI',136,1,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (358,'B806','ATACADOR P/COMPOSITE NÂ¥ 1 Y 2',151,1,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (359,'A1572','ATACADORES DE GUTA X 4',441,1,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (360,'741','BANDEJA PLASTICA COLOR',422,2,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (361,'422','BANDEJAS LISAS Y ACANALADAS',219,2,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (362,'A422','BANDEJAS P/APOYO DE INST.',434,2,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (363,'A1576','BRUÃ?IDOR',209,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (364,'B0007','CAJA ACERO 17 X 7 X 3',426,3,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (365,'B0006','CAJA ACERO 25 X 12 X 6',99,3,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (366,'B0005','CAJA DE ACERO 20 X 10 X 4',348,3,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (367,'C422','CAJA DE ALUMINIO NICHROMINOX',318,3,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (368,'C0007','CAJA PERF. 17X7X3CM.',176,3,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (369,'446','CALIBRE IWASSON',422,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (370,'A0863','CANISTER INSTRUMENT',85,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (371,'A1805','CEPILLOS COPA IMPORTADO C/U',76,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (372,'I0003','CINCEL P/IMPLANTES',373,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (373,'B1578','CONTENEDOR P/ AMALGAMA',43,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (374,'A1528','CUBETAS PERFORADAS MET.PLAS.',122,4,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (375,'B1528','CUBETAS POLYBITE ARCO TOTAL',465,4,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (376,'D1528','CUBETAS TRANSPARENTES',417,4,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (377,'A1565','CUCHARITAS DE BLACK C/U',306,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (378,'A0803','CUCHILLO PARA YESO',165,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (379,'A1498','CURETA GRACEY 7/8 11/12 13/14',125,5,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (380,'B1498','CURETA GRACEY COLOR',319,5,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (381,'A1570','CURETA GRACEY ZEFFIRO',371,5,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (382,'A1862','CURETA IMP6345-71 HU-FRIEDY',84,5,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (383,'A1863','CURETA IMP6577SC HU-FRIEDY',53,5,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (384,'B812','CURETA SHARPYS',35,5,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (385,'MO120','CURETAS LUCAS P/ HUESO',71,5,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (386,'A1566','CURETAS MOLT BELKYS',135,5,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (387,'I0010','DESTORNILLADORES P/ TOR. TITAN',115,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (388,'B1702','ELEV. BELKIS RECTO Y WINTER',60,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (389,'A1511','EMPACADOR HILO ULTRADENT',224,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (390,'A1569','ESP. LADO FRENTE WOODSON',410,6,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (391,'A1820','ESPA. ESTHETIC O CONTAC AVIO',232,6,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (392,'A1568','ESPACIADORES RECTOS Y CURVOS',375,6,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (393,'B1529','ESPATULA P/COMPOSITE NAC.',166,7,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (394,'B801','ESPATULA P/YESO PLASTICA',452,7,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (395,'A1515','ESPATULA PARA CEMENTO DOBLE',332,7,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (396,'A1516','ESPATULA PARA CERA CHICA',134,7,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (397,'A1584','ESPATULA PARA CERA DMG',8,7,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (398,'C1515','ESPATULA PARA IONOMERO',367,7,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (399,'A1517','ESPATULA PARA YESO',58,7,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (400,'B1820','ESPATULA ZINQUENOLICA',6,7,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (401,'A1522','ESPEJO ESPADA C/AUMENTO',139,8,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (402,'A1597','ESPEJOS NOVADENT',482,8,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (403,'A1479','EXCAVADOR 65/66 HU-FRIEDY',348,9,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (404,'B1479','EXCAVADOR BELKYS',31,9,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (405,'I0004','EXPANSOR/COMPACTADOR P/IMPLANT',92,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (406,'A1580','EXPLORADOR COLOR Y NÂ¥ 23',432,10,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (407,'B1826','EXPLORADOR P/ ODONTOPEDIATRIA',56,10,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (408,'A1534','EXTRACTOR DE PUENTE A PESA',310,11,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (409,'B1534','EXTRATOR DE PESAS BELKYS',8,11,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (410,'B802','FORCEPS JUEGO X 10 BELKYS',2,12,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (411,'A1712','FORCEPS PAKISTAN OPACO C/U',43,12,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (412,'B143','FRESERO IMANTADO',294,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (413,'A1530','INSTRUMENTOS PREMIUN',215,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (414,'MO437','INTRUMENTO ROMEROWSKY',140,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (415,'A1557','JERINGA CARPULE CROMADA',289,13,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (416,'B1557','JERINGA CARPULE AUTO ASPIRANTE',473,13,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (417,'C1529','KIT COMPOROLLER PARA COMPOSITE',449,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (418,'A0801','LAMPARA DE ALCOHOL DE VIDRIO',364,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (419,'97','LIMA P/HUESO AESCULAP',259,14,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (420,'MO338','LIMA P/HUESO NACIONAL',390,14,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (421,'C100','MANGO CON PUNTAS MORSE',332,15,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (422,'A1535','MANGO P/ BISTURI NÂ¥ 3 NACIO',195,15,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (423,'A1573','MANGO P/ESP.OCTOGONAL SAGIMA',274,15,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (424,'A1827','MANGO PARA ESPEJOS LM',379,15,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (425,'B803','MANGOS P/ESPEJOS ANODIZADOS',434,15,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (426,'A1594','MANGOS P/ESPEJOS COLOR ALUMINO',56,15,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (427,'A1595','MANGOS P/ESPEJOS NOVADENT',490,15,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (428,'C0801','MECHAS P/LAMPARA',130,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (429,'A1451','MORTERO',260,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (430,'A1495','OBTURADOR INST. MOD.HU-FRIEDY',118,16,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (431,'MO380','OBTURADOR P/AMALGAMA CHICO',405,16,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (432,'B1495','OBTURADORES P/AMALG. DOBLE',205,16,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (433,'271','OPTRA SCULP REP. X 12',38,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (434,'A741','ORGANIZADORES PLASTICOS',406,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (435,'I0009','OSTEOTOMO REMOBIBLE',114,17,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (436,'I0008','OSTEOTOMO X 6',347,17,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (437,'A1408','PERIOSTOTOMO NOVADENT',317,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (438,'A1450','PILON',102,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (439,'A1558','PINZA GUBIA P/HUESO',354,18,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (440,'722','PINZA KOCHER BELKYS',110,18,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (441,'416','PINZA PARA ALGODON',127,18,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (442,'B1540','PINZA PORTA AGUJA CASTROVIEJO',152,18,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (443,'B804','PINZA PORTA CONOS',11,18,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (444,'420','PINZA PORTA PAPEL ARTICULAR',132,18,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (445,'A1540','PORTA AGUJAS',84,19,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (446,'414','PORTA AMALGAMA BELKYS',263,19,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (447,'A414','PORTA AMALGAMA DOBLE',383,19,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (448,'B414','PORTA AMALGAMA MAQUIRA PLASTIC',48,19,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (449,'A1554','PORTA MATRIZ SAGIMA',259,19,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (450,'A0818','PORTA VASOS DAPPEN ACERO INOX.',443,19,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (451,'100','PUNTA MORSE',140,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (452,'A722','SEPARADOR DE FARABEUT',441,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (453,'417','SINDESMOTOMO RECTO Y CURVO C/U',440,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (454,'I0002','SONDA P/IMPLANTES',412,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (455,'A1571','TALLADOR DE FRANK DOBLE',116,20,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (456,'MO520','TALLADOR HALLEMBACK',340,20,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (457,'A1586','TALLADOR LE CRON',465,20,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (458,'B1586','TALLADOR PARA CERA',288,20,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (459,'C0003','TAMBOR 12 X 10CM.',469,21,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (460,'B0002','TAMBOR DE ACERO INOX. 16X12',159,21,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (461,'A418','TAZA FLEXIBLE AUTOLIMP.',358,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (462,'B1523','TIJERA CASTROVIEJO',430,22,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (463,'A1807','TIJERA LITTAUER BELKYS',357,22,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (464,'A1523','TIJERA P/ ENCIA D.M.G CURVA',29,22,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (465,'A1822','TIJERA P/ENCIAS MARTIN IMPORTA',107,22,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (466,'A1806','TIJERA PARA METAL CURVA',475,22,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (467,'A1544','VASO CRUZ ROJA PLASTICO',492,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (468,'C1599','ZEKRYA JET BURS',184,23,8);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (469,'B1789','ACOPLES P/TURBINA',243,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (470,'B1768','ACQUAFIT DUCHA PERSONAL',449,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (471,'B0909','ALACENA',382,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (472,'C1725','AUTOCLAVE FICOINOX 13.5 LT',39,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (473,'A0900','BOMBA DE VACIO STARBAC',236,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (474,'A1770','BULBO PARA SPECTRUM',475,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (475,'B0919','CAJ.RODANTE/MOD.COMPU/FICHERO',5,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (476,'E1789','CAVITADOR EVO TORQUE',13,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (477,'E1703','COMPRESOR 1.5 HP.',482,1,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (478,'A1703','COMPRESOR AT 1 HP.',469,1,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (479,'C1703','COMPRESOR NARDI & HERRERO',0,1,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (480,'A907','CONTRA ANGULO DENTFLEX',464,2,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (481,'D1714','CONTRA ANGULO GNATUS',202,2,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (482,'B1781','CONTRA ANGULO STRONG',331,2,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (483,'A1780','CONTRANGULO GACELA SEDNA .',0,2,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (484,'B1719','CONTRANGULO KAVO',419,2,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (485,'B1707','DELANTAL PLOMADO C/CUELLO',347,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (486,'A1758','ELECTROBISTURI PERFECT',421,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (487,'A1701','ELEVADOR TENSION COMPRESOR',167,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (488,'E1725','ESTERILIZADORA AUT. FAETA-EGEO',341,3,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (489,'A1751','ESTERILIZADORA CUARZO DRILLCO',101,3,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (490,'I1725','ESTERILIZADORA EGEO MINI',71,3,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (491,'D1725','ESTERILIZADORA FAETA 6 BAND.',179,3,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (492,'A1711','GABINETE P/REVELADO EGEO',393,4,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (493,'A1734','GABINETE P/REVELAR PINTADO',156,4,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (494,'B1746','GABINETE REVELADO ACERO',453,4,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (495,'A1717','INSERTO PARA CAVIRADOR',69,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (496,'A1726','JERINGA TRIPLE NAC. METALICA',478,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (497,'A1472','JET PLUS APARATO BICARBONATO',148,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (498,'A1767','JUEGO DE FORCEPS ALEMAN X 10',39,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (499,'A1772','KIT DE BANDEJA AUXILIAR',441,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (500,'A1792','KIT GACELA T-C-M-ACEITE-ACOPLE',70,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (501,'A1714','KIT GNATUS TURBINA- CONTRAANGU',159,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (502,'B1743','LAMPARA 3M ELIPAR 2500',135,5,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (503,'B1754','LAMPARA BLUEPHASE LED',253,5,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (504,'A1790','LAMPARA LED INALAMB. M.60 TPC',29,5,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (505,'A910','LAMPARA LITEX HALOGENA',26,5,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (506,'A1756','LAMPARA NOVALIGHT C/LED',374,5,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (507,'F1744','LAMPARA SOL LIGHT MOD. 800B',383,5,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (508,'A1743','LAMPARA SOLBECH MOD. 800 B',125,5,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (509,'C1769','LAVADORA IOI',231,6,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (510,'B1769','LAVADORA ULTRASONICA 700CC.',353,6,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (511,'B1701','LUPAS GALILEO C/ LUZ',133,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (512,'B911','MICRO BLUE ROCKET ENDO 2000',124,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (513,'B910','MICRO.ELECT.BLUE ROCKET BR3000',236,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (514,'B1787','MICROARENADOR',403,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (515,'A900','MICRODRILL DRILLCO',229,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (516,'A1781','MICROMOTOR DRILLCO M2 H35',168,7,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (517,'A917','MICROMOTOR HAKUSUI',141,7,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (518,'B912','MICROMOTOR M1 C/PIEZA DE MANO',382,7,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (519,'B0901','MOD.DOS CUERPOS C/MULT.SIMPLE',382,8,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (520,'C0919','MODULO DE 2 CUERPOS C/HUECO',308,8,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (521,'B0912','MULTIF.SIMPLE',93,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (522,'B0916','NEGATOSCOPIO CHAPA',19,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (523,'132','PERILLA DE BAQUELITA',179,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (524,'A1713','PIEZA DE MANO RECTA W&H',89,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (525,'A1437','PINZA DE 2.3MM. DRILLCO P/TORN',139,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (526,'B1772','PROPHY JET TPC',422,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (527,'A1791','PUNTAS P/CAVITADOR NSK ULTRASO',150,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (528,'B1753','RECORTADORA DE YESO C/BISAGRA',251,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (529,'B920','RETEN DE DOS/TRES VIAS',143,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (530,'A1550','SACAFRESAS GACELA-KMD',303,9,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (531,'B1550','SACAFRESAS KAVO',183,9,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (532,'A1753','TERMOFORMADORA SABILEX-EGEO',122,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (533,'B1735','TORNO 1/8 COLG. ECO',262,10,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (534,'A1771','TORNO DE MANO DRILLER',94,10,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (535,'B1700','TURBINA DOCHEM PUSH BOTON',415,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (536,'C1759','TURBINA EVO DELTA BUTTON',56,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (537,'B1759','TURBINA EVO TORQUE BUTTON',264,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (538,'C1761','TURBINA GACELA EVO MINI',78,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (539,'B1742','TURBINA GACELA EVO QUARTZ',105,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (540,'A1789','TURBINA GACELA EVO TORQUE',166,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (541,'C1714','TURBINA GNATUS',174,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (542,'A1759','TURBINA KAVO UNIK',232,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (543,'B1761','TURBINA KMD MAXTORQUE',152,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (544,'A1786','TURBINA NSK PANA-MAX',300,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (545,'A1742','TURBINA TE-97 LED ALEGRA',86,11,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (546,'A915','VIBRADOR DE YESO CHICO',381,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (547,'A1768','WATER PICK DUCHA BUCAL',225,12,9);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (548,'C1840','ADAPTADOR ALPHA F.G.',266,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (549,'A1030','ADHESIVO DENSELL',435,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (550,'A1076','AVIO COMPOSITE OPTIMIZE X 8 U.',388,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (551,'356','CEPILLO BROCHA C/A IMPORTADO',422,1,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (552,'C224','CEPILLO GAMUZA GENERO',88,1,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (553,'B200','CEPILLO GUM X 4 UN.',457,1,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (554,'204','CEPILLO LIMPIA FRESAS',429,1,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (555,'C225','CEPILLO PELO DE CABRA',362,1,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (556,'203','CEPILLOS GAMUZA/GENERO P/TORNO',474,1,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (557,'B1804','DISCO SIERRA 1/4',43,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (558,'B1009','DISCOS C/U/ P/ COMP.SUPERFIX',367,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (559,'A1409','DISCOS CARBORUNDUM MOYCO 7/8',418,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (560,'C1804','DISCOS DE ACERO C/U',268,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (561,'A1804','DISCOS DE ACERO X 12 7/8 ALEM',14,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (562,'A1441','DISCOS DE PAPEL X 10',106,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (563,'B1001','DISCOS HAWE X 10 MINI FLEX',297,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (564,'C1409','DISCOS IRROMP.',186,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (565,'35','DISCOS P/PULIR COMP. X 40',468,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (566,'A1454','DISCOS SOF-LEX POPON-XT X 30',182,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (567,'C1009','DISCOS SUPERSNAP SHOFU AVIO',336,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (568,'D1009','DISCOS SUPERSNAP SHOFU C/U',340,2,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (569,'B223','FLAMEADOR DE PLASTICO',378,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (570,'A1818','FRESA DE CARBURO DE 34MM. P/CA',283,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (571,'A1841','FRESA JET BURS P/IMPLANTE P.M.',427,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (572,'B1599','FRESA LN CA 006',130,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (573,'B1582','FRESA TRANSMETAL MAILLEFER',109,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (574,'A1599','FRESA ZEKRYA MAILLEFER-ENDOZ',452,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (575,'B1840','FRESAS CIRUGIA DZ',365,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (576,'A1840','FRESAS DE CARBURO DENSELL FG',276,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (577,'A1589','FRESAS DOCE FILOS I SERIE',306,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (578,'A1802','FRESAS JOTA P/TURBINA Y CONTRA',236,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (579,'A1815','FRESAS MEISINGER P/C',207,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (580,'A1541','FRESAS P/CIRUGIA LARGAS',442,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (581,'A1582','FRESAS P/CORTAR METAL',447,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (582,'A159','FRESAS P/CORTAR METAL MICROD.',190,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (583,'B1592','FRESERO PLASTICO P/24 FRESAS',107,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (584,'218','FRESON DE ACERO PIMPOLLO',110,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (585,'B218','FRESON DE CARBURO DC',63,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (586,'A2106','FRESONES 41P AL 33C Y 61A',434,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (587,'A2105','FRESONES 84T AL 88A 84TG- 63BG',440,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (588,'A2103','FRESONES 84TSP 88ASP',49,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (589,'A2101','FRESONES D2 AL D8',123,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (590,'C218','FRESONES DE ACERO FINOS C/U',145,3,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (591,'C368','GOMA P/ PULIR ACRILICO DOCHEM',70,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (592,'B1433','GOMAS C/SIRCONIO',24,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (593,'B356','HILO DENTAL',396,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (594,'221','MANDRILES C/A Y PM C/U IMPOR.',123,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (595,'A2110','PERNOS DOWEL PIN MAIN STAY C/U',326,6,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (596,'C1101','PIEDRA P/AFILAR TIBET',106,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (597,'A1553','PIEDRAS DE ARKANSAS FG LLAMA/C',346,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (598,'A1592','PIEDRAS DE DIAMANTE',266,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (599,'A1816','PIEDRAS HORICO CLASE 4 RUEDAS',33,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (600,'A1811','PIEDRAS HORICO CLASE I',491,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (601,'A1812','PIEDRAS HORICO CLASE II',54,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (602,'A1810','PIEDRAS HORICO FORMAS K',373,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (603,'B368','PIEDRAS P/ PORCELANA FLEXILLIU',370,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (604,'B100','PIEDRAS P/COMPOSITE',325,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (605,'368','PIEDRAS P/PROTESIS',114,4,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (606,'A368','PULIDOR MARRON P/ACRILICO',303,5,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (607,'A1512','PULIDORES EVE COMPOSITE P/C.',267,5,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (608,'B1512','PULIDORES KENDA C/U',477,5,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (609,'C1512','PULIDORES P/ COMP. MANDRIL PLA',100,5,10);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (610,'A1624','AMBO BLANCO COLOR',323,1,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (611,'A1631','AMBO ECONOMICO CIRUGIA',7,1,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (612,'A1632','AMBOS CELTA- ARCIEL',222,1,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (613,'A1602','BLOCK FICHA DE USO PRIVADO',423,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (614,'A1615','BONO AMARILLO SIST. CAPITADO',55,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (615,'C243','CHAQUETA 243 C/CIERRE Y VIVOS',151,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (616,'C249','CHAQUETA ARCIEL 249C/ BRODERI',121,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (617,'C290','CHAQUETA BLANCA Y COLOR',363,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (618,'A1630','CHAQUETA BROCHES',391,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (619,'C488','CHAQUETA COMBINADA HOMBRE',91,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (620,'A1622','CHAQUETA DAMA BLANCA',449,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (621,'A1628','CHAQUETA DENTAL BAS',272,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (622,'A1629','CHAQUETA ESTUDIANTIL',196,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (623,'A1625','CHAQUETA HOMBRE BLANCA',316,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (624,'A1627','CHAQUETA HOMBRE COLOR',8,2,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (625,'A1609','FICHAS DE PREVENCION',284,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (626,'A1601','FICHAS VERDES X 100',47,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (627,'A1610','FORMULARIO DE ORTODONCIA',15,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (628,'A1608','ORDENES DE RX.',303,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (629,'C253','PANTALON CAPRI BLCO/N. 253',443,3,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (630,'A1626','PANTALON COLOR HOMBRE',449,3,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (631,'A1613','PERIODONCIA IOMA.',206,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (632,'A1477','POSTERS O LAMINAS PREVENCION',230,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (633,'A1607','RECETARIO',6,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (634,'A1604','RESUMEN COMPUTACION',338,4,11);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (635,'A120','ALCOHOL GEL X 1 LT.',384,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (636,'A1339','BARRERA GINGIVAL OPALDAM X JER',117,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (637,'A135','BLANQUEADOR POLANIGTH C/JER',79,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (638,'C0904','BUCHES NAF',10,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (639,'B1202','BUCHEX FORTE X 200 ML.',53,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (640,'A1344','DECIDENT-SOBRE DESINF.P/TURB.',78,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (641,'581','DESENSIBILIZANTE GEL DENSELL',369,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (642,'A1307','DESIN. BACTER-BUR P/FRESAS',165,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (643,'A1305','DESIN. MADACIDE 1 GALON OFERTA',134,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (644,'A1321','DESIN. NOVACID P/FRESAS',170,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (645,'A1309','DESIN. P/MANOS BIOCIDA X 500 M',28,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (646,'24','DESIN. PARA ESPONJERO DICKINSO',399,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (647,'A1324','DESIN.LIM.ENZI.1 L. DENSELL',221,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (648,'A1343','DESINF. BIO-UC38 CONC. P/LAV.',288,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (649,'A1358','DESINF. GLUTARCOAT A.S.',12,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (650,'B1324','DESINF. LIMPIADOR X500 DENSELL',78,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (651,'A121','DESINFECTANTE PROCIDE SPRAY',370,1,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (652,'A1348','DET. ENZIMATICO X 1 LT.',406,2,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (653,'B1301','DETECTOR DE CARIES',228,2,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (654,'B1205','FLUORDENT SEMANAL COLUT. X 200',162,3,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (655,'A0904','FLUORGEL NAF',128,3,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (656,'A1316','FLUOROPLAT CARIOSTATICO',59,3,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (657,'288','FORMALINA X 25 DICKINSON',281,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (658,'409','FORMALINA X 50 DICKINSON',171,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (659,'300','GASA IODOFORMADA DICKINSON',153,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (660,'C1340','GERMIKILL GEL',497,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (661,'A1323','HEMOSTATICO X 5 UN.',186,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (662,'B1304','HILO P/RETRACCION GINGIVAL',326,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (663,'A1445','INDICADOR DE CARIES KLEPP',105,2,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (664,'C1350','JABON LIQUIDO BACTI BUSTER',423,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (665,'A1434','LEVERFRESH DISPENSER',0,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (666,'D1304','LIMPIADOR CAVIT',291,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (667,'201','MANTAS P/ CERAMICAS',93,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (668,'A26','NAFRESIM-P/SENSIBILIDAD',399,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (669,'A1347','OPALEC. AMBULATORIO C/JER.',220,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (670,'C142','OPALUSTRE P/MIC.ABRASION C/J',401,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (671,'21','PASTA DE LIMPIEZA DENT BRILL',254,3,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (672,'B123','PASTA DE PULIDO DIAM.ULTRADENT',380,3,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (673,'C21','PASTA PARA LIMPEIZA KLEPP',86,3,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (674,'B1201','PERIOBACTER AVIO BARNIZ',355,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (675,'B1328','PERIOBACTER COLUTORIO',308,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (676,'B1206','PLAC OUT X 200 ML.',472,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (677,'299','QUITAMANCHAS DENTAL DICKINSON',166,3,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (678,'A1328','REVELPLAC',63,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (679,'B1207','SEBSIDENT COLUT. X 250 ML.',139,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (680,'B1208','SENSIDENT PASTA DENTAL X 90GR.',383,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (681,'151','SOLUC. HEMOS.GINGIVA X10 ML.',339,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (682,'454','VASELINA SOLIDA',265,4,12);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (683,'A1446','ABRE BOCA SPANDEX',310,1,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (684,'A1448','ABREBOCA ARCFLEX FGM',265,1,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (685,'C1446','ABREBOCA MAQUIRA',225,1,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (686,'D1446','ABREBOCAS',212,1,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (687,'F1446','ABREBOCAS OPEN-EX',466,1,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (688,'215','ACEITE LUBR. KMD/GACELA SPRAY',378,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (689,'B139','ALAMBRE DE LIGADURA',376,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (690,'B1012','ANALOGOS BRONCE',206,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (691,'423','ANILLOS IDENTIFICADORES X20',480,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (692,'C1506','ANILLOS UNIMATRIX',446,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (693,'A222','ARCOS P/SIERRA',348,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (694,'A1353','AVIO CORONITAS DE ACETATO',181,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (695,'D141','BICARBONATO KLEPP X 40GR.',230,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (696,'A1336','BLANQUEADOR CONTRASTAM 1 PAC',87,2,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (697,'B1355','BLANQUEADOR LASE PEROXIDE 35%',173,2,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (698,'A1355','BLANQUEADOR POLA P/1 PACIENTE',67,2,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (699,'B1336','BLANQUEADOR WHITEGOLD OFFICE',69,2,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (700,'149','BUCAL BABY DOSIS CHUPETE C/D',284,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (701,'C1318','BUCAL TAC BIO-CLEAN ADULTOS',132,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (702,'C1310','BUCAL TAC CEPILLO UNIPENACHO',253,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (703,'C1331','BUCAL TAC ENHEBRADOR P/ HILO',152,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (704,'C1317','BUCAL TAC MANGO INTER.+ 2 REP.',264,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (705,'C1323','BUCAL TAC MINT PALILLOS INT.',141,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (706,'C1327','BUCAL TAC MINT PALILLOS X 100',209,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (707,'C1326','BUCAL TAC PALILLOS COMBO X100',310,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (708,'C1314','BUCAL TAC PERIO STICKS',338,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (709,'C1307','BUCAL TAC- CEPILLO EVOLUTION',416,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (710,'C1303','BUCAL TAC- CEPILLOS FLEXI-GRIP',286,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (711,'C1304','BUCAL TAC- CINTA E HILO',182,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (712,'C1306','BUCAL TAC-CEPILLO CLASIC',189,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (713,'C1301','BUCAL TAC-CEPILLOS',330,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (714,'C1305','BUCAL TAC-ORKET FLOSS',456,3,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (715,'A240','CAPSULA DE PETRI',89,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (716,'C1329','CEPILLO ORAL-B VITALITY',324,4,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (717,'B1309','CEPILLO SANIFILL 26-39-47-KIDS',77,4,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (718,'C1309','CEPILLOS INTERDENTALES SANIFIL',358,4,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (719,'B1350','CLEAR VISION',401,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (720,'D1350','CLEAR VISION REPUESTO',468,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (721,'A1418','CORONITAS ACETATO INDIVIDUALES',16,5,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (722,'A1402','CORONITAS DE POLICARBOXYLATO',295,5,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (723,'A1414','CORONITAS FRASACO',294,5,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (724,'C1302','CREMA DENTAL HEXIBEN',132,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (725,'A1327','CREMA PARA MANOS BACTI BUSTER',467,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (726,'P241','CUBETA IND. CELESTE .125',318,6,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (727,'P242','CUBETA IND. CELESTE .150',72,6,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (728,'50','CUBETAS P/TOPICACION EE.UU X 1',184,6,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (729,'C1392','DADOS PORTA CEPILLO DENTAL',58,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (730,'A1390','DENTADURAS SALTEADORAS',434,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (731,'B122','DESINF. KLEPP P/INSTRUMENTAL',145,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (732,'C1315','DESODORANTE BUCAL SPRAY',275,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (733,'426','DETERGENTE ENZ.ANIOSYME',305,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (734,'C1402','DIENTES BIOTONE/BIOCRIL',300,7,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (735,'B1402','DIENTES SUPERLUX',264,7,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (736,'B224','DIPLOMAS DEL BUEN PACIENTE',408,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (737,'A1421','DISPENSADOR P/ROLLO ALGODON',11,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (738,'A1507','ENDOFROST SPRAY ROEKONSEN AVIO',374,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (739,'A1821','ESPEJO MUELA',216,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (740,'C141','ESPONJAS REPUESTO',126,8,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (741,'D142','ESPONJERO DE ACERO',392,8,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (742,'A139','ESPONJERO ENDO DIADEN',184,8,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (743,'A137','ESPONJERO MAILLEFER',287,8,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (744,'A142','ESPONJERO VIDRIO P/ENDODONCIA',66,8,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (745,'D143','FRESERO PLASTICO ECO',193,9,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (746,'C143','FRESERO REDONDO P/60 FRESAS',469,9,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (747,'C1592','FRESERO SUTIDO 21 PIEDRAS DIAM',415,9,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (748,'B214','GAMUZA ALGADENT C/U',376,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (749,'C1316','GEL DENTAL BUCAL TAC BLANQ.',260,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (750,'C1313','GERMIKILL TOALLITAS INDIVIDUAL',135,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (751,'A1447','GUIA DE COLORES CHROMASCOP',186,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (752,'A1391','IMAN- RATON C/OREJAS Y COLA NE',297,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (753,'10','LAPIZ TINTA FABER',352,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (754,'A456','LENTES 3M 920 AF ANTIEMPAÂ¥ANTE',213,10,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (755,'456','LENTES P/ PROTECCION TRANS. IM',192,10,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (756,'B456','LENTES TRANSPARENTE PROTECCION',185,10,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (757,'C456','LENTES UVEX GENESIS S340 ANTIE',95,10,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (758,'B1323','LIQUIDO RETRACTOR GINGIVAL KLE',481,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (759,'B241','LLAVERO MUELITA CHICO',378,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (760,'C1300','MACROMODELO',50,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (761,'A1574','MATRICES PREFORMADAS IVORY TOF',492,11,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (762,'B1506','MATRICES X 5 UNIMATRIX',261,11,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (763,'A1470','MATRIZ HAWE',194,11,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (764,'A1481','MATRIZ STRIPROLL HAWEX 15M.',1,11,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (765,'A1318','MEMBRANA FIBRA DE VIDRIO C/RES',321,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (766,'A1313','MI PASTE KIT X 40 GRS. GC.',72,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (767,'B242','MUELITA P/ NIÂ¥OS',195,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (768,'A1392','MUELITA PELOTA PORTA CEPILLO',116,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (769,'A0001','MUÂ¥ECO PERRO',330,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (770,'B219','OCLUSOR PLASTICO',31,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (771,'A140','OPALESCENCE QUICK X 2 JER.',37,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (772,'228','OXIDO DE ALUMINIO X 1 K.',277,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (773,'A1424','PAPEL ART. HANEL C/HERR. AZUL',77,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (774,'B1428','PAPEL ART. HERR. BECH HANEL',194,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (775,'A1442','PAPEL ART. LIBRITO X 12 H.',42,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (776,'B21','PASTA ALTO BRILLO',5,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (777,'360','PASTA DENTAL HEXIBEN X 90 GRS.',111,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (778,'A1310','PASTA DENTAL OPALESCENCE',274,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (779,'A1308','PASTA PULIDO DIAMOND EXCEL',174,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (780,'C215','PICO LUBRICADOR',9,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (781,'C1013','PILAR RECTO',296,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (782,'A1492','PINS P/DURALAY CAJA X 60',148,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (783,'27','PINS STP P/RECONST. ANGULO',420,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (784,'P236','PLACA BASE ROSA 0.60',33,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (785,'P238','PLACA BASE ROSA 0.80',353,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (786,'P220','PLACA MIORRELAJANTE DUAL',331,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (787,'P119','PLACAS P/PROT. BUCAL 1.2',53,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (788,'P119Y','PLACAS P/PROT. BUCAL COLOR',56,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (789,'P114','PLACAS RESIL. 0.40',103,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (790,'P215','PLACAS RESIL. P/TEMP 0.20',42,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (791,'P118','PLACAS RESILIENTE 0.8',142,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (792,'P226','PLACAS RIG. 060 SABILEX',30,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (793,'P228','PLACAS RIG. 080 SABILEX',201,12,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (794,'163','PORTA-FILM EMMENIX C/U',56,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (795,'P818','PROFLEX LAMINA P/PROT. X 1',271,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (796,'B1339','PROTECTOR GINGIVAL TOP DAM FGM',8,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (797,'A1325','R.T.R OSEO EN FOSFATO TRICALCI',187,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (798,'A1393','RATON TODO DE UN COLOR ECONOMI',355,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (799,'B141','REC. DESCONT. P/FRESAS',65,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (800,'A141','RECIPIENTE P/LIMP. C/TAPA',479,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (801,'B1318','REDES DE NYLON C/U',393,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (802,'36','REPLAK REV DE PLACA BACTERIANA',393,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (803,'A1469','SIERRAS REPUESTO NEY C/U',106,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (804,'B222','SIERRITAS REPUESTO P/ YESO',345,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (805,'A136','SPRAY P/OCLUSION',376,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (806,'B1013','TAPON CICATRIZAL',325,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (807,'A1012','TEFLON PARA PROTESIS',183,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (808,'B1370','TERMOMETRO',79,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (809,'C1322','TOP BRUSH COVERS X4 CAPUCHONES',166,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (810,'C1335','TOP BRUSH FLOSSERS PALILLO HIL',325,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (811,'E1012','TORNILLO TRAB. TITANIO CUA.RED',398,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (812,'A1013','TRANSFER CON TORNILLO .',113,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (813,'C1012','UCLAS CALCINABLES',312,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (814,'B240','VASO DE PRECIPITACION',328,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (815,'240','VASOS DAPEN COLOR',117,13,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (816,'A1545','VASOS DAPEN DESC.',192,13,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (817,'A132','VASOS DAPEN FIXI-DAP 0',483,13,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (818,'A1436','VASOS DAPPEN SILICONADO GDE.',158,13,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (819,'B1306','VISCOSTAT C/U',92,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (820,'B1303','WHITENESS HP 35% BLUE FGM.',21,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (821,'B489','ZAPATOS HOMBRE 3035',131,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (822,'C1489','ZAPATOS HOMBRE 3081/3482',402,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (823,'A1350','ZOCALOS PVC X 3',480,14,13);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (824,'B1455','ADAPTADOR DE BANDAS',83,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (825,'C1416','ALAMBRE DE LIGADURA',265,1,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (826,'B1448','ALAMBRE VARILLA REDONDO',221,1,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (827,'B1419','ALAMBRE VARILLA TWIST',419,1,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (828,'B1487','ALAMBRE X 50GRS. ORTOPEDIA',54,1,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (829,'B1453','ALICATE CONT. ANGLE PTA. FINA',41,2,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (830,'B1461','ALICATE DISA CORTE DISTAL',463,2,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (831,'B1440','ALICATE HOW BELKYS',76,2,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (832,'B01515','ALICATE SMOLKO CORTE DISTAL',247,2,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (833,'B1438','ALICATE UNIVERSAL BELKYS',262,2,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (834,'B1435','AMANBRE 1.2 MM. X 1 METRO',393,1,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (835,'B1409','ARCO ACERO CUADRADO',405,3,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (836,'B1408','ARCO ACERO REDONDO SUP.',185,3,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (837,'B1442','ARCO C/POSTE LEONE C/U',255,3,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (838,'B1437','ARCO COAXIAL BRAIDED',236,3,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (839,'B1406','ARCO CURVA REVERSA REDONDO',167,3,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (840,'B1410','ARCO NITI CUADRADO',260,3,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (841,'B1411','ARCO NITI REDONDO',202,3,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (842,'B1468','ARCO TERMO ACTIVABLE',308,3,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (843,'B1472','BACKETS ONLY - ORGANIZERS',55,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (844,'B1430','BANDAS MORELLI C/TUBO',81,5,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (845,'D1430','BANDAS ONLYDENT C/T Y CAJA',245,5,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (846,'C1430','BANDAS S/TUBO MORELLI',406,5,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (847,'B1405','BARRA PALATINA MORELLI C/U',202,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (848,'B1491','BOLSO PORTA ALICATE',451,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (849,'B1423','BOTON MORELLI P/ADHERIR',34,6,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (850,'B1443','BOTON P/ ADHERIR LINGUAL C/U',154,6,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (851,'B1466','BOTON PARA CEMENTAR X10',91,6,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (852,'B1483','BRAC. CERAM ONLYDENT X 12',241,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (853,'B1484','BRAC. CERAM. ONLYDENT C/U',184,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (854,'B1482','BRAC.CERAM. ONLYDENT X 6 C.A C',246,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (855,'B1446','BRACKET C/HOOK X 10',165,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (856,'B1470','BRACKET CERAMICO TRANSPAREGRAD',313,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (857,'B1471','BRACKET CERAMICOS ONLY-BRACES',391,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (858,'B1447','BRACKET DE ROTH S/HOOK X 10',235,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (859,'B1444','BRACKET MORE/EDGEWISE X 10',128,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (860,'B1404','BRACKET MORELLI T/EDGEWISE',5,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (861,'B1400','BRACKET MORELLI T/ROTH EST.',298,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (862,'B1403','BRACKET MORELLI T/ROTH MONOBLO',71,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (863,'B1401','BRACKET MORELLI T/ROTH STANDAR',377,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (864,'B1469','BRACKETS ROTH COMP.C/SLOT MET.',205,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (865,'B1458','BRAQUETES ROTH ESPECIAL C/GANC',48,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (866,'B1436','BRILLANTINA X 50 GR.',89,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (867,'A1493','CAJA FLUORBOX P/ORTODONCIA',385,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (868,'37','CAJA PARA BRACKETS',108,4,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (869,'C1124','CERA ORTODONCIA',330,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (870,'A1467','DISPENSADOR PELLETS VENTURA',261,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (871,'B1452','ELASTICO CRISTAL ROLLO ORTHOTE',103,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (872,'B1427','GOMA INTRAORAL C/BOLSITA',349,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (873,'B1478','HILO ELASTICO TRANS.HUECO',246,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (874,'A1301','JERINGAS DESC. P/LAVAJE',481,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (875,'B1429','LIGADURA PARAGUITA',238,7,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (876,'B1415','LIGADURA PEINE COLOR',74,7,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (877,'B1456','MASCARA DELLAIRE LEONE',496,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (878,'A1412','MATRICES PREMOL Y MOL C/U',445,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (879,'B1481','MODULO DE ROTACION TRANS. X 10',129,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (880,'B1771','MORDAZA P/ TORNO COLG. Y MANO',110,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (881,'B1450','ORTHO ONE KIT TRIAL',134,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (882,'B1463','ORTHO-ONE 15 ML. LIQUIDO',492,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (883,'B1462','PINZA P/ BRACKETS',46,2,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (884,'B1490','PINZA PORTA TUBOS',277,2,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (885,'B2205','PORTA ALICATES ACRILICO',313,2,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (886,'B1459','PORTA ELASTOMERO',122,14,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (887,'B1432','RESORTE CERRADO DE 6-9-12MM.',464,8,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (888,'B1417','RESORTE MORELLI ACERO',392,8,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (889,'B1420','RESORTE MORELLI NITI',305,8,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (890,'B1422','RESORTE NITI RB ORTODONTIC',250,8,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (891,'B1449','SEPARADOR GOMA X100 POSTERIOR',380,9,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (892,'B1477','SEPARADOR GOMAS X 10 POSTERIOR',446,9,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (893,'B1416','SOLDADURA DE PLATA GDE. MORELL',54,10,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (894,'B1414','SOLDADURA UNIVERSAL C/U',323,10,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (895,'B1441','TORNILLO ESTANDAR A0805',450,11,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (896,'B1486','TORNILLO STANDAR',308,11,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (897,'B1445','TUBO P/ADHERIR ROTH X 5',318,12,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (898,'B1425','TUBO SIMPLE PARA CEMENTAR',146,12,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (899,'B1424','TUBO TRIPLE MORELLI SLOT 0.18',468,12,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (900,'162','ZOCALO',258,13,14);
INSERT INTO `productos` (`idProducto`,`codProducto`,`nombre`,`stock`,`idSubcategoria`,`idCategoria`) VALUES 
  (901,'B162','ZOCALO PLASTICO LEONE',444,13,14);
COMMIT;
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;


--
-- Dumping data for table `productos_anuncios`
--

/*!40000 ALTER TABLE `productos_anuncios` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (1,1);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (1,7);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (1,21);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (1,40);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (1,41);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (2,5);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (2,6);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (4,6);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (4,18);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (5,2);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (5,3);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (5,8);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (5,15);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (5,39);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (6,8);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (6,26);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,1);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,2);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,3);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,9);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,10);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,11);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,12);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,13);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,14);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,15);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,16);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,17);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,18);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,19);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,20);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,21);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,22);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,23);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,24);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,25);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,27);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,30);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,31);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,32);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,33);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,34);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,35);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,36);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,39);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (7,41);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (8,1);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (8,4);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (8,19);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (8,29);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (8,37);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (8,38);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (8,42);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (8,43);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (12,28);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (57,28);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (59,28);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (188,8);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (193,28);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (220,28);
INSERT INTO `productos_anuncios` (`idProducto`,`idAnuncio`) VALUES 
  (358,28);
COMMIT;
/*!40000 ALTER TABLE `productos_anuncios` ENABLE KEYS */;


--
-- Dumping data for table `subcategorias`
--

/*!40000 ALTER TABLE `subcategorias` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (1,1,'Anestesias');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (2,1,'Agujas/Bisturi');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (3,1,'Acidos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (4,1,'Acrilicos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (5,1,'Activadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,1,'Conos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (7,1,'Porta Peliculas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,1,'Atacadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,1,'Compresores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (10,1,'Cepillos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (11,1,'Ambos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (12,1,'Desinfectantes');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,1,'Abre Bocas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,1,'Alambres');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (2,2,'Algodon/Gasas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (3,2,'Adhesivos/Cementos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (4,2,'Cementos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (5,2,'Alginatos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,2,'Cuñas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (7,2,'Radiografias');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,2,'Bandejas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,2,'Contra Angulos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (10,2,'Discos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (11,2,'Chaquetas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (12,2,'Detectores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,2,'Blanqueadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,2,'Alicates/Pinzas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (2,3,'Aplicadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (3,3,'Aleaciones');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (4,3,'Monomeros');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (5,3,'Ceras');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,3,'Escareadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (7,3,'Fijadores/Reveladores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,3,'Cajas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,3,'Esterilizadoras');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (10,3,'Fresas/Fresones');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (11,3,'Pantalones');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (12,3,'Pastas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,3,'Bucal Tac');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,3,'Arcos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (2,4,'Baberos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (3,4,'Ionomeros');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (4,4,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (5,4,'Pastas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,4,'Espaciadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (7,4,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,4,'Cubetas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,4,'Gabinetes');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (10,4,'Piedras');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (11,4,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (12,4,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,4,'Cepillos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,4,'Brackets');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (2,5,'Barbijos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (3,5,'Jeringas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (5,5,'Yesos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,5,'Limas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,5,'Curetas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,5,'Lamparas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (10,5,'Pulidores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,5,'Coronitas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,5,'Bandas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (2,6,'Otros');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (3,6,'Selladores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (5,6,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,6,'Mangos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,6,'Espaciadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,6,'Lavadoras');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (10,6,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,6,'Cubetas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,6,'Botones');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (2,7,'Equipos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (3,7,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,7,'Pastas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,7,'Espatulas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,7,'Micromotores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,7,'Dientes');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,7,'Ligaduras');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (2,8,'Guantes');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,8,'Pernos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,8,'Espejos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,8,'Modulos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,8,'Esponjeros');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,8,'Resortes');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,9,'Postes');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,9,'Excavadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,9,'Sacafresas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,9,'Freseros');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,9,'Separadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,10,'Tiranervios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,10,'Exploradores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,10,'Tornos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,10,'Lentes');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,10,'Soldaduras');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (6,11,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,11,'Extractores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,11,'Turbinas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,11,'Matrices');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,11,'Tonillos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,12,'Forceps');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (9,12,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,12,'Placas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,12,'Tubos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,13,'Jeringas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,13,'Vasos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,13,'Zocalos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,14,'Limas P/Hueso');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (13,14,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (14,14,'Varios');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,15,'Mangos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,16,'Obturadores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,17,'Osteotomo');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,18,'Pinzas');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,19,'Porta Elementos');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,20,'Talladores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,21,'Tambores');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,22,'Tijeras');
INSERT INTO `subcategorias` (`idCategoria`,`idSubcategoria`,`descripcion`) VALUES 
  (8,23,'Varios');
COMMIT;
/*!40000 ALTER TABLE `subcategorias` ENABLE KEYS */;


--
-- Dumping data for table `userdetail`
--

/*!40000 ALTER TABLE `userdetail` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `userdetail` (`id`,`name`,`username`,`password`,`idCliente`) VALUES 
  (1,'Adminisrador','rnaredo','12345',0);
INSERT INTO `userdetail` (`id`,`name`,`username`,`password`,`idCliente`) VALUES 
  (2,'Administrador','jbartomioli','jbartomioli',0);
INSERT INTO `userdetail` (`id`,`name`,`username`,`password`,`idCliente`) VALUES 
  (3,'Maria Anders','manders','12345',1);
COMMIT;
/*!40000 ALTER TABLE `userdetail` ENABLE KEYS */;


--
-- Dumping data for table `ventas`
--

/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
SET AUTOCOMMIT=0;
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10248,'2012-01-01 00:00:00',349.000,85);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10249,'2012-01-01 00:00:00',3739.000,79);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10250,'2012-01-01 00:00:00',17769.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10251,'2012-01-01 00:00:00',1710.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10252,'2012-01-01 00:00:00',2011.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10253,'2012-01-01 00:00:00',3197.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10254,'2012-01-01 00:00:00',2336.000,14);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10255,'2012-01-01 00:00:00',9972.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10256,'2012-01-01 00:00:00',1616.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10257,'2012-01-01 00:00:00',531.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10258,'2012-01-01 00:00:00',6437.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10259,'2012-01-01 00:00:00',1061.000,13);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10260,'2012-01-01 00:00:00',2852.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10261,'2012-01-01 00:00:00',1214.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10262,'2012-01-01 00:00:00',6218.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10263,'2012-01-01 00:00:00',18903.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10264,'2012-01-01 00:00:00',3492.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10265,'2012-01-01 00:00:00',612.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10266,'2012-01-01 00:00:00',174.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10267,'2012-01-01 00:00:00',11874.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10268,'2012-01-01 00:00:00',6290.000,33);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10269,'2012-01-01 00:00:00',547.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10270,'2012-01-01 00:00:00',5245.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10271,'2012-01-01 00:00:00',4303.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10272,'2012-01-01 00:00:00',5577.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10273,'2012-01-01 00:00:00',8111.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10274,'2012-01-01 00:00:00',2006.000,85);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10275,'2012-01-01 00:00:00',298.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10276,'2012-01-01 00:00:00',614.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10277,'2012-01-01 00:00:00',2120.000,52);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10278,'2012-01-01 00:00:00',2151.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10279,'2012-01-01 00:00:00',1407.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10280,'2012-01-01 00:00:00',2014.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10281,'2012-01-01 00:00:00',369.000,69);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10282,'2012-01-01 00:00:00',93.000,69);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10283,'2012-01-01 00:00:00',3436.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10284,'2012-01-01 00:00:00',11771.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10285,'2012-01-01 00:00:00',61983.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10286,'2012-01-01 00:00:00',3943.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10287,'2012-01-01 00:00:00',1614.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10288,'2012-01-01 00:00:00',178.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10289,'2012-01-01 00:00:00',6172.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10290,'2012-01-01 00:00:00',2569.000,15);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10291,'2012-01-01 00:00:00',5280.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10292,'2012-01-01 00:00:00',1638.000,81);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10293,'2012-01-01 00:00:00',9421.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10294,'2012-01-01 00:00:00',5770.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10295,'2012-01-01 00:00:00',489.000,85);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10296,'2012-01-01 00:00:00',4126.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10297,'2012-01-01 00:00:00',6394.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10298,'2012-01-01 00:00:00',14415.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10299,'2012-01-01 00:00:00',631.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10300,'2012-01-01 00:00:00',5705.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10301,'2012-01-01 00:00:00',231.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10302,'2012-01-01 00:00:00',1606.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10303,'2012-01-01 00:00:00',5390.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10304,'2012-01-01 00:00:00',698.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10305,'2012-01-01 00:00:00',5098.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10306,'2012-01-01 00:00:00',200.000,69);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10307,'2012-01-01 00:00:00',767.000,48);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10308,'2012-01-01 00:00:00',53.000,2);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10309,'2012-01-01 00:00:00',666.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10310,'2012-01-01 00:00:00',240.000,77);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10311,'2012-01-01 00:00:00',415.000,18);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10312,'2012-01-01 00:00:00',34031.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10313,'2012-01-01 00:00:00',161.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10314,'2012-01-01 00:00:00',2073.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10315,'2012-01-01 00:00:00',1093.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10316,'2012-01-01 00:00:00',13762.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10317,'2012-01-01 00:00:00',806.000,48);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10318,'2012-01-01 00:00:00',475.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10319,'2012-01-01 00:00:00',559.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10320,'2012-01-01 00:00:00',1737.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10321,'2012-01-01 00:00:00',33.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10322,'2012-01-01 00:00:00',2225.000,58);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10323,'2012-01-01 00:00:00',2049.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10324,'2012-01-01 00:00:00',65741.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10325,'2012-01-01 00:00:00',2311.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10326,'2012-01-01 00:00:00',4958.000,8);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10327,'2012-01-01 00:00:00',9786.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10328,'2012-01-01 00:00:00',2121.000,28);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10329,'2012-01-01 00:00:00',1497.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10330,'2012-01-01 00:00:00',10995.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10331,'2012-01-01 00:00:00',1690.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10332,'2012-01-01 00:00:00',103366.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10333,'2012-01-01 00:00:00',1552.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10334,'2012-01-01 00:00:00',546.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10335,'2012-01-01 00:00:00',64382.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10336,'2012-01-01 00:00:00',1208.000,60);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10337,'2012-01-01 00:00:00',24671.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10338,'2012-01-01 00:00:00',946.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10339,'2012-01-01 00:00:00',1852.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10340,'2012-01-01 00:00:00',10335.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10341,'2012-01-01 00:00:00',2065.000,73);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10342,'2012-01-01 00:00:00',3606.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10343,'2012-01-01 00:00:00',1844.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10344,'2012-01-01 00:00:00',2313.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10345,'2012-01-01 00:00:00',50263.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10346,'2012-01-01 00:00:00',1498.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10347,'2012-01-01 00:00:00',352.000,21);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10348,'2012-01-01 00:00:00',2199.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10349,'2012-01-01 00:00:00',122.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10350,'2012-01-01 00:00:00',787.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10351,'2012-01-01 00:00:00',7060.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10352,'2012-01-01 00:00:00',336.000,28);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10353,'2012-01-01 00:00:00',2564.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10354,'2012-01-01 00:00:00',161.000,58);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10355,'2012-01-01 00:00:00',963.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10356,'2012-01-01 00:00:00',3654.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10357,'2012-01-01 00:00:00',2051.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10358,'2012-01-01 00:00:00',737.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10359,'2012-01-01 00:00:00',3114.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10360,'2012-01-01 00:00:00',2395.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10361,'2012-01-01 00:00:00',3801.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10362,'2012-01-01 00:00:00',2537.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10363,'2012-01-01 00:00:00',820.000,17);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10364,'2012-01-01 00:00:00',886.000,19);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10365,'2012-01-01 00:00:00',14054.000,3);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10366,'2012-01-01 00:00:00',310.000,29);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10367,'2012-01-01 00:00:00',5309.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10368,'2012-01-01 00:00:00',4229.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10369,'2012-01-01 00:00:00',679.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10370,'2012-01-01 00:00:00',14754.000,14);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10371,'2012-01-01 00:00:00',230.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10372,'2012-01-01 00:00:00',9170.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10373,'2012-01-01 00:00:00',18349.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10374,'2012-01-01 00:00:00',2947.000,91);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10375,'2012-01-01 00:00:00',1832.000,36);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10376,'2012-01-01 00:00:00',2083.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10377,'2012-01-01 00:00:00',1260.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10378,'2012-01-01 00:00:00',59.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10379,'2012-01-01 00:00:00',269.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10380,'2012-01-01 00:00:00',8983.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10381,'2012-01-01 00:00:00',906.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10382,'2012-01-01 00:00:00',5067.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10383,'2012-01-01 00:00:00',3018.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10384,'2012-01-01 00:00:00',3742.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10385,'2012-01-01 00:00:00',3058.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10386,'2012-01-01 00:00:00',297.000,21);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10387,'2012-01-01 00:00:00',8588.000,70);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10388,'2012-01-01 00:00:00',3372.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10389,'2012-01-01 00:00:00',13112.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10390,'2012-01-01 00:00:00',177700.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10391,'2012-01-01 00:00:00',30744.000,17);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10392,'2012-01-01 00:00:00',9430.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10393,'2012-01-01 00:00:00',5142.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10394,'2012-01-01 00:00:00',1393.000,36);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10395,'2012-01-01 00:00:00',43243.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10396,'2012-01-01 00:00:00',24724.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10397,'2012-01-01 00:00:00',2858.000,60);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10398,'2012-01-01 00:00:00',8259.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10399,'2012-01-01 00:00:00',1339.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10400,'2012-01-01 00:00:00',584.000,19);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10401,'2012-01-01 00:00:00',6960.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10402,'2012-01-01 00:00:00',39956.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10403,'2012-01-01 00:00:00',1383.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10404,'2012-01-01 00:00:00',96983.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10405,'2012-01-01 00:00:00',490.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10406,'2012-01-01 00:00:00',25868.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10407,'2012-01-01 00:00:00',5563.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10408,'2012-01-01 00:00:00',570.000,23);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10409,'2012-01-01 00:00:00',805.000,54);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10410,'2012-01-01 00:00:00',1721.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10411,'2012-01-01 00:00:00',1210.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10412,'2012-01-01 00:00:00',878.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10413,'2012-01-01 00:00:00',886.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10414,'2012-01-01 00:00:00',5015.000,21);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10415,'2012-01-01 00:00:00',890.000,36);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10416,'2012-01-01 00:00:00',2237.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10417,'2012-01-01 00:00:00',10446.000,73);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10418,'2012-01-01 00:00:00',15777.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10419,'2012-01-01 00:00:00',5502.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10420,'2012-01-01 00:00:00',3669.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10421,'2012-01-01 00:00:00',2040.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10422,'2012-01-01 00:00:00',131.000,27);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10423,'2012-01-01 00:00:00',644.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10424,'2012-01-01 00:00:00',15269.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10425,'2012-01-01 00:00:00',207.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10426,'2012-01-01 00:00:00',1772.000,29);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10427,'2012-01-01 00:00:00',175.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10428,'2012-01-01 00:00:00',48458.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10429,'2012-01-01 00:00:00',12621.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10430,'2012-01-01 00:00:00',35169.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10431,'2012-01-01 00:00:00',11316.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10432,'2012-01-01 00:00:00',692.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10433,'2012-01-01 00:00:00',1264.000,60);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10434,'2012-01-01 00:00:00',2501.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10435,'2012-01-01 00:00:00',2017.000,16);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10436,'2012-01-01 00:00:00',6626.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10437,'2012-01-01 00:00:00',19.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10438,'2012-01-01 00:00:00',1474.000,79);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10439,'2012-01-01 00:00:00',12998.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10440,'2012-01-01 00:00:00',4720.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10441,'2012-01-01 00:00:00',4085.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10442,'2012-01-01 00:00:00',51860.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10443,'2012-01-01 00:00:00',641.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10444,'2012-01-01 00:00:00',484.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10445,'2012-01-01 00:00:00',143.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10446,'2012-01-01 00:00:00',3721.000,79);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10447,'2012-01-01 00:00:00',27520.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10448,'2012-01-01 00:00:00',1435.000,64);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10449,'2012-01-01 00:00:00',21597.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10450,'2012-01-01 00:00:00',919.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10451,'2012-01-01 00:00:00',35149.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10452,'2012-01-01 00:00:00',2104.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10453,'2012-01-01 00:00:00',1932.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10454,'2012-01-01 00:00:00',7127.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10455,'2012-01-01 00:00:00',9357.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10456,'2012-01-01 00:00:00',101772.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10457,'2012-01-01 00:00:00',1382.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10458,'2012-01-01 00:00:00',2509.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10459,'2012-01-01 00:00:00',3840.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10460,'2012-01-01 00:00:00',16248.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10461,'2012-01-01 00:00:00',11266.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10462,'2012-01-01 00:00:00',264.000,16);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10463,'2012-01-01 00:00:00',1304.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10464,'2012-01-01 00:00:00',2824.000,28);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10465,'2012-01-01 00:00:00',986.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10466,'2012-01-01 00:00:00',1266.000,15);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10467,'2012-01-01 00:00:00',3919.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10468,'2012-01-01 00:00:00',1118.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10469,'2012-01-01 00:00:00',2639.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10470,'2012-01-01 00:00:00',1894.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10471,'2012-01-01 00:00:00',1654.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10472,'2012-01-01 00:00:00',9234.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10473,'2012-01-01 00:00:00',9750.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10474,'2012-01-01 00:00:00',3330.000,58);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10475,'2012-01-01 00:00:00',8762.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10476,'2012-01-01 00:00:00',613.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10477,'2012-01-01 00:00:00',1529.000,60);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10478,'2012-01-01 00:00:00',122.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10479,'2012-01-01 00:00:00',13793.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10480,'2012-01-01 00:00:00',835.000,23);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10481,'2012-01-01 00:00:00',1082.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10482,'2012-01-01 00:00:00',1347.000,43);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10483,'2012-01-01 00:00:00',4820.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10484,'2012-01-01 00:00:00',2063.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10485,'2012-01-01 00:00:00',127117.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10486,'2012-01-01 00:00:00',1665.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10487,'2012-01-01 00:00:00',59141.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10488,'2012-01-01 00:00:00',1100.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10489,'2012-01-01 00:00:00',1727.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10490,'2012-01-01 00:00:00',42590.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10491,'2012-01-01 00:00:00',1015.000,28);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10492,'2012-01-01 00:00:00',400.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10493,'2012-01-01 00:00:00',59200.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10494,'2012-01-01 00:00:00',37.000,15);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10495,'2012-01-01 00:00:00',512.000,42);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10496,'2012-01-01 00:00:00',1952.000,81);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10497,'2012-01-01 00:00:00',1728.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10498,'2012-01-01 00:00:00',1624.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10499,'2012-01-01 00:00:00',4758.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10500,'2012-01-01 00:00:00',944.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10501,'2012-01-01 00:00:00',216.000,6);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10502,'2012-01-01 00:00:00',410.000,58);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10503,'2012-01-01 00:00:00',647.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10504,'2012-01-01 00:00:00',1230.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10505,'2012-01-01 00:00:00',10980.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10506,'2012-01-01 00:00:00',880.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10507,'2012-01-01 00:00:00',1065.000,3);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10508,'2012-01-01 00:00:00',525.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10509,'2012-01-01 00:00:00',37.000,6);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10510,'2012-01-01 00:00:00',1928.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10511,'2012-01-01 00:00:00',26600.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10512,'2012-01-01 00:00:00',27346.000,21);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10513,'2012-01-01 00:00:00',668.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10514,'2012-01-01 00:00:00',24622.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10515,'2012-01-01 00:00:00',3954.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10516,'2012-01-01 00:00:00',6192.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10517,'2014-11-01 00:00:00',12147.000,53);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10518,'2012-01-01 00:00:00',930.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10519,'2012-01-01 00:00:00',2750.000,14);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10520,'2012-01-01 00:00:00',121.000,70);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10521,'2012-01-01 00:00:00',981.000,12);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10522,'2012-01-01 00:00:00',2599.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10523,'2012-01-01 00:00:00',1391.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10524,'2012-01-01 00:00:00',684.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10525,'2012-01-01 00:00:00',2310.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10526,'2012-01-01 00:00:00',4962.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10527,'2012-01-01 00:00:00',1860.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10528,'2012-01-01 00:00:00',272.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10529,'2012-01-01 00:00:00',1336.000,50);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10530,'2012-01-01 00:00:00',47907.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10531,'2012-01-01 00:00:00',159.000,54);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10532,'2012-01-01 00:00:00',1103.000,19);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10533,'2012-01-01 00:00:00',1781.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10534,'2012-01-01 00:00:00',654.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10535,'2012-01-01 00:00:00',13144.000,3);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10536,'2012-01-01 00:00:00',4679.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10537,'2012-01-01 00:00:00',4218.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10538,'2012-01-01 00:00:00',721.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10539,'2012-01-01 00:00:00',3226.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10540,'2012-01-01 00:00:00',2822.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10541,'2012-01-01 00:00:00',16714.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10542,'2012-01-01 00:00:00',512.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10543,'2012-01-01 00:00:00',1861.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10544,'2012-01-01 00:00:00',97.000,48);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10545,'2012-01-01 00:00:00',205.000,43);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10546,'2012-01-01 00:00:00',8100.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10547,'2012-01-01 00:00:00',1378.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10548,'2012-01-01 00:00:00',5856.000,79);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10549,'2012-01-01 00:00:00',28478.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10550,'2012-01-01 00:00:00',1334.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10551,'2012-01-01 00:00:00',149440.000,28);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10552,'2012-01-01 00:00:00',20862.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10553,'2012-01-01 00:00:00',1136.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10554,'2012-01-01 00:00:00',1872.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10555,'2012-01-01 00:00:00',37437.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10556,'2012-01-01 00:00:00',634.000,73);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10557,'2012-01-01 00:00:00',3437.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10558,'2012-01-01 00:00:00',3107.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10559,'2012-01-01 00:00:00',448.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10560,'2012-01-01 00:00:00',284.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10561,'2012-01-01 00:00:00',1044.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10562,'2012-01-01 00:00:00',1981.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10563,'2012-01-01 00:00:00',31351.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10564,'2012-01-01 00:00:00',664.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10565,'2012-01-01 00:00:00',211.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10566,'2012-01-01 00:00:00',6256.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10567,'2012-01-01 00:00:00',2012.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10568,'2012-01-01 00:00:00',26.000,29);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10569,'2012-01-01 00:00:00',6992.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10570,'2012-01-01 00:00:00',1611.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10571,'2012-01-01 00:00:00',598.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10572,'2012-01-01 00:00:00',1616.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10573,'2012-01-01 00:00:00',3205.000,3);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10574,'2012-01-01 00:00:00',1744.000,82);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10575,'2012-01-01 00:00:00',20579.000,52);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10576,'2012-01-01 00:00:00',2467.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10577,'2012-01-01 00:00:00',1129.000,82);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10578,'2012-01-01 00:00:00',418.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10579,'2012-01-01 00:00:00',895.000,45);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10580,'2012-01-01 00:00:00',2524.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10581,'2012-01-01 00:00:00',31.000,21);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10582,'2012-01-01 00:00:00',1209.000,6);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10583,'2012-01-01 00:00:00',5122.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10584,'2012-01-01 00:00:00',460.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10585,'2012-01-01 00:00:00',165.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10586,'2012-01-01 00:00:00',200.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10587,'2012-01-01 00:00:00',5062.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10588,'2012-01-01 00:00:00',154452.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10589,'2012-01-01 00:00:00',1757.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10590,'2012-01-01 00:00:00',3362.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10591,'2012-01-01 00:00:00',11041.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10592,'2012-01-01 00:00:00',815.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10593,'2012-01-01 00:00:00',864.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10594,'2012-01-01 00:00:00',61638.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10595,'2012-01-01 00:00:00',4291.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10596,'2012-01-01 00:00:00',1845.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10597,'2012-01-01 00:00:00',2667.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10598,'2012-01-01 00:00:00',5352.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10599,'2012-01-01 00:00:00',671.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10600,'2012-01-01 00:00:00',702.000,36);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10601,'2012-01-01 00:00:00',3570.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10602,'2012-01-01 00:00:00',549.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10603,'2012-01-01 00:00:00',4211.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10604,'2012-01-01 00:00:00',4974.000,28);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10605,'2012-01-01 00:00:00',127900.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10606,'2012-01-01 00:00:00',4331.000,81);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10607,'2012-01-01 00:00:00',14939.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10608,'2012-01-01 00:00:00',76.000,79);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10609,'2012-01-01 00:00:00',288.000,18);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10610,'2012-01-01 00:00:00',1554.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10611,'2012-01-01 00:00:00',6507.000,91);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10612,'2012-01-01 00:00:00',6904.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10613,'2012-01-01 00:00:00',875.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10614,'2012-01-01 00:00:00',1809.000,6);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10615,'2012-01-01 00:00:00',15.000,90);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10616,'2012-01-01 00:00:00',1401.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10617,'2012-01-01 00:00:00',14955.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10618,'2012-01-01 00:00:00',35167.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10619,'2012-01-01 00:00:00',7223.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10620,'2012-01-01 00:00:00',2272.000,42);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10621,'2012-01-01 00:00:00',878.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10622,'2012-01-01 00:00:00',83635.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10623,'2012-01-01 00:00:00',1762.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10624,'2012-01-01 00:00:00',663.000,78);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10625,'2012-01-01 00:00:00',1576.000,2);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10626,'2012-01-01 00:00:00',3150.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10627,'2012-01-01 00:00:00',5325.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10628,'2012-01-01 00:00:00',137.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10629,'2012-01-01 00:00:00',671.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10630,'2012-01-01 00:00:00',1309.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10631,'2012-01-01 00:00:00',522.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10632,'2012-01-01 00:00:00',2737.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10633,'2012-01-01 00:00:00',8935.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10634,'2012-01-01 00:00:00',4109.000,23);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10635,'2012-01-01 00:00:00',861.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10636,'2012-01-01 00:00:00',754.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10637,'2012-01-01 00:00:00',13146.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10638,'2012-01-01 00:00:00',1061.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10639,'2012-01-01 00:00:00',1868.000,70);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10640,'2012-01-01 00:00:00',602.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10641,'2012-01-01 00:00:00',7454.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10642,'2012-01-01 00:00:00',2624.000,73);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10643,'2012-01-01 00:00:00',4417.000,1);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10644,'2012-01-01 00:00:00',3507.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10645,'2012-01-01 00:00:00',25474.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10646,'2012-01-01 00:00:00',8032.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10647,'2012-01-01 00:00:00',1373.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10648,'2012-01-01 00:00:00',565.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10649,'2012-01-01 00:00:00',235.000,50);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10650,'2012-01-01 00:00:00',2764.000,21);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10651,'2012-01-01 00:00:00',3223.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10652,'2012-01-01 00:00:00',138.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10653,'2012-01-01 00:00:00',794.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10654,'2012-01-01 00:00:00',1486.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10655,'2012-01-01 00:00:00',495.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10656,'2012-01-01 00:00:00',518.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10657,'2012-01-01 00:00:00',18965.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10658,'2012-01-01 00:00:00',153271.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10659,'2012-01-01 00:00:00',2200.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10660,'2012-01-01 00:00:00',7174.000,36);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10661,'2012-01-01 00:00:00',174.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10662,'2012-01-01 00:00:00',85.000,48);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10663,'2012-01-01 00:00:00',9751.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10664,'2012-01-01 00:00:00',1163.000,28);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10665,'2012-01-01 00:00:00',2135.000,48);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10666,'2012-01-01 00:00:00',22972.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10667,'2012-01-01 00:00:00',7801.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10668,'2012-01-01 00:00:00',649.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10669,'2012-01-01 00:00:00',111.000,73);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10670,'2012-01-01 00:00:00',5307.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10671,'2012-01-01 00:00:00',1200.000,26);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10672,'2012-01-01 00:00:00',8387.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10673,'2012-01-01 00:00:00',196.000,90);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10674,'2012-01-01 00:00:00',40.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10675,'2012-01-01 00:00:00',2287.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10676,'2012-01-01 00:00:00',437.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10677,'2012-01-01 00:00:00',440.000,3);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10678,'2012-01-01 00:00:00',88593.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10679,'2012-01-01 00:00:00',107.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10680,'2012-01-01 00:00:00',11454.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10681,'2012-01-01 00:00:00',62431.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10682,'2012-01-01 00:00:00',12061.000,3);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10683,'2012-01-01 00:00:00',110.000,18);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10684,'2012-01-01 00:00:00',3526.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10685,'2012-01-01 00:00:00',1060.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10686,'2012-01-01 00:00:00',843.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10687,'2012-01-01 00:00:00',1116.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10688,'2012-01-01 00:00:00',484.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10689,'2012-01-01 00:00:00',770.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10690,'2012-01-01 00:00:00',7259.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10691,'2012-01-01 00:00:00',3610.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10692,'2012-01-01 00:00:00',195.000,1);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10693,'2012-01-01 00:00:00',1633.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10694,'2012-01-01 00:00:00',397197.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10695,'2012-01-01 00:00:00',2282.000,90);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10696,'2012-01-01 00:00:00',10570.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10697,'2012-01-01 00:00:00',6753.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10698,'2012-01-01 00:00:00',4957.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10699,'2012-01-01 00:00:00',412.000,52);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10700,'2012-01-01 00:00:00',3823.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10701,'2012-01-01 00:00:00',1388.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10702,'2012-01-01 00:00:00',441.000,1);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10703,'2012-01-01 00:00:00',16649.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10704,'2012-01-01 00:00:00',1785.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10705,'2012-01-01 00:00:00',84.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10706,'2012-01-01 00:00:00',32065.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10707,'2012-01-01 00:00:00',2209.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10708,'2012-01-01 00:00:00',303.000,77);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10709,'2012-01-01 00:00:00',1024.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10710,'2012-01-01 00:00:00',720.000,27);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10711,'2012-01-01 00:00:00',53275.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10712,'2012-01-01 00:00:00',1708.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10713,'2012-01-01 00:00:00',3875.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10714,'2012-01-01 00:00:00',3403.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10715,'2012-01-01 00:00:00',19554.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10716,'2012-01-01 00:00:00',811.000,64);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10717,'2012-01-01 00:00:00',24505.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10718,'2012-01-01 00:00:00',5692.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10719,'2012-01-01 00:00:00',701.000,45);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10720,'2012-01-01 00:00:00',376.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10721,'2012-01-01 00:00:00',2655.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10722,'2012-01-01 00:00:00',2252.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10723,'2012-01-01 00:00:00',31385.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10724,'2012-01-01 00:00:00',8420.000,51);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10725,'2012-01-01 00:00:00',380.000,21);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10726,'2012-01-01 00:00:00',1781.000,19);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10727,'2012-01-01 00:00:00',409.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10728,'2012-01-01 00:00:00',2839.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10729,'2012-01-01 00:00:00',581.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10730,'2012-01-01 00:00:00',617.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10731,'2012-01-01 00:00:00',952.000,14);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10732,'2012-01-01 00:00:00',512.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10733,'2012-01-01 00:00:00',4903.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10734,'2012-01-01 00:00:00',9916.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10735,'2012-01-01 00:00:00',367.000,45);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10736,'2012-01-01 00:00:00',331.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10737,'2012-01-01 00:00:00',1127.000,85);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10738,'2012-01-01 00:00:00',1318.000,74);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10739,'2012-01-01 00:00:00',14351.000,85);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10740,'2012-01-01 00:00:00',7778.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10741,'2012-01-01 00:00:00',19764.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10742,'2012-01-01 00:00:00',5539.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10743,'2012-01-01 00:00:00',34.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10744,'2012-01-01 00:00:00',4880.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10745,'2012-01-01 00:00:00',3794.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10746,'2012-01-01 00:00:00',58482.000,14);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10747,'2012-01-01 00:00:00',1423.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10748,'2012-01-01 00:00:00',23780.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10749,'2012-01-01 00:00:00',670.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10750,'2012-01-01 00:00:00',3874.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10751,'2012-01-01 00:00:00',1351.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10752,'2014-10-01 00:00:00',17.000,53);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10753,'2012-01-01 00:00:00',8562.000,27);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10754,'2012-01-01 00:00:00',12.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10755,'2012-01-01 00:00:00',16349.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10756,'2012-01-01 00:00:00',8974.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10757,'2012-01-01 00:00:00',10621.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10758,'2012-01-01 00:00:00',1157.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10759,'2012-01-01 00:00:00',238.000,2);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10760,'2012-01-01 00:00:00',3864.000,50);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10761,'2012-01-01 00:00:00',180.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10762,'2012-01-01 00:00:00',6747.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10763,'2012-01-01 00:00:00',53240.000,23);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10764,'2012-01-01 00:00:00',683.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10765,'2012-01-01 00:00:00',1440.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10766,'2012-01-01 00:00:00',9111.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10767,'2012-01-01 00:00:00',33.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10768,'2012-01-01 00:00:00',2520.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10769,'2012-01-01 00:00:00',12013.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10770,'2012-01-01 00:00:00',447.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10771,'2012-01-01 00:00:00',1014.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10772,'2012-01-01 00:00:00',918.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10773,'2012-01-01 00:00:00',21484.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10774,'2012-01-01 00:00:00',674.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10775,'2012-01-01 00:00:00',554.000,78);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10776,'2012-01-01 00:00:00',295801.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10777,'2012-01-01 00:00:00',1491.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10778,'2012-01-01 00:00:00',403.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10779,'2012-01-01 00:00:00',1586.000,52);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10780,'2012-01-01 00:00:00',303.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10781,'2012-01-01 00:00:00',2794.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10782,'2012-01-01 00:00:00',18.000,12);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10783,'2012-01-01 00:00:00',332.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10784,'2012-01-01 00:00:00',16612.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10785,'2012-01-01 00:00:00',1729.000,33);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10786,'2012-01-01 00:00:00',5913.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10787,'2012-01-01 00:00:00',5786.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10788,'2012-01-01 00:00:00',4953.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10789,'2012-01-01 00:00:00',503.000,23);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10790,'2012-01-01 00:00:00',98.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10791,'2012-01-01 00:00:00',454.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10792,'2012-01-01 00:00:00',2166.000,91);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10793,'2012-01-01 00:00:00',626.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10794,'2012-01-01 00:00:00',2078.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10795,'2012-01-01 00:00:00',2855.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10796,'2012-01-01 00:00:00',3558.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10797,'2012-01-01 00:00:00',5.000,17);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10798,'2012-01-01 00:00:00',5680.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10799,'2012-01-01 00:00:00',1629.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10800,'2012-01-01 00:00:00',1071.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10801,'2012-01-01 00:00:00',283.000,8);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10802,'2012-01-01 00:00:00',50795.000,73);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10803,'2012-01-01 00:00:00',13225.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10804,'2012-01-01 00:00:00',61552.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10805,'2012-01-01 00:00:00',1720.000,77);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10806,'2012-01-01 00:00:00',1166.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10807,'2012-01-01 00:00:00',52.000,27);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10808,'2012-01-01 00:00:00',1989.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10809,'2012-01-01 00:00:00',1508.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10810,'2012-01-01 00:00:00',551.000,42);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10811,'2012-01-01 00:00:00',4145.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10812,'2012-01-01 00:00:00',3420.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10813,'2012-01-01 00:00:00',4132.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10814,'2012-01-01 00:00:00',14216.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10815,'2012-01-01 00:00:00',86.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10816,'2012-01-01 00:00:00',75273.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10817,'2012-01-01 00:00:00',29611.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10818,'2012-01-01 00:00:00',942.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10819,'2012-01-01 00:00:00',785.000,12);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10820,'2012-01-01 00:00:00',216.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10821,'2012-01-01 00:00:00',143.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10822,'2012-01-01 00:00:00',505.000,82);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10823,'2012-01-01 00:00:00',1805.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10824,'2012-01-01 00:00:00',5706.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10825,'2012-01-01 00:00:00',357.000,17);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10826,'2012-01-01 00:00:00',607.000,7);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10827,'2012-01-01 00:00:00',2356.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10828,'2012-01-01 00:00:00',127.000,64);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10829,'2012-01-01 00:00:00',1712.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10830,'2012-01-01 00:00:00',7459.000,81);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10831,'2012-01-01 00:00:00',2193.000,70);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10832,'2012-01-01 00:00:00',3116.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10833,'2012-01-01 00:00:00',23425.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10834,'2012-01-01 00:00:00',378.000,81);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10835,'2012-01-01 00:00:00',1221.000,1);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10836,'2012-01-01 00:00:00',5310.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10837,'2012-01-01 00:00:00',1535.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10838,'2012-01-01 00:00:00',1738.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10839,'2012-01-01 00:00:00',2787.000,81);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10840,'2012-01-01 00:00:00',92.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10841,'2012-01-01 00:00:00',1367.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10842,'2012-01-01 00:00:00',1182.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10843,'2012-01-01 00:00:00',532.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10844,'2012-01-01 00:00:00',595.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10845,'2012-01-01 00:00:00',111325.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10846,'2012-01-01 00:00:00',38735.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10847,'2012-01-01 00:00:00',52670.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10848,'2012-01-01 00:00:00',473.000,16);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10849,'2012-01-01 00:00:00',1115.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10850,'2012-01-01 00:00:00',8210.000,84);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10851,'2012-01-01 00:00:00',9411.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10852,'2012-01-01 00:00:00',14785.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10853,'2012-01-01 00:00:00',91.000,6);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10854,'2012-01-01 00:00:00',1733.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10855,'2012-01-01 00:00:00',3576.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10856,'2012-01-01 00:00:00',1143.000,3);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10857,'2012-01-01 00:00:00',908.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10858,'2012-01-01 00:00:00',1063.000,40);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10859,'2012-01-01 00:00:00',5889.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10860,'2012-01-01 00:00:00',595.000,26);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10861,'2012-01-01 00:00:00',4796.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10862,'2012-01-01 00:00:00',557.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10863,'2012-01-01 00:00:00',1745.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10864,'2012-01-01 00:00:00',7652.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10865,'2012-01-01 00:00:00',7050.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10866,'2012-01-01 00:00:00',3475.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10867,'2012-01-01 00:00:00',5.000,48);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10868,'2012-01-01 00:00:00',2437.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10869,'2012-01-01 00:00:00',4001.000,72);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10870,'2012-01-01 00:00:00',469.000,91);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10871,'2012-01-01 00:00:00',994.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10872,'2012-01-01 00:00:00',100334.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10873,'2012-01-01 00:00:00',647.000,90);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10874,'2012-01-01 00:00:00',138.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10875,'2012-01-01 00:00:00',1411.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10876,'2012-01-01 00:00:00',1879.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10877,'2012-01-01 00:00:00',925.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10878,'2012-01-01 00:00:00',48.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10879,'2012-01-01 00:00:00',1323.000,90);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10880,'2012-01-01 00:00:00',15183.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10881,'2012-01-01 00:00:00',488.000,12);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10882,'2012-01-01 00:00:00',1663.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10883,'2012-01-01 00:00:00',159.000,48);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10884,'2012-01-01 00:00:00',2180.000,45);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10885,'2012-01-01 00:00:00',9013.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10886,'2012-01-01 00:00:00',21962.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10887,'2012-01-01 00:00:00',1586.000,29);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10888,'2012-01-01 00:00:00',251.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10889,'2012-01-01 00:00:00',5240.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10890,'2012-01-01 00:00:00',203.000,18);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10891,'2012-01-01 00:00:00',1835.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10892,'2012-01-01 00:00:00',1220.000,50);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10893,'2012-01-01 00:00:00',16448.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10894,'2012-01-01 00:00:00',2144.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10895,'2012-01-01 00:00:00',13087.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10896,'2012-01-01 00:00:00',518.000,50);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10897,'2012-01-01 00:00:00',12587.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10898,'2012-01-01 00:00:00',402.000,54);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10899,'2012-01-01 00:00:00',176.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10900,'2012-01-01 00:00:00',216.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10901,'2012-01-01 00:00:00',1401.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10902,'2012-01-01 00:00:00',7568.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10903,'2012-01-01 00:00:00',1134.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10904,'2012-01-01 00:00:00',2666.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10905,'2012-01-01 00:00:00',217.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10906,'2012-01-01 00:00:00',3651.000,91);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10907,'2012-01-01 00:00:00',325.000,74);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10908,'2012-01-01 00:00:00',785.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10909,'2012-01-01 00:00:00',5444.000,70);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10910,'2012-01-01 00:00:00',717.000,90);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10911,'2012-01-01 00:00:00',1225.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10912,'2012-01-01 00:00:00',9016.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10913,'2012-01-01 00:00:00',5229.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10914,'2012-01-01 00:00:00',145.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10915,'2012-01-01 00:00:00',1551.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10916,'2012-01-01 00:00:00',1127.000,64);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10917,'2012-01-01 00:00:00',260.000,69);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10918,'2012-01-01 00:00:00',3873.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10919,'2012-01-01 00:00:00',4719.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10920,'2012-01-01 00:00:00',240.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10921,'2012-01-01 00:00:00',3925.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10922,'2012-01-01 00:00:00',3992.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10923,'2012-01-01 00:00:00',37497.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10924,'2012-01-01 00:00:00',7349.000,5);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10925,'2012-01-01 00:00:00',1332.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10926,'2012-01-01 00:00:00',556.000,2);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10927,'2012-01-01 00:00:00',495.000,40);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10928,'2012-01-01 00:00:00',1165.000,29);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10929,'2012-01-01 00:00:00',121936.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10930,'2012-01-01 00:00:00',56424.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10931,'2012-01-01 00:00:00',5105.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10932,'2012-01-01 00:00:00',3977.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10933,'2012-01-01 00:00:00',262.000,38);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10934,'2012-01-01 00:00:00',4026.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10935,'2012-01-01 00:00:00',2112.000,88);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10936,'2012-01-01 00:00:00',260.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10937,'2012-01-01 00:00:00',552.000,12);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10938,'2012-01-01 00:00:00',8027.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10939,'2012-01-01 00:00:00',324.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10940,'2012-01-01 00:00:00',2547.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10941,'2012-01-01 00:00:00',12983.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10942,'2012-01-01 00:00:00',67.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10943,'2012-01-01 00:00:00',8295.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10944,'2012-01-01 00:00:00',1089.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10945,'2012-01-01 00:00:00',1022.000,52);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10946,'2012-01-01 00:00:00',38180.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10947,'2012-01-01 00:00:00',18.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10948,'2012-01-01 00:00:00',12378.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10949,'2012-01-01 00:00:00',43312.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10950,'2012-01-01 00:00:00',1397.000,49);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10951,'2012-01-01 00:00:00',2566.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10952,'2012-01-01 00:00:00',206.000,1);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10953,'2012-01-01 00:00:00',4560.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10954,'2012-01-01 00:00:00',1676.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10955,'2012-01-01 00:00:00',1391.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10956,'2012-01-01 00:00:00',12494.000,6);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10957,'2012-01-01 00:00:00',2408.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10958,'2012-01-01 00:00:00',291.000,54);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10959,'2012-01-01 00:00:00',98.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10960,'2012-01-01 00:00:00',4050.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10961,'2012-01-01 00:00:00',10690.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10962,'2012-01-01 00:00:00',6746.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10963,'2012-01-01 00:00:00',16.000,28);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10964,'2012-01-01 00:00:00',1372.000,74);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10965,'2012-01-01 00:00:00',336.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10966,'2012-01-01 00:00:00',731.000,14);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10967,'2012-01-01 00:00:00',441.000,79);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10968,'2012-01-01 00:00:00',2378.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10969,'2012-01-01 00:00:00',571.000,15);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10970,'2012-01-01 00:00:00',1704.000,8);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10971,'2012-01-01 00:00:00',204.000,26);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10972,'2012-01-01 00:00:00',477.000,40);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10973,'2012-01-01 00:00:00',1073.000,40);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10974,'2012-01-01 00:00:00',988.000,75);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10975,'2012-01-01 00:00:00',369.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10976,'2012-01-01 00:00:00',73.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10977,'2012-01-01 00:00:00',1860.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10978,'2012-01-01 00:00:00',60184.000,50);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10979,'2012-01-01 00:00:00',8157.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10980,'2012-01-01 00:00:00',244.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10981,'2012-01-01 00:00:00',2558.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10982,'2012-01-01 00:00:00',217.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10983,'2012-01-01 00:00:00',4383.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10984,'2012-01-01 00:00:00',4183.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10985,'2012-01-01 00:00:00',13961.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10986,'2012-01-01 00:00:00',12773.000,54);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10987,'2012-01-01 00:00:00',6550.000,19);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10988,'2012-01-01 00:00:00',710.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10989,'2012-01-01 00:00:00',2562.000,61);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10990,'2012-01-01 00:00:00',40180.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10991,'2012-01-01 00:00:00',17585.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10992,'2012-01-01 00:00:00',21.000,77);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10993,'2012-01-01 00:00:00',2055.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10994,'2012-01-01 00:00:00',2000.000,83);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10995,'2012-01-01 00:00:00',1223.000,58);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10996,'2012-01-01 00:00:00',1852.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10997,'2012-01-01 00:00:00',10974.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10998,'2012-01-01 00:00:00',2821.000,91);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (10999,'2012-01-01 00:00:00',1835.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11000,'2012-01-01 00:00:00',8994.000,65);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11001,'2012-01-01 00:00:00',4234.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11002,'2012-01-01 00:00:00',4230.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11003,'2012-01-01 00:00:00',3746.000,78);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11004,'2012-01-01 00:00:00',192.000,50);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11005,'2012-01-01 00:00:00',936.000,90);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11006,'2012-01-01 00:00:00',13712.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11007,'2012-01-01 00:00:00',7954.000,60);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11008,'2012-01-01 00:00:00',11881.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11009,'2012-01-01 00:00:00',6513.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11010,'2012-01-01 00:00:00',121.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11011,'2012-01-01 00:00:00',4764.000,1);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11012,'2012-01-01 00:00:00',2958.000,25);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11013,'2012-01-01 00:00:00',8989.000,69);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11014,'2012-01-01 00:00:00',8506.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11015,'2012-01-01 00:00:00',1875.000,70);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11016,'2012-01-01 00:00:00',2242.000,4);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11017,'2012-01-01 00:00:00',4019.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11018,'2012-01-01 00:00:00',1102.000,48);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11019,'2012-01-01 00:00:00',76.000,64);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11020,'2012-01-01 00:00:00',1049.000,56);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11021,'2012-01-01 00:00:00',4932.000,63);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11022,'2012-01-01 00:00:00',652.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11023,'2012-01-01 00:00:00',799.000,11);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11024,'2012-01-01 00:00:00',9592.000,19);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11025,'2012-01-01 00:00:00',6326.000,87);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11026,'2012-01-01 00:00:00',558.000,27);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11027,'2012-01-01 00:00:00',1739.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11028,'2012-01-01 00:00:00',1120.000,39);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11029,'2012-01-01 00:00:00',536.000,14);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11030,'2012-01-01 00:00:00',4161.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11031,'2012-01-01 00:00:00',7110.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11032,'2012-01-01 00:00:00',19204.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11033,'2012-01-01 00:00:00',1343.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11034,'2012-01-01 00:00:00',4669.000,55);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11035,'2012-01-01 00:00:00',7667.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11036,'2012-01-01 00:00:00',1732.000,17);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11037,'2012-01-01 00:00:00',29.000,30);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11038,'2012-01-01 00:00:00',2859.000,76);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11039,'2012-01-01 00:00:00',5544.000,47);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11040,'2012-01-01 00:00:00',8906.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11041,'2012-01-01 00:00:00',2862.000,14);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11042,'2012-01-01 00:00:00',379.000,15);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11043,'2012-01-01 00:00:00',227.000,74);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11044,'2012-01-01 00:00:00',365.000,91);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11045,'2012-01-01 00:00:00',2355.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11046,'2012-01-01 00:00:00',602.000,86);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11047,'2012-01-01 00:00:00',1615.000,19);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11048,'2012-01-01 00:00:00',727.000,10);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11049,'2012-01-01 00:00:00',96.000,31);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11050,'2012-01-01 00:00:00',2012.000,24);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11051,'2012-01-01 00:00:00',31.000,41);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11052,'2012-01-01 00:00:00',1206.000,34);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11053,'2012-01-01 00:00:00',4071.000,59);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11054,'2012-01-01 00:00:00',2551.000,12);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11055,'2012-01-01 00:00:00',3514.000,35);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11056,'2012-01-01 00:00:00',4521.000,19);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11057,'2014-10-17 00:00:00',51.000,53);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11058,'2012-01-01 00:00:00',210.000,6);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11059,'2012-01-01 00:00:00',20581.000,67);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11060,'2012-01-01 00:00:00',7743.000,27);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11061,'2012-01-01 00:00:00',476.000,32);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11062,'2012-01-01 00:00:00',441.000,66);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11063,'2012-01-01 00:00:00',4649.000,37);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11064,'2012-01-01 00:00:00',3096.000,71);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11065,'2012-01-01 00:00:00',1608.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11066,'2012-01-01 00:00:00',2159.000,89);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11067,'2012-01-01 00:00:00',40.000,17);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11068,'2012-01-01 00:00:00',4895.000,62);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11069,'2012-01-01 00:00:00',52.000,80);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11070,'2012-01-01 00:00:00',3565.000,44);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11071,'2012-01-01 00:00:00',270.000,46);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11072,'2012-01-01 00:00:00',7175.000,20);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11073,'2012-01-01 00:00:00',130.000,58);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11074,'2012-01-01 00:00:00',171.000,73);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11075,'2012-01-01 00:00:00',63188.000,68);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11076,'2012-01-01 00:00:00',3135.000,9);
INSERT INTO `ventas` (`idVenta`,`fecha`,`total`,`idCliente`) VALUES 
  (11077,'2012-01-01 00:00:00',6161.000,65);
COMMIT;
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
