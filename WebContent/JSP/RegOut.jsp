<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String lastname = (String)session.getAttribute("lastname");
String firstname = (String)session.getAttribute("firstname");
String lsubname = (String)session.getAttribute("lsubname");
String fsubname = (String)session.getAttribute("fsubname");
String birthday = (String)session.getAttribute("birthday");
String place = (String)session.getAttribute("place");
String hobby = (String)session.getAttribute("hobby");
String picPath = (String)session.getAttribute("picPath");
String word = (String)session.getAttribute("word");
%>


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

<p>
姓:<%=lastname %><br>
名:<%=firstname %><br>
フリガナ（姓）:<%=lsubname %><br>
フリガナ（名）:<%=fsubname %><br>
誕生日:<%=birthday %><br>
最寄り駅:<%=place %><br>
趣味:<%=hobby %><br>
写真:<img src="../Pic/${requestScope['image']} " alt="" width="100" height="100" border="0" /><br>
一言お願いします:<%=word %><br>
</p>
以上の内容で登録しますか？
<br>
<form  method="POST" action="/syaa/servlet/RegOut">
 <!--    <input type="hidden" name="lastname" value="${ requestScope['lastname']} "/>--> 
    <input type="hidden" name="lastname" value="<%=lastname %> "/>
    <input type="hidden" name="firstname" value="<%=firstname %>"/>
    <input type="hidden" name="lsubname" value="<%=lsubname %>"/>
    <input type="hidden" name="fsubname" value="<%=fsubname %>"/>
    <input type="hidden" name="birthday" value="<%=birthday %>"/>
    <input type="hidden" name="place" value="<%=place %>"/>
    <input type="hidden" name="hobby" value="<%=hobby %>"/>
    <input type="hidden" name="image" value="${requestScope['image']}"/>
    <input type="hidden" name="word" value="<%=word %>"/>
    
	<input type="submit" name="yesno" value="はい"/>
	
	<input type="submit" name="yesno" value="いいえ"/>
	
	
	</form>


</body>
</html>


