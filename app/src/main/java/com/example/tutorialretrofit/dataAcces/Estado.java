package com.example.tutorialretrofit.dataAcces;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Estado {

    @SerializedName("clave")
    @Expose
    private String clave;
    @SerializedName("nombre")
    @Expose
    private String nombre;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
