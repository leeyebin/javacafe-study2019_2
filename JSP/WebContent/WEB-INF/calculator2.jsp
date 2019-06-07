<!-- 페이지 지시자 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>계산기</title>
</head>
<body>
	<h2>JSP 계산기</h2>
	<form action="calculator2" method="get">
		<!-- 표현식 -->
		<input type="text" name="v1" size="4" value="${v1}">
			<select name="op">
				<option value="+" ${selected[0]}>+</option>
				<option value="-" ${selected[1]}>-</option>
				<option value="*" ${selected[2]}>*</option>
				<option value="/" ${selected[3]}>/</option>
			</select>
		<input type="text" name="v2" size="4" value="${v2}">
		<input type="submit" value="="> 
		<input type="text" size="8" value="${result}"><br>
	</form>
</body>
</html>

