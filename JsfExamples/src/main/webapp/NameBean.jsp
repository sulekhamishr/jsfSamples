<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
    
<!DOCTYPE html>
<f:view>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	        <h:form>
           Please Enter First Name and LastName <br/>
            First name 
            <h:inputText id="firstName" value="#{namebean.firstName}"/><br>
            Last Name
            <h:inputText id="lastName" value="#{namebean.lastName}"/><br>
        	Result is : 
        	<h:outputText value="#{namebean.fullName}"/> <br/>
        	<h:commandButton actionListener="#{namebean.result}" 
        		value="Show" />
        </h:form>

</body>
</html>
</f:view>