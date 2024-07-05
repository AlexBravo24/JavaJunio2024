package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		//Estructuras de decision if evaluan valores booleanos
		/*Si se cumple la condicion 
		 * se ejecuta este bloque 
		 * si no se cumple;
		 * se ejecuta este otro
		 */
  
		//ejemplo: variable con determinado valor
		int x=20;
		if(x<20) {
			System.out.println("si");
	}else  {
		System.out.println("no");
	}
		//condiciones compuestas con operadores logicos
		//and, or ,not  igualdad, diferente de 
		
		//and- es un doble simbolo de &&
		//devuelve el valor true cuando se cumplen todas las condiciones 
		System.out.println("probando operador And- &&");
		if(x<20 && x>10) {
			System.out.println("si");
	}else  {
		System.out.println("no");
	}
		//operador or- ||Devuelve true cuando se cumple al menos una condicion 
		System.out.println("probando operador or- ||"); 
		if(x<20 || x>10) {
			System.out.println("si");
	}else  {
		System.out.println("no");
	}
		//if else anidado o if else concatenado 
		//Nos permite seguir evaluando màs condiciones segun sea necesario 
		//Este tipo de estructuras es util cuando necesitamos evaluar 
		int dia=3;
		
	    if (dia==1) {
	    	System.out.println("Lunes");
	    }else if (dia==2) {
	    	System.out.println("martes");
	    }else if (dia==3) {
	    	System.out.println("miercoles");
	    }else if (dia==4) {
	    	System.out.println("jueves");
	    }else if (dia==5) {
	    	System.out.println("Viernes");
	    }else  {
	    	System.out.println("Error");
	    }
	   //Estructura switch Case
	    	// esta estructura es util cuando existen varias opciones frente al cambio
	    	//de una variable
	    	
	    	char letra='a';
	    	
	    	
	    	switch (letra) { //en caso de que esta variable cambie, que hacemos
	    	
	    	case 'a':
	    	System.out.println("lunes");
	    	break;
	    	case 'b':
		    	System.out.println("martes");
		    	break;
	    	case 'c':
		    	System.out.println("miercoles");
		    	break;
	    	case 'd':
		    	System.out.println("jueves");
		    	break;
	    	case 'e':
		    	System.out.println("viernes");
		    	break;
		    default:
		    System.out.println("error");
		    break;
	    	}
	}
}

	    	 


	    	
	    

		    	



