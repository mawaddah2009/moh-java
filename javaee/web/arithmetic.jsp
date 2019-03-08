<%-- 
    Document   : arithmetic
    Created on : Mar 7, 2019, 2:53:19 AM
    Author     : Nita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Hello World!</h1>
        2 + 2 = ${2+2}
        <hr>
        <h1>Scriplet</h1>
        <% 
            String name = "NIETA";            
            out.println(name);
            out.print(cetak(5));
        //out.println("Your ip address is" + request.getRemoteAddr());
        %>
        <%! 
            public String cetak(int bil){
                String str = "";
                for(int i = 0; i<bil; i++){
                str += i + "--";
            }
                  return str;
}
        %>
        <hr>
        <h1>JSP Expression</h1>
         Tarikh hari ini ialah <%= new java.util.Date()%>
         <hr>
         
         <h1>JSP Directive</h1>
         <%@include file="form.html" %>
         <hr>
</body>      
    
</html>
