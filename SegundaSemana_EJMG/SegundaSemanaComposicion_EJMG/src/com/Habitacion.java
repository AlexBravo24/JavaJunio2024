package com;

public class Habitacion {
    private String cama;
    private String television;
    private int ventanas;
    
    public Habitacion() {}

	public Habitacion(String cama, String television, int ventanas) {
		super();
		this.cama = cama;
		this.television = television;
		this.ventanas = ventanas;
	}

	public String getCama() {
		return cama;
	}

	public void setCama(String cama) {
		this.cama = cama;
	}

	public String getTelevision() {
		return television;
	}

	public void setTelevision(String television) {
		this.television = television;
	}

	public int getVentanas() {
		return ventanas;
	}

	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}

	@Override
	public String toString() {
		return "Habitacion [cama=" + cama + ", television=" + television + ", ventanas=" + ventanas + "]";
	}
    
    
    
    
    
}
