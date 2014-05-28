<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<%-- 
String image =" ../Pic/${requestScope['image']} ";

String lastname = request.getParameter("lastname");
session.setAttribute("lastname", lastname);
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>登録確認画面</title>
<link rel="stylesheet" href="/syaa/css/text.css" type="text/css" />
</head>
<body class="background" style="text-align:center">
<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png">
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
以上の内容で登録しますか？
<br><br>
<form  method="POST" action="/syaa/servlet/RegOut">
 <!--    <input type="hidden" name="lastname" value="${ requestScope['lastname']} "/> --> 
    <input type="hidden" name="lastname" value="${requestScope['lastname']}"/>
    <input type="hidden" name="firstname" value="${requestScope['firstname']}"/>
    <input type="hidden" name="lsubname" value="${requestScope['lsubname']}"/>
    <input type="hidden" name="fsubname" value="${requestScope['fsubname']}"/>
    <input type="hidden" name="birthday" value="${requestScope['birthday']}"/>
    <input type="hidden" name="place" value="${requestScope['place']}"/>
    <input type="hidden" name="hobby" value="${requestScope['hobby']}"/>
    <input type="hidden" name="image" value="${requestScope['image']}"/>
    <input type="hidden" name="word" value="${requestScope['word']}"/>
    
	<input type="submit" name="yesno" value="はい"/>
	
	<input type="submit" name="yesno" value="いいえ"/>
	
	
	</form>


</body>
</html>


