package com;

public class Bicicleta {
	
	private String volante;
	private String cadena;
	private String pedales;
	
	public Bicicleta () {}

	public Bicicleta(String volante, String cadena, String pedales) {
		super();
		this.volante = volante;
		this.cadena = cadena;
		this.pedales = pedales;
	}

	public String getVolante() {
		return volante;
	}

	public void setVolante(String volante) {
		this.volante = volante;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public String getPedales() {
		return pedales;
	}

	public void setPedales(String pedales) {
		this.pedales = pedales;
	}

	@Override
	public String toString() {
		return "Bicicleta [volante=" + volante + ", cadena=" + cadena + ", pedales=" + pedales + "]";
	}
	
	
	

}
