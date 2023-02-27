package com.iesam.carnetjoven.data;

import com.iesam.carnetjoven.data.local.EmpresaFileLocalDataSource;
import com.iesam.carnetjoven.domain.EmpresaRepository;
import com.iesam.carnetjoven.domain.models.Empresa;

import java.util.List;

public class EmpresaDataRepository implements EmpresaRepository {

    private EmpresaFileLocalDataSource localDataSource;

    public EmpresaDataRepository(EmpresaFileLocalDataSource instance) {
        this.localDataSource=instance;
    }

    @Override
    public void save(Empresa empresa) {
        this.localDataSource.save(empresa);
    }

    @Override
    public List<Empresa> getAll() {
        return this.localDataSource.findAll();
    }
}
