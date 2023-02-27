package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.data.EmpresaDataRepository;
import com.iesam.carnetjoven.data.UsuarioDataRepository;
import com.iesam.carnetjoven.data.local.EmpresaFileLocalDataSource;
import com.iesam.carnetjoven.data.local.UsuarioFileLocalDataSource;
import com.iesam.carnetjoven.domain.models.Empresa;
import com.iesam.carnetjoven.domain.models.Usuario;
import com.iesam.carnetjoven.domain.usecase.AddEmpresaUseCase;
import com.iesam.carnetjoven.domain.usecase.AddUsuarioUseCase;

public class NewEmpresa {
    public void createEmpresa() {
        Empresa empresa = buildEmpresa();
        saveEmpresa(empresa);
    }

    private void saveEmpresa(Empresa empresa) {
        AddEmpresaUseCase addEmpresaUseCase = new AddEmpresaUseCase(new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance()));
        addEmpresaUseCase.execute(empresa);
    }


    private Empresa buildEmpresa() {
        Empresa empresa = new Empresa();
        empresa.setId(1);
        empresa.setNombre("Resolver.s.l");
        empresa.setCif("90356840J");


        return empresa;
    }
}
