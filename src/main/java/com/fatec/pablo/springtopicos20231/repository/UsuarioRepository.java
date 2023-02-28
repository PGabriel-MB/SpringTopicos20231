package com.fatec.pablo.springtopicos20231.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.pablo.springtopicos20231.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
