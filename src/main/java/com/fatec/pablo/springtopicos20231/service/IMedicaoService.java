package com.fatec.pablo.springtopicos20231.service;

import java.util.List;

import com.fatec.pablo.springtopicos20231.entity.Medicao;

public interface IMedicaoService {
    public Medicao novaMedicao(Medicao medicao);

    public List<Medicao> buscarTodosOsRegistros();

    public Medicao buscarPorId(Long id);
}
