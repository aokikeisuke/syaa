<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索結果</title>
</head>
<body background="data:image/jpeg;base64,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">
<div style="text-align:center">
<header>
<a href="http://localhost:8080/syaa/JSP/Top.jsp"> <br>
<img src="http://www.casleyconsulting.co.jp/wp-content/themes/casleyconsulting/images/header_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>

<form method="POST" action="/syaa/servlet/Personal">

  <c:forEach var="item" items="${requestScope['list']}">
<br>

<table border=1 align="center" bgcolor="white">
<tr>
	<td>名前</td><td>（姓）${item.lastname}</td><td>（名）${item.firstname}</td>
	<td rowspan="4"><img src="http://localhost:8080/syaa/Pic/${item.image}" alt="" width="100" height="100" border="0" /></td>
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

</div>
</body>
</html>