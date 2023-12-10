package com.example.demo;

import java.util.List;


public interface StudentService {
	public String AddStudent(Student std);
	public List<Student>  ShowAll();
	public Student SearchStd(int rno);
	public String UpdateStd(Student std);
	public void DeleteStd(int rno);
}

