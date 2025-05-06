package com.adme.movieflix.userservice.adapters.db.entities;

import jakarta.persistence.Column;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

public class BaseEntity {
  // Common fields for all entities
  // For example, createdBy, updatedBy, createdAt, updatedAt
  // You can use appropriate data types for these fields
  // For example, String for createdBy and updatedBy, and LocalDateTime for createdAt and updatedAt
  @Column(name = "created_by", nullable = false)
  @CreatedBy
  private String createdBy;

  @Column(name = "updated_by", nullable = false)
  @LastModifiedBy
  private String updatedBy;

  @Column(name = "created_time", nullable = false)
  @CreatedDate
  private String createdAt;

  @Column(name = "updated_time", nullable = false)
  @LastModifiedDate
  private String updatedAt;

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

}
