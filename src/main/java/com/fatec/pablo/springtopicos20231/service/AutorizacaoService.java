package com.fatec.pablo.springtopicos20231.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.pablo.springtopicos20231.entity.Autorizacao;
import com.fatec.pablo.springtopicos20231.exception.AutorizacaoNaoEncontradaException;
import com.fatec.pablo.springtopicos20231.repository.AutorizacaoRepository;

@Service
public class AutorizacaoService implements IAutorizacaoService {
    
    @Autowired
    private AutorizacaoRepository autorizacaoRepo;

    public Autorizacao novaAutorizacao(Autorizacao autorizacao) {
        if(autorizacao == null || autorizacao.getNome() == null) {
            throw new IllegalArgumentException("Nome inválido");
        }

        return autorizacaoRepo.save(autorizacao);
    }

    public List<Autorizacao> buscarTodasAutorizacoes() {
        return autorizacaoRepo.findAll();
    }

    public Autorizacao buscarAutorizacaoPorId(Long id) {
        Optional<Autorizacao> autorizacaoOp = autorizacaoRepo.findById(id);
        if(autorizacaoOp.isEmpty()) {
            throw new AutorizacaoNaoEncontradaException("Autorizacao não encontrada");
        }

        return autorizacaoOp.get();
    }
}
