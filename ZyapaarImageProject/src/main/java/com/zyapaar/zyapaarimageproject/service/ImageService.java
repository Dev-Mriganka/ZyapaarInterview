package com.zyapaar.zyapaarimageproject.service;

import com.zyapaar.zyapaarimageproject.entity.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {

    public String saveImage(MultipartFile file) throws IOException;

}
