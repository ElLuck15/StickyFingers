package org.example.model;

import java.time.LocalDate;

public class Notebook extends Dispositivo{
    String res;
    String tipoTeclado;
    String batería;

    public Notebook(String marca, int memoriaRam, String memoriaAlmac, String procesador, String modelo, LocalDate anioFab, int precio, int stock, String res, String tipoTeclado, String batería) {
        super(marca,memoriaRam,memoriaAlmac,procesador,modelo,anioFab,precio,stock);
        this.res = res;
        this.tipoTeclado = tipoTeclado;
        this.batería = batería;
    }

    public String getRes() {
        return res;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public String getBatería() {
        return batería;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    public void setBatería(String batería) {
        this.batería = batería;
    }

    @Override
    public String toString() {
        return  super.toString() +"\n"+
                "Resolución de pantalla= " + res + "\n" +
                "Tipo de teclado= " + tipoTeclado + "\n" +
                "Batería=" + batería + "\n";
    }
}
