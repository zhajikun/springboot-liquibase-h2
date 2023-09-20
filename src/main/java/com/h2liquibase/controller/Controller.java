package com.h2liquibase.controller;


import com.h2liquibase.entities.Author;
import com.h2liquibase.entities.Book;
import com.h2liquibase.entities.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequestMapping("/")
public interface Controller {


    @GetMapping("books")
    List<Book> getAllBooks();

    @GetMapping("authors")
    List<Author> getAllAuthors();

    @GetMapping("publishers")
    List<Publisher> getAllPublishers();
}
