package com;

public class Persona {

	
	
	
	//Esta clase nos va a servir como una plantilla o molde para poder crear objetos persona
	
	//Comenzamos con algo llamado moldedo de nuestro objetios
	
	//ABSTRACCION
	//proceso o pilar POO que nos ayuda a definir los atributos y comportamientos de mi objeto
	//Existen algo que se llama modificador de objetos que va a permitir proteger mis atributos o
	//metodos de usos no autorizados y que forman parte de la POO, llamado ENCAPSULAMIENTO
	//Los modificadores de acceso son private, protected, public, default.
	
	
	private String nombre;
	private String sexo;
	private int edad;
	private double peso;
	private double talla;
	
	//Despues de declarar atributos y haberles colocado modificadores de accesoexisten
	//metodos que nos permitarn contruir a nuestros objetos
	
	//Metodos costructores
	
	//Medtodo de constructor vacio.- Nos permite iniciar un objeto vacio y posteriormente puede asignarle
	// valor a los atributos del objeto
	
	public Persona () {
		
				
	}
	
	//Metodo constructor con todos los argumentos: se utiliza para crear un objeto
	//con sus atributos inicializados
	


	public Persona(String nombre, String sexo, int edad, double peso, double talla) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
	
		//Puedo generar todos los constructores que necesite pero regularmente en el constructor vacio y en el de todos
		//los parametros es suficiente gracias a los metdodos getter y setters donde el vacio actuara como un comidin
		
		
	
	
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	//Metodos Getter y Setters:
	
	//Metodo Get-devuelven el valor almacenado del atributo en cuestion
	//Metodos Set- nos permiten establecer un valor a un atributo determinado
	
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

	//metodo toString nos sirve para visualizar en formatos string los valores de nuestro objeto en cuestion, es como una radiografia
	//en nuestro objeto
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla
				+ "]";
	}
	


}
