package Tiago.Garcia.musicas.controle;
import Tiago.Garcia.musicas.modelo.spec;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controle {
    @GetMapping("/musica")
    public spec musica(){
        spec m = new spec();
        m.setNome("Through the Fire and Flames");
        m.setBanda("DragonForce");
        m.setAlbum("inhuman Rampage");
        m.setData("2005");

        return m;
    }

    @GetMapping("/musicas")
    public ArrayList<spec> spec (){
        spec m = new spec();
        m.setNome("Fury of the Storm");
        m.setBanda("DragonForce");
        m.setAlbum("Sonic Firestorm");
        m.setData("2004");

        spec m2 = new spec();
        m2.setNome("Back in Black");
        m2.setBanda("AC/DC");
        m2.setAlbum("Back in Black");
        m2.setData("1980");

        spec m3 = new spec();
        m3.setNome("Paradise city");
        m3.setBanda("Guns N'Roses");
        m3.setAlbum("appetite for Destruction");
        m3.setData("1987");

        spec m4 = new spec();
        m4.setNome("Haruka Kanata");
        m4.setBanda("Asian Kung-Fu Generation");
        m4.setAlbum("Hōkai Amplifier");
        m4.setData("2002");

        spec m5 = new spec();
        m5.setNome("Iron man");
        m5.setBanda("Black Sabbath");
        m5.setAlbum("Paranoid");
        m5.setData("1970");

        ArrayList<spec> r = new ArrayList();

        r.add(m);
        r.add(m2);
        r.add(m3);
        r.add(m4);
        r.add(m5);
        return r;
    }
 }
