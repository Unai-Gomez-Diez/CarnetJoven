package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.data.EmpresaDataRepository;
import com.iesam.carnetjoven.data.local.EmpresaFileLocalDataSource;
import com.iesam.carnetjoven.domain.models.Empresa;
import com.iesam.carnetjoven.domain.usecase.GetEmpresaUseCase;

import java.util.List;

public class PrintsEmpresa {
    public void print() {
        GetEmpresaUseCase useCase = new GetEmpresaUseCase(new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance()));
        List<Empresa> empresas = useCase.execute();
        for (Empresa empresa : empresas) {
            System.out.println(empresa.toString());
        }
    }
}
