package com.example.t2_step1.Gallery.Domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "GallertEntity")
public class GalleryEntity {

    @Id
    private String id;

    @Column
    private String contentTypeId;

    @Column
    private String galTitle;

    @Column
    private String galWebImageUrl;

    @Column
    private String galPhotographyLocation;


}
