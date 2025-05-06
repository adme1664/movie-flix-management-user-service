package com.adme.movieflix.userservice.adapters.db.repository;

import com.adme.movieflix.userservice.adapters.db.entities.UserVerificationToken;
import java.math.BigInteger;
import org.springframework.data.repository.ListCrudRepository;

public interface UserVerificationTokenRepository extends ListCrudRepository<UserVerificationToken, BigInteger> {

}
