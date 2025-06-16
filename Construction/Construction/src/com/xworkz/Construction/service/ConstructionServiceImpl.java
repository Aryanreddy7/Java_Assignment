package com.xworkz.Construction.service;


import com.xworkz.Construction.Repository.ConstructionRepository;
import com.xworkz.Construction.Repository.ConstructionRepositoryImpl;
import com.xworkz.Construction.dto.ConstructionDTO;

public class ConstructionServiceImpl implements ConstructionService {

    @Override
    public String validateAndSave(ConstructionDTO constructionDTO) {
        if (constructionDTO != null) {
            ConstructionRepository constructionRepository = new ConstructionRepositoryImpl();
            constructionRepository.save(constructionDTO);
        }
        return "Done";
    }
}