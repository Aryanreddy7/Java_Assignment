package com.xworkz.Construction.service;


import com.xworkz.Construction.Repository.ConstructionRepository;
import com.xworkz.Construction.Repository.ConstructionRepositoryImpl;
import com.xworkz.Construction.dto.ConstructionDTO;

public class ConstructionServiceImpl implements ConstructionService {

    @Override
    public String validateAndSave(ConstructionDTO constructionDTO) {
        if (constructionDTO != null) {
            String name=constructionDTO.getFullName();
            if(name==null||name.length()<4||name.length()>20){
                System.out.println("Name is invalid");
                return "Please enter valid name";
            }
            ConstructionRepository constructionRepository = new ConstructionRepositoryImpl();
            constructionRepository.save(constructionDTO);
        }
        return "Sucessfully Submited";
    }
    public ConstructionDTO findById(int id){
        if (id<0){
            System.out.println("id is invalid");
            return null;
        }
        else {
            System.out.println("Id is valid");
            ConstructionRepository constructionRepository=new ConstructionRepositoryImpl();
            return constructionRepository.findById(id);
        }
        }
    }
