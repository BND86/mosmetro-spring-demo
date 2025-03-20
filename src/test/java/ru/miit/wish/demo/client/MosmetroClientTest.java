package ru.miit.wish.demo.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MosmetroClientTest {

    @Test
    public void test() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://prodapp.mosmetro.ru/api/stations/v2/173/wagons/";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String responseJson = response.getBody();
        Assertions.assertTrue(responseJson.startsWith("{"));
    }
}
