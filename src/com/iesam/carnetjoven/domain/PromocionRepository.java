package com.iesam.carnetjoven.domain;

import com.iesam.carnetjoven.domain.models.Promocion;

import java.util.List;

public interface PromocionRepository {
    public void save(Promocion promocion);

    public List<Promocion> getAll();
}
