package com.xworkz.Runner;

import com.xworkz.dto.CompanyDTO;
import com.xworkz.dto.OwnerDTO;
import com.xworkz.dto.ProductDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ProductDTO productDTO=new ProductDTO("Nut","Steel",2000,true);
        CompanyDTO companyDTO=new CompanyDTO("Aryan","atta345","Steel","Arysn",productDTO);
        OwnerDTO ownerDTO=new OwnerDTO("Areyan","aryan@h",98876654L,true,companyDTO);
        Collection<OwnerDTO> owners = new ArrayList<>();
        owners.add(ownerDTO);
        owners.stream()
                .filter(o -> o.getName().equals("Areyan"))
                .map(o -> o.getName().getproductNa().getName()) // get product name from nested chain
                .forEach(System.out::println);





    }
}
