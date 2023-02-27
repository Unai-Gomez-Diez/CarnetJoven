package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.data.CompraDataRepository;
import com.iesam.carnetjoven.data.EmpresaDataRepository;
import com.iesam.carnetjoven.data.PromocionDataRepository;
import com.iesam.carnetjoven.data.UsuarioDataRepository;
import com.iesam.carnetjoven.data.local.CompraFileLocalDataSource;
import com.iesam.carnetjoven.data.local.EmpresaFileLocalDataSource;
import com.iesam.carnetjoven.data.local.PromocionFileLocalDataSource;
import com.iesam.carnetjoven.data.local.UsuarioFileLocalDataSource;
import com.iesam.carnetjoven.domain.models.Compra;
import com.iesam.carnetjoven.domain.models.Empresa;
import com.iesam.carnetjoven.domain.models.Promocion;
import com.iesam.carnetjoven.domain.models.Usuario;
import com.iesam.carnetjoven.domain.usecase.*;

public class NewCompra {

    public void createCompra() {
        Compra compra = buildCompra();
        saveCompra(compra);
    }

    private void saveCompra(Compra compra) {
        AddCompraUseCase addCompraUseCase = new AddCompraUseCase(new CompraDataRepository(CompraFileLocalDataSource.getInstance()));
        addCompraUseCase.execute(compra);
    }


    private Compra buildCompra() {
        Compra compra = new Compra();
        compra.setId(1);
        compra.setFecha("07/08/2022");
        compra.setPromociones(findPromocion(1));
        compra.setUsuario(findUsuario(1));



        return compra;
    }
    private Promocion findPromocion(Integer promocionId) {
        GetPromocionUseCase getPromocionUseCase = new GetPromocionUseCase(new PromocionDataRepository(PromocionFileLocalDataSource.getInstance()));
        return (Promocion) getPromocionUseCase.execute();
    }

    private Usuario findUsuario(Integer usuarioId) {
        GetUsuarioUseCase getUsuarioUseCase = new GetUsuarioUseCase(new UsuarioDataRepository(UsuarioFileLocalDataSource.getInstance()));
        return (Usuario) getUsuarioUseCase.execute();
    }

}
