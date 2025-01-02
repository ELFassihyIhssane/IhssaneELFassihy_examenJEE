package com.ihssaneelfassihy.examjee.mapper;

import com.ihssaneelfassihy.examjee.dao.entities.Don;
import com.ihssaneelfassihy.examjee.dto.DonDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DonMapper {
    private ModelMapper modelMapper;

    public DonDTO toDTO(Don don) {
        return this.modelMapper.map(don, DonDTO.class);
    }

    public Don toEntity(DonDTO donDTO) {
        return this.modelMapper.map(donDTO, Don.class);
    }
}
