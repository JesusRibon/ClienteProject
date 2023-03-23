package com.example.Cliente.infrastructure.mapper;

import com.example.Cliente.domain.entities.Cliente;
import com.example.Cliente.infrastructure.dto.ClienteDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface ClienteMapper {
ClienteDto toClienteDto(Cliente cliente);
@Mapping(target = "idcliente" , source = "idcliente")
@Mapping(target = "nombre" ,source = "nombre")
@Mapping(target = "apellido" , source = "apellido")
@Mapping(target = "estado" , source = "estado")

Cliente toCliente(ClienteDto clienteDto);


}
