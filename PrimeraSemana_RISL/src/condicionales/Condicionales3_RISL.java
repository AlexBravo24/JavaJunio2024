package condicionales;
import java.util.Scanner;

public class Condicionales3_RISL {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
 System.out.println("inserte un numero");
 int numero1;
 numero1=entrada.nextInt();
 
 System.out.println("inserte otro numero");
 int numero2;
 
 
 numero2=entrada.nextInt();
 if (numero2==0) {
	 System.out.println("Error");
 }else
	 System.out.println("el resultado de la divisiòn es "+ ( numero1/numero2));
	 
 }
}
		
	
