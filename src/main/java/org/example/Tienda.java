package org.example;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Cliente;
import org.example.model.Dispositivo;

public class Tienda {
    private String direccion;
    private String nombre;
    private List<Dispositivo> dispositivos;
    private List<Cliente> clientes;
    private List<Dispositivo> carro;
    public Tienda(String direccion, String nombre) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.dispositivos = new ArrayList<Dispositivo>();
        this.carro = new ArrayList<Dispositivo>();
        this.clientes = new ArrayList<Cliente>();
    }

    //métodos
    public void registrarCliente() {
        // Implementar el registro de un cliente
    }
    public void eliminarCliente() {
        // Implementar la eliminación de un cliente
    }
    public void registrarDisp(Dispositivo dispositivo) {
        this.dispositivos.add(dispositivo);
    }
    public void eliminarDisp(Dispositivo dispositivo) {
        this.dispositivos.remove(dispositivo);
    }
    public void agregarDispCarr(Dispositivo dispositivo) {
        this.carro.add(dispositivo);
    }
    public void quitarDispCarr(Dispositivo dispositivo) {
        this.carro.remove(dispositivo);
    }

    //region Getters y Setters

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }   
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Dispositivo> getCarro() {
        return carro;
    }
    public void setCarro(List<Dispositivo> carro) {
        this.carro = carro;
    }
    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }
    public void setDispositivos(List<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    //endregion

    @Override
    public String toString() {
        return "Tienda [direccion=" + direccion + ", nombre=" + nombre + ", dispositivos=" + dispositivos+ ", clientes=" + clientes + ", carro=" + carro + "]";
    }
}
