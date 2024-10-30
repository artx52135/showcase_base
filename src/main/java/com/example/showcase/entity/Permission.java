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

    @Column(name = "create_track")
    private Boolean createTrack;

    @Column(name = "read_track")
    private Boolean readTrack;

    @Column(name = "update_track")
    private Boolean updateTrack;

    @Column(name = "delete_track")
    private Boolean deleteTrack;

    @Column(name = "create_project")
    private Boolean createProject;

    @Column(name = "read_project")
    private Boolean readProject;

    @Column(name = "update_project")
    private Boolean updateProject;

    @Column(name = "delete_project")
    private Boolean deleteProject;

    @Column(name = "create_user")
    private Boolean createUser;

    @Column(name = "read_user")
    private Boolean readUser;

    @Column(name = "update_user")
    private Boolean updateUser;

    @Column(name = "delete_user")
    private Boolean deleteUser;

    @Column(name = "create_tag")
    private Boolean createTag;

    @Column(name = "read_tag")
    private Boolean readTag;

    @Column(name = "update_tag")
    private Boolean updateTag;

    @Column(name = "delete_tag")
    private Boolean deleteTag;
}
