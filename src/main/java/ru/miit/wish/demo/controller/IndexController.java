package ru.miit.wish.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ru.miit.wish.demo.client.MosmetroClient;
import ru.miit.wish.demo.dto.MosMetroResponse;

@RestController
public class IndexController {

    private final MosmetroClient mosmetroClient;

    public IndexController(MosmetroClient mosmetroClient) {
        this.mosmetroClient = mosmetroClient;
    }

    @GetMapping("/")
    public MosMetroResponse index(@RequestParam int stationId) {
        return mosmetroClient.getWagonsForStation(stationId);
    }
}
