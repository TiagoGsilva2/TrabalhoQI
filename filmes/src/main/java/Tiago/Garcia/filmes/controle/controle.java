package Tiago.Garcia.filmes.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import Tiago.Garcia.filmes.model.spec;

import java.util.ArrayList;

@RestController
public class controle {
    @GetMapping("/filme")
    public spec filmes(){
        spec filmes = new spec();
        filmes.setName("Homem de ferro");
        filmes.setAuthor("Stan lee , Don Heck , Jack Kirby , Larry Lieber");
        filmes.setGender(" ação, aventura, ficção científica");
        filmes.setReleasedate("Data de lançamento: 30 de abril de 2008 (Brasil)");

        return filmes;
    }

    @GetMapping("/filmes")
    public ArrayList<spec> spec(){
    spec filmes = new spec();
        filmes.setName("Homem de ferro");
        filmes.setAuthor("Stan lee , Don Heck , Jack Kirby , Larry Lieber");
        filmes.setGender(" ação, aventura, ficção científica");
        filmes.setReleasedate("Data de lançamento: 30 de abril de 2008 (Brasil)");

    spec filmes2 = new spec();
        filmes2.setName("Os vingadores");
        filmes2.setAuthor("Stan lee , Jack Kirby ,Joss whedon,jack kirby");
        filmes2.setGender(" ação, aventura, ficção científica");
        filmes2.setReleasedate("Data de lançamento: 27 de abril de 2012 (Brasil)");

    spec filmes3 = new spec();
        filmes.setName("Vingadores: Endgame");
        filmes.setAuthor("Stan lee ,Jack Kirby ,Jim starlin");
        filmes.setGender(" ação, aventura, ficção científica");
        filmes.setReleasedate("Data de lançamento: 25 de abril de 2019 (Brasil)");

        ArrayList<spec> r = new ArrayList();

        r.add(filmes);
        r.add(filmes2);
        r.add(filmes3);

        return r;
    }
}








