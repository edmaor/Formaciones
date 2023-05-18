package edu.maor.formaciones.controller;


import edu.maor.formaciones.entity.Student;
import edu.maor.formaciones.repository.StudentDao;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("api")
public class StudentController {

  final StudentDao studentDAO;

  public StudentController(StudentDao studentDAO) {
    this.studentDAO = studentDAO;
  }

  @GetMapping("students")
  public String getStudents(Model model) {
    model.addAttribute("students", studentDAO.findAll());
    return "student-list";
  }

  @GetMapping("/students/add")
  public String mostrarFormulariProjecte(Model model) {
    Student student = new Student();
    model.addAttribute("student", student);
    return "add-student";
  }

  @PostMapping("students/registration")
  public String altaProjecte(@Valid Student student, Errors errors) {
    if (errors.hasErrors()) {
      return "add-student";
    }
    studentDAO.save(student);
    return "redirect:/api/students";
  }
}
