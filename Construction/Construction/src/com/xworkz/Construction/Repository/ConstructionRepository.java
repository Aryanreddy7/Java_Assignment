package com.xworkz.Construction.Repository;

import com.xworkz.Construction.dto.ConstructionDTO;

import java.util.List;

public interface ConstructionRepository {
    String save(ConstructionDTO dto);

    ConstructionDTO findById(int id);
}
