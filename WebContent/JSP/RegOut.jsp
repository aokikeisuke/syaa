<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
String lastname = (String)session.getAttribute("lastname");
String firstname = (String)session.getAttribute("firstname");
String lsubtname = (String)session.getAttribute("lsubname");
String fsubtname = (String)session.getAttribute("fsubname");
String birthday = (String)session.getAttribute("birthday");
String place = (String)session.getAttribute("place");
String hobby = (String)session.getAttribute("hobby");
String imag = (String)session.getAttribute("imag");
String word = (String)session.getAttribute("word");
%>
<%-- 
String lastname = request.getParameter("lastname");
session.setAttribute("lastname", lastname);
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>登録確認画面</title>
</head>
<body>
<p>
姓:<%=lastname %><br>
名:<%=firstname %><br>
フリガナ（姓）:<%=lsubtname %><br>
フリガナ（名）:<%=fsubtname %><br>
誕生日:<%=birthday %><br>
最寄り駅:<%=place %><br>
趣味:<%=hobby %><br>
写真:<%=imag %><br>
一言お願いします:<%=word %><br>
</p>

<form  method="POST" action="/syaa/servlet/RegOut">
	<input type="submit" name="yesno" value="はい"/>
	<input type="submit" name="yesno" value="いいえ"/>
</form>


</body>
</html>


