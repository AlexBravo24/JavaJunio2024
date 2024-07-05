package com;

import java.util.List;

public class JardinList {
	private String nombre;
	private double dimensiones;
	private String ubicacion;

	private List<Planta> plantas;
	private List<Flor> flores;
	private List<Arbol> arboles;
	private List<Fuente> fuentes;

	public JardinList(String nombre, double dimensiones, String ubicacion, List<Planta> plantas, List<Flor> flores,
			List<Arbol> arboles, List<Fuente> fuentes) {
		super();
		this.nombre = nombre;
		this.dimensiones = dimensiones;
		this.ubicacion = ubicacion;
		this.plantas = plantas;
		this.flores = flores;
		this.arboles = arboles;
		this.fuentes = fuentes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(double dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Planta> getPlantas() {
		return plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

	public List<Flor> getFlores() {
		return flores;
	}

	public void setFlores(List<Flor> flores) {
		this.flores = flores;
	}

	public List<Arbol> getArboles() {
		return arboles;
	}

	public void setArboles(List<Arbol> arboles) {
		this.arboles = arboles;
	}

	public List<Fuente> getFuentes() {
		return fuentes;
	}

	public void setFuentes(List<Fuente> fuentes) {
		this.fuentes = fuentes;
	}

	@Override
	public String toString() {
		return "JardinList [nombre=" + nombre + ", dimensiones=" + dimensiones + ", ubicacion=" + ubicacion
				+ ", plantas=" + plantas + ", flores=" + flores + ", arboles=" + arboles + ", fuentes=" + fuentes + "]";
	}

}
