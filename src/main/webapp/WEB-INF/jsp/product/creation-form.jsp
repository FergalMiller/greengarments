<%--@elvariable id="sizes" type="java.util.List"--%>
<%--@elvariable id="categories" type="java.util.List"--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set value="/resources/js/jquery-3.4.1.js" var="jqueryPath"/>
<c:set value="/resources/scss/core/main.scss" var="stylePath"/>
<c:set value="/resources/js/core/form.js" var="formPath"/>
<c:set value="/resources/js/product/creation-form.js" var="productCreationFormPath"/>

<script type="text/javascript" src="${jqueryPath}"></script>
<script type="text/javascript" src="${formPath}"></script>
<script type="text/javascript" src="${productCreationFormPath}"></script>
<link href="${stylePath}" rel="stylesheet"/>

<div class="creation_form_container">
<form id="productCreationForm" method="POST" onsubmit="return false">

    <div class="creation_form_table_container">
    <table class="creation_form_table">
        <thead>
            <tr>
                <th>Key</th>
                <th>Value</th>
            </tr>
        </thead>

        <tr>
            <td><label id="serialNoLabel" for="serialNo">Serial Number</label></td>
            <td>
                <input id="serialNo" name="serialNo">
            </td>
        </tr>
        <tr>
            <td><label id="brandLabel" for="brand">Brand</label></td>
            <td>
                <input id="brand" name="brand">
            </td>
        </tr>
        <tr>
            <td><label id="productNameLabel" for="productName">Name:</label></td>
            <td>
                <input id="productName" name="productName">
            </td>
        </tr>
        <tr>
            <td><label id="sizeLabel" for="size">Size</label></td>
            <td>
                <select id="size" name="size">
                    <option value="${null}">Please select</option>
                    <c:forEach var="size" items="${sizes}">
                        <%--@elvariable id="size" type="com.fergalmiller.greengarments.model.product.size.Size"--%>
                        <option value="${size}">${size.formattedName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td><label id="categoryLabel" for="category">Category</label></td>
            <td>
                <select id="category" name="category">
                    <option value="${null}">Please select</option>
                    <c:forEach var="category" items="${categories}">
                        <%--@elvariable id="category" type="com.fergalmiller.greengarments.model.product.category.Category"--%>
                        <option value="${category}">${category.formattedName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td><label id="subcategoryLabel" for="subcategory">Subcategory</label></td>
            <td>
                <select id="subcategory" name="subcategory">
                    <option value="${null}">Please select</option>
                    <c:forEach var="category" items="${categories}">
                        <%--@elvariable id="category" type="com.fergalmiller.greengarments.model.product.category.Category"--%>
                        <optgroup label="${category.formattedName}">
                            <c:forEach var="subcategory" items="${category.subcategories}">
                                <option value="${subcategory}">${subcategory}</option>
                            </c:forEach>
                        </optgroup>
                    </c:forEach>
                </select>
            </td>
        </tr>
    </table>
    </div>
    <div class="creation_form_button_container">
    <button type="submit">Submit form</button>
    </div>
</form>
</div>