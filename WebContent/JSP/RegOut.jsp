<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
String lastname = (String)session.getAttribute("lastname");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>登録確認画面</title>
</head>
<body>
<form>
姓：
<input type = "text" name = "lastname" size = "20"
value = "<%=lastname%>"/>
</form>

<form method="POST" action="/syaa/JSP/Top.jsp">
	<input type="submit" name="yes" value="はい"/></form>
<form method="POST" action="/syaa/JSP/RegIn.jsp">
	<input type="submit" name="no" value="いいえ"/></form>


</body>
</html>


