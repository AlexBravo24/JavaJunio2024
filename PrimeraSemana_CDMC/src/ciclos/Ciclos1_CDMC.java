package ciclos;

public class Ciclos1_CDMC {
public static void main(String[] args) {
	//Programa un algoritmo que realice la tabla de multiplicar del 12
	int numero = 12; // El número del cual queremos la tabla de multiplicar
    
    System.out.println("Tabla de multiplicar del " + numero + ":");

    // Iteramos del 1 al 10 para mostrar la tabla de multiplicar
    for (int i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
    }
	/*
	 * Definición del número: Se define la variable numero con el valor 12, 
	 * que es el número del cual se quiere generar la tabla de multiplicar.
	 *Mensaje inicial: Se imprime un mensaje inicial que indica cuál es la tabla de multiplicar 
	 *que se está mostrando.
     *Bucle for: Se utiliza un bucle for que itera desde i = 1 hasta i <= 10. Esto significa que se calcularán y mostrarán los productos del número 12 multiplicado por cada número del 1 al 10.
     *Cálculo y muestra del resultado: Dentro del bucle, se calcula resultado como la multiplicación de numero por i. Luego, se muestra por consola la expresión "numero x i = resultado", donde numero, i y resultado son variables que cambian en cada iteración del bucle.

	Resultado final: El programa imprimirá la tabla completa de multiplicar del número 12, desde 12 x 1 = 
	12 hasta 12 x 10 = 120

	 */
}
}
