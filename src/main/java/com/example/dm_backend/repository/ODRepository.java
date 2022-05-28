package com.example.dm_backend.repository;


import com.example.dm_backend.model.OD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ODRepository extends JpaRepository<OD,Integer> {
    List<OD> findODByTaxiId(int taxiId);

}
