package com.example.t2_step1.Gallery.Domain;


import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
