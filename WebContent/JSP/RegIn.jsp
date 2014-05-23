<%@ page contentType="text/html; charset=UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>登録入力画面</title>
</head>
<body>
	　*は必須項目です
	
	<form method ="POST"  action="/syaa/servlet/RegInText">
	<br> 
	*姓：
	<br>
	
	<input type="text" name="lastname"/>
	
	
	<br>
	*名：
	<br>
	<input type="text" name="firstname"/>
	
	<br>
	*フリガナ（姓）：
	<br>
	<input type="text" name="lsubname" value = "aoki"/>
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
	
	一言お願いします：
	<br>
	<input type="text" name="word" />
	<br>
	
	<input type="submit" value="次へ">
	</form>
	
	
</body>
</html>