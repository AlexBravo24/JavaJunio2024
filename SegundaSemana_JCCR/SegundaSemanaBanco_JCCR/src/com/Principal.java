package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;
import com.respuesta.Ticket;

public class Principal {

	public static void main(String[] args) {

		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();

		Cuenta julio = new Cuenta("Julio", 16541, 500, 100000, "Debito");
		cuentas.put(123, julio);
		cuentas.put(456, new Cuenta("César", 10000, 500, 200000, "Debito"));
		cuentas.put(789, new Cuenta("Fernando", 5000, 0, 10000, "Credito"));
		cuentas.put(321, new Cuenta("Hortencia", 1000, 0, 5000, "Credito"));

		// creamos cajero
		Cajero cajero1 = new Cajero("Cajero Santander 323", cuentas);

		// creamos la consulta de saldo
		Cuenta saldoJulio = cajero1.consultarCuenta(123);
		double cantidadDeposito = 1598;
		double cantidadRetiro = 1000;
		System.out.println("Saldo original " + saldoJulio.getSaldo());
		// hacemos el deposito
		System.out.println("Se deposita: " + cantidadDeposito);
		System.out.println(cajero1.depositar(123, cantidadDeposito));
		System.out.println(cajero1.depositar(123, cantidadDeposito));
		// hacemos retirlo

		System.out.println("Se retira: " + cantidadRetiro);
		System.out.println(cajero1.retirar(123, cantidadRetiro));

	}

}
