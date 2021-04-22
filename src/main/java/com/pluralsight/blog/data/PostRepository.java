package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.pluralsight.blog.model.Post;

//to create the REST API endpoints
public interface PostRepository extends JpaRepository<Post, Long> {
}