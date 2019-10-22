<%--@elvariable id="products" type="java.util.List"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title><spring:message key="properties.title"/></title>
</head>
<body>
<h1>
<spring:message key="properties.title"/>
</h1>

<table>
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
