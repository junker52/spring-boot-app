package pock.industrialisation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pock.industrialisation.model.Greeting;

@RestController
@RequestMapping("/hello")
public class WelcomeController {
	
	@GetMapping
	public Greeting seyHello() {
		Greeting greeting = new Greeting().builder().name("").message("Hi").build();
		return greeting;
	}

}
