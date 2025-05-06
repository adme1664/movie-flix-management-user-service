package com.adme.movieflix.userservice.adapters.mail.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfiguration {

  /**
   * Configures the JavaMailSender bean for sending emails.
   */
  @Value("${com.adme.learning.mail.host}")
  private String host;

  @Value("${com.adme.learning.mail.port}")
  private int port;

  @Value("${com.adme.learning.mail.username}")
  private String username;

  @Value("${com.adme.learning.mail.password}")
  private String password;

  @Bean
  JavaMailSender mailSender(){
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost(host);
    mailSender.setPort(port);
    mailSender.setUsername(username);
    mailSender.setPassword(password);
    return mailSender;
  }

  @Bean
  SimpleMailMessage validateTemplateMessage(){
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom("customer@movieflix.com");
    message.setSubject("Validate your Movie Flix account");
    return message;
  }

  @Bean
  SimpleMailMessage welcomeTemplateMessage(){
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom("customer@movieflix.com");
    message.setSubject("Welcome to Movie Flix");
    return message;
  }

}
