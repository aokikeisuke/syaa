<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索結果</title>
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
<form method="POST" action="/syaa/servlet/Personal">

  <c:forEach var="item" items="${requestScope['list']}">

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
  </c:forEach>
	
	<c:forEach var="item" items="${requestScope['list']}">
	<input type="hidden" name="lastname" value="${item.lastname} "/>
    <input type="hidden" name="firstname" value="${item.firstname}"/>
    <input type="hidden" name="lsubname" value="${item.lsubname}<"/>
    <input type="hidden" name="fsubname" value="${item.fsubname}"/>
    <input type="hidden" name="birthday" value="${item.birthday}"/>
    <input type="hidden" name="place" value="${item.place}"/>
    <input type="hidden" name="hobby" value="${item.hobby}"/>
    <input type="hidden" name="image" value="${requestScope['image']}"/>
    <input type="hidden" name="word" value="${item.word}"/>
	
	</c:forEach>
	
<input type="submit" name="choice" value="編集">
<input type="submit" name="choice" value="削除">
</form>


</body>
</html>