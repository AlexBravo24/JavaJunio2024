package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	// en el paquete com.logica se encuentra en la clase encargada de resolver las operaciones
	
	//Vamosa a declarar unos atributos de uestro objeto
	
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Declarar una variable auxiliar para incrementar el folio en nuestro cliente
	private int folio = 1;
	
	public Cajero() {}
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override 
	public Cuenta consultar(int numeroCuenta) {
		// Necesitamos crear una ceunta vacia inicialmente
		Cuenta cuenta = null;
		//entonces asignar posteriormente la cuent aexistente en el HashMap
		cuenta =cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket=null;
		//Vamos a buscar la cuenta y necesitamos hacer unas validaciones primero, si se encuentra o localisza la cuenta la
		//asignamos para manipular 
		if (consultar(numeroCuenta)!= null) {
			Cuenta cuenta= consultar(numeroCuenta);
			//Una vez que localizamos la cuenta para manipular realizamos ciertas validaciones 
			if (monto > 9000) {  //Validamos si el monto exede el maximo que debilita el cajero
			System.out.println("El monto exede el maximo permitido por el cajero ");
			return ticket;
			} else if(cuenta.getSaldo()< monto) { //Si el saldo es menor al monto a retirrar
				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;
			} else if (cuenta.getSaldo()-monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta ");
				return ticket;
				
			}else {//Si el retiro puede realizarser
				//actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto); //Realizamors el retiro
				ticket = new Ticket(folio++,new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				//Como la operacion es exitosa emitimos un nuevo ticket
				return ticket;
			}
		} else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
	}

	@Override
	public Ticket Depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta= consultar(numeroCuenta);
			//validaciones
			if (monto > cuenta.getSaldoMax()) {
				System.out.println("el monto a depositar exede el maximo permitido en la cuenta ");
				return ticket;
			} else if (cuenta.getSaldo() + monto > cuenta.getSaldoMax()) {
				System.out.println("Ahora el saldo exederia el maximo de la cuenta ");
				return ticket;
				
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++,new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
				
			}
		}else {
				System.out.println("No hay una cuenta asociada a ese cliente");
				return ticket;
			}
			
			
		
	
	}



	
	
}
