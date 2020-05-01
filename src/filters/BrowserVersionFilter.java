package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "filters.BrowserVersionFilter")
public class BrowserVersionFilter implements Filter {
    public void destroy() {
        System.out.println("Firefox version checker destroyed");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException {

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        String user_agent = request.getHeader("user-agent");
        if (user_agent.endsWith("68.0")) {
        } else {
            try (PrintWriter writer = response.getWriter()) {
                writer.println("Bad Firefox version");
            } catch (IOException e) {
                throw new IOException("Print writer exception");
            }
        }
    }


    public void init(FilterConfig config) {
        System.out.println("Firefox version checker started");
    }

}
