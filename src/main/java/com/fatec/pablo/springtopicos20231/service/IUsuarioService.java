package com.fatec.pablo.springtopicos20231.service;

import java.util.List;

import com.fatec.pablo.springtopicos20231.entity.Usuario;

public interface IUsuarioService {
    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> buscarTodosUsuarios();
    
    public Usuario buscarUsuarioPorIdUsuario(Long id);
}
