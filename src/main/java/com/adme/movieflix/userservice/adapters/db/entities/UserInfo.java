package com.adme.movieflix.userservice.adapters.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "user_info")
@EntityListeners(AuditingEntityListener.class)
public class UserInfo extends BaseEntity {

  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private BigInteger userId;

  @Column(name = "user_name", nullable = false)
  private String userName;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "join_date", nullable = false)
  LocalDateTime joinDate;

  @Column(name = "last_login")
  LocalDateTime lastLogin;

  @Column(name = "is_active", nullable = false)
  private Boolean isActive;

  public BigInteger getUserId() {
    return userId;
  }

  public void setUserId(BigInteger userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LocalDateTime getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(LocalDateTime joinDate) {
    this.joinDate = joinDate;
  }

  public LocalDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(LocalDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  private static class Builder {

    private BigInteger userId;
    private String userName;
    private String email;
    private String password;
    private LocalDateTime joinDate;
    private LocalDateTime lastLogin;
    private Boolean isActive;

    public Builder setUserId(BigInteger userId) {
      this.userId = userId;
      return this;
    }

    public Builder setUserName(String userName) {
      this.userName = userName;
      return this;
    }

    public Builder setEmail(String email) {
      this.email = email;
      return this;
    }

    public Builder setPassword(String password) {
      this.password = password;
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

    public UserInfo build() {
      UserInfo userInfo = new UserInfo();
      userInfo.setUserId(this.userId);
      userInfo.setUserName(this.userName);
      userInfo.setEmail(this.email);
      userInfo.setPassword(this.password);
      userInfo.setJoinDate(this.joinDate);
      userInfo.setLastLogin(this.lastLogin);
      userInfo.setActive(this.isActive);
      return userInfo;
    }
  }

}
