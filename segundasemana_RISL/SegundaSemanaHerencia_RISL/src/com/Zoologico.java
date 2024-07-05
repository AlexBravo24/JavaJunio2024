package com;

public class Zoologico extends Animal {
		
	
		private int TotalEspecie;
		private String Habitat;
		private String Especie;
		
		public Zoologico () {
			
		}
		
		public Zoologico(String nombre, String genero, String alimentación, int edad, String color, int totalEspecie,
				String habitat, String especie) {
			super(nombre, genero, alimentación, edad, color);
			TotalEspecie = totalEspecie;
			Habitat = habitat;
			Especie = especie;
		}

		public int getTotalEspecie() {
			return TotalEspecie;
		}

		public void setTotalEspecie(int totalEspecie) {
			TotalEspecie = totalEspecie;
		}

		public String getHabitat() {
			return Habitat;
		}

		public void setHabitat(String habitat) {
			Habitat = habitat;
		}

		public String getEspecie() {
			return Especie;
		}

		public void setEspecie(String especie) {
			Especie = especie;
		}

		@Override
		public String toString() {
			return "Zoologico [TotalEspecie=" + TotalEspecie + ", Habitat=" + Habitat + ", Especie=" + Especie
					+ ", toString()=" + super.toString() + "]";
		}
		
		
}
	