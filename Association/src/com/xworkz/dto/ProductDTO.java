package com.xworkz.dto;


import lombok.*;

import java.io.Serializable;

@ToString @Getter @Setter@EqualsAndHashCode

public class ProductDTO implements Serializable {
    String productName;
    String category;
    double price;
    boolean inStock;

    public ProductDTO(String productName, String category, double price, boolean inStock) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.inStock = inStock;
    }
}
