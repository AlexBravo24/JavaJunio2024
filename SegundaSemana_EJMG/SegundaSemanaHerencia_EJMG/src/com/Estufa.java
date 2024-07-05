package com;

public class Estufa  extends Electrodomestico{
	   
	  String tipo;
	  String marca;
	  int quemadores;
	  
	
	  public Estufa() {}


	public Estufa(String nombre, String color, int precio, String tipo, String marca, int quemadores) {
		super(nombre, color, precio);
		this.tipo = tipo;
		this.marca = marca;
		this.quemadores = quemadores;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getQuemadores() {
		return quemadores;
	}


	public void setQuemadores(int quemadores) {
		this.quemadores = quemadores;
	}


	@Override
	public String toString() {
		return "Estufa [tipo=" + tipo + ", marca=" + marca + ", quemadores=" + quemadores + ", toString()="
				+ super.toString() + "]";
	}
	
	  
}
