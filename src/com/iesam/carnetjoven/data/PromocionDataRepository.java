package com.iesam.carnetjoven.data;

import com.iesam.carnetjoven.data.local.PromocionFileLocalDataSource;
import com.iesam.carnetjoven.domain.PromocionRepository;
import com.iesam.carnetjoven.domain.models.Promocion;

import java.util.List;

public class PromocionDataRepository implements PromocionRepository {

    private PromocionFileLocalDataSource localDataSource;

    public PromocionDataRepository(PromocionFileLocalDataSource instance) {
        this.localDataSource=instance;
    }

    @Override
    public void save(Promocion promocion) {
        this.localDataSource.save(promocion);
    }

    @Override
    public List<Promocion> getAll() {
       return this.localDataSource.findAll();
    }
}
