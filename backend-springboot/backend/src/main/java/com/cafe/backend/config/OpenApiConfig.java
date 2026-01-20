package com.cafe.backend.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI cafeOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Cafe Management API")
                        .description("REST APIs for Cafe Management System")
                        .version("1.0"));
    }
}
