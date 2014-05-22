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
String image = (String)session.getAttribute("image");
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
写真:<img src="../Pic/${requestScope['name']} " alt="" width="100" height="100" border="0" /><br>
一言お願いします:<%=word %><br>
</p>

<form  method="POST" action="/syaa/servlet/RegOut">
    <input type="hidden" name="lastname" value="${ requestScope['lastname']} "/>
    <input type="hidden" name="firstname" value="<%=firstname %>"/>
    <input type="hidden" name="lsubtname" value="<%=lsubtname %>"/>
    <input type="hidden" name="fsubtname" value="<%=fsubtname %>"/>
    <input type="hidden" name="birthday" value="<%=birthday %>"/>
    <input type="hidden" name="place" value="<%=place %>"/>
    <input type="hidden" name="hobby" value="<%=hobby %>"/>
    <input type="hidden" name="image" value="<%=image %>"/>
    <input type="hidden" name="word" value="<%=word %>"/>
    
	<input type="submit" name="yesno" value="はい"/>
	<input type="submit" name="yesno" value="いいえ"/>
	
</form>


</body>
</html>


