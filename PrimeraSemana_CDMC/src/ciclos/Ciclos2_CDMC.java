package ciclos;
import java.util.Scanner;
public class Ciclos2_CDMC {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
	//hasta la iteración deseada por el usuario.
	
	
    // Pedir al usuario que ingrese el número base de la tabla
    System.out.print("Ingresa el numero que  se desea  multiplicar: ");
    int dato = scanner.nextInt();

    // Pedir al usuario que ingrese hasta qué iteración desea mostrar la tabla
    System.out.print("Ingresa la iteración que deseas mostrar en la tabla: ");
    int iteracionMaxima = scanner.nextInt();

    System.out.println("Tabla de multiplicar del " + dato + " hasta la iteración " + iteracionMaxima + ":");

    // Iterar desde 1 hasta la iteración máxima deseada
    for (int i = 1; i <= iteracionMaxima; i++) {
        int resultado = dato * i;
        System.out.println(dato + " x " + i + " = " + resultado);
    }

    scanner.close();
}

/*
 * Explicacion del codigo
 * 
 * Importación de Scanner: Importamos la clase Scanner desde java.util 
 * para poder leer la entrada del usuario desde la consola.
 *Creación del objeto Scanner: Creamos un objeto Scanner llamado scanner para poder usarlo y 
 *leer los datos ingresados por el usuario.
  *	Lectura del número base: Usamos scanner.nextInt() para leer 
*un número entero ingresado por el usuario, que será el número base para la tabla de multiplicar.

 *Lectura de la iteración máxima: Usamos scanner.nextInt() 
 *nuevamente para leer otro número entero ingresado por el 
 *usuario, que indica hasta qué iteración se mostrará la tabla de multiplicar.

 *Mensaje inicial: Se imprime un mensaje inicial que indica cuál es la tabla de multiplicar
 * que se está mostrando, con el número base y la iteración máxima ingresada por el usuario.

 *Bucle for: Se utiliza un bucle for que itera desde i = 1 hasta i <= iteracionMaxima. 
 *Esto significa que se calcularán y mostrarán los productos del número base multiplicado 
 *por cada número del 1 al iteracionMaxima.

Cálculo y muestra del resultado: Dentro del bucle, 
se calcula resultado como la multiplicación de numero por i.
 Luego, se muestra por consola la expresión "numero x i = resultado".
 */
}
