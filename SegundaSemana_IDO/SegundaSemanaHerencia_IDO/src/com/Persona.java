package com;

public abstract class  Persona {
	
	
	private String nombre;
	private String genero;
	private int edad;
	
	
	public Persona() {
		
	}

	// 
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
		
		//como declarar metodos propios void y retorn
		//que es el  polimorfismo
		
		
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

	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	
	//declaracion de metodos propios que osn acciones qu enuestro pemmetodo pueda hacer o realizar
	//metodos sin retorno llevan el modificador o palabra r3eservadas coid
	//la cual indica que no debe de devolver un tipoo de dato pero si ejecuta algo 
	
	public void dormir() {
		// en el cuerpo del metodo se define  como se realiza esta accion
		System.out.println("Estoy durmiendo .....ZZZzzzzzzzz");
				//Metodos con retorno  estos deben de volver el tipo de dato con el que son declarados
			
		}
	public String comer() {
		//los metodos con retorono deben de volver un valor de tiopo string
		
		String comiendo = "Estoy comiendo";
		return comiendo ;		
	}
	// metodo polimorfico es un metodo que va a contebner el mismo nombre
	//de otro pero se va a realizar de forma doiferente gracias a q solicita diferentes argumentos
	//Ejemplo el metodo dormir que va  asolicitar cunatas horas dormira la persona
	
	public void dormir (int horas) {
		System.out.println("Voy a dormir " + horas + " horas");
		
	}
	
	public void dormir (int horas, String lugar) {
		System.out.println("Voy a dormir " + horas + " horas " + " en " + lugar);
	}
	
	
	// El polimorfismo es mas aplicado en metodos  y es la facultad
	//de que un metodo posea el mismo  nombre y se ejecute de diversas formas
	
	
	//declaracion de un metodo abstracto es aquel que se vahacer pero no como se va hacer
	
	
	public abstract void sumar (int a, int b);
	
	public abstract void sumar ();
	

}
