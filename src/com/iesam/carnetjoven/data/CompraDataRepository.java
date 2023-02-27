package com.iesam.carnetjoven.data;

import com.iesam.carnetjoven.data.local.CompraFileLocalDataSource;
import com.iesam.carnetjoven.domain.CompraRepository;
import com.iesam.carnetjoven.domain.models.Compra;

import java.util.List;

public class CompraDataRepository implements CompraRepository {

    private CompraFileLocalDataSource localDataSource;

    public CompraDataRepository(CompraFileLocalDataSource instance) {
    }

    @Override
    public void save(Compra compra) {
        this.localDataSource.save(compra);
    }

    @Override
    public List<Compra> getAll() {
        return this.localDataSource.findAll();
    }
}
