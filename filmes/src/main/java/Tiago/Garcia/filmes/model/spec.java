package Tiago.Garcia.filmes.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class spec {
    @Getter @Setter
    public String name;
    @Getter @Setter
    public String releasedate;
    @Getter @Setter
    public String author;
    @Getter @Setter
    public String gender;
}
