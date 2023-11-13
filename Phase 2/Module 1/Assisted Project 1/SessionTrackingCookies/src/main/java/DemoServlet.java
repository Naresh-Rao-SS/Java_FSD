import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        HttpSession session = request.getSession(true);
        session.setAttribute("userName", userName);

        Cookie cookie = new Cookie("userName", userName);
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        response.sendRedirect("DisplayServlet");
    }
}
