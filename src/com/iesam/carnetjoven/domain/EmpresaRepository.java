package com.iesam.carnetjoven.domain;

import com.iesam.carnetjoven.domain.models.Empresa;

import java.util.List;

public interface EmpresaRepository {
    public void save(Empresa empresa);

    public List<Empresa> getAll();
}
