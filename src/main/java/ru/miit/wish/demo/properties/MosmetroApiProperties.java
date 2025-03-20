package ru.miit.wish.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties("ru.miit.wish.demo.mosmetro-api")
@Data
public class MosmetroApiProperties {
    private String baseUrl = "TODO";
}
