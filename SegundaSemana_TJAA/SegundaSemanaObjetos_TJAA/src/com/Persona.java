package com;

public class Persona {

	//Esta clase nos va a servir como una plantilla molde 
	//para poder crear objetos persona 
	
	//Comenzamos con algo que se llama modelado de nuestro
	//objeto 
	
	//ABSTRACCIÓN
	//Proceso o pilar POO, que nos ayuda a definir los atributos
	//y comportamientos de mi objeto 
	
	//Existe algo que se llama modificador de acceso, que me va a 
	//permitir proteger mis atributos o métodos de usos no autorizados 
	//y que forman parte de otro pilar de la POO, llamado ENCAPSULAMIENTO
	//Los modificadores de acceso son private, protected, public, default
	
	private String nombre;
	private String sexo;
	private int edad;
	private double peso;
	private double talla;
	
	//Después de declarar atributos y haberles colocado modificadores de acceso
	//existen métodos que nos permitirán construir nuestros objetos
	
	//Métodos constructor vacio - nos permite iniciar un objeto vacio y posteriormente
	//poder asignarle valor a los atributos del objeto 
	
	public Persona () {
		
	}

	
	//Método constructor con todos los argumentos - se utiliza para crear un objeto con sus
	//atributos inicializados 
	
	public Persona(String nombre, String sexo, int edad, double peso, double talla) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
	

		
	}

	//Puedo generar tantos constructores como necesite, pero, regularmente
	//con el constructor vacio y el de todos los parametros es suficiente, gracias 
	//a los comandos 
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	//Métodos Getters y Setters
	
	//Métodos Get - Devuelven el valor almacenado del atributo en cuestión 
	//Métodos Set - Nos permite establecer un valor a un atributo determinado 
	

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


	//Método toString() - nos sirve para poder visualizar en formato String
	//los valores de nuestro objeto en cuestión 
	//Imaginemonos que sirve como una "radiografia" de nuestro objeto 
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla
				+ "]";
	}
	
	
	
	

	
	
	
}
