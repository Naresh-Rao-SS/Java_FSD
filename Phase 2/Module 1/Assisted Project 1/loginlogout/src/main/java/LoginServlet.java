import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Simulated authentication (replace with actual authentication logic)
        if (username.equals("john") && password.equals("doe")) {
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            response.sendRedirect("welcome");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
