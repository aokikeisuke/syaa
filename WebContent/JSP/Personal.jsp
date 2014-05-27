<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索結果</title>
<link rel="stylesheet" href="../css/text.css" type="text/css" />
</head>
<body class="background" style="text-align:center">
<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>

<form method="POST" action="/syaa/servlet/Personal">

  <c:forEach var="item" items="${requestScope['list']}">
<br>

<table border=1 align="center" bgcolor="white">
<tr>
	<td>名前</td><td>（姓）${item.lastname}</td><td>（名）${item.firstname}</td>
	<td rowspan="4"><img src="/syaa/Pic/${item.image}" alt="" width="100" height="100" border="0" /></td>
	</tr>
	<tr>
	<td>フリガナ</td><td>（セイ）${item.lsubname}</td><td>（メイ）${item.fsubname}</td>
	</tr>
	<tr>
	<td>誕生日</td><td colspan="2">${item.birthday}</td>
	</tr>
	<tr>
	<td>最寄り駅</td><td colspan="2">${item.place}</td>
	</tr>
	<tr>
	<td>趣味</td><td colspan="3">${item.hobby}</td>
	</tr>
	<tr>
	<td>一言お願いします</td><td colspan="3">${item.word}</td>
	</tr>

</table>
<br>
<!-- 
	姓：${item.lastname}<br>
	名：${item.firstname}<br>
	フリガナ（姓）：${item.lsubname}<br>
	フリガナ（名）：${item.fsubname}<br>
	誕生日：${item.birthday}<br>
	最寄り駅：${item.place}<br>
	趣味：${item.hobby}<br>
	写真：<img src="http://localhost:8080/syaa/Pic/${item.image}" alt="" width="100" height="100" border="0" /><br>
	一言お願いします：<br>
	${item.word}<br>
	 -->
  </c:forEach>
	
	<c:forEach var="item" items="${requestScope['list']}">
	<input type="hidden" name="lastname" value="${item.lastname} "/>
    <input type="hidden" name="firstname" value="${item.firstname}"/>
    <input type="hidden" name="lsubname" value="${item.lsubname}"/>
    <input type="hidden" name="fsubname" value="${item.fsubname}"/>
    <input type="hidden" name="birthday" value="${item.birthday}"/>
    <input type="hidden" name="place" value="${item.place}"/>
    <input type="hidden" name="hobby" value="${item.hobby}"/>
    <input type="hidden" name="image" value="${requestScope['image']}"/>
    <input type="hidden" name="word" value="${item.word}"/>
    <input type="hidden" name="id" value="${item.id}"/>
	
	</c:forEach>
	
<input type="submit" name="choice" value="編集">
<input type="submit" name="choice" value="削除">
</form>

</body>
</html>