package com.educancoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educancoweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
