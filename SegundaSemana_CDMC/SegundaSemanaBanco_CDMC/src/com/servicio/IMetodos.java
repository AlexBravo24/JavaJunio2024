package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	// aqui declaramos las clases que se
	// van a resolver

	// Consultar una cuenta de banco
	public Cuenta consultar(int numeroCuenta);

	// Retirar recursos de la cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// Depositar recursos de la cuenta
	public Ticket depositar(int numeroCuenta, double monto);
}
