package com.iesam.carnetjoven.domain.usecase;

import com.iesam.carnetjoven.domain.CompraRepository;
import com.iesam.carnetjoven.domain.models.Compra;

public class AddCompraUseCase {

    private CompraRepository repository;

    public AddCompraUseCase(CompraRepository repository){
        this.repository=repository;
    }

    public void execute(Compra compra){
        this.repository.save(compra);
    }
}
