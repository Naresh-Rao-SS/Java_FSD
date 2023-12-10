package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	String query1="select s from Student s join s.courses sc join sc.teachers";
	@Query(query1)
	public List<Student> getalldetails();
	
	//i need a teacher name of a student 
	String query2="select sct.name from Student s join s.courses sc join sc.teachers sct where s.name=?1";
	@Query(query2)
	public List<String> getteachername(String name);
   //name of the teacher of a student whose course is java
	String query3="select sct.name from Student s join s.courses sc join sc.teachers sct where s.name=?1 and sc.name='java'";
	@Query(query3)
	public List<String> getteachernameOfjava(String name);
	//student courses??
}
