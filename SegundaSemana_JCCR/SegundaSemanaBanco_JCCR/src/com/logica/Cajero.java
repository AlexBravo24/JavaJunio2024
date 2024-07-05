package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	private String sucursal;
	private Map<Integer, Cuenta> cuentas;

	// auxiliar para contador de folio
	private int folio = 1;

	public Cajero() {

	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public Map<Integer, Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Map<Integer, Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	@Override
	public String toString() {
		return "Cajero [sucursal=" + sucursal + ", cuentas=" + cuentas + ", folio=" + folio + "]";
	}

	@Override
	public Cuenta consultarCuenta(int numeroCuenta) {
		// TODO Auto-generated method stub
		Cuenta cuenta = null;
		if (this.cuentas.containsKey(numeroCuenta)) {
			return this.cuentas.get(numeroCuenta);
		}

		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Date fecha = new Date();
		Ticket ticketComprobante = null;
		if (this.cuentas.containsKey(numeroCuenta)) {
			Cuenta cuenta = this.cuentas.get(numeroCuenta);

			if ((cuenta.getSaldo() + cuenta.getSaldoMin()) < monto) {
				System.out.println("No puedes retirar esa cantidad, excede tu minimo");
				return ticketComprobante;
			}

			cuenta.setSaldo((cuenta.getSaldo() - monto));

			ticketComprobante = new Ticket(folio++, fecha, cuenta.getUsuario(), cuenta.getSaldo(), this.sucursal, 1);

			return ticketComprobante;
		} else {
			System.out.println("No existe cuenta asociada a este numero");
		}
		return ticketComprobante;
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {

		Date fecha = new Date();
		Ticket ticketComprobante = null;
		if (this.cuentas.containsKey(numeroCuenta)) {
			Cuenta cuenta = this.cuentas.get(numeroCuenta);

			if ((cuenta.getSaldo() + monto) > cuenta.getSaldoMax()) {
				System.out.println("El saldo excede tu monto maximo permitido");
				return ticketComprobante;
			}

			cuenta.setSaldo((cuenta.getSaldo() + monto));

			ticketComprobante = new Ticket(folio++, fecha, cuenta.getUsuario(), cuenta.getSaldo(), this.sucursal, 1);
			ticketComprobante.setFolio((ticketComprobante.getFolio() + 1));
			return ticketComprobante;
		} else {
			System.out.println("No existe cuenta asociada a este numero");
		}

		return ticketComprobante;
	}

}
