package com.fatec.pablo.springtopicos20231.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.pablo.springtopicos20231.entity.Medicao;
import com.fatec.pablo.springtopicos20231.service.IMedicaoService;

@RestController
@CrossOrigin
@RequestMapping( value = "/medicao" )
public class MedicaoController {
    @Autowired
    private IMedicaoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Medicao novaMedicao(@RequestBody Medicao Medicao) {
        return service.novaMedicao(Medicao);
    }

    @GetMapping
    public List<Medicao> listarMedicao(){
        return service.buscarTodosOsRegistros();
    }

    @GetMapping(value = "/id/{id}")
    public Medicao buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }
}
