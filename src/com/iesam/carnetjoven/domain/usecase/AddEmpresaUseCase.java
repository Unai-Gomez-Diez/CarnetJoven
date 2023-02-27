package com.iesam.carnetjoven.domain.usecase;

import com.iesam.carnetjoven.domain.EmpresaRepository;
import com.iesam.carnetjoven.domain.models.Empresa;

public class AddEmpresaUseCase {

    private EmpresaRepository repository;

    public AddEmpresaUseCase(EmpresaRepository repository){
        this.repository=repository;
    }

    public void execute(Empresa empresa){
        this.repository.save(empresa);
    }
}
