package com.iesam.carnetjoven.domain.models;

public class Compra {
    private Integer id;
    private String fecha;
    private Usuario usuario;
    private Promocion promociones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Promocion getPromociones() {
        return promociones;
    }

    public void setPromociones(Promocion promociones) {
        this.promociones = promociones;
    }
}
