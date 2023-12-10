package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Autowired
	StudentRepo repo;

@PostMapping("/insert")
public Student insert(@RequestBody Student s) {
	return repo.save(s);
}

@GetMapping("/getall")
public List<Student> getall(){
	return repo.findAll();
}

@GetMapping("/getallbyjoin")
public List<Student> getalljoin(){
	return repo.getalldetails();
}
	
@GetMapping("/getteacher/{name}")
public List<String> getTeacher( @PathVariable("name") String name){
	return repo.getteachername(name);
}

@GetMapping("/getteacherbyjava/{name}")
public List<String> getTeacherbyjava( @PathVariable("name") String name){
	return repo.getteachernameOfjava(name);
}
}
