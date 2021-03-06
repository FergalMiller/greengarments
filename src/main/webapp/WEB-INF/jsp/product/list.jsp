<%--@elvariable id="products" type="java.util.List"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<c:set var="creationFormLink" value="creation-form"/>

<html>
<head>
    <title><spring:message key="products.title"/></title>
</head>
<body>
<div class="main_content">
    <h1>
        <spring:message key="products.title"/>
    </h1>

    <table class="control_bar">
        <tr>
            <td>
                <button onclick="openDialog('${creationFormLink}')">
                    Open creation form dialog
                </button>
            </td>
        </tr>
    </table>

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
