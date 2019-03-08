import model.StudentModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.StudentModel;

@WebServlet(urlPatterns = {"/student"})
public class StudentController extends HttpServlet {
    // http://localhost:9999/javaee/student?nama=azman
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html"); // application/json
        PrintWriter out = response.getWriter();
        int studId = Integer.parseInt(request.getParameter("id"));
        StudentModel stud = new StudentModel().getOne(studId);
        request.setAttribute("studId", stud);
        RequestDispatcher dispatch = request.getRequestDispatcher("student_details.jsp");
        request.setAttribute("stud", stud);
        dispatch.forward(request, response);
    }
}