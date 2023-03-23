package com.example.Cliente.repository;

import com.example.Cliente.infrastructure.dto.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDto, String> {
  @Query(nativeQuery = true , value = "update cliente set  nombre = :nombre , apellido = :apellido , estado = :estado where idcliente = :idcliente ")
  @Modifying
  void updateCliente(@Param("idcliente") String idcliente,
                     @Param("nombre") String nombre,
                     @Param("apellido") String apellido,
                     @Param("estado") boolean estado) ;



}
