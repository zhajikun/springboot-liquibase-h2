package com.h2liquibase.repositories;


import com.h2liquibase.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
