package com.blimas.course.repositories;

import com.blimas.course.entities.Category;
import com.blimas.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
