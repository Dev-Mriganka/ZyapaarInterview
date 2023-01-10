package com.zyepaar.zyepaarproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyepaar.zyepaarproject.entity.Category;
import com.zyepaar.zyepaarproject.entity.Item;
import com.zyepaar.zyepaarproject.exception.CategoryException;
import com.zyepaar.zyepaarproject.exception.ItemException;
import com.zyepaar.zyepaarproject.repository.CategoryRepo;
import com.zyepaar.zyepaarproject.repository.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService {

   @Autowired
   private ItemRepo itemRepo;

   @Autowired
   private CategoryRepo categoryRepo;


   @Override
   public Item addItem(Item item, Integer categoryId) throws CategoryException {
      
      Category category = categoryRepo.findById(categoryId).orElseThrow(() -> new CategoryException("Category is not present"));

      item.setCategory(category);

      category.getItems().add(item);

      Item newItem = itemRepo.save(item);

      return newItem;
   }

   @Override
   public Item editItem(Item item) throws ItemException {
      
      Item exItem = itemRepo.findById(item.getItemId()).orElseThrow(() -> new ItemException("Item is not present"));

      item.setCategory(exItem.getCategory());

      Item newItem = itemRepo.save(item);

      return newItem;
   }

   @Override
   public List<Item> getAllItem() throws ItemException{
      
      List<Item> items = itemRepo.findAll();
      
      if (items.size() == 0)
         throw new ItemException("No item is present");

      return items;
   }

   @Override
   public Item removeItem(Integer itemId) throws ItemException{

      Item exItem = itemRepo.findById(itemId).orElseThrow(() -> new ItemException("Item is not present"));

      itemRepo.delete(exItem);

      return exItem;
   }

   @Override
   public Integer getStock(Integer itemId) throws ItemException {
      
      Item exItem = itemRepo.findById(itemId).orElseThrow(() -> new ItemException("Item is not present"));

      return exItem.getStock();
   }
   
}
