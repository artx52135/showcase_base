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
@Table(name = "project_users")
public class ProjectUser {
    @Id
    @Column(name = "project_id", nullable = false)
    private int projectId;

    @Column(name = "user_id", nullable = false)
    private int userId;
}
