package ciclos;
import java.util.Scanner;
public class Ciclos2_CDMC {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	//Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
	//hasta la iteraci�n deseada por el usuario.
	
	
    // Pedir al usuario que ingrese el n�mero base de la tabla
    System.out.print("Ingresa el numero que  se desea  multiplicar: ");
    int dato = scanner.nextInt();

    // Pedir al usuario que ingrese hasta qu� iteraci�n desea mostrar la tabla
    System.out.print("Ingresa la iteraci�n que deseas mostrar en la tabla: ");
    int iteracionMaxima = scanner.nextInt();

    System.out.println("Tabla de multiplicar del " + dato + " hasta la iteraci�n " + iteracionMaxima + ":");

    // Iterar desde 1 hasta la iteraci�n m�xima deseada
    for (int i = 1; i <= iteracionMaxima; i++) {
        int resultado = dato * i;
        System.out.println(dato + " x " + i + " = " + resultado);
    }

    scanner.close();
}

/*
 * Explicacion del codigo
 * 
 * Importaci�n de Scanner: Importamos la clase Scanner desde java.util 
 * para poder leer la entrada del usuario desde la consola.
 *Creaci�n del objeto Scanner: Creamos un objeto Scanner llamado scanner para poder usarlo y 
 *leer los datos ingresados por el usuario.
  *	Lectura del n�mero base: Usamos scanner.nextInt() para leer 
*un n�mero entero ingresado por el usuario, que ser� el n�mero base para la tabla de multiplicar.

 *Lectura de la iteraci�n m�xima: Usamos scanner.nextInt() 
 *nuevamente para leer otro n�mero entero ingresado por el 
 *usuario, que indica hasta qu� iteraci�n se mostrar� la tabla de multiplicar.

 *Mensaje inicial: Se imprime un mensaje inicial que indica cu�l es la tabla de multiplicar
 * que se est� mostrando, con el n�mero base y la iteraci�n m�xima ingresada por el usuario.

 *Bucle for: Se utiliza un bucle for que itera desde i = 1 hasta i <= iteracionMaxima. 
 *Esto significa que se calcular�n y mostrar�n los productos del n�mero base multiplicado 
 *por cada n�mero del 1 al iteracionMaxima.

C�lculo y muestra del resultado: Dentro del bucle, 
se calcula resultado como la multiplicaci�n de numero por i.
 Luego, se muestra por consola la expresi�n "numero x i = resultado".
 */
}
