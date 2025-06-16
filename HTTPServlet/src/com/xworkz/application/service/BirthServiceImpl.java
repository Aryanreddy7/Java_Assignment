package com.xworkz.application.service;

import com.xworkz.application.dto.BirthDTO;
import com.xworkz.application.repository.BirthRepository;
import com.xworkz.application.repository.BirthRepositoryImp;

public class BirthServiceImpl implements BirthService{
    @Override
    public String validateAndSave(BirthDTO birthDTO) {

        if(birthDTO!=null){
            BirthRepository birthRepository=new BirthRepositoryImp();
            birthRepository.save();
        }
        return "Done";
    }
}
