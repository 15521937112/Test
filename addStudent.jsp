<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
    <form action="addStuentServlet" method="post">
      学号：<input type="text" name="Sno" /> <br>
      姓名：<input type="text" name="Sname" /> <br>
      年龄：<input type="text" name="Sage" /> <br>
      地址：<input type="text" name="Saddress" /> <br>
      <input  type="submit"  value="增加"  />
    </form>

</body>
</html>