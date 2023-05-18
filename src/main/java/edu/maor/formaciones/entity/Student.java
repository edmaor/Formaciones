package edu.maor.formaciones.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")
@Entity @Getter @Setter
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @NotBlank(message = "Must put a first name")
  @Size(min = 2, max = 50)
  private String fname;

  @NotBlank(message = "Must put a last name")
  @Size(min = 2, max = 50)
  private String lastName;

  @NotBlank(message = "Must put a cycle")
  @Size(min = 3, max = 4)
  private String cycle;

  private String modality;

  private String practicesStatus;

  @ManyToOne()
  private Firm firm;
}
