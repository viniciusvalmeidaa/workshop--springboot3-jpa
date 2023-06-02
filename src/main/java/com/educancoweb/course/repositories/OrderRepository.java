package com.educancoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educancoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
