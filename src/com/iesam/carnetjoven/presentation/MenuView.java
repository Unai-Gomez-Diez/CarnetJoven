package com.iesam.carnetjoven.presentation;

import com.iesam.carnetjoven.domain.models.Usuario;

public class MenuView {
    public void init() {
        createUsuarioForm();
        showUsuarios();

        createEmpresa();
       showEmpresas();

        createPromocion();
       showPromocion();

       createCompra();
       showCompra();

    }

    private void createUsuarioForm() {
        NewUsuario newUsuario = new NewUsuario();
        newUsuario.createUsuario();
    }

    private void showUsuarios() {
        PrintsUsuario printsUsuario = new PrintsUsuario();
        printsUsuario.print();
    }

       private void createEmpresa() {
        NewEmpresa newEmpresa = new NewEmpresa();
        newEmpresa.createEmpresa();
    }
    private void showEmpresas() {
        PrintsEmpresa printsEmpresa = new PrintsEmpresa();
        printsEmpresa.print();
    }

    private void createPromocion() {
        NewPromocion newPromocion = new NewPromocion();
        newPromocion.createPromocion();
    }

    private void showPromocion() {
        PrintsPromocion printsPromocion = new PrintsPromocion();
        printsPromocion.print();
    }

    private void createCompra() {
        NewCompra newCompra = new NewCompra();
        newCompra.createCompra();
    }

    private void showCompra() {
        PrintCompra printCompra = new PrintCompra();
        printCompra.print();
    }
}
