package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
 
	//aqui declaramos las operaciones que la clase encargada de la logica tendra quer resolver 
	
	//consultar una centa de banco 
	
	public Cuenta consultar(int numeroCuenta);
	
	//Retirar recursos de nuestra cuenta
	public Ticket retirar (int numeroCuenta, double monto);
	
	//depositar recursos en nuestra cuenta
	public Ticket depositar (int numeroCuenta, double monto);
	
	
}
