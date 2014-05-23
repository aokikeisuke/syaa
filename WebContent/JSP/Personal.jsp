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

<form method="POST" action="/syaa/JSP/EditText.jsp">
	<c:forEach var="item" items="${requestScope['list']}">
	姓：${item.lastname}<br>
	名：${item.firstname}<br>
	フリガナ（姓）：${item.lsubname}<br>
	フリガナ（名）：${item.fsubname}<br>
	誕生日：${item.birthday}<br>
	最寄り駅：${item.place}<br>
	趣味：${item.hobby}<br>
	写真：<img src="../Pic/${requestScope['image']} " alt="" width="100" height="100" border="0" /><br>
	一言お願いします：<br>
	${item.word}<br>
	
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
	<input type="submit" value="編集">
</form>



</body>