package com.fatec.pablo.springtopicos20231.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.fatec.pablo.springtopicos20231.entity.Medicao;
import com.fatec.pablo.springtopicos20231.repository.MedicaoRepository;

@Service
public class MedicaoService implements IMedicaoService {
    
    @Autowired
    private MedicaoRepository medicaoRepo;

    public Medicao novaMedicao(Medicao medicao) {
        if( medicao == null || medicao.getData_hora() == null){
            throw new IllegalArgumentException("Temperatura necessária");
        }
        return medicaoRepo.save(medicao);
    }

    public List<Medicao> buscarTodosOsRegistros(){
        return medicaoRepo.findAll();
    }
    public Medicao buscarPorId(Long id) {
        Optional<Medicao> medicaoOp = medicaoRepo.findById(id);
        if( medicaoOp.isEmpty()){
            throw new IllegalArgumentException("Id inexistente");
        }
        return medicaoOp.get();
    }
}
