package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.data.CompraDataRepository;
import com.iesam.carnetjoven.data.EmpresaDataRepository;
import com.iesam.carnetjoven.data.local.CompraFileLocalDataSource;
import com.iesam.carnetjoven.data.local.EmpresaFileLocalDataSource;
import com.iesam.carnetjoven.domain.models.Compra;
import com.iesam.carnetjoven.domain.models.Empresa;
import com.iesam.carnetjoven.domain.usecase.GetCompraUseCase;
import com.iesam.carnetjoven.domain.usecase.GetEmpresaUseCase;

import java.util.List;

public class PrintCompra {
    public void print() {
        GetCompraUseCase useCase = new GetCompraUseCase(new CompraDataRepository(CompraFileLocalDataSource.getInstance().getInstance()));
        List<Compra> compras = useCase.execute();
        for (Compra compra : compras) {
            System.out.println(compra.toString());
        }
    }
}
