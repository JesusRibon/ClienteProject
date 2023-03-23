package com.example.Cliente.infrastructure.adapter;

import com.example.Cliente.domain.entities.Cliente;
import com.example.Cliente.domain.service.ClienteGetService;
import com.example.Cliente.infrastructure.dto.ClienteDto;
import com.example.Cliente.infrastructure.mapper.ClienteMapper;
import com.example.Cliente.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGetAdapter implements ClienteGetService {
private final ClienteRepository clienteRepository;
private final ClienteMapper clienteMapper;

  @Override
  public Cliente getCliente(String idcliente) {
    Optional<ClienteDto> clienteDto =clienteRepository.findById(idcliente);
    return clienteDto.map(clienteMapper::toCliente).orElse(null);
  }

  @Override
  public List<Cliente> getListCliente() {
    List<ClienteDto> clientesDto = clienteRepository.findAll();
    return clientesDto.stream().map(clienteMapper::toCliente).toList();




  }
}
