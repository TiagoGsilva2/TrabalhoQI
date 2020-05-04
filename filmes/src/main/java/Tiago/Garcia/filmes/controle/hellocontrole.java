package Tiago.Garcia.filmes.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontrole {

    @GetMapping("/")

    public String index (){
        return ("hello mundo");

    }
}
