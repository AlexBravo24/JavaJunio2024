package com;

public class Casa {
	
  private String color;
  private int ventanas ;
  private int habitaciones;
  
  private Sala reclinable;
  private Cocina mabe;
  private Habitacion matrimonial ;
  
  public Casa() {}

public Casa(String color, int ventanas, int habitaciones, Sala reclinable, Cocina mabe, Habitacion matrimonial) {
	super();
	this.color = color;
	this.ventanas = ventanas;
	this.habitaciones = habitaciones;
	this.reclinable = reclinable;
	this.mabe = mabe;
	this.matrimonial = matrimonial;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getVentanas() {
	return ventanas;
}

public void setVentanas(int ventanas) {
	this.ventanas = ventanas;
}

public int getHabitaciones() {
	return habitaciones;
}

public void setHabitaciones(int habitaciones) {
	this.habitaciones = habitaciones;
}

public Sala getReclinable() {
	return reclinable;
}

public void setReclinable(Sala reclinable) {
	this.reclinable = reclinable;
}

public Cocina getMabe() {
	return mabe;
}

public void setMabe(Cocina mabe) {
	this.mabe = mabe;
}

public Habitacion getMatrimonial() {
	return matrimonial;
}

public void setMatrimonial(Habitacion matrimonial) {
	this.matrimonial = matrimonial;
}

@Override
public String toString() {
	return "Casa [color=" + color + ", ventanas=" + ventanas + ", habitaciones=" + habitaciones + ", reclinable="
			+ reclinable + ", mabe=" + mabe + ", matrimonial=" + matrimonial + "]";
}
  
  
  
	
	
}
