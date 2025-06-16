package com.xworkz.application.service;

import com.xworkz.application.dto.*;
import com.xworkz.application.repository.JobRepository;
import com.xworkz.application.repository.JobRepositoryImp;

public class JobServiceImpl implements JobService {
    @Override
    public String validateAndSave(JobDTO jobDTO) {
        System.out.println("Running validateAndSave in JobServiceImpl");
       if(jobDTO!=null){
           JobRepository jobRepository=new JobRepositoryImp();
           jobRepository.run();
       }
       return "Done";
    }

}
