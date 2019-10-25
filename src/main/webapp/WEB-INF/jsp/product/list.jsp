<%--@elvariable id="products" type="java.util.List"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<c:set var="styleMain" value="/resources/scss/core/main.scss" />
<html>
<head>
    <link href="${styleMain}" rel="stylesheet"/>
    <title><spring:message key="properties.title"/></title>
</head>
<body>
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
                ${product}
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
