<%@ page contentType="text/html; charset=UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>登録入力画面</title>

<style type="text/css">
p.exam1 {color: #ff0000; font-weight:bold}
</style>


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
<br>
	　*は必須項目です
	
	<form method ="POST" enctype = "multipart/form-data" action="/syaa/servlet/RegIn">
	
	<br> 
	*姓：
	<br>
	
	<input type="text" name="lastname"/>
	
	
	<br>
	*名：
	<br>
	<input type="text" name="firstname" />
	
	<br>
	*フリガナ（姓）：
	<br>
	<input type="text" name="lsubname" />
	<br>
	*フリガナ（名）：
	<br>
	<input type="text" name="fsubname" />
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
	<br>
	写真：<br/>
	<input type ="file" name="image"  size="75"/><br/>
	<br>
	<p class="exam1"> ${requestScope['alert1']} </p><br>
	<input type="submit" value="登録">  
	
	<c:forEach var = "errorMessage" items = "${requestScope['list']}">
	    <div>${errorMessage}</div>
	</c:forEach>
	</form>
	
	
</body>
</html>