<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculation Results</title>
</head>
<body>

<jsp:useBean id="beanCalc" class="com.java.beans.Calculation" />
<jsp:setProperty property="*" name="beanCalc" />

Sum is: 
       <b>
              <%= beanCalc.sum() %>
              </b>
Subtraction is: <b><%= beanCalc.sub() %></b>

Multiplication is: <b><%= beanCalc.multi() %></b>

</body>
</html>
