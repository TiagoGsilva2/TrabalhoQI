package Tiago.Garcia.musicas.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontrole {
    @GetMapping("/")
    public String index( ){
        return ("trabalho de musica");
    }
}
