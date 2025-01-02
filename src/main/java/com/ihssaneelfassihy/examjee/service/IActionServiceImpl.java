package com.ihssaneelfassihy.examjee.service;

import com.ihssaneelfassihy.examjee.dao.entities.Action;
import com.ihssaneelfassihy.examjee.dao.entities.Organisateur;
import com.ihssaneelfassihy.examjee.dao.repositories.ActionRepository;
import com.ihssaneelfassihy.examjee.dao.repositories.DonRepository;
import com.ihssaneelfassihy.examjee.dao.repositories.OrganisateurRepository;
import com.ihssaneelfassihy.examjee.dto.ActionDTO;
import com.ihssaneelfassihy.examjee.dto.DonDTO;
import com.ihssaneelfassihy.examjee.mapper.ActionMapper;
import com.ihssaneelfassihy.examjee.mapper.DonMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class IActionServiceImpl implements IActionService {
    private ActionRepository actionRepository;
    private DonRepository donRepository;
    private OrganisateurRepository organisateurRepository;
    private ActionMapper actionMapper;
    private DonMapper donMapper;

    @Override
    public ActionDTO saveAction(ActionDTO actionDTO){
        Action action = actionMapper.toEntity(actionDTO);
        Organisateur organisateur = organisateurRepository.findById(actionDTO.getOrganisateur_Id())
                .orElseThrow(() -> new RuntimeException("Organisateur introuvable"));
        action.setOrganisateur(organisateur);
        Action savedAction = actionRepository.save(action);
        return actionMapper.toDTO(savedAction);
    }
    @Override
    public List<DonDTO> getDonsByAction(Long actionId){
        actionRepository.findById(actionId)
                .orElseThrow(() -> new RuntimeException("Action introuvable"));

        return donRepository.findByAction_Id(actionId).stream()
                .map(don -> donMapper.toDTO(don))
                .collect(Collectors.toList());
    }
    @Override
    public ActionDTO getActionById(Long id) {
        Action action = actionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Action introuvable"));

        // Convertit l'entité Action en DTO ActionDTO
        return actionMapper.toDTO(action);
    }


}
