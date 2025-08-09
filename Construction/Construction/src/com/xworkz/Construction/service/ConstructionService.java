package com.xworkz.Construction.service;


import com.xworkz.Construction.dto.ConstructionDTO;

import java.util.List;

public interface ConstructionService {
    public String validateAndSave(ConstructionDTO constructionDTO);

    default ConstructionDTO findById(int id){
        return  null;

    }
}
