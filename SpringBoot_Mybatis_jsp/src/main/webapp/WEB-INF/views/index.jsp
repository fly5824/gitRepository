<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/test.css">
</head>
<body>

<h1>index page</h1>
<h1>${message}</h1>
<img alt="" src="./images/2.jpg">
<img alt="" src="${pageContext.request.contextPath}/images/3.jpg">
</body>
</html>