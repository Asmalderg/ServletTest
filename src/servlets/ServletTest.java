package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletTest")
public class ServletTest extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.getWriter().write("Hello from servlet");
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.getWriter().write("Hello from servlet");
//    }

    public void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        super.service(req, resp);
//        int first = Integer.parseInt(req.getParameter("num1"));
//        int second = Integer.parseInt(req.getParameter("num2"));
//        System.out.println(first+second);
//        resp.getWriter().write("result is: " + (first+second));
        req.setAttribute("T", "Hello from attribute");
//        req.setAttribute("num1", "Hello from attribute");
        RequestDispatcher rd = req.getRequestDispatcher("simple");
        rd.forward(req, resp);

    }
}
