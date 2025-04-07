package org.example.model;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String fono;
    private String estadoCiv;
    private String ciudad;

    public Cliente(String nombre, String apellido, String correo, String fono, String estadoCiv, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fono = fono;
        this.estadoCiv = estadoCiv;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", fono='" + fono + '\'' +
                ", esstadoCiv='" + estadoCiv + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getFono() {
        return fono;
    }
    public void setFono(String fono) {
        this.fono = fono;
    }
    public String getEsstadoCiv() {
        return estadoCiv;
    }
    public void setEsstadoCiv(String esstadoCiv) {
        this.estadoCiv = esstadoCiv;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    //endregion
}
