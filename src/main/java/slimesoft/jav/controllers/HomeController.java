package slimesoft.jav.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	@GetMapping("/")
	public String mostrarIndex() {
		return "index";
	}

}
