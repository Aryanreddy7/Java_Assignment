package com.xworkz.streamandoptional.Dto;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode

public class CountriesDTO {


    private String name;
    private int pinCode;
    private Long populationInMillions;
    private int noOfStates;
    private int massInSqKms;
    private  String primeMinister;
    private String primaryLang;
    private  String secondaryLang;
    private int gdp;
}

