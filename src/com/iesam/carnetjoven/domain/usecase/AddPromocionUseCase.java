package com.iesam.carnetjoven.domain.usecase;

import com.iesam.carnetjoven.domain.PromocionRepository;
import com.iesam.carnetjoven.domain.models.Promocion;

public class AddPromocionUseCase {

    private PromocionRepository repository;

    public AddPromocionUseCase(PromocionRepository repository){
        this.repository=repository;
    }

    public void execute(Promocion promocion){
        this.repository.save(promocion);
    }

}
