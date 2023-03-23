package com.example.Cliente.domain.entities;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cliente {
  @Id
  private String idcliente;
  private String nombre;
  private String apellido;
  private boolean estado;


}
