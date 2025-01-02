package com.ihssaneelfassihy.examjee.dto;

import com.ihssaneelfassihy.examjee.dao.entities.Don;
import lombok.Data;

@Data
public class DonDTO {
    private Long id;
    private String titre;
    private double montant;
    private Don.TypeDon type;
    private Long action_Id;
    private Long donateur_Id;
}
