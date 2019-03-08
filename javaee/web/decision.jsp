<%
    int day= 7;
%>

<html>
    <head>
        <title>IF...........ELSE Example </title>
    </head>
    <body>
        <%if (day == 1 | day == 7) { %>
        <p>Today is weekend</p>
        <% } else  { %>
       <!--selain 1 dgn 7 akan print kerja-->
        <p> Hari ni kerja la......</p>
        <% } %>
    </body>
</html>
