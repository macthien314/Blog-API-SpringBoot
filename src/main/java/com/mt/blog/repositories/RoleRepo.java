package com.mt.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mt.blog.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
