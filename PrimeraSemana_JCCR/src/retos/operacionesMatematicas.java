package retos;
/*
 * Tu tarea es crear una funci�n que realice cuatro operaciones matem�ticas b�sicas.
 * La funci�n debe tomar tres argumentos: operaci�n (cadena/car�cter), valor1 (n�mero), valor2 (n�mero).
 * La funci�n deber�a devolver el resultado de los n�meros despu�s de aplicar la operaci�n elegida.
 * 
 * 
 * Ejemplos
 *  ('+', 4, 7) --> 11
	('-', 15, 18) --> -3
	('*', 5, 5) --> 25
	('/', 49, 7) --> 7
 * 
 * 
 */
public class operacionesMatematicas {


	public static Integer matematicasBasicas(String op, int v1, int v2)
	  {
		 int result = 0;
		    if(op == "+") result = v1 +v2;
		     if(op == "-") result = v1  -v2;
		     if(op == "*") result = v1 * v2;
		     if(op == "/") result = v1 / v2;
		    return  result;
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.out.println(matematicasBasicas("+", 4, 7));
		    System.out.println(matematicasBasicas("-", 15, 18));
		    System.out.println(matematicasBasicas("*", 5, 5));
		    System.out.println(matematicasBasicas("/", 49, 7));
	}

}
