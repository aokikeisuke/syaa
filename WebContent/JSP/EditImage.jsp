<%@ page contentType="text/html; charset=UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>編集画面</title>
</head>
<body>
	
	<form method = "POST" enctype = "multipart/form-data" action = "/syaa/servlet/EditImage">
	写真：<br>
	
	<input type ="file" name="image"  size="75">
	
	<br>
	
	
	<input type="submit" value="編集">
	</form>
	
	
</body>
</html>