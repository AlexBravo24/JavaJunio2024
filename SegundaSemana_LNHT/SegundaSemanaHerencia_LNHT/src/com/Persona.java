package com;

public abstract class Persona {
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona() {}
	
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
	 //como declarar metodos propios que son los metodos void y los metodos de retorno
	//que es el polomorfismo
	
	//Metodos propios - acciones que nuestro objeto puede realizar 
	
	// metodo sin retorno - llevan el modificador o palabra reservada void 
	//lo cual indica que no debe devolver un tipo de dato pero si ejecuta algo 
	
	public void dormir() {
		//Aqui en el cuerpo del metodo debo definir como se realiza esta oaccion
		
		System.out.println("ZzZzZzZz....");
	}
	
	public String comer() {
		//Los metodos con retorno deben devolver valor con tipo String
		String comiendo= "Estoy comiendo...";
		
		return comiendo;
	}
	//Metodo Polimorfismo- es un metodo que va a contener el mismo nombre de otro pero se va a realizar de forma diferente 
		// gracias a que solicita diferentes argumentos 
		
		//Ejemplo de metodo dormir que va a solicitar cuantas horras dormira la persona 
		
		public void dormir(int horas) {
			System.out.println("voy a dormir "+ horas+" horas");
		}
		
	public void dormir(int horas, String lugar) {
		System.out.println("voy a dormir "+ horas+" horas en "+ lugar);
	}
	// EL POLIMORFISMO ES OTRO PILAR DE LA poo
	//es mas aplicado a metodos y es la facultad de que un metodo posee el mismo nombre y se ejecute
	//de diversas formas 
	
	//Declaracion de un metodo abstracto 
	// Es aquel que indica que se va hacer pero no como se va hacer 
	
	public abstract void sumar(int a,int b);
	
	public abstract void sumar();
	
	
}
