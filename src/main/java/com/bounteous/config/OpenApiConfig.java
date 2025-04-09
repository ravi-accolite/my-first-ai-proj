package com.bounteous.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("My First AI Project API")
                .description("Spring Boot REST API with Spring Security, JPA, and Swagger")
                .version("v1.0.0")
                .contact(new Contact()
                    .name("Bounteous")
                    .email("contact@bounteous.com")
                    .url("https://www.bounteous.com"))
                .license(new License()
                    .name("MIT License")
                    .url("https://opensource.org/licenses/MIT")));
    }
}