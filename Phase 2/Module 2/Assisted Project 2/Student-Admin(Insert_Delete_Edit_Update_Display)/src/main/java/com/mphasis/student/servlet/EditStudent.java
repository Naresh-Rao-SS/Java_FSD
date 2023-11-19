package com.mphasis.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mphasis.student.dao.StudentDAO_Impl;
import com.mphasis.student.pojo.Student;

/**
 * Servlet implementation class EditStudent
 */
public class EditStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		StudentDAO_Impl dao=new StudentDAO_Impl();
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.print("<form action='EditStudentController' method='post'>");
		pw.print("<input type='hidden' name='id' value="+id+"><br>");
		pw.print("Enter the student name to be edited <input type='text' name='name'>");
		pw.print("<input type='submit' value='edit'>");		
		pw.print("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
