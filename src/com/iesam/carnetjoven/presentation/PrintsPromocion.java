package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.data.PromocionDataRepository;
import com.iesam.carnetjoven.data.local.PromocionFileLocalDataSource;
import com.iesam.carnetjoven.domain.models.Promocion;
import com.iesam.carnetjoven.domain.usecase.GetPromocionUseCase;

import java.util.List;

public class PrintsPromocion {
    public void print() {
        GetPromocionUseCase getPromocionUseCase = new GetPromocionUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance().getInstance()));
        List<Promocion> promocions = getPromocionUseCase.execute();
        for(Promocion promocion : promocions){
            System.out.println(promocion.toString());
        }
    }
}
