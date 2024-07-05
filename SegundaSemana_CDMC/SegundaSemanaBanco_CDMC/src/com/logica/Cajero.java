package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{

	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	
	//Declarar una variable auxiliar para incrementar el folio 
	//en nuestro ticket 
	private int folio=1;
	
	public Cajero() {
		
	}
	
	
	
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}





	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Necesitamos crwar una cuenta vacia 
		
		Cuenta cuenta = null;
	
		
		//Entonces asignamos posteriormente la cuenta si exite en el Hasmap
		
		cuenta=cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		//Vamos a busrcar ka cuenta y hacer la validacion 
		//primero si se encuentra o localisa la cuenta la asiganacion 
		
		if (consultar(numeroCuenta)!=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//una ves localizada la cuenta 
			//relizar ciertas valiadaciones 
			if(monto>9000) {
				System.out.println("El monto excede el monto permitido por este cajero :(");
				return ticket;
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insuficiente :(");
				return ticket;
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldominimo()) {
			System.out.println("El retiro dejara el minimo en la cuenta");
			return ticket;
			}else {
			cuenta.setSaldo(cuenta.getSaldo()-monto);
			ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1); 
			
			return ticket;
			
			}
			
		}else {
			System.out.println("No exite cuenta asociada a este cliente");
		}
		return ticket;
	
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		
		Ticket ticket = null;
		if (consultar(numeroCuenta)!=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validacion 
			if (monto>cuenta.getSaldomax()) {
				System.out.println("El moento a depositar excede el maximo permito ");
				return ticket;
			}else if (cuenta.getSaldo()+monto>cuenta.getSaldomax()) {
				System.out.println("El saldo excederia el permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1); 
				return ticket;
			}
				
			}else {
				System.out.println("No hay cuenta asociada con este cliente");
				return ticket;
			}
		
		
	}
} 
