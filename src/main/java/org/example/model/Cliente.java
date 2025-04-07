package org.example.model;

public class Cliente {

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String estadoCiv;
    private String ciudad;

    public Cliente(String apellido, String ciudad, String correo, String estadoCiv, String telefono, String nombre) {
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.correo = correo;
        this.estadoCiv = estadoCiv;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public String getCiudad() {return ciudad;}
    public String getEstadoCiv() {return estadoCiv;}
    public String getCorreo() {return correo;}
    public String getTelefono() {return telefono;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public void setEstadoCiv(String estadoCiv) {this.estadoCiv = estadoCiv;}
    public void setCorreo(String correo) {this.correo = correo;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
}
