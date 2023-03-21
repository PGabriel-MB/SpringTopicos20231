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

import com.fatec.pablo.springtopicos20231.entity.Autorizacao;
import com.fatec.pablo.springtopicos20231.service.IAutorizacaoService;

@RestController
@CrossOrigin
@RequestMapping(value = "/autorizacao")
public class AutorizacaoController {
    @Autowired
    private IAutorizacaoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Autorizacao novaAutorizacao(@RequestBody Autorizacao autorizacao) {
        return service.novaAutorizacao(autorizacao);
    }

    @GetMapping
    public List<Autorizacao> buscarTodasAutorizacoes() {
        return service.buscarTodasAutorizacoes();
    }

    @GetMapping(value = "/id/{id}")
    public Autorizacao buscarAutorizacaoPorId(@PathVariable Long id) {
        return service.buscarAutorizacaoPorId(id);
    }
}
