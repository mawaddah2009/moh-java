

<%@page import="models.ProjectModel"%>
<%@page import="controllers.Project"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../include/header.jsp" %>

<a href="/pms/project/form.jsp" class="btn btn-info btn-sm">Tambah</a>
<table class="table table-bordered">
    <tr>
        <td>Bil</td>
        <td>Tajuk</td>
        <td>Keterangan</td>
        <td>Tindakan</td>
    </tr>
    
    <%
        ArrayList list = (ArrayList)request.getAttribute("list");
        for (int i =0; i<list.size(); i++){
            ProjectModel pro = (ProjectModel)list.get(i);
        %>
        <tr>
            <td><%= i+1 %>.</td>
            <td><%= pro.getTitle() %></td>
            <td><%= pro.getDescription() %></td>
            <td>
                <a href="/pms/project?id=<%=pro.getId() %>&action=edit" class="btn btn-success btn-sm">Edit</a>
                  <a href="/pms/project?id=<%=pro.getId() %>&action=delete"  class="btn btn-danger">Delete</a>
            </td>
            
            
        </tr>
        <% } %>

</table>


<%@include file="../include/footer.jsp" %>