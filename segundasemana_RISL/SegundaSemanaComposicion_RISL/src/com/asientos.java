package com;

public class asientos {

	private String tipo;
	private String color;
	private String material;
	public asientos(String tipo, String color, String material) {
		super();
		this.tipo = tipo;
		this.color = color;
		this.material = material;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "asientos [tipo=" + tipo + ", color=" + color + ", material=" + material + "]";
	}
	
	
	
	
}
