<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
String lastname = (String)session.getAttribute("lastname");
String firstname = (String)session.getAttribute("firsttname");
%>
<%-- 
String lastname = request.getParameter("lastname");
session.setAttribute("lastname", lastname);
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>登録確認画面</title>
</head>
<body>
<p>
姓:<%=lastname %><br>
名:<%=firstname %><br>
</p>

<form  method="POST" action="/syaa/servlet/RegOut.java">
	<input type="submit" name="yesno" value="はい"/>
	<input type="submit" name="yesno" value="いいえ"/>
</form>


</body>
</html>


