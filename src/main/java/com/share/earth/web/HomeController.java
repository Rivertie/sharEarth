package com.share.earth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.share.earth.service.ClothService;

@Controller
public class HomeController {
	
	private ClothService clothService;

	public HomeController(ClothService clothService) {
		this.clothService = clothService;
	}
	
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
}
