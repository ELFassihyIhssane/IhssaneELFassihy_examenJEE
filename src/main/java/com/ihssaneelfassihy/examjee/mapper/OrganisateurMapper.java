package com.ihssaneelfassihy.examjee.mapper;

import com.ihssaneelfassihy.examjee.dao.entities.Organisateur;
import com.ihssaneelfassihy.examjee.dto.OrganisateurDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class OrganisateurMapper {
    private ModelMapper modelMapper;

    public OrganisateurDTO toDTO(Organisateur organisateur) {
        return this.modelMapper.map(organisateur, OrganisateurDTO.class);
    }

    public Organisateur toEntity(OrganisateurDTO organisateurDTO) {
        return this.modelMapper.map(organisateurDTO, Organisateur.class);
    }
}