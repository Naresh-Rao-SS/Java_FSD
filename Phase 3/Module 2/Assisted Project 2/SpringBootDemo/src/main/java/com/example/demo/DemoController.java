package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class DemoController {

	//response -> 2. physical response 
	@RequestMapping("/")
	public ModelAndView defaultpage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();	
		mv.setViewName("index.jsp");	
		return mv;
		
	}
	
	
	
	@RequestMapping("/sum")
	public ModelAndView displaySum(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		int res= Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
		mv.setViewName("display.jsp");
		mv.addObject("result", res);
		return mv;
		
	}
	
	
	
	@RequestMapping("/sub")
	public ModelAndView displaySub(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv=new ModelAndView();
		int res= Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
		mv.setViewName("display.jsp");
		mv.addObject("value", res);
		return mv;
		
	}
	
}
