package com.xworkz.application.service;

import com.xworkz.application.dto.DrivingLicenseDTO;
import com.xworkz.application.repository.DeathRepository;
import com.xworkz.application.repository.DeathRepositoryImp;
import com.xworkz.application.repository.DrivingLicenseRepository;
import com.xworkz.application.repository.DrivingLicenseRepositoryImp;

public class DrivingLicenseServiceImpl implements DrivingLicenseService{
    @Override
    public String validateAndSave(DrivingLicenseDTO drivingLicenseDTO) {
        if(drivingLicenseDTO!=null){
            DrivingLicenseRepository drivingLicenseRepository=new DrivingLicenseRepositoryImp();
            drivingLicenseRepository.run();
        }
        return "Done";
    }
}
