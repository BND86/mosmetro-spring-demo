package ru.miit.wish.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.miit.wish.demo.client.MosmetroClient;
import ru.miit.wish.demo.dto.MosMetroStationsResponse;

@RestController
@RequestMapping("/stations")
public class StationsController {

    private final MosmetroClient mosmetroClient;

    public StationsController(MosmetroClient mosmetroClient) {
        this.mosmetroClient = mosmetroClient;
    }

    @GetMapping
    public MosMetroStationsResponse stations() throws JsonProcessingException {
        return mosmetroClient.getStations();
    }
}
