<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


   <jsp:useBean id="beanGreeting" class="com.java.beans.Greeting"/>
   Default Message:
   <b>
      <jsp:getProperty property="msg" name="beanGreeting">
      </b>
       
      <jsp:getProperty property="msg" name="beanGreeting" value="Good Evening">
      
      Update Message : 
      <b>
      <jsp:getProperty property="msg" name="beanGreeting" /></b>
      
   
   </b>
</body>
</html>