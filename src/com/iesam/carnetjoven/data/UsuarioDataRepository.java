package com.iesam.carnetjoven.data;

import com.iesam.carnetjoven.data.local.UsuarioFileLocalDataSource;
import com.iesam.carnetjoven.domain.UsuarioRepository;
import com.iesam.carnetjoven.domain.models.Usuario;

import java.util.List;

public class UsuarioDataRepository implements UsuarioRepository {

    private UsuarioFileLocalDataSource localDataSource;

    public UsuarioDataRepository(UsuarioFileLocalDataSource instance) {
        this.localDataSource=instance;
    }

    @Override
    public void save(Usuario usuario) {
        this.localDataSource.save(usuario);
    }

    @Override
    public List<Usuario> getAll() {
        return this.localDataSource.findAll();
    }
}
