package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica casio = new Cientifica("Casio", "Plata", "fx-991EX", 300, "logarítmica, exponencial, trigonométricas y estadísticas");
		
		casio.sumar();
		casio.restar(45, 10);
		casio.multiplicar();
		casio.dividir();
		
		//¿De dónde toman comportamientos o acciones nuestros objetos?
		//De métodos de la misma clase
		//De la herencia de otras cles, incluyendo clases abstractas
		//De interfases

	}

}
