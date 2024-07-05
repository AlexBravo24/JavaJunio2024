package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {
public static void main(String[] args) {
	
	//Vamos a crear nuestra base de datos
	
	//Declaramos nuestro HashMap
	Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
	
	//Para agregar cuentas en nuestro HashMap podemos hacerlo de dos formas
	//1. Creando la cuenta y agregandola despu�s 
	
	Cuenta jaz = new Cuenta("Jaz", 15000, 2000, 50000, "D�bito");
	
	cuentas.put(1001, jaz);
	
	//2. Creando las cuentas directamente en el HashMap 
	cuentas.put(1002, new Cuenta("Rosa", 500, 100, 12000, "D�bito"));
	cuentas.put(1003, new Cuenta("Valeria", 1500, 1000, 25000, "D�bito"));
	cuentas.put(1004, new Cuenta("Zaid", 3000, 500, 30000, "D�bito"));
	
	//Si nos acordamos, para recuperar el valor de un objeto en mi HashMap
	//System.out.println(cuentas.get(1002));
	
	//Crear mi nuevo Cajero 
	Cajero angelopolis = new Cajero("Angelopolis", cuentas);
	
	//Probar el metodo consultar
	System.out.println(angelopolis.consultar(1002));
	
	
	//Probar el metodo retirar exitoso
	System.out.println(angelopolis.retirar(1001, 9000));
	System.out.println(angelopolis.retirar(1001, 4500));
	
	//Quiero retirar dinero de una cuenta que no existe 
	System.out.println(angelopolis.retirar(1003, 2000));

	//Probar el metodo depositar dinero exitoso
	System.out.println(angelopolis.depositar(1002, 2000));
	
	System.out.println(angelopolis.depositar(1003, 150000));
	
	
	
	
	
	
}
}