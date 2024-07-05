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
		return "Persona [nombre = " + nombre + ", genero = " + genero + ", edad = " + edad + "]";
	}
	
	// M�todos propios - Acciones que nuestro objeto puede realizar
	
			/*
			 * M�todos sin retorno - Llevan el modificador o palabra void, lo cual indica que no debe devolver un tipo de
			 * dato, pero si ejecuta una acci�n
			 */
			
			public void dormir() {
				// Aqu� en el cuerpo del m�todo debo definir como se realiza esta acci�n
				
				System.out.println("ZzZzZzZz.... ");
			}
			
			/*
			 * M�todos con retorno - Deben devolver el tipo de dato con el que son declarados. 
			 */
			
			public String comer () {
				String comiendo = "Estoy comiendo...";
				
				return comiendo;
			}
	
	// Polimorfismo
			/*
			 * Capacidad de una funcion, metodo o variable, de poseer varias formas distintas.}
			 * Podriamos decir que un mismo identificador comparte varios significados diferentes.
			 */
			
			/*M�todo polimorfico - es un m�todo que va a contener el mismo nombre de otro, pero se va a realizar de forma
			 * diferente gracias a que solicita diferentes argumentos.
			 * 
			 * Ejemplo: el m�todo dormir que va a solicitar cuantas horas dormir� la Persona.
			*/ 

			public void dormir (int horas) {
				System.out.println("Voy a dormir "+horas+" horas");
			}
			
			public void dormir (int horas, String lugar) {
				System.out.println("Voy a dormir "+horas+ " horas en "+lugar);
			}
			
			// Declaraci�n de un m�todo ABSTRACTO
			// Es aquel que indica QU� se va a hacer, pero no C�MO se va a hacer.
			
			public abstract void sumar(int a, int b);
			
			public abstract void sumar();

} // Class Persona
