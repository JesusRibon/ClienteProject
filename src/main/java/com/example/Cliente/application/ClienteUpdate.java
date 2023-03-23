package com.example.Cliente.application;

import com.example.Cliente.domain.entities.Cliente;
import com.example.Cliente.domain.service.ClienteUpdateService;
import com.example.Cliente.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteUpdate implements ClienteUpdateService {
  private final ClienteRepository clienteRepository;

  @Transactional
  public void updateCliente(Cliente cliente) {
    clienteRepository.updateCliente(cliente.getIdcliente(),
                                    cliente.getNombre(),
                                     cliente.getApellido(),
                                     cliente.isEstado());



  }
}
