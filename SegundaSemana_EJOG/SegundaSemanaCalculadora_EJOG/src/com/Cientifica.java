package com;

public class Cientifica extends Calculadora implements iTermometro {

    public Cientifica(String marca, String color, double anio) {
        super(marca, color, anio);
    }

    @Override
    public double sumar(double a, double b) {
        return a + b;
    }

    @Override
    public double restar(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("No se puede dividir por cero");
            
            return 0;
            
        }
    }

	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		
		System.out.println("Temperatura Normal");
		
	}

    
}
