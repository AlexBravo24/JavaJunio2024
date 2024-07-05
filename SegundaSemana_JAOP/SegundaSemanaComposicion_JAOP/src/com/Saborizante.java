package com;

public class Saborizante {

	private String manzana;
	private String limon;
	private String cola;
	
	public Saborizante () {}

	public Saborizante(String manzana, String limon, String cola) {
		super();
		this.manzana = manzana;
		this.limon = limon;
		this.cola = cola;
	}

	public String getManzana() {
		return manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	public String getLimon() {
		return limon;
	}

	public void setLimon(String limon) {
		this.limon = limon;
	}

	public String getCola() {
		return cola;
	}

	public void setCola(String cola) {
		this.cola = cola;
	}

	@Override
	public String toString() {
		return "Saborizante [manzana=" + manzana + ", limon=" + limon + ", cola=" + cola + "]";
	}
	
	
	
	
	
}
