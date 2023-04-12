package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // anotação deve ficar junta da classe, sem dar enter para pular linha
public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello World!</b>";
	}

	@GetMapping("/bsm")
	public String bsms() {
	    return "<b>Mentalidade de crescimento</b><br>Persistência<br>Responsabilidade pessoal<br>Orientação ao futuro<br>Comunicação<br>Orientação ao detalhe<br>Proatividade<br>Trabalho em equipe";

	}

	@GetMapping("/objetivos")
	public String objetivos() {
	    return "<b>Objetivos de aprendizagem da semana:</b><br>Melhorar a atenção aos detalhes;<br>Aumentar a minha comunicação com o time;<br>Continuar focada no trabalho em equipe.";
	}
}
