package com.example.testvocacional.Entidades;

public class ResultadoBasico {
    private Integer id=0;
    private Integer estado=0;
    private Integer numero=0;
    private String nombre=null;
    private Integer resultado1=0;
    private Integer resultado2=0;
    private Integer resultado3=0;
    private Integer resultado4=0;
    private Integer resultado5=0;
    private Integer r1=0;
    private Integer r2=0;
    private Integer r3=0;
    private Integer r4=0;
    private Integer r5=0;

    public ResultadoBasico() {
    }

    public ResultadoBasico(Integer id, Integer estado, Integer numero, String nombre, Integer resultado1, Integer resultado2, Integer resultado3, Integer resultado4, Integer resultado5, Integer r1, Integer r2, Integer r3, Integer r4, Integer r5) {
        this.id = id;
        this.estado = estado;
        this.numero = numero;
        this.nombre = nombre;
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;
        this.resultado3 = resultado3;
        this.resultado4 = resultado4;
        this.resultado5 = resultado5;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
        this.r5 = r5;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getResultado1() {
        return resultado1;
    }

    public void setResultado1(Integer resultado1) {
        this.resultado1 = resultado1;
    }

    public Integer getResultado2() {
        return resultado2;
    }

    public void setResultado2(Integer resultado2) {
        this.resultado2 = resultado2;
    }

    public Integer getResultado3() {
        return resultado3;
    }

    public void setResultado3(Integer resultado3) {
        this.resultado3 = resultado3;
    }

    public Integer getResultado4() {
        return resultado4;
    }

    public void setResultado4(Integer resultado4) {
        this.resultado4 = resultado4;
    }

    public Integer getResultado5() {
        return resultado5;
    }

    public void setResultado5(Integer resultado5) {
        this.resultado5 = resultado5;
    }

    public Integer getR1() {
        return r1;
    }

    public void setR1(Integer r1) {
        this.r1 = r1;
    }

    public Integer getR2() {
        return r2;
    }

    public void setR2(Integer r2) {
        this.r2 = r2;
    }

    public Integer getR3() {
        return r3;
    }

    public void setR3(Integer r3) {
        this.r3 = r3;
    }

    public Integer getR4() {
        return r4;
    }

    public void setR4(Integer r4) {
        this.r4 = r4;
    }

    public Integer getR5() {
        return r5;
    }

    public void setR5(Integer r5) {
        this.r5 = r5;
    }
}
