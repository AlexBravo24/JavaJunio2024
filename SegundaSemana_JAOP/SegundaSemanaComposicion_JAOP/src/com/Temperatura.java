package com;

public class Temperatura {

	private String frio;
	private String templado;
	private String caliente;
	
	public Temperatura () {}

	public Temperatura(String frio, String templado, String caliente) {
		super();
		this.frio = frio;
		this.templado = templado;
		this.caliente = caliente;
	}

	public String getFrio() {
		return frio;
	}

	public void setFrio(String frio) {
		this.frio = frio;
	}

	public String getTemplado() {
		return templado;
	}

	public void setTemplado(String templado) {
		this.templado = templado;
	}

	public String getCaliente() {
		return caliente;
	}

	public void setCaliente(String caliente) {
		this.caliente = caliente;
	}

	@Override
	public String toString() {
		return "Temperatura [frio=" + frio + ", templado=" + templado + ", caliente=" + caliente + "]";
	}
	
	
	
}
