package com.h2liquibase.service;


import com.h2liquibase.entities.Publisher;
import com.h2liquibase.repositories.PublisherReposiroty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    private PublisherReposiroty publisherReposiroty;

    @Autowired
    public PublisherService(PublisherReposiroty publisherReposiroty) {
        this.publisherReposiroty = publisherReposiroty;
    }

    public List<Publisher> getPublishers(){
        return publisherReposiroty.findAll();
    }

}
