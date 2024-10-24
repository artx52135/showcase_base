package com.example.showcase.service;

import com.example.showcase.entity.ProjectUser;

import java.util.List;

public interface ProjectUserService {
    ProjectUser createProjectUser(ProjectUser projectUser);

    ProjectUser getProjectUserById(int userId);

    List<ProjectUser> getAllProjectUsers();

    ProjectUser updateProjectUser(int userId, ProjectUser updateProjectUser);

    void deleteProjectUser(int userId);
}
