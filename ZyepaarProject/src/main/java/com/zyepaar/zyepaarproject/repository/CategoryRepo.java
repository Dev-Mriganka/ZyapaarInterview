package com.zyepaar.zyepaarproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zyepaar.zyepaarproject.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
   
   Optional<Category> findByCategoryName(String categoryName);

}
