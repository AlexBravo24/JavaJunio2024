package com.respuesta;

import java.util.Date;

public class Ticket {
	//el propisito de esta clase es responder
	//si las operaciones se realizaron con exito o no
	
	private int folio;
	private Date fechahora;
	private String usuario;
	private double saldo;
	private String Sucursal;
	private int cajero;
	
	
	public Ticket() {
		
	}


	public Ticket(int folio, Date fechahora, String usuario, double saldo, String sucursal, int cajero) {
		super();
		this.folio = folio;
		this.fechahora = fechahora;
		this.usuario = usuario;
		this.saldo = saldo;
		Sucursal = sucursal;
		this.cajero = cajero;
	}


	public int getFolio() {
		return folio;
	}


	public void setFolio(int folio) {
		this.folio = folio;
	}


	public Date getFechahora() {
		return fechahora;
	}


	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getSucursal() {
		return Sucursal;
	}


	public void setSucursal(String sucursal) {
		Sucursal = sucursal;
	}


	public int getCajero() {
		return cajero;
	}


	public void setCajero(int cajero) {
		this.cajero = cajero;
	}


	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechahora=" + fechahora + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", Sucursal=" + Sucursal + ", cajero=" + cajero + "]";
	}
	
}
