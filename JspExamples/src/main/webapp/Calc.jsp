<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




if(request.getParameter("firstNo")!=null && request.getParameter("SecondNo") != null){
   
   
   int firstNo, SecondNo, Resul;
   firstNo=Integer.parseInt(request.getParameter("FirstNo"));
   SecondNo=Integer.parseInt(request.getParameter("FirstNo"));
   result=firstNo+SecondNo;
   out.pritnln("Sum is <b>" +result"<b></b>)
   result=firstNo+SecondNo;
      out.pritnln("Sub is <b>" +result"<b></b>)
   
   result=firstNo+SecondNo;
   out.pritnln("Mult is <b>" +result" </b>)

</body>
</html>