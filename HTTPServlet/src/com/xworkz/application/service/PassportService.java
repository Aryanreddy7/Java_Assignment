package com.xworkz.application.service;

import com.xworkz.application.dto.PassportDTO;

public interface PassportService {
    public String validateAndSave(PassportDTO passportDTO);
}
