<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="/resources/js/jquery-3.4.1.js" var="jsJquery"/>
<c:set value="/resources/js/core/main.js" var="jsMain"/>
<c:set var="styleMain" value="/resources/css/ggstyle.min.css" />
<c:set value="/resources/js/core/dialog.js" var="dialogScriptPath"/>

<script type="text/javascript" src="${jsJquery}"></script>
<script type="text/javascript" src="${jsMain}"></script>
<script type="text/javascript" src="${dialogScriptPath}"></script>
<link href="${styleMain}" rel="stylesheet"/>