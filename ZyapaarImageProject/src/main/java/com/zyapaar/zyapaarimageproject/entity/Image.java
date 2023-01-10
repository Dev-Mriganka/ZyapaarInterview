package com.zyapaar.zyapaarimageproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String type;

    @Lob
    @Column(length = 1000)
    private byte[] imageData;

}
