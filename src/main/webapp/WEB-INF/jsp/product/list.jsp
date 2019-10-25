<%--@elvariable id="products" type="java.util.List"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head>
    <jsp:include page="../import-include.jsp"/>
    <title><spring:message key="properties.title"/></title>
</head>
<body>
<jsp:include page="../sidebar-menu.jsp"/>
<div class="main_content">
    <h1>
        <spring:message key="properties.title"/>
    </h1>

    <table class="entity_list_table">
        <c:forEach var="product" items="${products}">
            <%--@elvariable id="product" type="com.fergalmiller.greengarments.model.product.Product"--%>
            <tr>
                <td>
                        ${product.serialNo}
                </td>
                <td>
                        ${product.brand}
                </td>
                <td>
                        ${product.productName}
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
