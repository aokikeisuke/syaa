<%@ page contentType="text/html; charset=UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>編集画面</title>
</head>
<body>
<div style="text-align:center">
	<header>
<a href="http://localhost:8080/syaa/JSP/Top.jsp"> <br>
<img src="http://www.casleyconsulting.co.jp/wp-content/themes/casleyconsulting/images/header_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
</div>
	<form method = "POST" enctype = "multipart/form-data" action = "/syaa/servlet/EditImage">
	写真：<br>
	
	<input type ="file" name="image"  size="75">
	
	<br>
	
	
	<input type="submit" value="編集">
	</form>
	
	
</body>
</html>