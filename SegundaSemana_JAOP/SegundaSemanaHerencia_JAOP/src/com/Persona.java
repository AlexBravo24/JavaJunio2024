package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {}

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
	
	//Metodos propios- Acciones que nuestro objeto puede realizar
	//Metodos sin retorno-llevan el modificador  o palabra reservada void
	//Los metodos sin retorno son aquellos que llevan el modificador void el cual indica que no debe
	//devolver ningun tipo de dato pero si ejecuta algo

	public void dormir () {
		
		//Aqui en el cuerpop del metodo debo definir como se realiza esta accion
		System.out.println("ZzZzZzZzZzZz...");
		
	}
		//Vamos a declarar metodos con retorno, estops deben de devolver el tipo de dato con el que son declarados
		
		public String comer () {
			//Los metodos con retorno deben devolver un valor de tipo string solo en este ejemplo
			String comiendo = "Estoy comiendo...";
			
			return comiendo;
					
		}
		//-------------------------------------------------------------------------------------------
		// Metodo Polimorfico.- Es un metodo que va a contener el mismo nombre de otro pero se va a realizar
		// de forma diferente gracias a que solicita diferentes argumentos
		
	//Ejemplo del metodo dormir que va a solicitar cuantas horas dormira esa persona
		
		public void dormir (int horas) {
			
			System.out.println("Voy a dormir" + horas + "horas");			
			
		}
		
		public void dormir (int horas, String lugar) {
		System.out.println("Voy a dormir" + horas + "horas"+ "en" + lugar);
		}
		
		
		//El polimorfismo es otro pilar de la POO
		//Es mas aplicado en metodos y es la facultad de que un metodo
		//posea el mismo nombre y se ejecute de diferentes formas
		//------------------------------------------------------------------------------------------
		//Declaracion de un metodo abstracto
		//Es aquel que indica que se va a hacer pero no como se va a hacer
		
		public abstract void sumar (int a, int b);
		public abstract void sumar();
		
		
			
		}
	



	

	

