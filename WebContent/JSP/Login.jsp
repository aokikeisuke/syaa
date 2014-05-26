<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ログイン画面</title>
</head>

<body>
<div style="text-align:center">
<header>
<a href="http://localhost:8080/syaa/JSP/Login.jsp"> <br>
<img src="http://www.casleyconsulting.co.jp/wp-content/themes/casleyconsulting/images/header_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
<br>
		私たちのチームの名前は？<br />
		<form method="POST" action="/syaa/Login" autocomplete="off">
			<input type="text" name="answer" /> <input type="submit" value="ログイン">

		</form>
	</div>
</body>

</html>