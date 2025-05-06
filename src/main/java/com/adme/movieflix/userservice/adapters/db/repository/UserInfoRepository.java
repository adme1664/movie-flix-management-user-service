package com.adme.movieflix.userservice.adapters.db.repository;


import com.adme.movieflix.userservice.adapters.db.entities.UserInfo;
import java.math.BigInteger;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, BigInteger> {
  Optional<UserInfo> findByEmail(String email);
}
