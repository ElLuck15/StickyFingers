package org.example;

import org.example.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Av. Siempre Viva 123", "Tienda de Dispositivos");
        Cliente cliente1 = new Cliente("Juan", "Soto", "lindolindo92@tutu.cl", "+56912345678", "Casado", "Temuco");
        Dispositivo dispositivo1 = new Desktop("Sam sun",16,"1TB","Intellij","I5", LocalDate.now(),100000,2,"envidia","5000w","Si",new Pantalla("Entel","S",2030));
        Dispositivo dispositivo2 = new Tablet("Sam sun",16,"1TB","Intellij","I5", LocalDate.now(),60000,3,"1920x1080p", new String[]{"Mouse"});
        Dispositivo dispositivo3 = new Notebook("Sam sun",16,"1TB","Intellij","I5", LocalDate.now(),50000,1,"1920x1080p","Español","500W");

        System.out.println(tienda.getDireccion());
        tienda.setDireccion("Gran Temuco");
        System.out.println(tienda.getDireccion());
        tienda.agregarDispCarr(dispositivo1);
        tienda.agregarDispCarr(dispositivo2);
        tienda.agregarDispCarr(dispositivo3);
        tienda.registrarCliente(cliente1);
        System.out.println(tienda.getClientes());
        tienda.agregarDispCarr(dispositivo1);
        System.out.println(tienda.getCarro());
    }
}