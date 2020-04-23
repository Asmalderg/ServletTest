package filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebFilter(filterName = "filters.BrowserFilter")
public class BrowserFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest  request  = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;

        String user_agent = request.getHeader("user-agent");

        if (user_agent.contains("Firefox")){
            chain.doFilter(req, resp);
        } else
        try (PrintWriter writer = response.getWriter()) {
            writer.println("Bad browser");
        }


    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("!!!!!!!!! FILTER STARTED");
    }

}
