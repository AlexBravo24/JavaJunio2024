package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String llave = "a";
		String modif;
		Cientifica calcu= new Cientifica("Casio","Negro","RX-2K3","Graficos");
	Scanner tecla = new Scanner(System.in);

	while(llave.equalsIgnoreCase("exit") != true) {
	System.out.println("S = suma \nR = resta \nM = MUltiplicacion \nD = Division "
			+ "\nmarca = Modificar marca de la calculadora \ncalculadora = Imprime las caracteristicas de la calculadora"
			+ "\n exit = sale del programa"
			+ "\n Ingrese la opcion deseada");
	llave = tecla.nextLine();
		
	
	switch (llave) {
		case "S":
			calcu.sumar();
			break;
		case "R":
			calcu.restar();
			break;
		case "M":
			calcu.multiplicar();
			break;
		case "D":
			calcu.dividir();
			break;
		case "marca":
			System.out.println("Ingrese la marca de su calculadora");
			modif = tecla.nextLine();
			calcu.setMarca(modif);
			break;
		case "calculadora":
			System.out.println(calcu.toString());
			break;
		default:
			System.out.println("Ingrese una opcion valida");
			break;
		}
	System.out.println("Desea continuar en el programa 'S' = si 'N'= no ");
	llave = tecla.nextLine();
		if (llave.equalsIgnoreCase("N")) {
			llave = "exit";
		}
	}//while
	
	calcu.tomarTemperatura();
	//De donde tomas comportamientos nuestro objetos o nuentras clases 
	// 1.-De metodos propios de la clase 
	// 2.-Dela herencia de otras clases , incluyendo clases abstracta
	// 3.- Interfaces 
	
	
	
	
	}
	
}
