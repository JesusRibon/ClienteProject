package com.example.Cliente.shared;

import lombok.Getter;

@Getter
public enum ExceptionCode {
  CLIENTE_NOT_FOUND("PNF-001", "NOT_FOUND");

  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
}
