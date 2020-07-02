package com.blimas.course.repositories;

import com.blimas.course.entities.Category;
import com.blimas.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
