package com.xworkz.application.service;

import com.xworkz.application.dto.MarriageDTO;
import com.xworkz.application.repository.MarriageRepository;
import com.xworkz.application.repository.MarriageRepositoryImp;

public class MarriageServiceImpl implements MarriageService{
    @Override
    public String validateAndSave(MarriageDTO marriageDTO) {
        if(marriageDTO!=null){
            MarriageRepository marriageRepository=new MarriageRepositoryImp();
            marriageRepository.run();
        }
        return "Done";
    }
}
