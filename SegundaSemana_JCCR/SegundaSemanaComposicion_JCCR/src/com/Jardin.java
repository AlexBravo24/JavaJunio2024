package com;

public class Jardin {

	private String nombre;
	private Double dimension;
	private String ubicacion;
	
	private Planta planta;
	private Flor flor;
	private Arbol arbol;
	private Fuente fuente;
	
	public Jardin() {
		super();
	}

	public Jardin(String nombre, Double dimension, String ubicacion, Planta planta, Flor flor, Arbol arbol,
			Fuente fuente) {
		super();
		this.nombre = nombre;
		this.dimension = dimension;
		this.ubicacion = ubicacion;
		this.planta = planta;
		this.flor = flor;
		this.arbol = arbol;
		this.fuente = fuente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getDimension() {
		return dimension;
	}

	public void setDimension(Double dimension) {
		this.dimension = dimension;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Planta getPlanta() {
		return planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public Flor getFlores() {
		return flor;
	}

	public void setFlores(Flor flores) {
		this.flor = flores;
	}

	public Arbol getArbol() {
		return arbol;
	}

	public void setArbol(Arbol arbol) {
		this.arbol = arbol;
	}

	public Fuente getFuente() {
		return fuente;
	}

	public void setFuente(Fuente fuente) {
		this.fuente = fuente;
	}

	@Override
	public String toString() {
		return "Jardin [nombre=" + nombre + ", dimension=" + dimension + ", ubicacion=" + ubicacion + ", planta="
				+ planta + ", flor=" + flor + ", arbol=" + arbol + ", fuente=" + fuente + "]";
	}
	
	
	
}
