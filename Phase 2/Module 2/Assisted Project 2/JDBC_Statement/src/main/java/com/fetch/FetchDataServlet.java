package com.fetch;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class FetchDataServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		Properties props = new Properties();
		resp.setContentType("text/html");
		InputStream in = getServletContext().getResourceAsStream("/WEB-INF/dbinfo.properties");
		props.load(in);

		Connection con = DBConfig.getConnection(props);

		if (con != null) {

			out.println("Connection is  Established");
			out.println("<br>");

			try {

				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from product");

				while (rs.next()) {
					out.println("ID: " + rs.getInt("pid") + ", Name: " + rs.getString("pname"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {

			out.print("Error While Connecting Connections");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
