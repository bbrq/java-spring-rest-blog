package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pluralsight.blog.model.Author;

@Component
public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}