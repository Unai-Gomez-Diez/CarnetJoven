package com.iesam.carnetjoven.domain;

import com.iesam.carnetjoven.domain.models.Compra;

import java.util.List;

public interface CompraRepository {
    public void save(Compra compra);

    public List<Compra> getAll();
}
