package com;

public class Persona {

	
	
	//Esta clase nos va a servir como  una platilla o molde
	//para poder crear objetos persona
	
	// comenzamos con algo que se llama modelado de nuestro objeto 
	
	//Proceso o pilar POO que nos ayuda a deteer los atributos
	// y comportamientos de mi objeto
	
	//Existe algo que se llama modificador de acceso que me va permitir
	//proteger mis atributos o metodos de usos no autorizados 
	//y que forman parte de otro pilar de la POO llamado encapsulamineto 
	// los modificadore de acceso son private, protected, public, default 
	
	private String nombre;
	private String sexo;
	private int edad;
	private double peso;
	private double altura;
	
	//Despues de declarar atributos y haberles colocado modificadores de acceso , exiten metodos 
	//que nos permite construir a nuestros objetos 
	
	//Metodos Constructores 
	
	//nos permite iniciar un objeto vacio y posteriormente poder asignarle 
	//valor a los atributos del objeto
	
	public Persona() {
	}
	
	
	

		//Metodo constructor con todos los argumentos  - se utliza 
	// public Persona (String name, String gene, int aga, double heigth, double size) {
		//nombre= name;
		//sexo = gene;
		//int edad = aga;
		//double peso=heigth;
		//double altura=size; */
		
	public Persona(String nombre, String sexo, int edad, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}


	
	//puedo generar tanto constructures como necesite 

		public Persona(String nombre) {
			super();
			this.nombre = nombre;
		}


// Metodos Getters y Setters
		// Metodo Get- Devuelven el valor almacenado del atributo en cuestion 
		//Metodo Set- nos permite establecer un valor a un atributo determinado

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




		public double getAltura() {
			return altura;
		}




		public void setAltura(double altura) {
			this.altura = altura;
		}


//Metodo toString() - nos sirve para poder visualizar en formato String
		//los valaores de nuestro objeto en cuestion 
		//

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", altura="
					+ altura + "]";
		}

	

	}
	
	

