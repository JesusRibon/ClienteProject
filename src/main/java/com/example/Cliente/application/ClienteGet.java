package com.example.Cliente.application;

import com.example.Cliente.domain.entities.Cliente;
import com.example.Cliente.domain.service.ClienteGetService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGet {
private final ClienteGetService clienteGetService;

public Cliente getCliente(String idcliente){

   return clienteGetService.getCliente(idcliente);
}

public List<Cliente> getListCliente(){
   return clienteGetService.getListCliente();

}

}
