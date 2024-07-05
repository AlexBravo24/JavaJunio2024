package retos;
/*
 * Tu tarea es crear una función que realice cuatro operaciones matemáticas básicas.
 * La función debe tomar tres argumentos: operación (cadena/carácter), valor1 (número), valor2 (número).
 * La función debería devolver el resultado de los números después de aplicar la operación elegida.
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
