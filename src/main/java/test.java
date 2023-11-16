// fichier acheter.java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class test extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        String article = request.getParameter("article");
        out.println("Vous avez acheté: " + article);
    }
}
