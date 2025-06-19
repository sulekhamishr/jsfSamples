<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri = "http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri= "http://java.sun.com/jsf/html" %>
<!DOCTYPE html>
<f:view>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h:form>


<center>
    
<h2><h:outputText value="Employ Records"/></h2>
</center>

<h:dataTable value= "#{employDao.showEmploy()}" var="e" border="5">

<h:column>
       <f:facet name="header">

         <h:outputText value="Employ No"/>
         
         </f:facet>
         <h:outputText value="#{e.empno}"/>

</h:column>


<h:column>

         <f:facet name="header">
         
         <h:outputText value ="Employ name"/>
         
         </f:facet>
         <h:outputText value="#{e.name}"/>
</h:column>


<h:column>
        <f:facet name="header">
         
          <h:outputText value ="Employ Dept"/>
         
         </f:facet>
         
                   <h:outputText value ="#{e.dept}"/>
         
</h:column>


<h:column>
 <f:facet name="header">
 
    
       <h:outputText value ="Employ Desig "/>
    
  
 </f:facet>


 <h:outputText value="#{e.desig}"/>

</h:column>


<h:column>

   
   <f:facet name="header">
   
   
   <h:outputText value="Employ basic salary"/>
   
   
   </f:facet>
   
   <h:outputText value="#{e.basic}"/>

</h:column>



</h:dataTable>
 


         
</h:form>
</body>
</html>
</f:view>