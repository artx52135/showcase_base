package com.example.showcase.service.impl;

import com.example.showcase.exception.ResourceNotFoundException;
import com.example.showcase.entity.ProjectUser;
import com.example.showcase.repository.ProjectUserRepository;
import com.example.showcase.service.ProjectUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectUserServiceImpl implements ProjectUserService {
    private ProjectUserRepository projectTagRepository;
    
    @Override
    public ProjectUser createProjectUser(ProjectUser projectTag) {
        return projectTagRepository.save(projectTag);
    }

    @Override
    public ProjectUser getProjectUserById(int projectTagId) {
        ProjectUser projectTag = projectTagRepository.findById(projectTagId)
            .orElseThrow(() -> new ResourceNotFoundException("ProjectUser not found"));
        return projectTag;
    }

    @Override
    public List<ProjectUser> getAllProjectUsers() {
        return projectTagRepository.findAll();
    }

    @Override
    public ProjectUser updateProjectUser(int projectTagId, ProjectUser updateProjectUser) {
        ProjectUser projectTag = projectTagRepository.findById(projectTagId)
            .orElseThrow(() -> new ResourceNotFoundException("ProjectUser not found"));
        projectTag.setProject(updateProjectUser.getProject());
        projectTag.setUser(updateProjectUser.getUser());
        return projectTagRepository.save(projectTag);
    }

    @Override
    public void deleteProjectUser(int projectTagId) {
        ProjectUser projectTag = projectTagRepository.findById(projectTagId)
            .orElseThrow(() -> new ResourceNotFoundException("ProjectUser not found"));
        projectTagRepository.delete(projectTag);
    }
}
