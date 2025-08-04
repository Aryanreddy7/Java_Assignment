package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class CompanyDTO implements Serializable {
    String name;
    String gstNumber;
    String type;
    String industry;
    ProductDTO productdto;

//    public CompanyDTO(String industry, String name, String gstNumber, String type) {
//        this.industry = industry;
//        this.name = name;
//        this.gstNumber = gstNumber;
//        this.type = type;
//
//    }
}
