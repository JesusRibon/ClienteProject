package com.example.Cliente.infrastructure.api.controller;

import com.example.Cliente.application.ClienteGet;
import com.example.Cliente.application.ClienteSave;
import com.example.Cliente.application.ClienteUpdate;
import com.example.Cliente.domain.entities.Cliente;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/cliente")
public class ClienteController {
  private final ClienteSave clienteSave;
  private final ClienteGet clienteGet;
  private final ClienteUpdate clienteUpdate;




@PostMapping
public ResponseEntity<Cliente> clienteSave(@RequestBody Cliente cliente){
  return new ResponseEntity<>(clienteSave.saveCliente(cliente), HttpStatus.CREATED);

}

@GetMapping
public ResponseEntity<Cliente> clienteGet(@RequestParam String idcliente){
  return ResponseEntity.ok(clienteGet.getCliente(idcliente));
}

@GetMapping(value = "/all")
  public ResponseEntity<List<Cliente>> getAllCliente(){
   return ResponseEntity.ok(clienteGet.getListCliente());
}

@PutMapping
  public void updateCliente(@RequestBody Cliente cliente){
  clienteUpdate.updateCliente(cliente);

}






}
