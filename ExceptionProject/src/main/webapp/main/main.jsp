<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
  <%
     try
    {
      int a=10/0; // 무시
    }catch(Exception e){}  
  %>
  <hl>Hello Java!!</hl>
  <hl>Hello Java!!</hl>
  <hl>Hello Java!!</hl>
  <hl>Hello Java!!</hl>
  <hl>Hello Java!!</hl>
</body>
</html>