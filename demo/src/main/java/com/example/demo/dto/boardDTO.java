package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class boardDTO {
    private Long boardNo;
    private String title;
    private String name;
    private String content;
}
