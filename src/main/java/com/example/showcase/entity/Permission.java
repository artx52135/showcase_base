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
@Table(name = "permissions")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "create_track", nullable = false)
    private Boolean createTrack;

    @Column(name = "read_track", nullable = false)
    private Boolean readTrack;

    @Column(name = "update_track", nullable = false)
    private Boolean updateTrack;

    @Column(name = "delete_track", nullable = false)
    private Boolean deleteTrack;

    @Column(name = "create_project", nullable = false)
    private Boolean createProject;

    @Column(name = "read_project", nullable = false)
    private Boolean readProject;

    @Column(name = "update_project", nullable = false)
    private Boolean updateProject;

    @Column(name = "delete_project", nullable = false)
    private Boolean deleteProject;

    @Column(name = "create_user", nullable = false)
    private Boolean createUser;

    @Column(name = "read_user", nullable = false)
    private Boolean readUser;

    @Column(name = "update_user", nullable = false)
    private Boolean updateUser;

    @Column(name = "delete_user", nullable = false)
    private Boolean deleteUser;

    @Column(name = "create_tag", nullable = false)
    private Boolean createTag;

    @Column(name = "read_tag", nullable = false)
    private Boolean readTag;

    @Column(name = "update_tag", nullable = false)
    private Boolean updateTag;

    @Column(name = "delete_tag", nullable = false)
    private Boolean deleteTag;
}
