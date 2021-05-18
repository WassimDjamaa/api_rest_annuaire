package com.example.phoneBook;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PhoneBookApplication {
	@ApiModelProperty("Powered by team ©")
	public static void main(String[] args) {
		SpringApplication.run(PhoneBookApplication.class, args);
	}

}

