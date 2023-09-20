package com.h2liquibase.service;



import com.h2liquibase.entities.Book;
import com.h2liquibase.repositories.BookRepository;

import java.util.List;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksServices {

  private BookRepository bookRepository;

  @Autowired
  public BooksServices(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }
}
