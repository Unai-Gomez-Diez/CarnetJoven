package com.iesam.carnetjoven.domain.usecase;

import com.iesam.carnetjoven.domain.UsuarioRepository;
import com.iesam.carnetjoven.domain.models.Usuario;

import java.util.List;

public class GetUsuarioUseCase {
    private UsuarioRepository repository;

    public GetUsuarioUseCase(UsuarioRepository repository){
        this.repository=repository;
    }

    public List<Usuario> execute(){
        return this.repository.getAll();
    }
}
