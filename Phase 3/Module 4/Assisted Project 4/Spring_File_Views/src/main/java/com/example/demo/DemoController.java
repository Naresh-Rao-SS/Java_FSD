package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DemoController {
	@RequestMapping("/")
	public ModelAndView defaultpage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dummypage");
		return mv;
	}
	
	@RequestMapping("/view")
	public ModelAndView mainpage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String n = request.getParameter("uname");
		mv.setViewName("displayvaluepage");
		mv.addObject("value", n);
		return mv;
	}
	
}
