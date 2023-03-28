package com.fatec.pablo.springtopicos20231.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.pablo.springtopicos20231.entity.Anotacao;
import com.fatec.pablo.springtopicos20231.entity.Usuario;
import com.fatec.pablo.springtopicos20231.repository.AnotacaoRepository;
import com.fatec.pablo.springtopicos20231.repository.UsuarioRepository;

@Service
public class AnotacaoService implements IAnotacaoService {
    
    @Autowired
    private UsuarioRepository usuarioRepo;

    @Autowired
    private AnotacaoRepository anotacaoRepo;

    @Transactional
    public Anotacao novaAnotacao(Anotacao anotacao) {
        Long idUsuario = anotacao.getUsuario().getId();
        Optional<Usuario> usuarioOp = usuarioRepo.findById(idUsuario);
        if(usuarioOp.isEmpty()) {
            throw new IllegalArgumentException("Usuário não existe!");
        }
        if(anotacao.getDataHora() == null) {
            anotacao.setDataHora(LocalDateTime.now());
        }
        anotacao.setUsuario(usuarioOp.get());
        return anotacaoRepo.save(anotacao);
    }

    public List<Anotacao> buscarTodas() {
        return anotacaoRepo.findAll();
    }
}
