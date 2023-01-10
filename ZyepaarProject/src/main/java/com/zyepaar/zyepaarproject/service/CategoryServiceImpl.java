package com.zyepaar.zyepaarproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyepaar.zyepaarproject.entity.Category;
import com.zyepaar.zyepaarproject.exception.CategoryException;
import com.zyepaar.zyepaarproject.repository.CategoryRepo;

@Service
public class CategoryServiceImpl implements CategoryService {

   @Autowired
   private CategoryRepo categoryRepo;

   @Override
   public String addCategory(Category category) throws CategoryException {
      
      System.out.println(category.getCategoryName());

      boolean flag = categoryRepo.findByCategoryName(category.getCategoryName()).isPresent();

      if (flag)
         throw new CategoryException("Category is already present");


      categoryRepo.save(category);

      return "Category added successfully...";
   }
   
}
