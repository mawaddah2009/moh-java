package controllers;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.ProjectModel;

@WebServlet(urlPatterns = {"/project"})
public class Project extends HttpServlet {

  

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action != null){
            int id = Integer.parseInt(request.getParameter("id"));
            ProjectModel pro = new ProjectModel();
            if(action.equals("edit")) {
                //show form with original data -edit dia kan pggil form.jsp
                pro = pro.getOne(id);
                request.setAttribute("project", pro);
                request.getRequestDispatcher("project/form.jsp").forward(request, response);
            }else if(action.equals("delete")){
                pro.delete(id);
            }
            
        }
        //ArrayList List = new models.ProjectModel().getAll();
        //teknik ini tak perlu import class kat atas
        ArrayList list = new ProjectModel().getAll();
        //yg atasni kena import models.ProjectModel kat atas
        request.setAttribute("list", list);
        request.getRequestDispatcher("project/list.jsp").forward(request, response);
       
    }
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        //kena baca id jenis string
       
        String id = request.getParameter("id");
        ProjectModel pro = new ProjectModel();
        pro.setTitle(title);
        pro.setDescription(description);
        if(id.equals("0")){
        //insert
        pro.insert();
        }else{
            int id2 = Integer.parseInt(id);
            pro.update(id2);
        }
        //request.getRequestDispatcher("project/list.jsp").forward(request, response);
        response.sendRedirect("project");
    }
}

    