package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello from servlet. Post Method");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.getWriter().write("Hello from servlet. Get method");
//        request.getServletContext().getRequestDispatcher(request.getContextPath()+"/index.jsp").forward(request, response);
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/index.jsp");
//      System.out.println("Get method");
        dispatcher.forward(request, response);

//        RequestDispatcher requestDispatcher = request.getRequestDispatcher(request.getContextPath()+"/index.jsp");
//        requestDispatcher.forward(request, response);
    }
}
