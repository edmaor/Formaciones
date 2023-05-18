package edu.maor.formaciones.controller;

import edu.maor.formaciones.entity.Firm;
import edu.maor.formaciones.repository.FirmDao;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api")
public class FirmController {
  final FirmDao firmDao;

  public FirmController(FirmDao firmDao) {
    this.firmDao = firmDao;
  }

  @GetMapping("firms")
  public String getFirms(Model model) {
    model.addAttribute("firms", firmDao.findAll());
    return "firm-list";
  }

  @GetMapping("/firms/add")
  public String mostrarFormulariEmpresa(Model model) {
    Firm firm = new Firm();
    model.addAttribute("firm", firm);
    return "add-firm";
  }

  @PostMapping("firm/registration")
  public String altaEmpresa(@Valid Firm firm, Errors errors) {
    if (errors.hasErrors()) {
      return "add-firm";
    }
    firmDao.save(firm);
    return "redirect:/api/firms";
  }
}
