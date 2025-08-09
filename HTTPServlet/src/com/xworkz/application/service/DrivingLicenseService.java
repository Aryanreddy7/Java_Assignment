package com.xworkz.application.service;

import com.xworkz.application.dto.DrivingLicenseDTO;

public interface DrivingLicenseService {
    public String validateAndSave(DrivingLicenseDTO drivingLicenseDTO);
}
