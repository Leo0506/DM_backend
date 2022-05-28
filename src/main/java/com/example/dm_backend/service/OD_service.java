package com.example.dm_backend.service;

import com.example.dm_backend.model.OD;
import com.example.dm_backend.model.TaxiUpdated;
import com.example.dm_backend.repository.ODRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OD_service {
    @Autowired
    ODRepository odRepository;

    public List<OD> findOD(int id){
        return odRepository.findODByTaxiId(id);
    }
}
