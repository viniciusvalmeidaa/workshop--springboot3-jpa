package com.educancoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educancoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
