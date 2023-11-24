package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("/login") public String show(HttpServletRequest request,
	 * HttpServletResponse response) { String user = request.getParameter("uname");
	 * String password = request.getParameter("pass"); if (user.equals(password)) {
	 * return "Login Pass"; } else { return "Fail"; } }
	 */
	
	@RequestMapping("/login")
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response) { 
		ModelAndView m = new ModelAndView();
		String user = request.getParameter("uname");
		String password = request.getParameter("pass");
		m.setViewName("show.jsp");
		m.addObject("value",user);
		m.addObject("value1",password);
		return m;
		
	
	}
}
