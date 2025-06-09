package com.bidweb.API_REST_Sale;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class ApiRestSaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSaleApplication.class, args);
	}

	@Bean
	ApplicationRunner runner(PasswordEncoder passwordEncoder){
		return args -> System.out.println(passwordEncoder.encode("password"));
	}
}
