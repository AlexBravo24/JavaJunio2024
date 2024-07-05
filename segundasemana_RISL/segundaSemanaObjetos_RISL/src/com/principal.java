package com;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//una vez creados los atributos, podemos crear un objeto
		
		Persona persona1= new Persona ();
		
		//hasta este momentos yo puedo asignar un nombre
		//a la persona a traves de sus atributos llamandolos 
		//desde aqui
		
	//probar a crear una nueva persona pero con el constructor con todos los atributos
	
	Persona persona2 = new Persona("Rosa", "femenino", 23, 1.60, 1.60);
	
	
	//podemos asignarle un nombre o demas valores a personas, gracias a los metodos 
	//getters y setters 
	persona1.setNombre("ana");
	
	//ejemplo de la persona 1 en consola
	
	System.out.println(persona2.getNombre());
	System.out.println(persona2);
	System.out.println(persona1);
	
//ACTIVIDAD - CREAR UNA CLASE PARA GENERAR ALGUN OBJETO EL QUE USTEDES GUSTEN
//EL OBJETO O CLASE DEBERÁ LLEVAR POR LO MENOS 3 ATRIBUTOS
//GENERAN CONSTRUCTORES - VACIO Y CON TODOS LOS ARGUMENTOS
//GENERAN GETTERS Y SETTERS
//GENERAN MÉTODO TOSTRING()
//EN ESTA MISMA CLASE PRINCIPAL VAN A INSTANCIAR UNO CON TODOS LOS ARGUMENTOS Y UNO
//VACIO Y LOS MANDAN A IMPRIMIR EN CONSOLA. EN EL VACIO ASIGNAN UN VALOR POR LO MENOS
//CON UN SETTER

    Autos autos1= new Autos ();
    
    Autos autos2= new Autos ("audi",2023,"rojo");
    
    autos1.setMarca("chevrolet");
    
    System.out.println(autos1);
    System.out.println(autos2);
    
    
    
    
    
    
    
    
    
	}
	}



