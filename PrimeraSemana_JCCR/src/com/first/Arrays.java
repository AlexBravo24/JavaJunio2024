package com.first;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] numeros = new int[5][5];



for(int i = 0; i<= numeros.length -1; i++) {
	for(int j = 0; j<= i; j++) {
		
			
			numeros[i][j] = i;
		
			numeros[j][i] = j;
		
	System.out.print(numeros[i][j]);
	System.out.println(" ");
	System.out.print(numeros[j][i]);
	}
}

	}

}
