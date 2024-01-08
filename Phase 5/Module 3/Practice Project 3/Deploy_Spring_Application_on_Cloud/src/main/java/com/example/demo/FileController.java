package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class FileController {
@ResponseBody
	@RequestMapping("/")
	public String Deploy() {
		return "This is Naresh-Rao-SS First AWS Spring Project Deployment";
	}

}
