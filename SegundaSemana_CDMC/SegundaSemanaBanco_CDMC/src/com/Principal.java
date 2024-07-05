package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// crear la BD
		
		Map<Integer,Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//para gregar cuentas en nuestro hasmap
		//podemos hacerlo de 2 formas
		//Creado la cuenta y agregandola despues 
		
		Cuenta alex = new Cuenta("Cesar",13000, 1000,50000,"Debito");
		
		cuentas.put(1001,alex);
		
		//Creando las cuentas directamente en el hasmap
		
		cuentas.put(1002,new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003,new Cuenta("Jorgue", 3000, 200, 20000, "Debito"));
		cuentas.put(1004,new Cuenta("Aldo", 2000, 500, 30000, "Debito"));
		
		
		//System.out.println(cuentas.get(1003));
		
		//Crear cajero new
		
		Cajero lunapark = new Cajero ("lunapark",cuentas);
		
		System.out.println(lunapark.consultar(1004));
		
		//Metodo Retirar
		System.out.println(lunapark.retirar(1001, 9000));
		System.out.println(lunapark.retirar(1001, 1000));
		
		//Quiero retirar dinero de una cuenta que no exite 
		System.out.println(lunapark.retirar(1006, 1000));
		
		//Agregra
		System.out.println(lunapark.depositar(1001, 5000));
		
		
	}

}
