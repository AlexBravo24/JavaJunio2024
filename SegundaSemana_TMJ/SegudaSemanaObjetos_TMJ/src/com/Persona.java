package com;

public class Persona {
	//Esta clase nos permite usar una plantola para crear objetos 
	
	//ABSTRACCION, 
	//PILAR DE POO, QUE NOS AYUDA A DEFINIR LOS ATRIBUTOS 
	// Y COMPORTAMIENTOS DE MI ONJETO
	
	//Existe algo llamado modificador de acceso  que permite el resguardo de 
	//la informacion llamado encapsulamiento.
	//private, protected ,public y deffault 
	
	private String nombre;
	private String sexo ;
	private  static int edad =30;
	private double peso;
	private double talla;

	
	/* DESPUS DE DECLARAR LOS ATRIVUTOS Y HABER COLOCADO LOS MODIFICADORES DE ACCESO,
	 * EXISTEN METODOS QUE NOS PERMITEN CONSTRUIR NUESTROS OBJETOS
	 * 
	 * METODOS CONSTRUCCTORES 
	 * 
	 * UN METODO CONSTRUCTOR VACIO NOS PERMITE INICIAR UN OBJETO VACIO Y POSTERIORMENTE PODER ASIGNARLE 
	 * VELKOR A LOS ATRIBUTOS DEL OBJETO 
	 * */
	
	public Persona() {
		/*metodo constructor  con todos los argumentos 
		 * se utiliza para crear un objetos con sus atrubutos 
		 * */
	}


	public Persona(String nombre, String sexo, int edad, double peso, double talla) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
	}
	// SE PUEDEN GENERAR TANTOS CONSTRUCTORES COMO SE NECESITE 
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		}
	/*METODOS GETTER Y SETTER 
	 * GET  DEVUELVEN VALOR ALMACENADO DEL ATRIBUTO EN CUESTIOM
	 * SET PERMITE ESTABLECER UN VALOR A UN ATRIBUTO DETERMINADO
	 * 
	 * 
	 * 
	 * 
	 *  CON EL CONSTRUCTOR VACIO Y EL DE TODOS LO PARAMETROS ES SUFICIENBTE ,
	 *  
	 * */


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

	public static void setEdad(int edad) {
		Persona.edad = edad;
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

//metodo tostring  , sirve para ver en formato strinbg los valores del objeto
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla
				+ "]";
	}
	
	
	
	
		
}