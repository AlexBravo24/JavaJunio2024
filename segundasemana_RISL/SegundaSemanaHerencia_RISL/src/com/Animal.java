package com;

public class Animal {

		private String nombre;
		private String genero;
		private String alimentaci�n;
		private int edad;
		private String color;

		public Animal () {
		}

		public Animal(String nombre, String genero, String alimentaci�n, int edad, String color) {
			super();
			this.nombre = nombre;
			this.genero = genero;
			this.alimentaci�n = alimentaci�n;
			this.edad = edad;
			this.color = color;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getAlimentaci�n() {
			return alimentaci�n;
		}

		public void setAlimentaci�n(String alimentaci�n) {
			this.alimentaci�n = alimentaci�n;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		@Override
		public String toString() {
			return "Animal [nombre=" + nombre + ", genero=" + genero + ", alimentaci�n=" + alimentaci�n + ", edad="
					+ edad + ", color=" + color + "]";
		}


		
		
}
