package com.h2liquibase.entities;


import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(nullable = false, unique = true)
  private String name;

  @ManyToOne
  @JoinColumn(name = "author")
  private Author author;

  protected Book() {
    // for JPA
  }

  public Book(int id, String name, Author author) {
    this.id = id;
    this.name = name;
    this.author = author;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Author getAuthor() {
    return author;
  }

  @Override
  public String toString() {
    return "Book{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", author=" + author +
        '}';
  }
}
