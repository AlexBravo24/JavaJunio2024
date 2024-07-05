package com;

public class BocinaPortable extends EquipoAudio {
	private String marca;
	private String rangoConexion;
	private String carga;
	private int duracion;
	
public BocinaPortable () {
	}

public BocinaPortable(double potencia, double frecuencia, String conectividad, String marca, String rangoConexion,
		String carga, int duracion) {
	super(potencia, frecuencia, conectividad);
	this.marca = marca;
	this.rangoConexion = rangoConexion;
	this.carga = carga;
	this.duracion = duracion;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getRangoConexion() {
	return rangoConexion;
}

public void setRangoConexion(String rangoConexion) {
	this.rangoConexion = rangoConexion;
}

public String getCarga() {
	return carga;
}

public void setCarga(String carga) {
	this.carga = carga;
}

public int getDuracion() {
	return duracion;
}

public void setDuracion(int duracion) {
	this.duracion = duracion;
}

@Override
public String toString() {
	return "BocinaPortable [marca = " + marca + ", rangoConexion = " + rangoConexion + ", carga = " + carga + ", duracion = "
			+ duracion + ", heredados = " + super.toString() + "]";
}



	
}//class
