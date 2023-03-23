package com.example.Cliente.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name ="cliente")
public class ClienteDto {
  @Id
  private String idcliente;
  private String nombre;
  private String apellido;
  private boolean estado;

}
