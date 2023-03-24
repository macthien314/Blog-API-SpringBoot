package com.mt.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mt.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
