package com.ihssaneelfassihy.examjee.web;

import com.ihssaneelfassihy.examjee.dto.ActionDTO;
import com.ihssaneelfassihy.examjee.dto.DonDTO;
import com.ihssaneelfassihy.examjee.service.IActionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ihssaneelfassihy.examjee.dao.entities.Action.Etat.*;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class ActionController {
    private IActionService actionService;

    @GetMapping("/new")
    public String showActionForm(Model model) {
        model.addAttribute("actionDTO", new ActionDTO());
        model.addAttribute("etat", List.of(PREPARATION, OUVERTE, SUSPENDUE, TERMINEE));
        return "addActionForm";
    }
    @PostMapping("/save")
    public String saveAction(@ModelAttribute("actionDTO") ActionDTO actionDTO, Model model) {
        actionService.saveAction(actionDTO);
        return "redirect:/";
    }
    @GetMapping("/action/{id}")
    public String getDonByAction(@PathVariable("id") Long id, Model model) {
        List<DonDTO> dons = actionService.getDonsByAction(id);
        model.addAttribute("dons", dons);
        // Calcul du montant total
        double totalMontant = dons.stream()
                .mapToDouble(DonDTO::getMontant)
                .sum();
        model.addAttribute("totalMontant", totalMontant);

        // Récupérer les détails de l'action
        ActionDTO actionDTO = actionService.getActionById(id);
        model.addAttribute("action", actionDTO);
        return "DonsList";
    }
    @GetMapping("/")
    public String show() {
        return "<h1>Bonjour dans le site de Dons</h1>";
    }

}
