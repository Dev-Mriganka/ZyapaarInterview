package com.zyapaar.zyapaarimageproject.controller;

import com.zyapaar.zyapaarimageproject.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ImageController {

    @Autowired
    ImageService imageService;

    @PostMapping
    public ResponseEntity<String> uploadImage(@RequestParam("image")MultipartFile file)throws IOException {
        return new ResponseEntity<String>(imageService.saveImage(file), HttpStatus.CREATED);
    }

}
