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
	<input type="text" name="lastname" required/>
	
	<br>
	*名：
	<br>
	<input type="text" name="firstname" required="required" />
	
	<br>
	*フリガナ（姓）：
	<br>
	<input type="text" name="sublastname" required="required"/>
	<br>
	*フリガナ（名）：
	<br>
	<input type="text" name="subfirstname" required="required"/>
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
	<input type ="file" name="picture" size="75">
	</form>
	<br>
	一言お願いします：
	<br>
	<input type="text" name="word" />
	<br>
	<form method="POST" action="/syaa/RegOut3">
	<input type="submit" value="登録">
	</form>

<% 
session.setAttribute("lastname", request.getParameter("lastname"));
session.setAttribute("firstname", request.getParameter("firstname"));
session.setAttribute("sublastname", request.getParameter("sublastname"));
session.setAttribute("subfirstname", request.getParameter("subfirstname"));
session.setAttribute("birthday", request.getParameter("birthday"));
session.setAttribute("place", request.getParameter("place"));
session.setAttribute("hobby", request.getParameter("hobby"));
session.setAttribute("picture", request.getParameter("picture"));
session.setAttribute("word", request.getParameter("word"));
%>
	
	
</body>
</html>