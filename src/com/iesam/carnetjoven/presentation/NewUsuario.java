package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.data.UsuarioDataRepository;
import com.iesam.carnetjoven.data.local.UsuarioFileLocalDataSource;
import com.iesam.carnetjoven.domain.models.Usuario;
import com.iesam.carnetjoven.domain.usecase.AddUsuarioUseCase;

public class NewUsuario {
    public void createUsuario() {
        Usuario usuario = buildUsuario();
        saveUsuario(usuario);
    }

    private void saveUsuario(Usuario usuario) {
        AddUsuarioUseCase addUsuarioUseCase = new AddUsuarioUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        addUsuarioUseCase.execute(usuario);
    }


    private Usuario buildUsuario() {
        Usuario usuario = new Usuario();
        usuario.setDni("70845257J");
        usuario.setNombre("Unai");
        usuario.setApellidos("Gomez Diez");
        usuario.setDireccion("nose");


        return usuario;
    }
}
