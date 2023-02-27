package com.iesam.carnetjoven.domain.usecase;

import com.iesam.carnetjoven.domain.CompraRepository;
import com.iesam.carnetjoven.domain.models.Compra;

import java.util.List;

public class GetCompraUseCase {

    private CompraRepository repository;

    public GetCompraUseCase(CompraRepository repository){
        this.repository=repository;
    }


    public List<Compra> execute(){
        return this.repository.getAll();
    }
}
