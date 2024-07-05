package retos;



/*
 * Retornar el numero menor y mayor de una String
 * Ejemplos
 * 
	highAndLow("1 2 3 4 5")  // return "5 1"
	highAndLow("1 2 -3 4 5") // return "5 -3"
	highAndLow("1 9 3 4 -5") // return "9 -5"
 */

public class mayorMenor {

	
	
	public static String highAndLow(String numbers) {
		
		
		String[] splitted = numbers.split(" ");
		 int mayor = Integer.parseInt(splitted[0]);
	        int menor = Integer.parseInt(splitted[0]);
		for(String element: splitted) {
			int temp = Integer.parseInt(element);
			if(temp > mayor) {
				mayor = temp;
			}  
			if(temp < menor){
				menor = temp;
				
			}
		}
		String returned = mayor + " " + menor;
		
		return returned;
	}
	
	
	/*
	 * Otro ejemplo (no lo hice yo)
	  public static String highAndLow(String numbers) {
        String[] array = numbers.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i< array.length; i++){
            int value = Integer.parseInt(array[i]);
            if (value < min) min = value;
            if (value > max) max = value;
        }
        return String.format("%d %d", max, min);
  }
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(highAndLow("1 2 3"));

	}

}
