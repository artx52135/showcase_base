package com.example.showcase.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDTO {
    private Integer trackId;
    private String goals;
    private String results;
    private Integer grade;
    private String repo;
    private String title;
    private String screenshots;
    private String thubnail;
    private String pptxurl;
}
