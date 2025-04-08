package org.example.model;

import java.time.LocalDate;
import java.util.Date;

public abstract class Dispositivo {
    String marca;
    int memoriaRam;
    String memoriaAlmac;
    String procesador;
    String modelo;
    LocalDate anioFab;
    int precio;
    int stock;

    public Dispositivo(String marca, int memoriaRam, String memoriaAlmac, String procesador, String modelo, LocalDate anioFab, int precio, int stock) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.memoriaAlmac = memoriaAlmac;
        this.procesador = procesador;
        this.modelo = modelo;
        this.anioFab = anioFab;
        this.precio = precio;
        this.stock = stock;
    }
    public String getMarca() {
        return marca;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setMemoriaAlmac(String memoriaAlmac) {
        this.memoriaAlmac = memoriaAlmac;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnioFab(LocalDate anioFab) {
        this.anioFab = anioFab;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMemoriaAlmac() {
        return memoriaAlmac;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getAnioFab() {
        return anioFab;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    //Información Técnica del producto
    @Override
    public String toString() {
        return "\n"+"Tabla de especificaciones"+
                "Marca= " + marca + "\n" +
                "Memoria Ram= " + memoriaRam + "\n"+
                "Memoria de Almacenamiento= " + memoriaAlmac + "\n" +
                "Procesador= " + procesador + "\n" +
                "Modelo= " + modelo + "\n" +
                "Año de fabricación= " + anioFab + "\n"+
                "Precio= " + precio + "\n"+
                "Stock= " + stock+"\n";
    }
}
