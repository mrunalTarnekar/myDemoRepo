package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/GetMethod")
	public String method()
	{
		String msg="this is style";
		return "login";
	}
}
