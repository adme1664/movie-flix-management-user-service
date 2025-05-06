package com.adme.movieflix.userservice.service;

import com.adme.movieflix.userservice.adapters.db.entities.UserInfo;
import com.adme.movieflix.userservice.adapters.db.repository.UserInfoRepository;
import com.adme.movieflix.userservice.domain.UserDomain;
import com.adme.movieflix.userservice.exceptions.UserAlreadyExistException;
import com.adme.movieflix.userservice.mappers.UserMapper;
import java.math.BigInteger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoService {

  private UserInfoRepository userInfoRepository;
  private final UserMapper userMapper;

  public UserInfoService(UserInfoRepository userInfoRepository, UserMapper userMapper) {
    this.userInfoRepository = userInfoRepository;
    this.userMapper = userMapper;
  }
  /**
   * Saves the user information to the database.
   *
   * @param userInfo The user information to save.
   */
  public void saveUserInfo(UserInfo userInfo) {
    userInfoRepository.save(userInfo);
  }

  /**
   * Retrieves user information by user ID.
   *
   * @param userId The ID of the user.
   * @return The user information, or null if not found.
   */
  public UserInfo getUserInfoById(BigInteger userId) {
    return userInfoRepository.findById(userId).orElse(null);
  }

  /**
   * Retrieves user information by email.
   *
   * @param email The email of the user.
   * @return The user information, or null if not found.
   */

  public UserInfo getUserInfoByEmail(String email) {
    return userInfoRepository.findByEmail(email).orElse(null);
  }


  /**
   * Registers a new user in the system.
   *
   * @param userInfo The user information to register.
   * @return The registered user information.
   * @throws UserAlreadyExistException If the user already exists.
   */
  public UserInfo registerUser(UserDomain userInfo) throws UserAlreadyExistException {
    // Check if the user already exists
    UserInfo userToRegister = userMapper.toUserInfo(userInfo);
    // Check if the user already exists
    if (userInfoRepository.findByEmail(userToRegister.getEmail()).isPresent()) {
      throw new UserAlreadyExistException(userToRegister.getEmail());
    }
    // Save the new user
    userToRegister.setActive(false);
    return userInfoRepository.save(userToRegister);
  }

}
