package com.logica;

import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	
	
	//en el paquete com.logica seencuentra la clase encargada de resolver la soperaciones 
   
	//vamos a declarar unos atributos de nuestro cajero
	
	private String sucursal;
	private Map<Integer,Cuenta> cuentas;
	//declarar una variable auxiliar para incrementar el fiolio de nuestro ticket
	
	private int folio=1;
	
	public Cajero() {}
	
	
	
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}





	@Override
	public Cuenta consultar(int numeroCuenta) {
		//necesitamos crear una cuenta vacia inicialmente
				Cuenta cuenta = null;
		       
	//erntonces asignamos posteriormente la cuenta si existe el el HashMAp
				 cuenta = cuentas.get(numeroCuenta);
				
				return cuenta;
	}
	
	
	

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
	Ticket ticket = null
		return null;
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
