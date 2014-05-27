<%@ page contentType="text/html; charset=UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>登録入力画面</title>
<link rel="stylesheet" href="/syaa/css/text.css" type="text/css"/>
</head>
<body class="background" style="text-align:center">
	<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
	<form method = "POST" enctype = "multipart/form-data" action = "/syaa/servlet/RegInImage">
	<br>
	写真：<br/>
	<input type ="file" name="image"  size="75"/><br/>
	
	<br>
	<input type="submit" value="登録"/><br/>
	${requestScope['alert']}
	</form>
</body>
</html>