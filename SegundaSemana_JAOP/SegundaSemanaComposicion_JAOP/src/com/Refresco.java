package com;

public class Refresco {

	private String marca;
	private int cantidad;
	private double precio;
	
	private Saborizante sabor;
	private Temperatura estado;
	private Envasado envase;
	
	public Refresco () {}

	public Refresco(String marca, int cantidad, double precio, Saborizante sabor, Temperatura estado, Envasado envase) {
		super();
		this.marca = marca;
		this.cantidad = cantidad;
		this.precio = precio;
		this.sabor = sabor;
		this.estado = estado;
		this.envase = envase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Saborizante getSabor() {
		return sabor;
	}

	public void setSabor(Saborizante sabor) {
		this.sabor = sabor;
	}

	public Temperatura getEstado() {
		return estado;
	}

	public void setEstado(Temperatura estado) {
		this.estado = estado;
	}

	public Envasado getEnvase() {
		return envase;
	}

	public void setEnvase(Envasado envase) {
		this.envase = envase;
	}

	@Override
	public String toString() {
		return "Refresco [marca=" + marca + ", cantidad=" + cantidad + ", precio=" + precio + ", sabor=" + sabor
				+ ", estado=" + estado + ", envase=" + envase + "]";
	}

	
	
	
}
