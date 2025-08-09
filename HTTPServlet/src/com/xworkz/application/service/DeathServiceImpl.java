package com.xworkz.application.service;

import com.xworkz.application.dto.DeathDTO;
import com.xworkz.application.repository.DeathRepository;
import com.xworkz.application.repository.DeathRepositoryImp;

public class DeathServiceImpl implements DeathService{
    @Override
    public String validateAndSave(DeathDTO deathDTO) {
        if(deathDTO!=null){
            DeathRepository deathRepository=new DeathRepositoryImp();
            deathRepository.run();
        }
        return "Done";
    }
}
