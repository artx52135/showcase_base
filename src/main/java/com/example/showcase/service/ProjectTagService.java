package com.example.showcase.service;

import com.example.showcase.entity.ProjectTag;

import java.util.List;

public interface ProjectTagService {
    ProjectTag createProjectTag(ProjectTag projectTag);

    ProjectTag getProjectTagById(int projectId);

    List<ProjectTag> getAllProjectTags();

    ProjectTag updateProjectTag(int projectId, ProjectTag updateProjectTag);

    void deleteProjectTag(int projectId);
}
