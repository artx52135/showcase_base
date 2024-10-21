package com.example.showcase.service.impl;

import com.example.showcase.exception.ResourceNotFoundException;
import com.example.showcase.entity.Project;
import com.example.showcase.repository.ProjectRepository;
import com.example.showcase.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private ProjectRepository projectRepository;
    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project getProjectById(int projectId) {
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found"));
        return project;
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Project updateProject(int projectId, Project updateProject) {
        Project project = projectRepository.findById(projectId)
                .orElseThrow(() -> new ResourceNotFoundException("Project not found"));
        project.setTrack(updateProject.getTrack());
        project.setGoals(updateProject.getGoals());
        project.setResults(updateProject.getResults());
        project.setGrade(updateProject.getGrade());
        project.setRepo(updateProject.getRepo());
        project.setTitle(updateProject.getTitle());
        project.setScreenshots(updateProject.getScreenshots());
        project.setThubnail(updateProject.getThubnail());
        project.setPptxurl(updateProject.getPptxurl());
        return projectRepository.save(project);
    }

    @Override
    public void deleteProject(int projectId) {
        Project project = projectRepository.findById(projectId).orElseThrow(() -> new ResourceNotFoundException("Project not found"));
        projectRepository.delete(project);
    }

}
