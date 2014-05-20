<%@ page contentType="text/html; charset=UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>シャアタイトル</title>
</head>
<body>
	*は必須項目です
	<br> 
	*姓：
	<br>
	<input type="text" name="lasttname"/>
	
	<br>
	*名：
	<br>
	<input type="text" name="firstname"/>
	
	<br>
	*フリガナ（姓）：
	<br>
	<input type="text" name="lsubname"/>
	<br>
	*フリガナ（名）：
	<br>
	<input type="text" name="fsubname"/>
	<br>
	生年月日：
	<br>
	<input type="date" name="birthday" />
	<br>
	最寄り駅：
	<br>
	<input type="text" name="place" />
	<br>
	趣味：
	<br>
	<input type="text" name="hobby" />
	<br>
	写真：
	<form method ="POST" enctype="multipart/form-data">
	<input type ="file" name="image" size="75">
	</form>
	<br>
	一言お願いします：
	<br>
	<input type="text" name="word" />
	<br>
	<form method="POST" action="/syaa/servlet/RegOut">
	<input type="submit" value="登録">
	</form>
	
	
</body>
</html>