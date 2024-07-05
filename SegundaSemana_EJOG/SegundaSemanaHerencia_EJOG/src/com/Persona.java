package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {
		
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
	
	
	//M�todos Propios - Acciones que nuestro objeto puede realizar
	
	
	
	
	//M�todos con retorno - deben devolver el tipo de dato con el que son declarados 
	public String comer() {
		//Los m�todos con retorno en este ejemplo deben devolver un valor tipo String
		
		String comiendo = "Estoy comiendo";
		
		return comiendo;
	}
	
	//El tener varios metodos con el mismo nombre, se le conoce como Sobrecarga de m�todos
	//M�todos sin retorno - llevan el modificador o palabra reservada VOID, lo cual indica que no debe devolver
	//un tipo de dato, pero si ejecuta algo
	public void dormir () {
		//En el cuerpo del m�todo debo definir como se realiza esta acci�n
		System.out.println("ZzZzZzZ......");
	}
	//M�todo polimofrico - es un m�todo que va a contener el mismo nombre de otro pero se va a realizar de una forma 
	//diferente, gracias a que solicita diferentes argumentos.
	
	//Ejemplo del m�todo dormir , que va a solicitar cu�ntas horas dormira la persona
	public void dormir(int horas) {
		System.out.println("Voy a dormir "+ horas + " horas");
	}
	
	//Ejemplo con sobrecarga de argumentos.
	public void dormir(int horas, String lugar) {
		System.out.println("Voy a dormir "+horas+" horas en "+lugar);
	}
	//EL POLIMORFISMO es otro pilar de la POO mas aplicados a metodos y posea el mismo nombre y se ejecute de diversas formas
	
	
	//Declaraci�n de un m�todo ABSTRACTO
	//Es aquel que indica QUE se va a hacer, per no COMO se va a hacer
	
	public abstract void sumar(int a, int b);
	
	public abstract void sumar();
	
}
