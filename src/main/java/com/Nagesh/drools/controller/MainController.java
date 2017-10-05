package com.Nagesh.drools.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String defaultRoute() {
		return "index.html";
	}

}