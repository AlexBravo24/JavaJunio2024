package com;

public class Interior {

	private String color;
	private String material; 
	private String estereo;
	
	public Interior () {}

	public Interior(String color, String material, String estereo) {
		super();
		this.color = color;
		this.material = material;
		this.estereo = estereo;
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

	public String getEstereo() {
		return estereo;
	}

	public void setEstereo(String estereo) {
		this.estereo = estereo;
	}

	@Override
	public String toString() {
		return "Interior [color=" + color + ", material=" + material + ", estereo=" + estereo + "]";
	}
	
	
}
