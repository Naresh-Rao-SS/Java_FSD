package mphasishibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Table(name="employeemain")
public class Employee {
@Id
	private int id;
//@Column(name="ename")
	private String name;
	private String Email;
	private double salary;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
