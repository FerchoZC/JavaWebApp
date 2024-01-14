package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/ServletFernando")
public class ServletFernando extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>Ejemplo Servlet de Fernando</title></head>");
        out.println("<body>");
        out.println("<h1>Bienvenido al Ejemplo de Fernando!!</h1>");
        out.println("<form action=\"/myServlet2\">");
        out.println("<label for=\"fname\">User name:</label><br>");
        out.println("<input type=\"text\" id=\"fname\" name=\"fname\" value=\"\"><br>");
        out.println("<label for=\"lname\">Password:</label><br>");
        out.println("<input type=\"password\" id=\"lpass\" name=\"lpass\" value=\"\"><br><br>");
        out.println("<input type=\"submit\" value=\"Submit\">");
        out.println("</form> ");
        out.println("<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/action_page.php\".</p>");
        out.println("</body></html>");
    }
}
