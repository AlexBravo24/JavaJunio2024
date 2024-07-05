package com;

public class Refresco {
	
	private String sabor;
	private int cantidad;
	double precio;
	
	public Refresco () {}

	public Refresco(String sabor, int cantidad, double precio) {
		super();
		this.sabor = sabor;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
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

	@Override
	public String toString() {
		return "Refresco [sabor=" + sabor + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
		
		
	
	
	
	
	
	
	

}
