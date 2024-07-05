package com;

public class Persona {

	//esta clase nos va a servir como una plantilla o molde para poder crear objetos pèrsona
	
	//comenzamos con algo que se llama modelado de nuestro objeto
	
	//ABSTRACCION
	//Proceso o pilar que nos ayuda a definir los atributos
	//y comportamientos de mi objeto
	
	//existe algo que se llama modificadores de acceso , que me va apermitir 
	//priteger mis atributos o metodos de usos no autorizados
	//y que forman parte de otro pilar de la POO, llamado ENCAPSULAMIENTO 
	//Los modificadores de acceso son Private, public, default
	
	
	
	 private String nombre;
	 private String sexo;
	 private int edad;
	 private double peso;
	 private double talla;
	 
	 //despues de declarar atributos y haberles colocado modificadores de acceso existen
	 //metodos que nos permitiran construir a nuestros objetos
	 
	 //metodos contructores
	 
	 
	 
	 //metodo constructor vacio - nos permite iniciar un objeto vacio y posteriormente poder asignarle
	 //valor a los atributos del objeto
	
	 public Persona() {          //para crear un constructor vacio modificador publico + nombre de la clase (){
		                        //  }abrimos y cerramos llaves
		
	}
	 
   //metodo constructor con todos los argumentos - se utiliza para crear un objeto con sus atributos inicializados
	
	//constructor
   public Persona(String nombre, String sexo, int edad, double peso, double talla) {
		
		
	    super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
	}
   
		//puedo generar tantos constructgores como necesite pero regularmente 
		//con el constructor vacio y el de todos los parametros es suficiente, 
		//gracias a los metodos metodos getters y setters
		
		
	
//metodos getters y setters
		
		//metodos get--devuekven el valor almacenado del atributo en cuestion 
		//netodos set - nos permiten establecer un valor a un atributo determinado


   //metodos getters y setters 
   
   //los metodos get devuelven el valor almacenado de el atriburto en cuestion
   //metodos set-nos permiten establecer un valor a un atributo determinado
   
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
	
	//Metodo toString ()--Nos sirve para poder visualizar en formato String 
	//los valores de nuestro objeto en cuestion
	//imaginemos que nos sirve como un "radiografia"
    //de nuestro objeto
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla
				+ "]";
	}
	
}
