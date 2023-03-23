package com.example.Cliente.domain.service;

import com.example.Cliente.domain.entities.Cliente;
import java.util.List;

public interface ClienteGetService {
Cliente getCliente(String idcliente);

List<Cliente> getListCliente();

}
