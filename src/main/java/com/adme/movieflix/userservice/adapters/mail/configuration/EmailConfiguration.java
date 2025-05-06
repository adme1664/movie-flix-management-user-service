package com.adme.movieflix.userservice.adapters.mail.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfiguration {

  @Bean
  JavaMailSender mailSender(){
    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    mailSender.setHost("smtp.com");
    mailSender.setPort(587);
    return mailSender;
  }




}
