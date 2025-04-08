package org.example.model;

public class Pantalla {
    String marca;
    String modelo;
    int anio;

    public Pantalla(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //Información Técnica del producto
    @Override
    public String toString() {
        return "Pantalla:" +"\n"+
                "Marca= " + marca + "\n" +
                "Modelo= " + modelo + "\n" +
                "Año=" + anio +"\n";
    }
}
