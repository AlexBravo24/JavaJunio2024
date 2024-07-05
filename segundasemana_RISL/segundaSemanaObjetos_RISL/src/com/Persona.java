package com;

public class Persona {
	
	//Esta clase servira como molde para crear el objeto persona
//abstraccion
	// proceso o pilar de la pOO que nos ayuda a definir los atributos de nuestro 
	//objeto
	
	// modificadores de acceso permiten proteger los atributos de usos
	//no autorizados 
	
	private String nombre;
	private String genero;
	private int edad;
	private double peso;
	private double altura;
	
	//Despues de declarar y haberles colocado modificadores de acceso, existen metodos 
	//que permitiran construir a nuestros objetos
	//metodos costructores
	 
	//Metodo contrusctor vacio- nos permite iniciar un objeto vacio y porteriormente poder asignarle
	//valor a los atributos del objeto
	
	public Persona () {
		
	}

	public Persona(String nombre, String genero, int edad, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	//metodo constructor co todos los argumentos, se utiliza para crear un objeto 
		//con sus atributos inicializados
		
	//puedo generar tantos constructores como necesite 	
	
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getGenero() {
			return genero;
		}
		// metodo get devuelve el valor del atributo 
		//metodo set permite establecer un valor al atributo 
		

		public void setGenero(String genero) {
			this.genero = genero;
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

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}

		@Override
		public String toString() {
			return "Persona [edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
		}


	
		


	
	}
	
	
	