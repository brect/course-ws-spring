package com.blimas.course.services;

import com.blimas.course.entities.Order;
import com.blimas.course.entities.User;
import com.blimas.course.repositories.OrderRepository;
import com.blimas.course.repositories.UserRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }

}
