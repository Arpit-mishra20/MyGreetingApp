package com.springapicalls.RestApiCalls;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@OpenAPIDefinition(info = @Info(title = "Greeting API", version = "1.0", description = "Greeting API Documentation"))

public class RestApiCallsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiCallsApplication.class, args);
	}
}
