package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Habilidades: \nOrientação ao Detalhe \nGerenciamento de tempo \nMentalidades: \nPersistência, \nMentalidade de crescimento";
	}

}
