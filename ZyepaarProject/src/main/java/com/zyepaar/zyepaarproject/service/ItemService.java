package com.zyepaar.zyepaarproject.service;

import java.util.List;

import com.zyepaar.zyepaarproject.entity.Item;
import com.zyepaar.zyepaarproject.exception.CategoryException;
import com.zyepaar.zyepaarproject.exception.ItemException;

public interface ItemService {

   public Item addItem(Item item, Integer categoryId) throws CategoryException, CategoryException;

   public Item editItem(Item item) throws ItemException;

   public List<Item> getAllItem() throws ItemException;

   public Item removeItem(Integer itemId) throws ItemException;

   public Integer getStock(Integer itemId) throws ItemException;

}
