package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletFernando")
public class ServletFernando extends HttpServlet {

    private String lName;
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        doGet(httpServletRequest,httpServletResponse);

        lName = httpServletRequest.getParameter("nombre");
        System.out.println(lName);

    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        //super.doGet(httpServletRequest, httpServletResponse);
        //doPost(httpServletRequest,httpServletResponse);

        httpServletRequest.setAttribute("nombre2",lName);
        httpServletRequest.getRequestDispatcher("/WEB-INF/paginaDestino.jsp").forward(httpServletRequest,httpServletResponse);
    }
}
