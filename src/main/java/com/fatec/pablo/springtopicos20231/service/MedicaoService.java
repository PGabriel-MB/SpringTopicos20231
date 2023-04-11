package com.fatec.pablo.springtopicos20231.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.pablo.springtopicos20231.repository.MedicaoRepository;

@Service
public class MedicaoService implements IMedicaoService {
    
    @Autowired
    private MedicaoRepository medicaoRepo;

    public Medicao novaMedicao()
}
