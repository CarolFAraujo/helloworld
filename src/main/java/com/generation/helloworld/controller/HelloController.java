package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello") //anotação deve ficar junta da classe, sem dar enter para pular linha
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello Turma 62!</b>";
	}
	
	@GetMapping("/nome")
	public String meunome() {
		return "<b> Hello! <br />Carolina</b>";
	}

}
