package com;

public class Persona {
	
	// esta clase no va a servir  como una plantilla o molde para
	//poder crear objetos persona
	
	// comenzamos con algo que se llama modelado de nuestra
	//objeto
	
	//abtraccion
	//Proceso o pilar poo que nos ayuda a definir los atributos
	//y comportamiento de mi objeto
	
	//exite algo que lla amodificadores de aceso que me va a permitir
	// proteger mis atributos o metodos de usos no autorizados
	// y que forman parte de otro pilar de la poo llamado encapsulamiento
	// loaa modificadores de acceso son private, protected, public, default
	
	private String nombre;
	private String sexo;
	private int edad;
	private double peso;
	private double talla;
	
	// despues de haber declarado atributos  y haberles colocado modificadores de acceso
	// existen metodos que nos permitan construir a nuestros objetos
	
	// Metofdos constructores
	
	//Metodo constructor vacio - nos permiten imiciar un objeto vacio y posteriormente poder asignarle
	//valor a los atributos del objeto
	
	public Persona () {
		
		
	}
	
	//Metodo constructor con todos los argumentos se utiliza para crear un objeto con sus atributos inicializados

//	public Persona (String name, String genre, int age, double heigth, double size) {
//		nombre = name;
//		sexo = genre;
//		edad = age;
//		peso = heigth;
//		talla = size;
//		
		
	//}
	
	
	
	{
		
	}

	public Persona(String nombre, String sexo, int edad, double peso, double talla) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
	}

	//Puedo generar tantos constructores como necesite
	//
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla
				+ "]";
	}
	
	
	
	

}
