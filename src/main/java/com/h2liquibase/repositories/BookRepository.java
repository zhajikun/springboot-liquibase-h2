package com.h2liquibase.repositories;

import com.h2liquibase.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
