package com;

public class Persona {
	
	//Esta clase nos va a servir como una plantilla o molde para poder crear objetos "persona"
	
	//1.Comenzamos con algo que se llama modelado de nuestro objeto
	
	//==========ABSTRACCIÓN=============
	//Proceso o pilar POO, que nos ayuda a definir los atributos y comportamientos de mi objeto.
	
	//ADEMÁS, existen "modificadores de acceso", que me permitirán proteger mis atributos o métodos de uso
	//no autorizado y que forman parte de otro PILAR DE LA POO, llamado ENCAPSULAMIENTO.
	
	//Los modificadores de acceso son: PRIVATE, DEFAULT, PROTECTED Y PUBLIC.
	//De los cuales PRIVATE es de los más utilizados.
	
	private String nombre;
	private String sexo;
	private int edad;
	private double peso;
	private double talla;
	
	//Después de declarar atributos y haberles colocado modificadores de acceso, existen métodos que nos 
	//permiten construir nuestro objeto
	
	//============MÉTODOS CONSTRUCTORES===============
	
	//Método constructor VACÍO - nos permite iniciar un objeto vacío y posteriormente poder asignarle 
	//valor a los atributos del objeto:
	
	public Persona () {
	}
	
	//Método constructor CON TODOS LOA ARGUMENTOS - se utiliza para crear un objeto con sus atributos inicializados

	public Persona(String nombre, String sexo, int edad, double peso, double talla) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
	}
	//Puedo generar tantos constructores como necesite, especificando en un solo atributo:

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		//AUNQUE es mas que suficiente con los primeros dos constructores, PUES, debido a los métodos getters y setters
		//
	}
	
	//===========MÉTODOS GETTERS Y SETTERS==============
	// Método Get - Devuelve el valor almacenado del atributo en cuestión
	// Método Set - Nos permite establecer un valor a un atributo deteminado

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
	//Método toString()-nos sirve para poder visualizar en formato String los valores de nuestro objeto en cuestion
	//Imaginemos que sirve como una radiografía de nuestro objeto

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla
				+ "]";
	}
	

}
