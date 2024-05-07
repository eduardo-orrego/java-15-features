package org.duna.jep384;

public record UserRecord(String username, String password) {
  public UserRecord {
    if (password.equals("123456"))  // referring here to the implicit constructor parameters
      throw new IllegalArgumentException("¡¡ password invalid !!");
  }
}
