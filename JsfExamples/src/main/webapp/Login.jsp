<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core" %>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html" %>
<!DOCTYPE html>
<f:view>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
       <h:form>
       
       <h:outputLabel value="userName "/>
       <h:inputText id="userName" value="#{login.userName}"/> <br>
       
       <h:outputLabel value="passCode"/>
       <h:inputSecret id="passCode" value="#{login.passCode}"/><br>
       
       
       <p style="color:red"> <h:outputText value="#{error}"/>
       <h:commandButton action= "#{loginDao.validateDao(login.userName, login.passCode)}" value="Login"/>
       
       
       </h:form>
        

</body>
</html>
</f:view>