<%--This is the decorating page.--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<c:set value="/resources/js/jquery-3.4.1.js" var="jsJquery"/>
<c:set value="/resources/js/core/main.js" var="jsMain"/>
<c:set var="styleMain" value="/resources/css/ggstyle.min.css" />
<c:set value="/resources/js/core/dialog.js" var="dialogScriptPath"/>

<html>
<head>
    <!--Common imports-->
    <script type="text/javascript" src="${jsJquery}"></script>
    <script type="text/javascript" src="${jsMain}"></script>
    <script type="text/javascript" src="${dialogScriptPath}"></script>

    <link href="${styleMain}" rel="stylesheet"/>
    <title><sitemesh:write property="'title"/></title>
    <sitemesh:write property="head"/>
</head>
<body>
    <div class="sidebar_container">
        <jsp:include page="sidebar-menu.jsp"/>
    </div>
    <div class="body_container">
        <sitemesh:write property="body"/>
    </div>
</body>
</html>


