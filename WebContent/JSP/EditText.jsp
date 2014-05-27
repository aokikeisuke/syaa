<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>編集画面</title>
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
		<form method="POST" enctype = "multipart/form-data" action="/syaa/servlet/EditText">
		
		<br>
			　*は必須項目です <br> 
			<br>
			*姓：<br>
			<input type="text" name="lastname" value="${requestScope['lastname']}"/>
			<br> 
			*名：<br> 
			<input type="text" name="firstname" value="${requestScope['firstname']}"/> <br>
			*フリガナ（姓）：<br> 
			<input type="text" name="lsubname" value="${requestScope['lsubname']}"/> <br>
			*フリガナ（名）：<br> 
			<input type="text" name="fsubname" value="${requestScope['fsubname']}"/> <br>
			生年月日：<br> 
			<input type="date" name="birthday" value="${requestScope['birthday']}"/> <br>
			最寄り駅： <br> 
			<input type="text" name="place" value="${requestScope['place']}"/> <br> 
			趣味： <br>
			<input type="text" name="hobby" value="${requestScope['hobby']}"/> <br> 
			一言お願いします： <br>
			<input type="text" name="word"  value="${requestScope['word']}"/> <br> <br>
			写真：<br>
	        <input type ="file" name="image"  size="75">
	        
			<input type="hidden" name="id" value="${requestScope['id']}"/>
			
			<p class="exam1"> ${requestScope['alert1']} </p><br>
			<input type="submit" value="編集"> 
			
			<c:forEach var = "errorMessage" items = "${requestScope['list']}">
	    <div>${errorMessage}</div>
	        </c:forEach>
	        
		</form>
</body>

</html>