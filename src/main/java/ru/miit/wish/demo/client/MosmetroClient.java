package ru.miit.wish.demo.client;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ru.miit.wish.demo.dto.MosMetroResponse;
import ru.miit.wish.demo.properties.MosmetroApiProperties;

@Component
public class MosmetroClient {
    private final RestTemplate restTemplate = new RestTemplate();
    private final MosmetroApiProperties properties;

    public MosmetroClient(MosmetroApiProperties properties) {
        this.properties = properties;
    }

    public MosMetroResponse getWagonsForStation(int stationId) {
        String url = properties.getBaseUrl() + "/api/stations/v2/" + stationId + "/wagons/";
        ResponseEntity<MosMetroResponse> response = restTemplate.getForEntity(url, MosMetroResponse.class);
        MosMetroResponse responseBody = response.getBody();
        return responseBody;
    }
}
