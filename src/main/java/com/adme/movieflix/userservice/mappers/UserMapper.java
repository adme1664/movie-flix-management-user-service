package com.adme.movieflix.userservice.mappers;

import com.adme.movieflix.userservice.adapters.db.entities.UserInfo;
import com.adme.movieflix.userservice.domain.UserDomain;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {

  //UserInfo to UserDomain
  @Mapping(source = "userId", target = "id")
  @Mapping(source = "userName", target = "userName")
  @Mapping(source = "password", target = "password")
  @Mapping(source = "email", target = "email")
  @Mapping(source = "joinDate", target = "joinDate")
  @Mapping(source = "lastLogin", target = "lastLogin")
  @Mapping(source = "active", target = "isActive")
  UserDomain toUserDomain(UserInfo userInfo);

  //UserDomain to UserInfo
  @Mapping(source = "id", target = "userId")
  @Mapping(source = "userName", target = "userName")
  @Mapping(source = "password", target = "password")
  @Mapping(source = "email", target = "email")
  @Mapping(source = "joinDate", target = "joinDate")
  @Mapping(source = "lastLogin", target = "lastLogin")
  @Mapping(source = "isActive", target = "active")
  UserInfo toUserInfo(UserDomain userDomain);
}
