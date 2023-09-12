package com.h2liquibase.repositories;

import com.h2liquibase.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherReposiroty extends JpaRepository<Publisher, Integer> {
}
