package edu.maor.formaciones.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.List;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "firm")
@Entity @Getter @Setter
public class Firm {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String cif;

  @NotBlank(message = "Has d'introduir el nom de la empresa")
  @Size(min = 2, max = 50)
  private String name;

  @NotBlank(message = "Has d'introduir la direcció de la empresa")
  @Size(min = 2, max = 50)
  private String address;

  @OneToMany(mappedBy = "firm")
  private List<Student> students;

}
