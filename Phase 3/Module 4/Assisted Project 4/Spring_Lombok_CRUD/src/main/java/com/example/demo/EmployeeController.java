package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@RequestMapping("/")
	//alternate of request.getParameter=>@RequestParam("name") String name 
	public ModelAndView defaultPage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}

	@RequestMapping("/insert")
	//alternate of request.getParameter=>@RequestParam("name") String name 
	public ModelAndView insertrecord(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Employee e=new Employee();
		e.setEmpname(request.getParameter("name"));
		e.setEmpphone(request.getParameter("phono"));
		if(service.insert(e)!=null) {
			mv.setViewName("display.jsp");
		}
		return mv;
	}

	@RequestMapping("/getall")
	//alternate of request.getParameter=>@RequestParam("name") String name 
	public ModelAndView getall(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		List<Employee> list=service.getall();
		mv.setViewName("displayall.jsp");
		mv.addObject("list",list);
		return mv;
	}
}
