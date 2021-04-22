package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import com.pluralsight.blog.model.Author;

@Component
//can't browse the authors at all except to be displayed within a Post
//check by localhost:8080

@RepositoryRestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}