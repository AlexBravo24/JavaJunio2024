package com;

public class Bicicleta {

	private String marca;
	private String modelo; 
	private String color;
	
	private   Ruedas llantas;
	private  Asiento  sillin;
	private  Pedal pedales;
	
	
	public Bicicleta() {
		
	}


	public Bicicleta(String marca, String modelo, String color, Ruedas llantas, Asiento sillin, Pedal pedales) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.llantas = llantas;
		this.sillin = sillin;
		this.pedales = pedales;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Ruedas getLlantas() {
		return llantas;
	}


	public void setLlantas(Ruedas llantas) {
		this.llantas = llantas;
	}


	public Asiento getSillin() {
		return sillin;
	}


	public void setSillin(Asiento sillin) {
		this.sillin = sillin;
	}


	public Pedal getPedales() {
		return pedales;
	}


	public void setPedales(Pedal pedales) {
		this.pedales = pedales;
	}


	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", llantas=" + llantas
				+ ", sillin=" + sillin + ", pedales=" + pedales + "]";
	}
	
	

}
