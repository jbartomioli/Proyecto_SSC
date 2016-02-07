REM @ECHO off

TITLE SSC - Sistema de Seguimiento de Clientes

SET SSC_DIR=S:\Sistema_SSC
SET SSC_LIBAUX=%SSC_DIR%\lib

SET SSC_LIB=%SSC_LIBAUX%\mysql\mysql-connector-java-5.1.24-bin.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\slf4j-1.7.5\slf4j-simple-1.7.5.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\javamail-1.4.7\mail.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\novaworx\novaworx-syntax-0.0.7.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\ekit.1.5b\ekit\ekit.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\sam\sam.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\jtidy\jtidy-8.0.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\JWSAntTasks\org-netbeans-modules-javawebstart-anttasks.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\jdom\build\jdom-1.1.3.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\jpa\hibernate-entitymanager-4.2.2.Final.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\required\antlr-2.7.7.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\required\hibernate-jpa-2.0-api-1.0.1.Final.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\envers\hibernate-envers-4.2.2.Final.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\required\hibernate-commons-annotations-4.0.2.Final.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\required\hibernate-core-4.2.2.Final.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\required\jboss-transaction-api_1.1_spec-1.0.1.Final.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\required\jboss-logging-3.1.0.GA.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\required\javassist-3.15.0-GA.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\hibernate-release-4.2.2.Final\lib\required\dom4j-1.6.1.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\jfreechart-1.0.14.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\javacsv2.1\javacsv.jar;
SET SSC_LIB=%SSC_LIB%%SSC_LIBAUX%\jcommon-1.0.15.jar;


SET CLASSPATH=%SSC_DIR%\bin;%SSC_LIB%

CD %SSC_DIR%

java main.Main

EXIT