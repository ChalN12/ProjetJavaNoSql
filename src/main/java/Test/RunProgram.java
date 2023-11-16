package Test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RunProgram")
public class RunProgram extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Appelez la méthode du programme Java
        String output = MainProgram.getOutput();

        // Envoyez la sortie en tant que réponse HTTP
        response.setContentType("text/plain");
        response.getWriter().write(output);
    }
}
