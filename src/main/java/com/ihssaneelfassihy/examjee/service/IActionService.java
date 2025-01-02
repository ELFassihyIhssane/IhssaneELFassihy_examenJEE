package com.ihssaneelfassihy.examjee.service;

import com.ihssaneelfassihy.examjee.dto.ActionDTO;
import com.ihssaneelfassihy.examjee.dto.DonDTO;

import java.util.List;

public interface IActionService {
    public ActionDTO saveAction(ActionDTO actionDTO);
    public List<DonDTO> getDonsByAction(Long actionId);
    public ActionDTO getActionById(Long id);
}
