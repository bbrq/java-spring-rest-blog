package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.blog.model.Post;

//to create the REST API endpoints
public interface PostRepository extends JpaRepository<Post, Long> {
	//check query definition by: http://localhost:8080/posts/search ->
	//http://localhost:8080/posts/search/findByTitleContaining{?title}"
	//http://localhost:8080/posts/search/findByTitleContaining?title=Smart
	List<Post> findByTitleContaining(String title);
}