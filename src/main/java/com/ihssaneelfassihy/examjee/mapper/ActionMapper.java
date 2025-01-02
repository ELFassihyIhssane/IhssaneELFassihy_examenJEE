package com.ihssaneelfassihy.examjee.mapper;

import com.ihssaneelfassihy.examjee.dao.entities.Action;
import com.ihssaneelfassihy.examjee.dto.ActionDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ActionMapper {
    private ModelMapper modelMapper;

    public ActionDTO toDTO(Action action) {
        return this.modelMapper.map(action, ActionDTO.class);
    }

    public Action toEntity(ActionDTO actionDTO) {
        return this.modelMapper.map(actionDTO, Action.class);
    }
}
