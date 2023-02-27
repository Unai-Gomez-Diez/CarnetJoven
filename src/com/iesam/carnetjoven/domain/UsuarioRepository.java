package com.iesam.carnetjoven.domain;

import com.iesam.carnetjoven.domain.models.Usuario;

import java.util.List;

public interface UsuarioRepository {
    public void save(Usuario usuario);


    public List<Usuario> getAll();
}
