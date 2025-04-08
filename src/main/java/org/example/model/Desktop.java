package org.example.model;

import java.time.LocalDate;
import java.util.Date;

public class Desktop extends Dispositivo {
    String tarjetVid;
    String fuentePod;
    String chasis;
    Pantalla pantalla;

    public Desktop(String marca, int memoriaRam, String memoriaAlmac, String procesador, String modelo, LocalDate anioFab, int precio, int stock, String tarjetVid, String fuentePod, String chasis, Pantalla pantalla) {
        super(marca,memoriaRam,memoriaAlmac,procesador,modelo,anioFab,precio,stock);
        this.tarjetVid = tarjetVid;
        this.fuentePod = fuentePod;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    public void setTarjetVid(String tarjetVid) {
        this.tarjetVid = tarjetVid;
    }

    public void setFuentePod(String fuentePod) {
        this.fuentePod = fuentePod;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public String getTarjetVid() {
        return tarjetVid;
    }

    public String getFuentePod() {
        return fuentePod;
    }

    public String getChasis() {
        return chasis;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Tarjeta de Video= " + tarjetVid + "\n" +
                "Fuente de poder= " + fuentePod + "\n" +
                "Chasis= " + chasis + "\n"+
                pantalla.toString();
    }
}
