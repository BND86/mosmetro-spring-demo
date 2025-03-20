package ru.miit.wish.demo.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class MosMetroResponse {
    private boolean success;
    private Map<String, List<MosmetroWagonLoadDto>> data;
}
