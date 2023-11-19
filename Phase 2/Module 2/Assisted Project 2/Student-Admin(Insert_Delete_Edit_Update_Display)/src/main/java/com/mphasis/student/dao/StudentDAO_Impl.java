package com.mphasis.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mphasis.student.dbutil.DbUtil;
import com.mphasis.student.pojo.Student;

//Note :create an interface 
public class StudentDAO_Impl {

	//insert
	public int insert(Student student) throws ClassNotFoundException, SQLException {
		Connection conn=DbUtil.dbConn();
		if(conn!=null) {
			System.out.println("connection established with dB..!");
		}
		String sql ="insert into student values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,student.getSid());
		ps.setString(2, student.getSname());
		ps.setString(3, student.getSemail());
		return ps.executeUpdate();	
	}
	
	
	//retrieve the data 
	public List<Student> displayallStudents() throws ClassNotFoundException, SQLException{
		Connection conn=DbUtil.dbConn();
		if(conn!=null) {
			System.out.println("connection established with dB..!");
		}
		String sql="select * from student";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		List<Student> list=new ArrayList();
		
		while(rs.next()) {
			Student student=new Student();
			student.setSid(rs.getString("sid"));
			student.setSname(rs.getString("sname"));
			student.setSemail(rs.getString("semail"));
			list.add(student);	
		}
		return list;
	}
	
	//delete
	public List<Student> deleteStudent(String id) throws ClassNotFoundException, SQLException{
		Connection conn=DbUtil.dbConn();
		if(conn!=null) {
			System.out.println("connection established with dB..!");
		}
		String sql="delete from student where sid=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,id);
		ps.executeUpdate();
		return displayallStudents();
	}
	
	//update 
	public List<Student> updateStudent(String id,String name) throws ClassNotFoundException, SQLException{
		Connection conn=DbUtil.dbConn();
		if(conn!=null) {
			System.out.println("connection established with dB..!");
		}
		String sql="update student set sname=? where sid=?";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1,name );
		ps.setString(2, id);
		ps.executeUpdate();
		return displayallStudents();
	}
	}
