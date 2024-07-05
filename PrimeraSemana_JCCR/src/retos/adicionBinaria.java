package retos;

public class adicionBinaria {

	/*
	 * Implemente una funci�n que sume dos n�meros y devuelva su suma en binario. La conversi�n se puede realizar antes o despu�s de la suma.
*
* El n�mero binario devuelto debe ser una cadena.
*
* Ejemplos
* 1, 1 --> "10" (1 + 1 = 2 in decimal or 10 in binary)
* 5, 9 --> "1110" (5 + 9 = 14 in decimal or 1110 in binary)
	 */
	
	public static String sumaBinaria(int a, int b){
		 int sum = a + b;
		    return Integer.toBinaryString(sum);
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumaBinaria(5,9));

	}

}
