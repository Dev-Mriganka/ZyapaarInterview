package com.zyepaar.zyepaarproject.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Item {
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer itemId;

   @Size(min = 2)
   private String itemName;

   @NotNull
   private Double price;

   private Integer stock;

   @ManyToOne(cascade = CascadeType.ALL)
   private Category category;

}
