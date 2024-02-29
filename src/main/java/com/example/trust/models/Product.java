package com.example.trust.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String text;
    private String price;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Image> images=new ArrayList<>();
    private Long previewImageId;
    private Long secondPreviewImageId;
    public  void addImageCompany(Image image){
        image.setProduct(this);
        images.add(image);
    }
}
