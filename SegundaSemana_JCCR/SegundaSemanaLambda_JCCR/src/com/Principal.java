package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IFuncional suma = (a, b) -> {

			System.out.println("La suma es: " + (a + b));
			System.out.println("La suma es 2: " + (a + b));
		};

		suma.operacion(15, 15);

		IFuncional resta = (a, b) -> {

			System.out.println("La suma es: " + (a - b));
			System.out.println("La suma es 2: " + (a - b));
		};
		resta.operacion(15, 10);
	}

}
