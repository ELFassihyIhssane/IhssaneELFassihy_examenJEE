package com.ihssaneelfassihy.examjee.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Don {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private double montant;
    public enum TypeDon {
        ARGENT, BIEN
    }
    @Enumerated(EnumType.STRING)
    private TypeDon type;
    @ManyToOne
    private Action action;
    @ManyToOne
    private Donateur donateur;
}
