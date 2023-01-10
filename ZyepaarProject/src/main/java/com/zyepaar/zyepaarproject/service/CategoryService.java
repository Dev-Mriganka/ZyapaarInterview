package com.zyepaar.zyepaarproject.service;

import com.zyepaar.zyepaarproject.entity.Category;
import com.zyepaar.zyepaarproject.exception.CategoryException;

public interface CategoryService {

   public String addCategory(Category category) throws CategoryException;

}
