import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/DemoServlet")
public class servlet extends HttpServlet implements javax.servlet.Servlet {
    private static final long serialVersionUID = 1L;

    public servlet() {
        super();
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Demo of Servlet Classes and Interfaces.");
    }
}
