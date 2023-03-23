package com.example.Cliente.infrastructure.adapter;

import com.example.Cliente.domain.entities.Cliente;
import com.example.Cliente.domain.service.ClienteSaveService;
import com.example.Cliente.infrastructure.mapper.ClienteMapper;
import com.example.Cliente.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteSaveAdapter implements ClienteSaveService {
private final ClienteRepository clienteRepository;
private final ClienteMapper clienteMapper;

  @Override
  public Cliente saveCliente(Cliente cliente) {
    return clienteMapper.toCliente(clienteRepository.save(clienteMapper.toClienteDto(cliente)));
  }
}
