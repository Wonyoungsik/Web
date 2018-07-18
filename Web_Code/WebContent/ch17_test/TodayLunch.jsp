<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>점심 메뉴</title>
</head>
<body>

<!--점심 메뉴  -->
<h3>오늘 점심은 무엇을 먹을까? (체크박스 - 복수 선택가능)</h3>
<form action="/TodayMenu" method="post">

 <input type="checkbox" name="lunch"  value="떡볶이"/>떡볶이 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->
 <input type="checkbox" name="lunch"  value="돈가스"/>돈가스 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->
 <input type="checkbox" name="lunch"  value="해장국"/>해장국 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->
 <input type="checkbox" name="lunch"  value="육개장"/>육개장 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->
 <input type="checkbox" name="lunch"  value="쌀국수"/>쌀국수 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->

<input type="submit" value="post전송"/> <!-- value에 submitdp 넣을 이름. -->
</form>

<br> <!-- 수평선을 그어준다.. -->
<h3>오늘 점심은 무엇을 먹을까?(체크박스 - 복수 선택 가능)</h3>
<form action="/TodayMenu">
 <input type="checkbox" name="lunch"  value="떡볶이"/>떡볶이 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->
 <input type="checkbox" name="lunch"  value="돈가스"/>돈가스 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->
 <input type="checkbox" name="lunch"  value="해장국"/>해장국 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->
 <input type="checkbox" name="lunch"  value="육개장"/>육개장 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->
 <input type="checkbox" name="lunch"  value="쌀국수"/>쌀국수 <br> <!-- requst에 저장된다. Lunch=떡볶이 -->

<input type="submit" value="get 전송" /> <!-- value에 submit 넣읗 이름. -->



</form>
</body>
</html>