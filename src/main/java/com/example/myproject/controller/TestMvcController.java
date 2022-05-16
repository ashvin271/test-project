package com.example.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/test")
public class TestMvcController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
