package com.ihssaneelfassihy.examjee.dto;

import com.ihssaneelfassihy.examjee.dao.entities.Action;
import lombok.Data;

import java.util.Date;

@Data
public class ActionDTO {
    private Long id;
    private String titre;
    private String description;
    private Date dateCreation;
    private double montantObj;
    private Action.Etat etat;
    private Long organisateur_Id;
}
