package com.example.showcase.service.impl;

import com.example.showcase.exception.ResourceNotFoundException;
import com.example.showcase.entity.ProjectTag;
import com.example.showcase.repository.ProjectTagRepository;
import com.example.showcase.service.ProjectTagService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectTagServiceImpl implements ProjectTagService {
    private ProjectTagRepository projectTagRepository;
    
    @Override
    public ProjectTag createProjectTag(ProjectTag projectTag) {
        return projectTagRepository.save(projectTag);
    }

    @Override
    public ProjectTag getProjectTagById(int projectTagId) {
        ProjectTag projectTag = projectTagRepository.findById(projectTagId)
            .orElseThrow(() -> new ResourceNotFoundException("ProjectTag not found"));
        return projectTag;
    }

    @Override
    public List<ProjectTag> getAllProjectTags() {
        return projectTagRepository.findAll();
    }

    @Override
    public ProjectTag updateProjectTag(int projectTagId, ProjectTag updateProjectTag) {
        ProjectTag projectTag = projectTagRepository.findById(projectTagId)
            .orElseThrow(() -> new ResourceNotFoundException("ProjectTag not found"));
        projectTag.setProjectId(updateProjectTag.getProjectId());
        projectTag.setTagId(updateProjectTag.getTagId());
        return projectTagRepository.save(projectTag);
    }

    @Override
    public void deleteProjectTag(int projectTagId) {
        ProjectTag projectTag = projectTagRepository.findById(projectTagId)
            .orElseThrow(() -> new ResourceNotFoundException("ProjectTag not found"));
        projectTagRepository.delete(projectTag);
    }
}
