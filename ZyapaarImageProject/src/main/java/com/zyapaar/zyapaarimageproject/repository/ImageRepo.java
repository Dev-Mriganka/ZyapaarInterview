package com.zyapaar.zyapaarimageproject.repository;

import com.zyapaar.zyapaarimageproject.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Image, Integer> {
}
