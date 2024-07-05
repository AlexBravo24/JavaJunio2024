package com;

public class Persona {
	
	// Esta clase nos va a servir como una plantilla o molde para poder crear objetos persona
	
	//Comenzamos con algo que se llama modelado de nuestro objeto.
	
	// ABSTRACCI�N
	// Proceso o pilar POO que nos ayuda a definir los atributos y comportamientos de mi objeto.
	
	// Existe algo que se llama modificador de acceso, que me va a permitir proteger mis atributos o m�tdoso de usos no
	// autorizados y que forman parte de otro pilar de la POO, llamado ENCAPSULACI�N.	
	//Los modificadores de acceso son de tipo, private, protected, public, default.

	private String nombre;
	private String sexo;
	private static final int edad=28;
	private double peso;
	private double talla;
	
	// Despu�s de declarar atributos y haberles colocado modificadores de acceso, existen m�todos que nos permitir�n
	// construir a nuestro objetos
	
	// M�todos constructores
	// M�todo constructor vac�o - nos permite iniciar un objeto vac�o y posteriormente poder asignarle valor a los
	//atributos del objeto.
	
	public Persona () {
	}
		
	
	// M�todo con todos los argumentos - Se utiliza para crear un objeto con sus atributos inicializados	
		
	// Clic derecho -> source -> Generate constructor using Fields
			public Persona(String nombre, String sexo, double peso, double talla) {
			super();
			this.nombre = nombre;
			this.sexo = sexo;
			this.peso = peso;
			this.talla = talla;
		}
			// Puedo generar tantos constructores como necesite, pero regularmente con el constructor vacio y el de
			// todos los parametros es suficiente, gracias a los metodos Getters y Stters, donde el vacio actuara como 
			// un comodin
			// Seleccionamos unicamente los atributos que queremos


	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
			//Clic derecho -> Source -> Generar Getters and Setters 
	// Metodos Get - Devuelven el valor almacenado del atributo en cuesti�n
	// M�todos set - Nos permiten establecer un valor a un atributo determinado


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
	
	//M�todo toString () - nos sirve para poder visualizar en formato String los valores de nuestro objeto en cuesti�n
	// Imaginemonos que sirve como una "radiograf�a" de nuestro objeto.

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla
				+ "]";
	}
	
	
		
	
		
	
	

}
