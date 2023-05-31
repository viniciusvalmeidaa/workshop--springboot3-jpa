package com.educancoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educancoweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
