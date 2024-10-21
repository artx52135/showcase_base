package com.example.showcase.service;

import com.example.showcase.entity.Project;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project);

    Project getProjectById(int projectId);

    List<Project> getAllProjects();

    Project updateProject(int projectId, Project updateProject);

    void deleteProject(int projectId);
}
