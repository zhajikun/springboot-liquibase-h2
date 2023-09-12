package com.h2liquibase.business;


import com.h2liquibase.entities.Author;
import com.h2liquibase.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Component
public class AuthorsManager {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorsManager(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Stream<Author> getAllAuthors() {
        return StreamSupport.stream(authorRepository.findAll().spliterator(), true);
    }
}
