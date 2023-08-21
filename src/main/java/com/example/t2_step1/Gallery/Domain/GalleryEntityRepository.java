package com.example.t2_step1.Gallery.Domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GalleryEntityRepository extends JpaRepository<GalleryEntity,Integer>, JpaSpecificationExecutor<GalleryEntity> {



}
