package com.xworkz.application.service;

import com.xworkz.application.dto.PassportDTO;
import com.xworkz.application.repository.PassportRepository;
import com.xworkz.application.repository.PassportRepositoryImp;

public class PassportServiceImpl implements PassportService{

    @Override
    public String validateAndSave(PassportDTO passportDTO) {
        if(passportDTO!=null){
            PassportRepository passportRepository=new PassportRepositoryImp();
            passportRepository.run();
        }
        return "Done";
    }
}
