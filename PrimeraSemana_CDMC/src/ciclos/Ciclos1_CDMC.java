package ciclos;

public class Ciclos1_CDMC {
public static void main(String[] args) {
	//Programa un algoritmo que realice la tabla de multiplicar del 12
	int numero = 12; // El n�mero del cual queremos la tabla de multiplicar
    
    System.out.println("Tabla de multiplicar del " + numero + ":");

    // Iteramos del 1 al 10 para mostrar la tabla de multiplicar
    for (int i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
	/*
	 * Definici�n del n�mero: Se define la variable numero con el valor 12, 
	 * que es el n�mero del cual se quiere generar la tabla de multiplicar.
	 *Mensaje inicial: Se imprime un mensaje inicial que indica cu�l es la tabla de multiplicar 
	 *que se est� mostrando.
     *Bucle for: Se utiliza un bucle for que itera desde i = 1 hasta i <= 10. Esto significa que se calcular�n y mostrar�n los productos del n�mero 12 multiplicado por cada n�mero del 1 al 10.
     *C�lculo y muestra del resultado: Dentro del bucle, se calcula resultado como la multiplicaci�n de numero por i. Luego, se muestra por consola la expresi�n "numero x i = resultado", donde numero, i y resultado son variables que cambian en cada iteraci�n del bucle.

	Resultado final: El programa imprimir� la tabla completa de multiplicar del n�mero 12, desde 12 x 1 = 
	12 hasta 12 x 10 = 120

	 */
}
}
