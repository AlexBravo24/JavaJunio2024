package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo de instanciar una nueva persona
		//Una vez nuestra clase persona es abstracta, no podemos crear instancias de esa clase
		//podria eliminar a juan ya que no puedo instanciar personas de esa clase pero
		// si puedo crear empleados entonces puedo convertir a juan en empleado, y estariamos en 
		//un polimorfismo de asignacion
		Persona juan = new Empleado("Juan", "Masculino", 28, "lkdskjfkl", 20000, "Matutino");
		
		
				//ejemplo de instanciar un nuevo empleado
				
		Empleado empleado1 = new Empleado("Pedro", "Masculino", 33, "sdfcg", 8000, "Vespertino");
		 
		System.out.println(juan);
		System.out.println(empleado1);
		
		Empleado jorge = new Empleado();
		jorge.setNombre("Jorge");
		jorge.setSalario(20000);
		
		System.out.println(jorge);
		//Si llamamos a nuestra persona Juan podemos utilizar el metodo dormir()
		jorge.dormir();
		String nombreJorge = jorge.getNombre();
		
		
		
		// Probar el metodo comer 
		//vemos que el metodo.comer ()
		
		
		System.out.println(jorge.comer());
		
		//Si llamamos a nuestra persona juan podemos utilizar el metodo dormir ()
		
		juan.dormir();//Este metodo va a mandar una impresion en consola ("ZzZzZzZzZz...")
		
		jorge.dormir();//Jorge es un empleado pero tambien esta heredando los metodos provenientes de la clase persona
		
		String nombrejorge = jorge.getNombre();
		
		//Probar el metodo comer
		//Vemos que con el metodo . comer() no imprime nada en consola pero si retorna el mensaje
		//"Estoy comiendo...", por lo cuaal aqui ese mensaje lo podemos guardar en otro string
		//o mandarlo  a imprimir
		System.out.println(jorge.comer());
		//-------------------------------------------------------------------------------------------
		//Probando el metodo dormir polimorfico
		jorge.dormir(9);
		//Probando una tercera forma del metodo dormir
		juan.dormir(8, "Hotel Holiday Inn");
		
		//Probando el metodo abstracto
		juan.sumar(8, 15);
		
		//Las clases abstractas no pueden ser instanciadas, pero si las clases 
		//que heredan de ellas
		//Una clase abstracta puede tener metodos propios y bien definidos, pero por lo menos
		//uno debe ser abstracto.Esto nos permitira tener una clase base o "resumen"
		//para poder heredarla a otras y especializarlas.
		
		//probando el metodo summar que inicia un scanner
		
		jorge.sumar();
		
		
		
		
		
		
		
		
		 
		/* Actividad: van a crear una clase padre que nos permita heredar estas propiedades a una clase hija
		 * ej. persona que hereda a estudiante
		 * abaco que hereda a una calculadora
		 * televisor que hereda a un proyector
		 * Una vez que tengan instanciado aqui el objeto de la clase padre como el de la hija
		 * lo mandan a imprimir a consola.
		 */
				

		
		Bicicleta bici = new Bicicleta("Benotto", "XR", "acord");
		
		Motocicleta moto = new Motocicleta("Italik", "XRT", "Descansa pies", "Electrico", "Rojo)", "Amplia");
		
		System.out.println(bici);
		System.out.println(moto);
		
		
		
	}
	

	

}
