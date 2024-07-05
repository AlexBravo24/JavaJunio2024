package com;

public class Desarrollador {
	
	private String compañia;
	private String creador;
	private String país;
	
	public Desarrollador () {}

	public Desarrollador(String compañia, String creador, String país) {
		super();
		this.compañia = compañia;
		this.creador = creador;
		this.país = país;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getPaís() {
		return país;
	}

	public void setPaís(String país) {
		this.país = país;
	}

	@Override
	public String toString() {
		return "Desarrollador [compañia=" + compañia + ", creador=" + creador + ", país=" + país + "]";
	}
	
	

}
