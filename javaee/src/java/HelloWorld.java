

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {
    private String message;
    private String message2;
    
    //first akan run init dhl,
    public void init() throws ServletException{
    //do required initialization
    message = "Hello World ..";
    message2 = "Java maaa ..";
            //void x return apa2
}
    //second ke doGet
public void doGet(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException
{
    //Set response content type
    response.setContentType("text/html");
    //actual logic goes here
    PrintWriter out = response.getWriter();
    String nama = request.getParameter("nama");
 
     out.println("<h1>" +this.message + nama + "</h1>");
   // out.println("<h1>" +message+"</h1>");
   // out.println("<h1>" +message2+"</h1>");
    //out.println kuar pd browser
    
    
 
 }

public void doPost(HttpServletRequest request, HttpServletResponse response) throws
    ServletException, IOException
{
    String nama = request.getParameter("nama");
    int umur = Integer.parseInt(request.getParameter("umur"));
    //actual logic goes here
    PrintWriter out = response.getWriter();
    out.println("<h1>" + nama + " " + umur + "</h1>");
    }
}
