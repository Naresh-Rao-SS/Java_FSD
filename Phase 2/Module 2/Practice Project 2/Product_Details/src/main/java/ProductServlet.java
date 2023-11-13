import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/ProductServlet")

public class ProductServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String productId = request.getParameter("productId");

        String url = "jdbc:mysql://localhost:3306/ecommerce";
        String username = "root";
        String password = "N@re$H7-*#&7";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM product WHERE product_id = " + productId;
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                out.println("<h2>Product Details</h2>");
                out.println("<p>Product ID: " + rs.getString("product_id") + "</p>");
                out.println("<p>Product Name: " + rs.getString("product_name") + "</p>");
                out.println("<p>Product Price: " + rs.getString("product_price") + "</p>");
            } else {
                out.println("<h2>Error: Invalid Product ID</h2>");
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            out.println("Error: " + e);
        }

        out.close();
    }
}