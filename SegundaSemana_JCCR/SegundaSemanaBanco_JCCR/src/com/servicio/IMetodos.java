package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	
	// metodos utilizados como oepraciones ene la aplciacion
	
	public Cuenta consultarCuenta(int numeroCuenta);
	
	public Ticket retirar(int numeroCuenta, double monto);
	public Ticket depositar(int numeroCuenta, double monto);
}
