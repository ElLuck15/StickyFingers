package org.example;

import org.example.model.Cliente;
import org.example.model.Desktop;
import org.example.model.Dispositivo;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda("Av. Siempre Viva 123", "Tienda de Dispositivos");
        Cliente cliente1 = new Cliente("Juan", "Soto", "lindolindo92@tutu.cl", "+56912345678", "Casado", "Temuco");
        Dispositivo dispositivo1 = new Desktop();
        Dispositivo dispositivo2 = new Tablet();
        Dispositivo dispositivo3 = new Notebook();

    }
}