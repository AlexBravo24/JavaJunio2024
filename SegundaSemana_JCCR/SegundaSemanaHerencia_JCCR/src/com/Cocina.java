package com;

public class Cocina extends Electrodomestico {
	private int numeroDeQuemadores;
    private boolean tieneHorno;
    
    
	public Cocina() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cocina(String marca, String modelo, double precio, int numeroDeQuemadores, boolean tieneHorno) {
		super(marca, modelo, precio);
		this.numeroDeQuemadores = numeroDeQuemadores;
		this.tieneHorno = tieneHorno;
		// TODO Auto-generated constructor stub
	}
	public int getNumeroDeQuemadores() {
		return numeroDeQuemadores;
	}
	public void setNumeroDeQuemadores(int numeroDeQuemadores) {
		this.numeroDeQuemadores = numeroDeQuemadores;
	}
	public boolean isTieneHorno() {
		return tieneHorno;
	}
	public void setTieneHorno(boolean tieneHorno) {
		this.tieneHorno = tieneHorno;
	}
	@Override
	public String toString() {
		return "Cocina [numeroDeQuemadores=" + numeroDeQuemadores + ", tieneHorno=" + tieneHorno + ", toString()="
				+ super.toString() + "]";
	}
    
    
    
}
