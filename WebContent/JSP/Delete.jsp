<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>削除画面</title>
<link rel="stylesheet" href="/syaa/css/text.css" type="text/css" />
</head>
<body class="background" style="text-align:center">
<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
<br>
<table border=1 align="center" bgcolor="#fff5ee">
<tr>
	<td>名前</td><td>（姓）${requestScope['lastname']}</td><td>（名）${requestScope['firstname']}</td>
	<td rowspan="4"><img src="/syaa/Pic/${requestScope['image']}" alt="" width="100" height="100" border="0" /></td>
	</tr>
	<tr>
	<td>フリガナ</td><td>（セイ）${requestScope['lsubname']}</td><td>（メイ）${requestScope['fsubname']}</td>
	</tr>
	<tr>
	<td>誕生日</td><td colspan="2">${requestScope['birthday']}</td>
	</tr>
	<tr>
	<td>最寄り駅</td><td colspan="2">${requestScope['place']}</td>
	</tr>
	<tr>
	<td>趣味</td><td colspan="3">${requestScope['hobby']}</td>
	</tr>
	<tr>
	<td>一言お願いします</td><td colspan="3">${requestScope['word']}</td>
	</tr>
</table>
<br>
		データを削除しますか？<br><br>
		<form method="POST" action="/syaa/Delete">
			 <input type="submit" style="WIDTH: 80px; HEIGHT: 25px"value="はい">
			 <input type="hidden" name="id" value="${requestScope['id']}"/>
		</form>
		<br>
		<form method="GET" action="/syaa/servlet/SearchOutPersonal/${requestScope['id']}">
		
			 <input type="submit" style="WIDTH: 80px; HEIGHT: 25px" value="いいえ">
		</form>
</body>

</html>