package com.mphasis.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.mphasis.student.pojo.Student;

public class DisplayStudent {

	public static void displayStudents(List<Student> list,HttpServletResponse response) throws IOException {
		PrintWriter pw=response.getWriter();
		pw.print("<a href='index.html'>Add a student click here ..!</a>");
		pw.print("<h1><i>Students Record</i></h1>");
		pw.print("<table border='1'>")	;
		pw.print("<tr><th>Student Identifier</th><th>Student Name</th><th>Student Email</th><th>Edit Student Name</th><th>Delete Student</th></tr>");

		for(Student student:list) {

			pw.print("<tr><td>"+student.getSid()+"</td>"+"<td>"+student.getSname()+"</td>"+"<td>"+student.getSemail()
			+"</td>"+"<td><a href='./EditStudent?id="+student.getSid()+"'>Edit By Name</a></td>"+"<td><a href='./DeleteStudent?id="+student.getSid()+"'>Delete record</a></td></tr>");	

		}
		pw.print("</table>");	
	}

}
