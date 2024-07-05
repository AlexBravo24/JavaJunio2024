package com.respuesta;

import java.util.Date;

public class Ticket {

	//El proposito de sta clase es respoder si las operaciones se realizaron con exito
	private int folio;
	private Date fecha;
	private String usuario;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {}
	public Ticket(int folio, Date fecha, String usuario, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fecha = fecha;
		this.usuario = usuario;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}
	public int getFolio() {
		return folio;
	}
	public void setFolio(int folio) {
		this.folio = folio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public int getIdCajero() {
		return idCajero;
	}
	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}
	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fecha=" + fecha + ", usuario=" + usuario + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
}
