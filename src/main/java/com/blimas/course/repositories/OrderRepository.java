package com.blimas.course.repositories;

import com.blimas.course.entities.Order;
import com.blimas.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
