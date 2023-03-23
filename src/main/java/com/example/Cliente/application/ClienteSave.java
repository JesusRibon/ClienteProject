package com.example.Cliente.application;

import com.example.Cliente.domain.entities.Cliente;
import com.example.Cliente.domain.service.ClienteGetService;
import com.example.Cliente.domain.service.ClienteSaveService;
import com.example.Cliente.infrastructure.adapter.ClienteGetAdapter;
import com.example.Cliente.shared.ClienteExeption;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ClienteSave {
private final ClienteSaveService clienteSaveService;
private final ClienteGetAdapter clienteGetAdapter;
private final ClienteGetService clienteGetService;

public Cliente saveCliente(Cliente cliente){
  Cliente cliente1 = clienteGetService.getCliente(cliente.getIdcliente());
  if(cliente1 != null){
    throw new ClienteExeption("Cliente ya existe con el id de " +cliente.getIdcliente());

  }else {
    log.info("Cliente registrado exitosamente");
    return clienteSaveService.saveCliente(cliente);

  }




}

}
