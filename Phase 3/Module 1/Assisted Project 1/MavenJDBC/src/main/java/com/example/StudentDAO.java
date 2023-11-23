package com.example;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;


public class StudentDAO {
	private JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}

	public int insert(Student sobj) {
		String sql="insert into student values("+sobj.getId()+",'"+sobj.getName()+"','"+sobj.getEmail()+"')"; 
		return temp.update(sql);

	}

	// Update operation in StudentDAO

	public int update(Student sobj) {
		String sql = "update student set sname=?, semail=? where sid=?";
		return temp.update(sql, sobj.getName(), sobj.getEmail(), sobj.getId());
	}	
	// Delete operation in StudentDAO

	public int delete(int studentId) {
		String sql = "delete from student where sid=?";
		return temp.update(sql, studentId);
	}

	// Display all operation in StudentDAO

	public List<Student> displayAll() {
		String sql = "select * from student";
		return temp.query(sql, new BeanPropertyRowMapper<>(Student.class));
	}
}

