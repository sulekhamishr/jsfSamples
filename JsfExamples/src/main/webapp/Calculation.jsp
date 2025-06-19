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
       First Number:
       <h:inputText id="firstNo" value="#{calculation.firstNo }"/> <br>
       Second Number:
       <h:inputText id="secondNo" value="#{calculation.secondNo}"/><br>
       Result:
       <h:outputText id="result" value="#{calculation.result}"/><br>
       <h:commandButton actionListener="#{calculation.addition}" value= "Add"/>
       </h:form>
</body>
</html>
</f:view>

<!-- This is a JSF tag used to create a form. It's similar to an HTML <form> tag but it integrates with the JSF lifecycle, allowing you to bind user input to JavaBean properties 
   1. Calculation - managed bean 
   2. br  break-- talatu talatu line 
   3. CommandButton- it is  standard JSF component which makes the UI clickable.
   4. actio 
 
  The actionListener attribute is used to specify a method in the managed bean that gets invoked when the button is clicked.
  
  
             <!-- It is used inside <h:dataTable>.

You create one <h:column> for each column in your table.

✅ <f:facet name="header"> — Sets Column Headers
It is a special child tag of <h:column>.

Use it to define what appears in the table header for that column



<h:inputText>: A textbox for entering the username.

<h:inputSecret>: A password field for the password.

The value="#{login.userName}" binds the form input to a managed bean called login, which has a property userName.
  | Step | Action                       | What Happens                                             |
| ---- | ---------------------------- | -------------------------------------------------------- |
| 1    | User interacts               | Clicks button, types, etc.                               |
| 2    | Event generated              | Component creates `ActionEvent`                          |
| 3    | Event delivered to listener  | Calls `actionPerformed()` on registered `ActionListener` |
| 4    | Listener processes the event | Code inside `actionPerformed()` executes                 |
  
 -->