package com.zyepaar.zyepaarproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zyepaar.zyepaarproject.entity.Item;

public interface ItemRepo extends JpaRepository<Item, Integer>{
   
   

}
