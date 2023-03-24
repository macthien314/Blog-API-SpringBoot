package com.mt.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mt.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
