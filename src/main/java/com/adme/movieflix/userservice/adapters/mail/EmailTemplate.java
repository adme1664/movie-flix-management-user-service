package com.adme.movieflix.userservice.adapters.mail;

import org.springframework.stereotype.Component;

@Component
public class EmailTemplate {

  /**
   * Generates an HTML email template for user registration.
   *
   * @param name  The name of the user.
   * @param token The verification token.
   * @return The HTML email template as a string.
   */
  public String getEmailTemplate(String name, String token) {
    // HTML email template
    String template = """
        <html>
        <head>
            <title>Welcome to MovieFlix</title>
        </head>
        <body>
            <h1>Welcome to MovieFlix, %s!</h1>
            <p>Thank you for signing up. Please click the link below to verify your email address:</p>
            <a href="http://localhost:8080/api/v1/user/verify?token=%s">Verify Email</a>
        </body>
        </html>
        """;
    return String.format(template, name, token);
  }

}
