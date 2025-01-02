package com.ihssaneelfassihy.examjee.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private Date dateCreation;
    private double montantObj;

    public enum Etat {
        PREPARATION, OUVERTE, SUSPENDUE, TERMINEE
    }
    @Enumerated(EnumType.STRING)
    private Etat etat;
    @ManyToOne
    private Organisateur organisateur;
    @OneToMany(mappedBy = "action",fetch = FetchType.LAZY)
    private List<Don> donss= new ArrayList<>();


}
