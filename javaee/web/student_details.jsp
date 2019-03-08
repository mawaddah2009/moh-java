<%-- 
    Document   : student_details
    Created on : Mar 7, 2019, 3:47:02 AM
    Author     : nita
--%>

<%@page import="model.StudentModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            StudentModel stud = (StudentModel) request.getAttribute("stud");
            out.print(stud.name);
            out.print("<br>");
            out.print(stud.id);
        %>
        <h1>Student Details</h1>
        <br>
       
      
    </body>
</html>
