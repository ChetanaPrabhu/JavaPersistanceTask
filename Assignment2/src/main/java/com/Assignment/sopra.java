package com.Assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sopra 

{
	
	@RequestMapping("/home")
	public String home() 
	{
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() 
	{
		return "about";
	}

	@RequestMapping("/info")
	public String info() 
	{
		return "info";
	}
}