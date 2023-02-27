package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.data.UsuarioDataRepository;
import com.iesam.carnetjoven.data.local.UsuarioFileLocalDataSource;
import com.iesam.carnetjoven.domain.models.Usuario;
import com.iesam.carnetjoven.domain.usecase.GetUsuarioUseCase;

import java.util.List;

public class PrintsUsuario {
    public void print() {
        GetUsuarioUseCase useCase = new GetUsuarioUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        List<Usuario> usuarios = useCase.execute();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }
    }


}
