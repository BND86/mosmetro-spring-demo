package ru.miit.wish.demo.dto;

import lombok.Data;

@Data
public class StationDto {
    private String id;
    private LocalizedString name;

    @Data
    private static class LocalizedString {
        private String ru;
    }
}
