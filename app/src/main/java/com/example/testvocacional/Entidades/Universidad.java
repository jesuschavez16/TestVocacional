package com.example.testvocacional.Entidades;

public class Universidad {

    private String  descripcion;
    private String  nombre;
    private double  lat;
    private double  lon;

    public Universidad() {
    }

    public Universidad(String descripcion, String nombre, double lat, double lon) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.lat = lat;
        this.lon = lon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
