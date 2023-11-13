import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = (String) request.getSession().getAttribute("userName");

        response.getWriter().write("<html><body>");
        response.getWriter().write("<h1>Session Tracking using Cookies</h1>");
        response.getWriter().write("<p>Welcome, " + userName + "!</p>");
        response.getWriter().write("</body></html>");
    }
}
