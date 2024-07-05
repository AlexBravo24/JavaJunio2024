package com;

public class Desarrollador {
	
	private String compa�ia;
	private String creador;
	private String pa�s;
	
	public Desarrollador () {}

	public Desarrollador(String compa�ia, String creador, String pa�s) {
		super();
		this.compa�ia = compa�ia;
		this.creador = creador;
		this.pa�s = pa�s;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getPa�s() {
		return pa�s;
	}

	public void setPa�s(String pa�s) {
		this.pa�s = pa�s;
	}

	@Override
	public String toString() {
		return "Desarrollador [compa�ia=" + compa�ia + ", creador=" + creador + ", pa�s=" + pa�s + "]";
	}
	
	

}
