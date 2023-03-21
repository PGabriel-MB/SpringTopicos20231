package com.fatec.pablo.springtopicos20231.service;

import java.util.List;

import com.fatec.pablo.springtopicos20231.entity.Autorizacao;

public interface IAutorizacaoService {
    public Autorizacao novaAutorizacao(Autorizacao usuario);

    public List<Autorizacao> buscarTodasAutorizacoes();

    public Autorizacao buscarAutorizacaoPorId(Long id);
}
