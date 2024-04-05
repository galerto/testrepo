package com.example.springboottest.model;
import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "schools")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    // dodaj inne pola wg potrzeb
}