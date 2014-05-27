<%@ page contentType="text/html; charset=UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>編集画面</title>
<link rel="stylesheet" href="../css/text.css" type="text/css" />
</head>
<body class="background" style="text-align:center">
	<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png">
</a>
</header>
	<form method = "POST" enctype = "multipart/form-data" action = "/syaa/servlet/EditImage">
	写真：<br>
	
	<input type ="file" name="image"  size="75">
	
	<br>
	
	
	<input type="submit" value="編集">
	</form>
	
	
</body>
</html>