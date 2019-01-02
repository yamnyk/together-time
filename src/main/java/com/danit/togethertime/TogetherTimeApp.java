package com.danit.togethertime;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TogetherTimeApp {
	public static void main(String[] args) {
		SpringApplication.run(TogetherTimeApp.class, args);
	}

  @Bean
  public ModelMapper getModelMapper() {
    return new ModelMapper();
  }
}