package com.adme.movieflix.userservice.adapters.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.math.BigInteger;
import java.time.LocalDateTime;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name =  "user_verification_token")

public class UserVerificationToken {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private BigInteger id;

  @JoinColumn(name = "user_id", referencedColumnName = "id",nullable = false)
  @OneToOne(targetEntity = UserInfo.class,fetch = FetchType.EAGER)
  private UserInfo user;

  @Column(name = "token", nullable = false)
  private String token;

  @Column(name = "expiry_time", nullable = false)
  LocalDateTime expiryTime;

  @Column(name = "is_used", nullable = false)
  @ColumnDefault("false")
  private boolean isUsed;
}
