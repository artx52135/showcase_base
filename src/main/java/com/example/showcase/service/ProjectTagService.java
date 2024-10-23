package com.example.showcase.service;

import com.example.showcase.entity.ProjectTag;

import java.util.List;

public interface ProjectTagService {
    ProjectTag createProjectTag(ProjectTag projectTag);

    ProjectTag getProjectTagByProjectId(int projectId);

    ProjectTag getProjectTagByTagId(int tagId);

    List<ProjectTag> getAllProjectTags();

    void deleteProjectTag(int projectId);
}
