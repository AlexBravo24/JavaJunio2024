package com;

public class Animal {

		private String nombre;
		private String genero;
		private String alimentación;
		private int edad;
		private String color;

		public Animal () {
		}

		public Animal(String nombre, String genero, String alimentación, int edad, String color) {
			super();
			this.nombre = nombre;
			this.genero = genero;
			this.alimentación = alimentación;
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

		public String getAlimentación() {
			return alimentación;
		}

		public void setAlimentación(String alimentación) {
			this.alimentación = alimentación;
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
			return "Animal [nombre=" + nombre + ", genero=" + genero + ", alimentación=" + alimentación + ", edad="
					+ edad + ", color=" + color + "]";
		}


		
		
}
