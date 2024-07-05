package ciclos;

public class Ciclos1_DISA {

	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar del 12
		
		//se utilizan dos variables, x que representa el numero que durante el bucle ira cambiano y "n" que sera el producto entre x y 12
		int x,n; 
		//para esto asignamos un valor que ira cambiando en x
		x=1;
		System.out.println("Tabla de multiplicar del 12"); //con esto solo se pone el titulo en la consola
		//se agrada el bucle while y se determina que hasta que x sea doce el bucle seguira corriendo
		while (x<=12) {
			n=x*12;
			System.out.println("12x"+x+"="+n); //se escribe la operación 
			x=x+1; //con esto se para el bucle, una vez que x sea 12.
			
		}
				
	}

}
