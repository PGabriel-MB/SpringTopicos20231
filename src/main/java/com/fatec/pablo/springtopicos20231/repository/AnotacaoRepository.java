package com.fatec.pablo.springtopicos20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.pablo.springtopicos20231.entity.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long> {
    
}
