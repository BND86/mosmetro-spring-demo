package ru.miit.wish.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class MosMetroStationsResponse {
    private List<StationDto> data;
}