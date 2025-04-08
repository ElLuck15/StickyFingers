package org.example.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Tablet extends Dispositivo{
    String res;
    String[] lista;

    public Tablet(String marca, int memoriaRam, String memoriaAlmac, String procesador, String modelo, LocalDate anioFab, int precio, int stock, String res, String[] lista) {
        super(marca,memoriaRam,memoriaAlmac,procesador,modelo,anioFab,precio,stock);
        this.res = res;
        this.lista = lista;
    }

    public String getRes() {
        return res;
    }

    public String[] getLista() {
        return lista;
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }

    public void setRes(String res) {
        this.res = res;
    }

    //Información Técnica del producto
    @Override
    public String toString() {
        return super.toString() +
                "Resolución de pantalla= " + res + "\n"+
                "lista= " + Arrays.toString(lista) +"\n";
    }
}
