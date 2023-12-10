package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo  sr;
	
	@Override
	public String AddStudent(Student std) {
		String res = "err";
		
		Student s = sr.save(std);
		if(s!=null)
			res = "Success";
		
		return res;
	}

	@Override
	public List<Student> ShowAll() {
		return sr.findAll();
	}

	@Override
	public Student SearchStd(int rno) {
		Optional<Student> std = sr.findById(rno);
		if(std.isPresent())
			return std.get();
		return null;
	}

	@Override
	public String UpdateStd(Student std) {
		String res = "err";
		Student s = sr.saveAndFlush(std);
		if(s!=null)
			res = "Success";
		return res;
	}

	@Override
	public void DeleteStd(int rno) {
		sr.deleteById(rno);
	}
}
