package org.example.data;
import org.example.model.*;
import java.util.Date;
import java.util.List;


public class Factura {

    private Date fecha;
    private Cliente cliente;
    private List<Dispositivo> dispositivos;

    public Factura(Date fecha, Cliente cliente, List<Dispositivo> dispositivos) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.dispositivos = dispositivos;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }
    public void setDispositivos(List<Dispositivo> dispositivos) {
        this.dispositivos = dispositivos;
    }

    public void mostrarFactura() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Dispositivos comprados:");
        for (Dispositivo d : dispositivos) {
            //System.out.println(" - " + d.getMarca() + " " + d.getModelo() + " ($" + d.getPrecio() + ")");
        }
    }

}
