package tiago.garcia.model;

import lombok.*;


import org.springframework.stereotype.Component;

import javax.persistence.*;



@Component

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_player")
    private long id;

    @Column(name = "rank")
    private double rank;
}
