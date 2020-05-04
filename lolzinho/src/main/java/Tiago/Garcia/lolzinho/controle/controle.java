package Tiago.Garcia.lolzinho.controle;
import Tiago.Garcia.lolzinho.modelo.spec;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controle {
    @GetMapping("/destaque")
    public spec lol(){
        spec l = new spec();
        l.setNome("AATROX");
        l.setFuncao("LUTADOR");
        l.setDificuldade("MODERADO");
        l.setRota("TOPO");

        return l;
    }
    @GetMapping("/todos")
    public ArrayList<spec> spec(){

        spec l = new spec();
        l.setNome("AHRI");
        l.setFuncao("MAGO");
        l.setDificuldade("MODERADO");
        l.setRota("MEIO");

        spec l2 = new spec();
        l2.setNome("AMUMU");
        l2.setFuncao("TANK");
        l2.setDificuldade("FACIL");
        l2.setRota("SELVA");

        spec l3 = new spec();
        l3.setNome("RIVEN");
        l3.setFuncao("LUTADOR");
        l3.setDificuldade("DIFICIL");
        l3.setRota("TOPO");

        spec l4 = new spec();
        l4.setNome("AURELION SOL");
        l4.setFuncao("MAGO/CONTROLLER");
        l4.setDificuldade("EXTREMAMENTE DIFICIL");
        l4.setRota("MEIO");

        ArrayList<spec> r = new ArrayList();

        r.add(l);
        r.add(l2);
        r.add(l3);
        r.add(l4);

        return r;


    }
}
