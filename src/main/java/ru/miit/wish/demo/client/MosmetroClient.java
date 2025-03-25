package ru.miit.wish.demo.client;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ru.miit.wish.demo.dto.MosMetroResponse;
import ru.miit.wish.demo.dto.MosMetroStationsResponse;
import ru.miit.wish.demo.properties.MosmetroApiProperties;

@Component
public class MosmetroClient {
    private final RestTemplate restTemplate = new RestTemplate();
    private final MosmetroApiProperties properties;
    private final ObjectMapper objectMapper;

    public MosmetroClient(MosmetroApiProperties properties, ObjectMapper objectMapper) {
        this.properties = properties;
        this.objectMapper = objectMapper;
    }

    public MosMetroResponse getWagonsForStation(int stationId) {
        String url = properties.getBaseUrl() + "/api/stations/v2/" + stationId + "/wagons/";
        ResponseEntity<MosMetroResponse> response = restTemplate.getForEntity(url, MosMetroResponse.class);
        MosMetroResponse responseBody = response.getBody();
        return responseBody;
    }

    public MosMetroStationsResponse getStations() throws JsonProcessingException {
        String url = properties.getBaseUrl() + "/api/schema/v1.0/stations";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        MosMetroStationsResponse mosMetroStationsResponse = objectMapper.readValue(response.getBody(), MosMetroStationsResponse.class);
        return mosMetroStationsResponse;
    }
}
