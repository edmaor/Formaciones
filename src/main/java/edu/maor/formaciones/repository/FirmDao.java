package edu.maor.formaciones.repository;

import edu.maor.formaciones.entity.Firm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FirmDao extends JpaRepository<Firm, String> {
}
