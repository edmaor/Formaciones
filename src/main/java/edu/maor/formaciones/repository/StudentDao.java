package edu.maor.formaciones.repository;

import edu.maor.formaciones.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Long> {
}