package com;

public abstract class Persona {
private String nombre;
private String genero;
private int edad;

public Persona () {
}

public Persona(String nombre, String genero, int edad) {
	super();
	this.nombre = nombre;
	this.genero = genero;
	this.edad = edad;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
}

//metodos propios- acciones que nuestro objeto puede realizar
//metodos sin retorno- llevan el modificador void, indica que no debe devolver un tipo
//de dato, pero si ejecuta.

public void dormir() {
	//aqui en el cuerpo del metodo se define como realizar la accion
	System.out.println("zzzzzz....");
	
}
//metodos con retorno- deben devolver un tipo de dato con el que son declarados
public String comer() {
	String comiendo=("Estoy comiendo...");
	return comiendo;

}

//Metodo polimorfico- es un metodo que va a contener el mismo nombre de otro
//pero se va a realizar de forma diferente, gracias a que solicita diferentes argumentos

//ejemplo el metodo dormir, que se va a solicitar cuantas horas dormirá la persona

public void dormir(int horas) {
	System.out.println("voy a dormir "+ horas + "horas");

}

public void dormir(int horas, String lugar) {
	
	
}




//Declaracion de un metodo abstracto
//es aquel que indice QUE se va a hacer, pero no COMO se va a hacer 

public abstract void sumar(int a, int b);

}
