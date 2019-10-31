<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <jsp:include page="core/import-include.jsp"/>
    <title>GreenGarments Landing Page</title>
</head>
<body>
<jsp:include page="core/sidebar-menu.jsp"/>
<div class="main_content">
    <div class="main_title">
        <h1><c:out value="GG landing page"/></h1>
    </div>
    <div class="main_body">
        page cont: ${pageContext.request.contextPath}
        <a href="${pageContext.request.contextPath}product/list">click here</a>
    </div>
</div>
</body>
</html>
