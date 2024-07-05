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
//quwe es polimorfismo
   
   //Metodos Propios -- son acciones que nuestrto objeto puede erealizar
  //metodos sin rertorno --llevan el modificador o palabra reservada void 
//lo cual indica que no debe devover un tipo de dato, pero si ejecuta algo



   public void dormir() {
	   
	   //Aqui en el ceurpo del metodo debo definir como se realiza esta acccion 
	   System.out.println("zzzzzzzzzzzzz...");
   }
	
	//metodos con etorno- deben devolver el po de dato con el que son declarados
   
   public String comer() {
	//los metoedos con retorno en este ejemplo deben devolver un valor de tipo string
	   
	   String comiendo = "Estoy comiendo....";
	   
	   return comiendo;
	
	//metodo polimorfico--es un metodo que va acontener el mismo nombre d eotro 
	   //pero se va a realizar de forma diferente, gracais a que solicita diferentes argumentos 
	   //elemplo del metodo dormir , que va asolicitar cuantas horas dormira la persona
	
	
		   
	   }
	
   public void dormir(int horas) {
	   System.out.println("Voy a dormir "  + horas  + " horas ");
	
}
   
   public void dormir(int horas, String lugar) {
	   System.out.println("Voy a dormir " +  horas  +  " horas " + "en " +  lugar );
   
   
   }
   
   //declaracion de un metodod abstracto 
   //es aque que indica que se va hacert , pero no como se va hacer 
   
   
   public abstract void sumar(int a, int b);
   
   public abstract void sumar();
   
   
   
}