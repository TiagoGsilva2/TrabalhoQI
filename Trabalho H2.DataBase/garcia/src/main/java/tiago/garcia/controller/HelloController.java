package tiago.garcia.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    @GetMapping("/")
    public String index () { return "Bem vindo Trabalho sobre o lolzinho com implementacao do banco de dados";}
}
