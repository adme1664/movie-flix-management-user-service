package com.adme.movieflix.userservice.domain;

import java.math.BigInteger;
import java.time.LocalDateTime;

public record UserDomain(BigInteger id, String userName, String password, String email,
                         LocalDateTime joinDate, LocalDateTime lastLogin, Boolean isActive) {

  public UserDomain {
    if (userName == null || userName.isBlank()) {
      throw new IllegalArgumentException("Username cannot be null or blank");
    }
    if (password == null || password.isBlank()) {
      throw new IllegalArgumentException("Password cannot be null or blank");
    }
    if (email == null || email.isBlank()) {
      throw new IllegalArgumentException("Email cannot be null or blank");
    }
  }

  public UserDomain(String username, String password, String email) {
    this(null, username, password, email, null, null, true);
  }

  static class Builder {

    private BigInteger id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime joinDate;
    private LocalDateTime lastLogin;
    private Boolean isActive;

    public Builder setId(BigInteger id) {
      this.id = id;
      return this;
    }

    public Builder setUsername(String username) {
      this.username = username;
      return this;
    }

    public Builder setPassword(String password) {
      this.password = password;
      return this;
    }

    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder setJoinDate(LocalDateTime joinDate) {
      this.joinDate = joinDate;
      return this;
    }

    public Builder setLastLogin(LocalDateTime lastLogin) {
      this.lastLogin = lastLogin;
      return this;
    }

    public Builder setIsActive(Boolean isActive) {
      this.isActive = isActive;
      return this;
    }

    public UserDomain build() {
      return new UserDomain(id, username, password, email, joinDate, lastLogin, isActive);
    }
  }

}
