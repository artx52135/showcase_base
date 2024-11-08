package com.example.showcase.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "track")
    private Integer track;

    @Column(name = "goals")
    private String goals;

    @Column(name = "results")
    private String results;

    @Column(name = "grade")
    private Integer grade;

    @Column(name = "repo")
    private String repo;

    @Column(name = "title")
    private String title;

    @Column(name = "screenshots")
    private String[] screenshots;

    @Column(name = "thumbnail")
    private String thumbnail;//thumbnail

    @Column(name = "pptxUrl")
    private String pptxUrl;
}
