package retos;

/*
 * 
 * Necesitamos una funci�n que pueda transformar un n�mero (entero) en una cadena.

�Qu� formas de conseguirlo conoces?

*	Ejemplos

	123  --> "123"
	999  --> "999"
	-100 --> "-100"
 */
public class numeroACadena {

	public static String numberToString(int num) {
	    
		
		return Integer.toString(num);
		// return String.valueOf(num);
		//  return ""+num;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberToString(123));
		System.out.println(numberToString(999));
		System.out.println(numberToString(-100));

	}

}
