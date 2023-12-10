package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;
@Entity
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;

@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="course_teacher",
                //join column represents the current pojo 
joinColumns = {@JoinColumn(name="cid",referencedColumnName ="id")},
//inverse column refer to the other pojo 
inverseJoinColumns ={@JoinColumn(name="tid",referencedColumnName = "id")}
		)
private List<Teacher> teachers;
}
