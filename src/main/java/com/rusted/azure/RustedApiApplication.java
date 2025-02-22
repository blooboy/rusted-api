package com.rusted.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RustedApiApplication {

	@GetMapping("/message")
	public String message() {
		return "Spring api successfully deployed";
	}

	public static void main(String[] args) {
		SpringApplication.run(RustedApiApplication.class, args);
	}

}
