package com.blimas.course.repositories;

import com.blimas.course.entities.OrderItem;
import com.blimas.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
