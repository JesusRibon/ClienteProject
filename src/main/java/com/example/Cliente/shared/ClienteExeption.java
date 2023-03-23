package com.example.Cliente.shared;

import org.springframework.http.HttpStatus;

public class ClienteExeption extends BaseException{

public ClienteExeption(String message){
  super(false, HttpStatus.NOT_FOUND , message, ExceptionCode.CLIENTE_NOT_FOUND);

}
}
