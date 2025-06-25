package com.xworkz.Construction.service;


import com.xworkz.Construction.dto.ConstructionDTO;

public interface ConstructionService {
    public String validateAndSave(ConstructionDTO constructionDTO);

    default ConstructionDTO findById(int id){
        return  null;
    }
}
