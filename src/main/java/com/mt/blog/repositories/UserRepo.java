package com.mt.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mt.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
