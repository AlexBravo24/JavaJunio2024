package com;

public class Principal {

	public static void main(String[] args) {
		
	// EJEMPLO DE: instanciar una nueva persona
		
		//AQUI LOS SIGUIENTES COMENTARIOS SON DEL METODO ABSTRACTO:
		//La clase Persona ya no la podemos instanciar por volverla abstracta.
		//Se puede comentar los comandos de "Persona" para quitar los errores
		//Se puede eliminar a dylan, dado que ya no puede crear objetos de la clase persona.
		//Pero si puedo seguir creando empleados, por lo que estariamos haciendo un POLIMORFISMO DE ASIGNACIÓN.
		//Persona dylan = new Persona("Dylan", "Masculino", 24);
		
		//EJEMPLO DE: instanciar un nuevo empleado
		
		Empleado israel = new Empleado("Israel", "masculino", 24, "SOAD990910", 20000, "Hibrido");
		
		//System.out.println(dylan);
		
		System.out.println(israel);
		
		//ACTIVIDAD
		//CREAR UNA CLASE PADRE QUE NOS PERMITA HEREDAR ESTAS PROPIEDADES A UNA CLASE HIJA
		//EJ. PERSONA A ESTRUDIANTE
		

/*		
		OldSmartphones blackberry = new OldSmartphones("Blackberry", "BlackBerry 7230", 0.015, "2G");
		
		NewSmartphones iPhone = new NewSmartphones("Apple", "iPhone15", 64, "5G", "SIRI", "Facial y huella digital", "Frontal y Trasera", "120");
		
		System.out.println(blackberry);
		
		System.out.println(iPhone);
		*/
		
		//Si llamamos a nuestra persona Dylan podemos utilizar el método dormir()
		//dylan.dormir(); //Este método va a mandar a impirmi en consolo "ZzZzZzZz....."
		
		//También este método se puede heredar, por ejmeplo, si llamamos al empleado Israel:
		israel.dormir();
		
		israel.getName(); //Esto devuelve el nombre de Israel, pues name es una variable en valor String
		
		//PROBANDO EL MÉTODO COMER:
		israel.comer(); //De esta manera es una manera erronea de hacerlo pues en consola no aparecerá el mensaje, se tiene que hacer de la sig. manera:
		System.out.println(israel.comer());
		
		//PROBANDO EL MÉTODO DORMIR POLIMÓRFICO:
		israel.dormir(9);
		
		//PROBANDO LA TERCERA FORMA DEL MÉTODO DORMIR:
	//	dylan.dormir(8, " el Hotel Royalty");
		
		//PROBANDO EL MÉTODO ABSTRACTO DESPUES DE MODIFICAR COMO HACER LA ACCION EN CLASE "Empleado"
		israel.sumar(68, 33);
		//RECORDAR: las clases abstractas no pueden ser instanciadas, pero si las clases hijas o que heredan
		//Unaclase abstracta puede tener métodos propios y bien definidos, pero por lo menos unos debe ser abstracto. Esto nos permitirá tener una clase base o "resumen"
		//para poder heredarla a otras y especializarlas.
		
		
		//PROBANDO EL MÉTODO SUMAR:
		israel.sumar();
		
		
	}

}
