package com.zyepaar.zyepaarproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zyepaar.zyepaarproject.entity.Category;
import com.zyepaar.zyepaarproject.entity.Item;
import com.zyepaar.zyepaarproject.exception.CategoryException;
import com.zyepaar.zyepaarproject.exception.ItemException;
import com.zyepaar.zyepaarproject.service.CategoryService;
import com.zyepaar.zyepaarproject.service.ItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("zyapaar")
public class StoreController {

   @Autowired
   private ItemService itemService;

   @Autowired
   private CategoryService categoryService;

   @PostMapping("/item/add")
   public ResponseEntity<Item> addItemHandler(@RequestBody @Valid Item item, @RequestParam Integer categoryId)
         throws CategoryException {

      Item newItem = itemService.addItem(item, categoryId);

      return new ResponseEntity<Item>(newItem, HttpStatus.CREATED);

   }

   @PutMapping("/item/update")
   public ResponseEntity<Item> editItemHandler(@RequestBody @Valid Item item)
         throws ItemException {

      Item newItem = itemService.editItem(item);

      return new ResponseEntity<Item>(newItem, HttpStatus.ACCEPTED);

   }

   @GetMapping("/item/getAll")
   public ResponseEntity<List<Item>> getAllItemHandler()
         throws ItemException {

      List<Item> items = itemService.getAllItem();

      return new ResponseEntity<List<Item>>(items, HttpStatus.OK);

   }

   @DeleteMapping("/item/remove/{itemId}")
   public ResponseEntity<Item> removeItemHandler(@PathVariable Integer itemId)
         throws ItemException {

      Item newItem = itemService.removeItem(itemId);

      return new ResponseEntity<Item>(newItem, HttpStatus.OK);

   }

   @GetMapping("/item/stock/{itemId}")
   public ResponseEntity<Integer> getStockHandler(@PathVariable Integer itemId) throws ItemException {

      Integer stock = itemService.getStock(itemId);

      return new ResponseEntity<Integer>(stock, HttpStatus.OK);

   }

   @PostMapping("/category/add")
   public ResponseEntity<String> addCategoryHandler(@RequestBody @Valid Category category) throws CategoryException {

      return new ResponseEntity<String>(categoryService.addCategory(category), HttpStatus.OK);

   }

}
