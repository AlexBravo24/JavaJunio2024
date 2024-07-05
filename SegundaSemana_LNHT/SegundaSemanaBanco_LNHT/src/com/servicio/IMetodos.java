package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	//Aqui declarmos las operaciones que la clse encargada de la logica tendra que resolver 
	
	//Consultar una cuenta de banco 
	
	public Cuenta consultar(int numeroCuenta);
	//Retirar recurso de nuestra cuenta 
	public Ticket retirar(int numeroCuenta, double monto);
	//Depositar recurso de nuestra cuenta 
	public Ticket Depositar(int numeroCuenta, double monto);
	
}
