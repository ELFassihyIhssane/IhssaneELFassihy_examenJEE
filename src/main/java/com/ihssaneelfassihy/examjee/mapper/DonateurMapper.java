package com.ihssaneelfassihy.examjee.mapper;

import com.ihssaneelfassihy.examjee.dao.entities.Donateur;
import com.ihssaneelfassihy.examjee.dto.DonateurDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DonateurMapper {
    private ModelMapper modelMapper;

    public DonateurDTO toDTO(Donateur donateur) {
        return this.modelMapper.map(donateur, DonateurDTO.class);
    }

    public Donateur toEntity(DonateurDTO donateurDTO) {
        return this.modelMapper.map(donateurDTO, Donateur.class);
    }
}
