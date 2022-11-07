package com.school.ecommerceupch.services.interfaces;

import org.springframework.web.multipart.MultipartFile;

public interface IFileService {

    String upload(MultipartFile multipartFile);

    void delete(String imageUrl);

}
