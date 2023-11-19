package com.product;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProductDetails() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");

            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
            Properties props = new Properties();
            props.load(in);

            DBConnection conn = new DBConnection(props.getProperty("url"), props.getProperty("userid"),
                    props.getProperty("password"));

            // Use PreparedStatement for the INSERT operation
            String sql = "INSERT INTO product (product_name, product_price) VALUES (?, ?)";
            try (Connection connection = conn.getConnection();
                 PreparedStatement pstmt = connection.prepareStatement(sql)) {

                // Set values for parameters
                pstmt.setString(1, "HP");
                pstmt.setBigDecimal(2, new BigDecimal(2000.10));

                // Execute the insert statement
                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    out.println("Insertion successful.<br>");
                } else {
                    out.println("Insertion failed.<br>");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                out.println("Error executing INSERT statement.<br>");
            }

            out.println("</body></html>");
            conn.closeConnection();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
