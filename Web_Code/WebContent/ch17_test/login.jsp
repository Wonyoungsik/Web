<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 자바스크립트 입력 페이지 연동 -->
<script type="text/javascript" src="login.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>label</title>
</head>
<body>


<form action="/login.jsp" method="post" name ="loginInfo">

<label for="userid">아이디: </label><input type="text" name="id" id="userid"><br>
<label for="userpw">암&nbsp;호 :</label>
<input type="password" name="pwd" id="userpw"><br>
<input type="submit" value="전송" onclick="return check()">


<!-- 
login.jsp에 login.js를 연동하고 label을 이용한 로그인, 비밀번호와 전송 버튼을 만들어 준다.

<label for="userid"> 태그 중에 태그의 id라고 되어있는 태그를 찾아라!..
name은 다른 서블릿페이지가 쓰고 id는 이 페이지에서 쓴다.
실행시키고 이름 문자를 눌러보면 커서가 이름쪽으로 가는 것을 볼 수 있다.

 -->
</form>
</body>
</html>