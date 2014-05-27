<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />

<title>トップ画面</title>
</head>
<body>
<div style="text-align:center">
<header>
<a href="http://localhost:8080/syaa/JSP/Top.jsp"> <br>
<img src="http://www.casleyconsulting.co.jp/wp-content/themes/casleyconsulting/images/header_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
		<form method="POST" action="http://localhost:8080/syaa/JSP/RegIn.jsp">
		<br>
			<input type="submit" style="WIDTH: 80px; HEIGHT: 25px" value="新規登録" >
		</form>
		<br>
		<form method="POST" action="/syaa/servlet/Top">
			<input type="submit" style="WIDTH: 80px; HEIGHT: 25px" value="社員一覧"><br>
			　<br>${requestScope['msg']}
			 ${requestScope['topalert']}
			
		</form>
</div>
</body>

</html>