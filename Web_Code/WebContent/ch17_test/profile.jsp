<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 자바스크립트 페이지 연동하기! -->
<script type="text/javascript" src="Profile.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- get방식 -->
<form action="/Profile" method="post" name="frm">

아이디 : <input type="text" name="id"> <br>
나&nbsp;&nbsp;&nbsp;&nbsp;이 : <input type="text" name="age"> <br><!-- &nbsp;빈 공간 -->
<input type="submit" value="전송" onclick="return check()">

</form>

</body>
</html>