package com.iesam.carnetjoven.domain.usecase;

import com.iesam.carnetjoven.domain.EmpresaRepository;
import com.iesam.carnetjoven.domain.models.Empresa;

import java.util.List;

public class GetEmpresaUseCase {
    private EmpresaRepository repository;

    public GetEmpresaUseCase(EmpresaRepository repository){
        this.repository=repository;
    }

    public Empresa execute(Integer id){
        return this.repository.;
    }
}
