package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class OwnerDTO implements Serializable {
    String name;
    String email;
    long phone;
    boolean verified;
    CompanyDTO companyDTO;
//
//    public OwnerDTO(String[] name, String email, long phone, boolean verified) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//        this.verified = verified;
//    }
}
