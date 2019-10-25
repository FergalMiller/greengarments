<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <jsp:include page="import-include.jsp"/>
    <title>Welcome page</title>
</head>
<body>
<jsp:include page="sidebar-menu.jsp"/>
<div class="main_content">
    Welcome
    page cont: ${pageContext.request.contextPath}
    <a href="${pageContext.request.contextPath}product/list">click here</a>
</div>
</body>
</html>
