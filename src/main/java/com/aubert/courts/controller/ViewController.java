package com.aubert.courts.controller;

import com.aubert.courts.entity.Court;
import com.aubert.courts.service.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class ViewController {
  @Autowired CourtService courtService;

  @GetMapping("/courtList")
  public String homePage(Model model) {
    model.addAttribute("courts", courtService.getCourts());
    return "courtList";
  }

  @GetMapping("/showAddCourt")
  public String initCourt(Model model) {
    model.addAttribute("court", new Court(0, false, ""));
    return "addCourt";
  }

  @PostMapping("/addCourt")
  public String addCourt(Model model, @ModelAttribute("court") Court newCourt) {
    courtService.addCourt(
        new Court(newCourt.getNumCourt(), newCourt.isCouvert(), newCourt.getTypeSurface()));
    return "redirect:/courtList";
  }

  @DeleteMapping("/removeCourt/{numCourt}")
  public String removeCourt(@PathVariable int numCourt) {
    courtService.removeCourt(numCourt);
    return "redirect:/courtList";
  }
}
