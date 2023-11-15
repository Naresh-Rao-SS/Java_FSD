package com.ecommerce.pojo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));

        
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);

        HttpSession session = request.getSession();
        session.setAttribute("product", product);

        request.getRequestDispatcher("ProductInfo.jsp").forward(request, response);
    }
}
