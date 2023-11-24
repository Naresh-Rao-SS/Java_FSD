package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	/*	@ResponseBody
	@RequestMapping("/sum")
		public String Display(HttpServletRequest request, HttpServletResponse response) {
			int res = Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));

			return "the output is " +res;}*/

	@RequestMapping("/sum")
	public ModelAndView Display(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		int res = Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
		mv.setViewName("show.jsp");
		mv.addObject("value",res);
		return mv;
	}
}
	