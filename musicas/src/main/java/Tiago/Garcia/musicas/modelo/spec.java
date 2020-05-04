package Tiago.Garcia.musicas.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class spec {

    @Getter @Setter
    public String nome;
    @Getter @Setter
    public String banda;
    @Getter @Setter
    public String album;
    @Getter @Setter
    public String data;

}
