package com.abhishekchoksi.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;;

@SpringBootApplication
public class BankingAppApplication extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(BankingAppApplication.class);
  }
    public static void main(String[] args) {
        SpringApplication.run(BankingAppApplication.class, args);
    }

}
