package com.adme.movieflix.userservice.service;

import java.security.SecureRandom;
import org.springframework.stereotype.Component;

@Component
public class UserVerificationTokenGenerator {
  private SecureRandom random;
  private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
  private static final int TOKEN_LENGTH = 6;

  public UserVerificationTokenGenerator() {
    this.random = new SecureRandom();
  }

  public String generateToken() {
    StringBuilder token = new StringBuilder(TOKEN_LENGTH);
    for (int i = 0; i < TOKEN_LENGTH; i++) {
      int index = random.nextInt(CHARACTERS.length());
      token.append(CHARACTERS.charAt(index));
    }
    return token.toString();
  }

}
