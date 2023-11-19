import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String productid = request.getParameter("productId");

        String url = "jdbc:mysql://localhost:3306/db3";
        String username = "root";
        String password = "nareshrao";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            pstmt = conn.prepareStatement("SELECT * FROM product WHERE productid = ?");
            pstmt.setString(1, productid);
            rs = pstmt.executeQuery();

            out.println("<html>");
            out.println("<head><title>Product Details</title></head>");
            out.println("<body>");

            if (rs.next()) {
                out.println("<h2>Product Details</h2>");
                out.println("<p>Product ID: " + rs.getString("productid") + "</p>");
                out.println("<p>Product Name: " + rs.getString("productname") + "</p>");
            } else {
                out.println("<h2>Error: Invalid Product ID</h2>");
            }

            out.println("</body>");
            out.println("</html>");

        } catch (ClassNotFoundException | SQLException e) {
            out.println("Error: " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                out.println("Error closing resources: " + e);
            }
        }
    }
}
