package com;

public abstract class Calculadora {
    private String marca;
    private String color;
    private double anio;

    public Calculadora(String marca, String color, double anio) {
        this.marca = marca;
        this.color = color;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getanio() {
        return anio;
    }

    public void setanio(double anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", anio=" + anio +
                '}';
    }

    public abstract double sumar(double a, double b);
    public abstract double restar(double a, double b);
    public abstract double multiplicar(double a, double b);
    public abstract double dividir(double a, double b);
}
