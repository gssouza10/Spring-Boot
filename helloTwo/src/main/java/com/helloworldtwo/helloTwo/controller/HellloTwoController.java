package com.helloworldtwo.helloTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/hellotwo")

public class HellloTwoController {
	@GetMapping
	public String hello() {
		return "Meus objetivos de aprendizagem para essa semana são: Aprender MySQL e colocar em pratica, Spring Boot,aprimorar meus desenvolvimento pessoal e em programação";
	}

}
