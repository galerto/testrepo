package com.example.springboottest.model;

import lombok.*;

import jakarta.persistence.*;
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private int tel;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
}