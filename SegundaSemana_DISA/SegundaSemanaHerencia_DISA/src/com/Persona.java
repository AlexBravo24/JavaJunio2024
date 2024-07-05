package com;

public abstract class Persona {
	
	private String name;
	private String genere;
	private int edad;
	
	public Persona () {}

	public Persona(String name, String genere, int edad) {
		super();
		this.name = name;
		this.genere = genere;
		this.edad = edad;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", genere=" + genere + ", edad=" + edad + "]";
	}
	
	//==============MÉTODOS PROPIOS ==============
	//Son acciones que nuestro objeto puede realizar
	
	//Dentro de este método existe un MÉTODO SIN RETORNO:
	//LLevan el modificador o palabra reservada "VOID", lo cual indica que no debe devolver un tipo de dato, pero sí ejecuta algo.
	
	public void dormir () { //Aquí, en el cuerpo del método, deno definir COMO se realiza esta acción.
		System.out.println("ZzZzZzZzZzZzZzZz.......");
	}
		//MÉTODO CON RETORNO: deben devolver el tipo de dato con el que son declarados
		
		public String comer () {
			//Los métodos con retorno, en este ejemplo, deben devolver un valor de tripo String
			String comiendo= "Estoy comiendo.... ";
			return comiendo;
					
	}
	//===========MÉTODO POLIMÓRFICO===========
	//Es un método que va a contener el mismo nombre de otro método, pero se va a realizar de forma diferente, gracias a que solicita diferentes argumentos
	//Ejemplo con el método dormir, para solicitar horas para dormir:
	public void dormir (int horas) { //Aquí se esta estableciendo el ARGUMENTO entre "()".
		System.out.println("Voy a dormir " + horas +" horas");
	}
	
	public void dormir(int horas, String lugar) { //Hasta aqui van "3" métodos polimorficos. Al tener varios con el mismo nombre se le conoce como sobregarga de métodos.
		System.out.println("Voy a dormir " + horas +" horas" + " en" + lugar);
	}
	
	//El POLIMORFISMO es otro pilar de la programación orientada a objetos.
	//El siguiente método no es un pilar de la programación:
	
	//============MÉTODO ABSTRACTO============NO ES PILAR
	//Declaración de un método abstracto
	//Es aquel que indica QUE se va  ahacer pero no CÓMO se va a hacer.
	
	public abstract void sumar(int a, int b); //Primero se sobrepone el cursor sobre el error que arroja al principio y se selecciona "Change to abstract", luego aparecerá la palabra 
	//"abstrac" en el comando. Sigue el error, se vuelve a sobreponer el cursosr sobre el mismo y se selecciona "volver a "persona" abstract", la cual es la clase.
	//se puede observar que la clase "Persona" se vilvio abstracta, pero arrojara errores en la clase principal.
	
	public abstract void sumar ();
}
