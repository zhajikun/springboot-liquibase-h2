package com.h2liquibase.controller.impl;

import com.h2liquibase.controller.Controller;
import com.h2liquibase.entities.Author;
import com.h2liquibase.entities.Book;
import com.h2liquibase.entities.Publisher;
import com.h2liquibase.service.AuthorsService;
import com.h2liquibase.service.BooksServices;
import com.h2liquibase.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ControllerImpl implements Controller {

    @Autowired
    private AuthorsService authorsService;

    @Autowired
    private BooksServices booksServices;

    @Autowired
    private PublisherService publisherService;

    @Override
    public List<Book> getAllBooks() {
        return booksServices.getAllBooks();
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorsService.getAllAuthors();
    }

    @Override
    public List<Publisher> getAllPublishers() {
        return publisherService.getPublishers();
    }
}
