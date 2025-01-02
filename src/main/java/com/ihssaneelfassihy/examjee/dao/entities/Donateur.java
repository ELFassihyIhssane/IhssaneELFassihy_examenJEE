package com.ihssaneelfassihy.examjee.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String email;
    public enum Evaluation {
        DEBUTANT, DONATEUR_ACTIF, DONATEUR_FIDELE
    }
    @Enumerated(EnumType.STRING)
    private Evaluation evaluation;
    @OneToMany(mappedBy = "donateur",fetch = FetchType.LAZY)
    private List<Don> donss = new ArrayList<>();
}
