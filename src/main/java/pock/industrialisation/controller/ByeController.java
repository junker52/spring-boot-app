package pock.industrialisation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pock.industrialisation.model.Greeting;

@RestController
@RequestMapping("/bye")
public class ByeController {
	
	@GetMapping
	public Greeting seyHello() {
		Greeting greeting = new Greeting().builder().name("").message("Bye bye").build();
		return greeting;
	}


}
