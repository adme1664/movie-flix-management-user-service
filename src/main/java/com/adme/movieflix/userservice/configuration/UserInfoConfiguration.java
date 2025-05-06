package com.adme.movieflix.userservice.configuration;

import java.util.Optional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class UserInfoConfiguration implements AuditorAware {

  @Override
  public Optional getCurrentAuditor() {
    return Optional.of("system");
  }

}
