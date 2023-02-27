package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.data.EmpresaDataRepository;
import com.iesam.carnetjoven.data.PromocionDataRepository;
import com.iesam.carnetjoven.data.local.EmpresaFileLocalDataSource;
import com.iesam.carnetjoven.data.local.PromocionFileLocalDataSource;
import com.iesam.carnetjoven.domain.models.Empresa;
import com.iesam.carnetjoven.domain.models.Promocion;
import com.iesam.carnetjoven.domain.usecase.AddPromocionUseCase;
import com.iesam.carnetjoven.domain.usecase.GetEmpresaUseCase;

import java.util.List;

public class NewPromocion {
    public void createPromocion() {
        Promocion promocion = buildPromocion();
        savePromocion(promocion);
    }

    private void savePromocion(Promocion promocion) {
        AddPromocionUseCase addPromocionUseCase = new AddPromocionUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
        addPromocionUseCase.execute(promocion);
    }


    private Promocion buildPromocion() {
        Promocion promocion = new Promocion();
        promocion.setId(1);
        promocion.setDescripcion("ahorro en zapatillas");
        promocion.setDescuento(50);
        promocion.setEmpresa(findEmpresa(1));
        promocion.setTitulo("especial");


        return promocion;
    }
    private List<Empresa> findEmpresa(Integer empresaId) {
        GetEmpresaUseCase getEmpresaUseCase = new GetEmpresaUseCase(new EmpresaDataRepository(EmpresaFileLocalDataSource.getInstance()));
        return getEmpresaUseCase.execute();
    }

}
