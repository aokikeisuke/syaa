<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ログイン画面</title>
<link rel="stylesheet" href="../css/text.css" type="text/css" />
<style type="text/css">
p.exam1 {color: #ff0000; font-weight:bold}
</style>
</head>
<body class="background" style="text-align:center">
<header>
<a href="/syaa/JSP/Login.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png">
</a>
</header>
<br>
		私たちのチームの名前は？<br />
		<form method="POST" action="/syaa/Login" autocomplete="off">
			<input type="text" name="answer" /> <input type="submit" value="ログイン" >
		<p class="exam1"> ${requestScope['loginalert']} </p><br>
		</form>
</body>
</html>