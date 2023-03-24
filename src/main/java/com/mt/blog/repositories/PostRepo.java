package com.mt.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mt.blog.entities.Category;
import com.mt.blog.entities.Post;
import com.mt.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {
	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
}
