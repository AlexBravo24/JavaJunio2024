package condicionales;

import java.util.Scanner;

public class Condicionales3_TMJ {

	public static void main(String[] args) {
//		3.Crea un programa que pida al usuario dos números y muestre el resultado
//		de su división. Si el segundo número es 0, debe mostrar un mensaje de error.

		int nume, deno;// declaramos las variables del numerador y el denominador
		
		Scanner entrada= new Scanner (System.in);
		//solicitamos los datos de entrada
		System.out.println("Ingrese el primer numero");
		nume = entrada.nextInt();
		System.out.println("Ingrese el segundo numero:");
		deno= entrada.nextInt();
		
		//realizamos las operaciones
		if (deno !=0) //aqui señalamos que si el denominador es diferente de 0
			// se realiza la operacion  si no imprime el mensaje de error
			{
			System.out.println((double)nume/(double)deno);//realizamos una conversion de tipo de dato ya que no todas las divisiones 
			//dan como resultado numeros enteros
		}else{
			System.out.println("Error, el segundo valor introducido es 0");
		}
		
		}

}
