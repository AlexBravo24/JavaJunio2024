package com.Logica;

import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	//En el paquete com.logica se encuentra la clase encargada de resolver las operaciones
	
	//Vamos a declarar unos atributos de nuestro cajero
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Declarar una variable auxiliar para incrementar
	//el folio en nuestro ticket
	
	private int folio=1;
	
	public Cajero () {}
	
	
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}




	@Override
	public Cuenta consultar(int numeroCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// TODO Auto-generated method stub
		return null;
	}

}
