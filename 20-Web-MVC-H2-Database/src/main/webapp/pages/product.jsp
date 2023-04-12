<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" 
 integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
<div class ="container">

<a href="/">Add new Product</a>

<h1>Get All Product</h1>
<hr/>

      <table border: 1px solid black>
            <thead>
                 <tr> 
                 <th>S.No</th>
                 <th>Name</th>
                 <th>Price</th>
                 <th>Quantity</th>

                </tr>

          </thead>
            <tbody>
            
            <c:forEach items="${allProduct}" var="all" varStatus ="index" >
            <tr>
               <td>${index.count}</td>
               <td>${all.name}</td>
               <td>${all.price}</td>
               <td>${all.quantity}</td>
               
            </tr>
            </c:forEach>
            
            </tbody>

      </table>

</div>






 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" 
 integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" 
 crossorigin="anonymous"></script>
</body>
</html>