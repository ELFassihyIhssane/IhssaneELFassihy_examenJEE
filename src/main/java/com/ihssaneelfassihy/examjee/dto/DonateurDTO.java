package com.ihssaneelfassihy.examjee.dto;

import com.ihssaneelfassihy.examjee.dao.entities.Donateur;
import lombok.Data;

@Data
public class DonateurDTO {
    private Long id;
    private String nom;
    private String email;
    private Donateur.Evaluation evaluation;

}
