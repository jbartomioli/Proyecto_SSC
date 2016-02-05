rem @echo off

color B
title SSC - Sistema de Seguimiento de Clientes
echo *************************************************
echo * BIENVENIDO SISTEMA DE SEGUIMIENTO DE CLIENTES *
echo *************************************************
echo. 
echo.


CD S:\Sistema_SSC

set SSC_DIR=S:\Sistema_SSC
set SSC_LIB=%SSC_DIR%\lib

set SSC_LIB01=%SSC_LIB%\mysql\mysql-connector-java-5.1.24-bin.jar;
set SSC_LIB02=%SSC_LIB%\slf4j-1.7.5\slf4j-simple-1.7.5.jar;
set SSC_LIB03=%SSC_LIB%\javamail-1.4.7\mail.jar;
set SSC_LIB04=%SSC_LIB%\novaworx\novaworx-syntax-0.0.7.jar
set SSC_LIB05=%SSC_LIB%\ekit.1.5b\ekit\ekit.jar;
set SSC_LIB06=%SSC_LIB%\sam\sam.jar;
set SSC_LIB07=%SSC_LIB%\jtidy\jtidy-8.0.jar;
set SSC_LIB08=%SSC_LIB%\JWSAntTasks\org-netbeans-modules-javawebstart-anttasks.jar;
set SSC_LIB09=%SSC_LIB%\jdom\build\jdom-1.1.3.jar;
set SSC_LIB10=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\jpa\hibernate-entitymanager-4.2.2.Final.jar;
set SSC_LIB11=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\required\antlr-2.7.7.jar;
set SSC_LIB12=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\required\hibernate-jpa-2.0-api-1.0.1.Final.jar;
set SSC_LIB13=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\envers\hibernate-envers-4.2.2.Final.jar;
set SSC_LIB14=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\required\hibernate-commons-annotations-4.0.2.Final.jar;
set SSC_LIB15=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\required\hibernate-core-4.2.2.Final.jar;
set SSC_LIB16=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\required\jboss-transaction-api_1.1_spec-1.0.1.Final.jar;
set SSC_LIB17=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\required\jboss-logging-3.1.0.GA.jar;
set SSC_LIB18=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\required\javassist-3.15.0-GA.jar;
set SSC_LIB19=%SSC_LIB%\hibernate-release-4.2.2.Final\lib\required\dom4j-1.6.1.jar;
set SSC_LIB20=%SSC_LIB%\jfreechart-1.0.14.jar;
set SSC_LIB21=%SSC_LIB%\javacsv2.1\javacsv.jar;
set SSC_LIB22=%SSC_LIB%\jcommon-1.0.15.jar;

set SSC_LIBIMP=%SSC_LIB01%%SSC_LIB02%%SSC_LIB03%%SSC_LIB04%%SSC_LIB05%%SSC_LIB06%%SSC_LIB07%%SSC_LIB08%%SSC_LIB09%%SSC_LIB10%%SSC_LIB11%%SSC_LIB12%%SSC_LIB13%%SSC_LIB14%%SSC_LIB15%%SSC_LIB16%%SSC_LIB17%%SSC_LIB18%%SSC_LIB19%%SSC_LIB20%%SSC_LIB21%%SSC_LIB22%

set CLASSPATH=%SSC_DIR%\bin;%SSC_LIBIMP%

java main.Main



echo.
SET /P = Presione una tecla para salir...