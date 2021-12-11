package hu.unideb.inf.lego.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter

public class Lego {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private int pieces;
    private int setNumber;
    private String name;
    private String type;
    private String recommendedAge;
}
