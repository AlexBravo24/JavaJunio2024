package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {}

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


	//M�todos propios - Acciones que nuestro objeto puede realizar
	
	//M�todos sin retorno - Llevan el modificador o palabra reservada void
	//lo cual indica que no debe devolver un tipo de dato, pero si ejecuta algo
	
	public void dormir () { //Tener varios m�todos con el mismo nombre, se le conoce como Sobrecarga de m�todos
		//Aqui en el cuerpo del m�todo debo definir c�mo 
		//se realiza esta accion 
		System.out.println("Estoy durmiendo...");
	}
	
	//M�todos con retorno - deben devolver el tipo de dato con el que son declarados
	
	public String comer () { //Este no pide ning�n argumento
		//Los m�todos con retorno, en este ejemplo, deben devolver valor de tipo String
		
		String comiendo = "Estoy comiendo ...";
		
		return comiendo;
	}
	
	//Polimorfismo - Habilidad de una funci�n, m�todo, variable
	//u objeto de poseer varias formas distintas. 
	
	//M�todo poliformico - es un m�todo que va a contener el mismo nombre de otro
	//pero se va a realizar de forma diferente, gracias a que se solicita diferentes argumentos
	
	//Ejemplo del m�todo dormir, que va a solicitar cu�ntas horas dormira la Persona
	
	public void dormir (int horas) { //Este pide un argumento de tipo entero
		System.out.println("Voy a dormir " + horas + " horas");
	}
	
	public void dormir (int horas, String lugar) { //El tener varios argumentos que soliciten los m�todos se le 
		//conoce como Sobrecarga de argumentos
	System.out.println("Voy a dormir " + horas + " horas " + " en " + lugar);
	}
	
	//El polimorfismo es otro pilar de la POO
	//es m�s aplicado en m�todos y es la facultad de que un m�todo
	//posee el mismo nombre y se ejecuta de diversas formas
	
	
	//Declaraci�n de un m�todo Abstracto 
	//Es aquel que indica que se va a hacer, pero no como se va a hacer
	
	public abstract void sumar(int a, int b); 
	
	public abstract void sumar();
	
	
	
	
	
	
}
