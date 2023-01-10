package com.zyepaar.zyepaarproject.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category {
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer categoryId;

   @Size(min = 2)
   private String categoryName;

   
   @OneToMany(mappedBy = "category")
   @JsonIgnore
   private List<Item> items;

}
