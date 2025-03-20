package ru.miit.wish.demo.dto;

import java.util.Map;

import lombok.Data;

@Data
public class MosmetroWagonLoadDto {
    private String id;
    private int prevStation;
    private int nextStation;
    private int arrivalTime;
    private Map<String, String> wagons;
}
