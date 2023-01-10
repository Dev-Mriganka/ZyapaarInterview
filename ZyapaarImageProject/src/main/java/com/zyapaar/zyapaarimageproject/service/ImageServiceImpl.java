package com.zyapaar.zyapaarimageproject.service;

import com.fasterxml.jackson.databind.util.NativeImageUtil;
import com.zyapaar.zyapaarimageproject.entity.Image;
import com.zyapaar.zyapaarimageproject.repository.ImageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageServiceImpl implements ImageService{

    @Autowired
    private ImageRepo imageRepo;
    @Override
    public String saveImage(MultipartFile file) throws IOException {

        Image img = new Image();
        img.setName(file.getOriginalFilename());
        img.setType(file.getContentType());
        img.setImageData(file.getBytes());

        Image newImg = imageRepo.save(img);

        return "Image uploaded";
    }
}
