@echo off

color B
title SSC - Sistema de Seguimiento de Clientes
echo *************************************************
echo * BIENVENIDO SISTEMA DE SEGUIMIENTO DE CLIENTES *
echo *************************************************
echo. 
echo.


rem CD S:\Sistema_SSC

set SSC_DIR=S:\Sistema_SSC
set SSC_LIB=Sistema_Seguimiento_lib

set CLASSPATH=%SSC_DIR%\bin;%SSC_DIR%\%SSC_LIB%\mysql-connector-java-5.1.24-bin.jar;%SSC_DIR%\%SSC_LIB%\slf4j-simple-1.7.5.jar;%SSC_DIR%\%SSC_LIB%\mail.jar;%SSC_DIR%\%SSC_LIB%\novaworx-syntax-0.0.7.jar;%SSC_DIR%\%SSC_LIB%\ekit.jar;%SSC_DIR%\%SSC_LIB%\sam.jar;%SSC_DIR%\%SSC_LIB%\jtidy-8.0.jar;%SSC_DIR%\%SSC_LIB%\org-netbeans-modules-javawebstart-anttasks.jar;%SSC_DIR%\%SSC_LIB%\jdom-1.1.3.jar;%SSC_DIR%\%SSC_LIB%\hibernate-entitymanager-4.2.2.Final.jar;%SSC_DIR%\%SSC_LIB%\antlr-2.7.7.jar;%SSC_DIR%\%SSC_LIB%\hibernate-jpa-2.0-api-1.0.1.Final.jar;%SSC_DIR%\%SSC_LIB%\hibernate-envers-4.2.2.Final.jar ;%SSC_DIR%\%SSC_LIB%\hibernate-commons-annotations-4.0.2.Final.jar;%SSC_DIR%\%SSC_LIB%\hibernate-core-4.2.2.Final.jar ;%SSC_DIR%\%SSC_LIB%\jboss-transaction-api_1.1_spec-1.0.1.Final.jar;%SSC_DIR%\%SSC_LIB%\jboss-logging-3.1.0.GA.jar;%SSC_DIR%\%SSC_LIB%\javassist-3.15.0-GA.jar;%SSC_DIR%\%SSC_LIB%\dom4j-1.6.1.jar;%SSC_DIR%\%SSC_LIB%\jfreechart-1.0.14.jar;%SSC_DIR%\%SSC_LIB%\javacsv.jar;%SSC_DIR%\%SSC_LIB%\jcommon-1.0.15.jar

java main.Main



echo.
SET /P = Presione una tecla para salir...