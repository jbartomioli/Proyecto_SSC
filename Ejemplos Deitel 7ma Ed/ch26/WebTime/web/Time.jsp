<?xml version = "1.0" encoding = "UTF-8"?>

<!-- Fig. 26.4: Time.jsp -->
<!-- JSP file generated by Java Studio Creator 2 that displays -->
<!-- the current time on the web server -->
<jsp:root version = "1.2" 
   xmlns:f = "http://java.sun.com/jsf/core" 
   xmlns:h = "http://java.sun.com/jsf/html"
   xmlns:jsp = "http://java.sun.com/JSP/Page" 
   xmlns:ui = "http://www.sun.com/web/ui">
   <jsp:directive.page contentType = "text/html; charset = UTF-8" 
      pageEncoding = "UTF-8"/>
   <f:view>
      <ui:page binding = "#{Time.page}" id = "page">
         <ui:html binding = "#{Time.html}" id = "html">
            <ui:head binding = "#{Time.head}" id = "head" 
               title = "Web Time: A Simple Example">
               <ui:link binding = "#{Time.link}" id = "link" 
                  url = "/resources/stylesheet.css"/>
            </ui:head>
            <ui:meta content = "60" httpEquiv = "refresh"/>
            <ui:body binding = "#{Time.body}" id = "body" 
               style = "-rave-layout: grid">
               <ui:form binding = "#{Time.form}" id = "form">
                  <ui:staticText binding = "#{Time.timeHeader}" id = 
                     "timeHeader" style = "font-size: 18px; left: 24px;
                     top: 24px; position: absolute" text = "Current time
                     on the Web Server:"/>
                  <ui:staticText binding = "#{Time.clockText}" id = 
                     "clockText" style = "background-color: black; 
                     color: yellow; font-size: 18px; left: 24px; top: 
                     48px; position: absolute"/>
               </ui:form>
            </ui:body>
         </ui:html>
      </ui:page>
   </f:view>
</jsp:root>

<!-- (C) Copyright 1992-2007 by Deitel & Associates, Inc. and          -->
<!-- Pearson Education, Inc. All Rights Reserved.                      -->
<!--                                                                   -->
<!-- DISCLAIMER: The authors and publisher of this book have used their-->
<!-- best efforts in preparing the book. These efforts include the     -->
<!-- development, research, and testing of the theories and programs   -->
<!-- to determine their effectiveness. The authors and publisher make  -->
<!-- no warranty of any kind, expressed or implied, with regard to     -->
<!-- these programs or to the documentation contained in these books.  -->
<!-- The authors and publisher shall not be liable in any event for    -->
<!-- incidental or consequential damages in connection with, or        -->
<!-- arising out of, the furnishing, performance, or use of these      -->
<!-- programs.                                                         -->