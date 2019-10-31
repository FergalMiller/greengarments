<%--@elvariable id="include" type="java.lang.String"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<c:set value="${pageContext.request.contextPath}/product/list" var="productLink"/>
<c:set value="${pageContext.request.contextPath}/outlet/list" var="outletLink"/>
<c:set value="${pageContext.request.contextPath}/employee/list" var="employeeLink"/>
<c:set value="/resources/static/logo.png" var="staticLogo"/>

<div class="sidebar_menu">
    <button class="sidebar_toggle_button" onclick="toggleSidebarMenu()">☰ Hide menu</button>
    <div class="sidebar_link_container">
        <ul class="sidebar_link_list">
            <li class="sidebar_link"><a href="${productLink}">Product management</a></li>
            <li class="sidebar_link"><a href="${outletLink}">Outlet management</a></li>
            <li class="sidebar_link"><a href="${employeeLink}">Employee management</a></li>
        </ul>
    </div>
    <div class="sidebar_logo_container">
        <a href="${pageContext.request.contextPath}/">
            <img src="${staticLogo}" alt="GG Logo" class="sidebar_logo_image"/>
        </a>
    </div>
</div>
