package com.fatec.pablo.springtopicos20231.service;

import com.fatec.pablo.springtopicos20231.entity.Anotacao;

import java.util.List;

public interface IAnotacaoService {
    public Anotacao novaAnotacao(Anotacao anotacao);

    public List<Anotacao> buscarTodas();
}
