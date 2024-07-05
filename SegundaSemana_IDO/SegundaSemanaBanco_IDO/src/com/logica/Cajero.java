package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	// en el pakete .com.logica se encunetra la clase donde se 
	//se van a resolver todas las operaciones
	
	
	
	
	//declarar atributos de cajero <>
	
	private String sucursal;
	//El Map es el acceso a la BD la cual estara e la clase principal
	//Map almacenara 
	//Al declarar el Map aqui nos permite construir un cajero en la clase principañ
	// le damos una sucursal y le asignamos el acceso a la bd y este map almacenaria 
	//objetos de tipo cuenta
	private Map<Integer, Cuenta> cuentas;
	
	//Declaramos una variable auxiliar para incrementar el folio de nuestro ticket
	private int folio =1;
	
	//constructor vacio del cajero
	public Cajero () {
		
	}
	
	
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}




	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Se requiere primero una cuenta vacia
		Cuenta cuenta = null;
		
		//se asigna la cuneta si existe en el HM
		
		// explicacion   si la cuenta existe se guarda en cuenta que iniciamos vacia
		//y se retorna el valor de esa misma
		
		cuenta = cuentas.get(numeroCuenta);		
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// aqui va devolver un ticket que es un objeto  iniciara en null
		//
		Ticket ticket = null;
		//vamos a buscar la cuenta y se requiere  unas validaciones
		//que este la cuenta se asigna para manipular 
		
		//si nuestro metodo consultar (que actua mediante el numero de cuenta)
		//que se solicita atravez de este metodo que es el de retirar
		//
		
		if (consultar (numeroCuenta) != null) {
			
			// cuenta localizada
			Cuenta cuenta = consultar (numeroCuenta);
			
			//e tiene q validar<>
			
			if (monto>9000) {// se valida el monto maximo del cajero
				System.out.println("El monto excede el Maximo permitido por el Cajero");
				return ticket;
				
			}else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo Insuficiente para realizar el Retiro");
				return ticket;
			}else if (cuenta.getSaldo()-monto< cuenta.getSaldoMin()) {
				System.out.println("El retiro dejara por debajo del minimo de la cuenta");
				return ticket;
			}else {// si el retiro puede realizar se actualiza el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);//realiza el retiro
				// operacion es exitosa 
				// se emite nuevo ticket
				ticket =new Ticket(folio ++, new Date (), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
				
			}
			
			
			
		}else {
		System.out.println("no existe una cuenta asociada a este cliente");
		return ticket;
		}	
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		// aqui se va devolver un ticket
		Ticket ticket = null;
		
		if (consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validaciones
			if (monto > cuenta.getSaldoMax()) {
				System.out.println("El Monto exede el maximo permitido");
				return ticket;
				
			}else if (cuenta.getSaldo()+ monto > cuenta.getSaldoMax()) {
				System.out.println("El saldo exederia el Maximo Permitidop en l Cuenta");
				return ticket ;
				
				
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket =new Ticket(folio ++, new Date (), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
				
				
				
			}
			
		}else {
			System.out.println("No hay cuenta asociada a este cliente");
			return ticket;
			
		}
		
		
	
	}
	
	
		
}
