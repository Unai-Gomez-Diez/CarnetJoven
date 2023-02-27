package com.iesam.carnetjoven.domain.usecase;

import com.iesam.carnetjoven.domain.PromocionRepository;
import com.iesam.carnetjoven.domain.models.Promocion;

import java.util.List;

public class GetPromocionUseCase {

    private PromocionRepository repository;

    public GetPromocionUseCase(PromocionRepository repository){
        this.repository=repository;
    }

    public List<Promocion> execute(){
        return this.repository.getAll();
    }

}
