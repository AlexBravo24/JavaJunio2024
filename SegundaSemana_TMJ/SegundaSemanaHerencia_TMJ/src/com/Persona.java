package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad ;
	
	
	
	public Persona(){
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

	//metodos propios son acciones que nuestro objeto puede realizar 
	
	//metopdos sin retorno - llevan el modificador o palabra reservada que indica que no 
	// debe devolver un tipo de dato 
	
	
	public void dormir() {
		// aqui se  define el como se realiza la accion del metodo 
		System.out.println("ZZzzZZZzzzZZZzzzZZZ...!!!");
		
	}
	public String comer() {
		String comiendo = "Estoy comiendo.....";
		return comiendo;
	}
	
	//Metodo polimorfico es un metodo que a a contener el mismo nombre de otro 
	// pero este va a realizar  su accion de manera diferente 
	
	//Ejemplo del metodo dormir , que va a solicitar cuantas horas dormira la persona
	
	public void dormir(int horas) {
		System.out.println("Dormi durante ..."+ horas + "horas");
	}
		
	//nuevo metodo dormir
	
	//tener varios metodos con el mismo nombre se le conoce como sobre carga de metodos
	// el tener varios argumentos que solicitan varios metodos se le conoce coo sobre carga de argumentos 

	public void dormir (int horas, String lugar ){
		
		System.out.println("voy a dormir"+ horas+" horas"+ "en "+lugar);
	}
	
	/*El polimorfismo es otro pilar  de   la poo 
	 *
	 * 
	 * 
	 * DECLARACION DE UN METODO ABSTRACTO
	 * 
	 * Es aquel que indica que accion se va  a hacer pero no el como se  realizara 
	 * 
	 * */
	public abstract void sumar(int a, int b);// el metodo al ser declarado con  ; agregamos la palabra abstrac
	
	public abstract void sumar();
	
	
	
	}
