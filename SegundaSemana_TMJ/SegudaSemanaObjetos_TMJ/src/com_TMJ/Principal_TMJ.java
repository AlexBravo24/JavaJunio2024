package com_TMJ;

public class Principal_TMJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio de POO numero1 
		// ejercicio de deposito de cerveceria 
		
		 Cerveza Cerveza1= new Cerveza();
		 
		 Cerveza1.setMarca("modelo");
		 Cerveza1.setPresentacion("six pack");
		 Cerveza1.setAlcohol(7);
		 Cerveza1.setPrecio(150.00);
		 
		 
		 Cerveza Cerveza2= new Cerveza();
		 Cerveza2.setMarca("barrilito");
		 Cerveza2.setPresentacion("24 pack");
		 Cerveza2.setAlcohol(4.5);
		 Cerveza2.setPrecio(150);
		 
		 Cerveza Cerveza3= new Cerveza();
		 Cerveza3.setMarca("carta blanca");
		 Cerveza3.setPresentacion("six pack");
		 Cerveza3.setAlcohol(5.5);
		 Cerveza3.setPrecio(120);
		 
		 Cerveza Cerveza4= new Cerveza();
		 Cerveza4.setMarca("indio");
		 Cerveza4.setPresentacion("mega");
		 Cerveza4.setAlcohol(4.5);
		 Cerveza4.setPrecio(40);
		 		 
		 System.out.println(Cerveza1);
		 System.out.println(Cerveza2);
		 System.out.println(Cerveza3);
		 System.out.println(Cerveza4);
		 

	}

}
