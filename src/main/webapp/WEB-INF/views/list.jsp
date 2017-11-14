<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css" />">
<script src="<c:url value="/resources/js/jquery-3.2.1.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<title>Insert title here</title>
<link rel="shortcut icon" href="/favicon.ico" />

</head>
<body>
	Natural Language Understanding 분석결과
	<br />
	<table border="1">
		<tr>
			<th>no</th>
			<th>statement</th>
			<th>anger</th>
			<th>disgust</th>
			<th>fearr</th>
			<th>joy</th>
			<th>sadness</th>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.no}</td>
				<td>${vo.statement}</td>
				<td>${vo.anger}</td>
				<td>${vo.disgust}</td>
				<td>${vo.fear}</td>
				<td>${vo.joy}</td>
				<td>${vo.sadness}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="nluForm">입력폼</a>
</body>
</html>