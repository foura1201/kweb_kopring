package com.example.kopring.commons.config

import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
public class Swagger2Config {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
            .group("v1-definition")
            .pathsToMatch("/api/**")
            .build();
    }
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
            .info(new Info().title("Bstagram API")
                .description("BMW 프로젝트 API 명세서입니다.")
                .version("v0.0.1");
    }
}