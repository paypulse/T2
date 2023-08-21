package com.example.t2_step1.Gallery.Service;

import com.example.t2_step1.Gallery.Domain.GalleryEntityRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GalleryService {

    @Autowired
    private GalleryEntityRepository galleryEntityRepository;



}
