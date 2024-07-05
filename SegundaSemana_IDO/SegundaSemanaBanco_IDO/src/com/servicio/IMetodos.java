package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	// COntendra metodos Abstractos
	// aqui se declaran las operaciones q la clase
	// encargada de la logica tendra q resolver

	// Consultar una cuenta de banco

	// Metodo con retorno
	// Cuenta es una clase se tiene q importar del paquete modelo

	public Cuenta consultar(int numeroCuenta);

	// patra retirar recursos de la cuenta
	// ticket es una clase que pertenece al paquete respuesta se tiene q importar
	public Ticket retirar(int numeroCuenta, double monto);
	// depositar se crea un metodo con la clase Ticlet pero con otros datos 
	public Ticket depositar(int numeroCuenta, double monto);
	
	

}
