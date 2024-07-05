package com;

public abstract class Persona {

	
	
		private String nombre;
		private String genero;
		private int edad;
		
		public Persona() {
			
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
		
		//Declaracion de metoodos propios - acciones que nuestro objeto puede realizar
		
		//Metodos sin retorno llevan el modificador o palabra reservada void
		//lo cual indica que no debe devolver un tipo de dato, pero si ejecuta algo
		
		public void dormir () {
			
			//Aqui en el curpo del metodo debo definir como se realiza esta accion 
		System.out.println("ZzzzZzzzZZ......");
		
		}
		
		//Metodos con retorno- deben devolver el tipo de dato con el que son declarados
		
		public String comer() {
			//Los metodos con retorno , en este ejemplo deben devolver un valor de tipo String
			
			String comiendo ="Estoy comiendo";
			
			return comiendo;
			
		
		}
		
		//Declarar un metodo polimorfico - es un metodo que va contener el misom onmbre de otro
		//pero se va a realizar de forma diferente gracias a que solcita diferente argumentos 
		
		//Ejemplo del metodo dormir- que va a solcitar cuantas horas dormira la persona
		
		public void dormir(int horas) {
			System.out.println("voy a dormir "+ horas +" horas");
		}
		
		public void dormir(int horas, String lugar) {
			System.out.println("Vor a dormir"+ horas + "horas"+ "en" + lugar);
			
			
		}
		
		//el polimormismo es el otro pilar de la POO
		//es mas aplicado en metodos y es la facultad de que es un metodo
		
		
		//Declaracion de un metodo abstracto 
		//Es aquel que indica que se va hacer pero no como se va a hacer
		
		public abstract void sumar();

		public void sumar(int a, int b) {
			
		} 
		
		}
		

		
		

