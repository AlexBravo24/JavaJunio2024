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
	
	//==============M�TODOS PROPIOS ==============
	//Son acciones que nuestro objeto puede realizar
	
	//Dentro de este m�todo existe un M�TODO SIN RETORNO:
	//LLevan el modificador o palabra reservada "VOID", lo cual indica que no debe devolver un tipo de dato, pero s� ejecuta algo.
	
	public void dormir () { //Aqu�, en el cuerpo del m�todo, deno definir COMO se realiza esta acci�n.
		System.out.println("ZzZzZzZzZzZzZzZz.......");
	}
		//M�TODO CON RETORNO: deben devolver el tipo de dato con el que son declarados
		
		public String comer () {
			//Los m�todos con retorno, en este ejemplo, deben devolver un valor de tripo String
			String comiendo= "Estoy comiendo.... ";
			return comiendo;
					
	}
	//===========M�TODO POLIM�RFICO===========
	//Es un m�todo que va a contener el mismo nombre de otro m�todo, pero se va a realizar de forma diferente, gracias a que solicita diferentes argumentos
	//Ejemplo con el m�todo dormir, para solicitar horas para dormir:
	public void dormir (int horas) { //Aqu� se esta estableciendo el ARGUMENTO entre "()".
		System.out.println("Voy a dormir " + horas +" horas");
	}
	
	public void dormir(int horas, String lugar) { //Hasta aqui van "3" m�todos polimorficos. Al tener varios con el mismo nombre se le conoce como sobregarga de m�todos.
		System.out.println("Voy a dormir " + horas +" horas" + " en" + lugar);
	}
	
	//El POLIMORFISMO es otro pilar de la programaci�n orientada a objetos.
	//El siguiente m�todo no es un pilar de la programaci�n:
	
	//============M�TODO ABSTRACTO============NO ES PILAR
	//Declaraci�n de un m�todo abstracto
	//Es aquel que indica QUE se va  ahacer pero no C�MO se va a hacer.
	
	public abstract void sumar(int a, int b); //Primero se sobrepone el cursor sobre el error que arroja al principio y se selecciona "Change to abstract", luego aparecer� la palabra 
	//"abstrac" en el comando. Sigue el error, se vuelve a sobreponer el cursosr sobre el mismo y se selecciona "volver a "persona" abstract", la cual es la clase.
	//se puede observar que la clase "Persona" se vilvio abstracta, pero arrojara errores en la clase principal.
	
	public abstract void sumar ();
}
