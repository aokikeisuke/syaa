<%@ page contentType="text/html; charset=UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>登録入力画面</title>
</head>
<body>
	
	<form method = "POST" enctype = "multipart/form-data" action = "/syaa/servlet/RegInImage">
	写真：
	
	<input type ="file" name="image"  size="75">
	
	<br>
	
	
	<input type="submit" value="登録">
	</form>
	
	
</body>
</html>