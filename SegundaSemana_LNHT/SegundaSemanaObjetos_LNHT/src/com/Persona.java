package com;

public class Persona {
		// esta clase nos va a servir como una plantilla o molde para poder crear objetos persona
	
	// comenzamos con algo que se llama modelado de nuestro objeto
	
	// abstraccion
	//proceso o pilar POO, que nos ayuda  a definir los atributos y comportamiento de mi objeto 
	
	
	//existe algo que se llama modificador de acceso, que me va a permitir proteger mis atributos o metodos de usos 
	// no autorizados
	// y que forman parte de otro pillar de la POO llamado encapsumiento
	
	// los modificadores de acceso son: private, protected public default
	private String nombre;
	private String sexo;
	private static final int edad;
	private double peso;
	private double talla;
	
	//Con modificadores static, creamos atributos o metodos de clase.
	//Aplican para todos los objetos creados de esa clase con static aun podemosmodificar el valor para 
	//todos los objetos de la clase, si fuera necesario ejempl, actualizar un precio
	
	//Con tatic final, creamos valores inmutables y no pueden ser modificados
	
	//Metodos constructores 
	//Metodo contructor vacio- nos permite iniciar un objeto vacio y posteriormente poderle asignarle 
	// valor a los atributos del objeto
	public Persona () {
		
	}

	// Metodo constructor con todos los argumento - se utiliza 	para crear un objeto con sus atributos inicializados 

	public Persona(String nombre, String sexo, int edad, double peso, double talla) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
	}
	//Puedo generar tantos contructores como necesite 
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	// Metodos Getters y Setter
	
	//Metodos get - devuelven el valor almacenado del atributo en cuestion
	// Metodo set - nos permite establecer un valor a un atributo determinado
	// con el constructor vacio y el de todos los parametros es suficiente , gracias alos 
	//metodos getter y setters , donde el metodo contructor vacio es el comodin 
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

	//Metodo toString() -nos permite para poder visualizar en formato String 
	//los valores de nuestro objeto en cuestion
	// imaginemos que sirve como un radiografia de nuestro objeto
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla
				+ "]";
		
	}
	
	
	
	
	
}
