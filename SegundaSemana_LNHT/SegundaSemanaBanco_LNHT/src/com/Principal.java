package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vamos a crear nuestra base de datos 
		
		//declaramos un HashMAp
		
		Map<Integer,Cuenta> cuentas = new HashMap<Integer, Cuenta>();
	
	
		//PARA AGREGAR CUENTAS EN NUESTRO hASHmAP PODEMOS HACERLO DE DOR FORMAS 
		//cREANDO LA CUENTAA Y AGREGADOLA DESPUES 
		
		Cuenta alex = new Cuenta("Alex",13000,4000,50000,"Debito");
		cuentas.put(1001, alex);
		 
		cuentas.put(1002, new Cuenta("Berenice",1000,100,15000,"Debito"));
		cuentas.put(1003, new Cuenta("Humberto",10000,1000,20000,"Debito"));
		cuentas.put(1004, new Cuenta("Pablo",500,100,10000,"Debito"));
		
		//Para recuperar el valor de un objeto en mi HashMap
		System.out.println(cuentas.get(1003));
		
		//Crear  mi nuevo cajero
		Cajero angelopolis = new Cajero("angelopolis",cuentas);
		
		System.out.println(angelopolis.consultar(1006));
		//Probar el metodo exitoso
		System.out.println(angelopolis.retirar(1001,9000));
		
		
		//Probamos retirar de una cuenta que no existe 
		System.out.println(angelopolis.retirar(1007,1000));
		
		//Probar el metodo depositar exitoso
		System.out.println(angelopolis.Depositar(1001, 5000));
		
	}



}
