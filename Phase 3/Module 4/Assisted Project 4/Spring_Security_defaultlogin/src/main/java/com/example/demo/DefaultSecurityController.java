package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultSecurityController {
	@ResponseBody
	@RequestMapping("/")
	public String defaultlogin() {
		return "Default Login Bro";
	}

	@ResponseBody
	@RequestMapping("/access1")
	public String request1() {
		return "Admin Login";
	}
	@ResponseBody
	@RequestMapping("/access2")
	public String request2() {
		return "User Login";
	}
	@ResponseBody
	@RequestMapping("/access3")
	public String request3() {
		return "User and Admin";
	}
}
