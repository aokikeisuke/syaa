<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />

<title>トップ画面</title>
<link rel="stylesheet" href="../css/text.css" type="text/css" />
</head>
<body class="background" style="text-align:center">
<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png">
</a>
</header>
		<form method="POST" action="syaa/JSP/RegIn.jsp">
		<br>
			<input type="submit" style="WIDTH: 80px; HEIGHT: 25px" value="新規登録" >
		</form>
		<br>
		<form method="POST" action="/syaa/servlet/Top">
			<input type="submit" style="WIDTH: 80px; HEIGHT: 25px" value="社員一覧"><br>
			　<br>${requestScope['msg']}
			 ${requestScope['topalert']}
			
		</form>
</body>

</html>