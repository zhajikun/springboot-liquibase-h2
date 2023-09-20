package com.h2liquibase.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "author")
//    private Author author;
}
