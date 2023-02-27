package com.iesam.carnetjoven.domain.usecase;

import com.iesam.carnetjoven.domain.UsuarioRepository;
import com.iesam.carnetjoven.domain.models.Usuario;

public class AddUsuarioUseCase {
    private UsuarioRepository repository;

    public AddUsuarioUseCase(UsuarioRepository repository){
        this.repository=repository;
    }

    public void execute(Usuario usuario){
        this.repository.save(usuario);
    }
}
