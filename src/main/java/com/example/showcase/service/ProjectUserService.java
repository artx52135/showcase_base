package com.example.showcase.service;

import com.example.showcase.entity.ProjectUser;

import java.util.List;

public interface ProjectUserService {
    ProjectUser createProjectUser(ProjectUser projectUser);

    ProjectUser getProjectUserByUserId(int userId);

    ProjectUser getProjectUserByProjectId(int projectId);

    List<ProjectUser> getAllProjectUsers();

    void deleteProjectUserByUserId(int userId);

    void deleteProjectUserByProjectId(int projectId);
}
