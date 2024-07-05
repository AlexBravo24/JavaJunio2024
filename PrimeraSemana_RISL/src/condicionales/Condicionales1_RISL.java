package condicionales;
import java.util.Scanner;
public class Condicionales1_RISL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("introduce un numero");
		numero1=entrada.nextInt();
		
		System.out.println("introduce otro numero");
		numero2=entrada.nextInt();
		if (numero1==numero2){
		System.out.println("los numeros son iguales");
		
		}else if (numero1>numero2){
			System.out.println("el numero )"+(numero1)+"es mas grande que el numero"+ (numero2));
		}if(numero1<numero2) {
		System.out.println("el numero "+(numero2)+" es mas grande que el numero "+ (numero1));
	    entrada.close();
		}
	}
}