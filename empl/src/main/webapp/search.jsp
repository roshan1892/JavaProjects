<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title> Search Employee </title>
</head>
<body>
 
    <form action="/searchEmployee">
    
    <tr>
         <td>
         <input type="text" placeholder="Search by First Name" name="firstname" required>
         </td>
         
        <td colspan="2">
             <input type="submit"  value="Search Employee">
         </td>
     </tr>
     </form>
          
   
    
     <br>
     <br>
         
           <tr>
                <td></td>
                     <td><a href="index.jsp">Home</a>
                  </td>
           </tr>
       
              
<br>
<br>
<br>

<table border="1">
	<th>ID</th>
	<th>First name</th>
	<th>Last name</th>
	<th>Email</th>
	<th>Address</th>
	<th>Age</th>
	<th>Phone</th>
	<c:forEach items="$employees" var="emp ">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.firstname}</td>
			<td>${emp.lastname}</td>
			<td>${emp.email} </td>
			<td>${emp.address}</td>
			<td>${emp.age} </td>
			<td>${emp.phone}</td>
			
		</tr>
	</c:forEach>
</table>

</body>
</html>