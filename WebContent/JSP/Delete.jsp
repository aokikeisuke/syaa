<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>削除画面</title>
<link rel="stylesheet" href="/syaa/css/text.css" type="text/css" />
</head>
<body class="background" style="text-align:center">
<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
<br>
		データを削除しますか？<br />
		<form method="POST" action="/syaa/Delete">
			 <input type="submit" style="WIDTH: 80px; HEIGHT: 25px"value="はい">
			 <input type="hidden" name="id" value="${requestScope['id']}"/>
		</form>
		<br>
		<form method="GET" action="/syaa/servlet/SearchOutPersonal/${requestScope['id']}">
		
			 <input type="submit" style="WIDTH: 80px; HEIGHT: 25px" value="いいえ">
		</form>
</body>

</html>