package com.adme.movieflix.userservice.exceptions;

public class UserAlreadyExistException extends RuntimeException {

  private static String DEFAULT_MESSAGE = "%s user already exists";

  public UserAlreadyExistException(String username) {
    super(String.format(DEFAULT_MESSAGE, username));
  }

  public UserAlreadyExistException(String username, Throwable cause) {
    super(String.format(DEFAULT_MESSAGE, username), cause);
  }

  public UserAlreadyExistException(Throwable cause) {
    super(cause);
  }

}
