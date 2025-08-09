package service;

import dto.AryanDTO;
import repository.AryanRepository;
import repository.AryanRepositoryImpl;

public class AryanServiceImpl implements AryanService{
    @Override
    public String validateandSave(AryanDTO aryanDTO) {
        if (aryanDTO != null) {
            AryanRepository aryanRepository = new AryanRepositoryImpl();
            aryanRepository.save(aryanDTO);
        }
        return "done";
    }
}
