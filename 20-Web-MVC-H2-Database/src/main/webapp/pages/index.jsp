<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product save Form</h1>
<p>
<font color='green'>${msg}</font>
</p>

<form:form action="save" modelAttribute="product" method ="POST">

    <table>
       <tr>
       <td>Name</td>
       <td><form:input path="name"/></td>
       </tr>
       
        <tr>
       <td>Price</td>
       <td><form:input path="price"/></td>
       </tr>
       
        <tr>
       <td>Quantity</td>
       <td><form:input path="quantity"/></td>
       </tr>
       
       <tr>
       <td></td>
       <td><input type="submit" value ="save"></td>
       <td><input type="reset" value ="reset"></td>
       </tr>
    
    </table>
    
</form:form>
<hr>
<a href="http://localhost:9091/getAll" >GetAllProduct</a>

</body>
</html>