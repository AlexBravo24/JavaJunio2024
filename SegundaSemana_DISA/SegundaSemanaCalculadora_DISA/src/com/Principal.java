package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica casio = new Cientifica("Casio", "Plata", "fx-991EX", 300, "logar�tmica, exponencial, trigonom�tricas y estad�sticas");
		
		casio.sumar();
		casio.restar(45, 10);
		casio.multiplicar();
		casio.dividir();
		
		//�De d�nde toman comportamientos o acciones nuestros objetos?
		//De m�todos de la misma clase
		//De la herencia de otras cles, incluyendo clases abstractas
		//De interfases

	}

}
