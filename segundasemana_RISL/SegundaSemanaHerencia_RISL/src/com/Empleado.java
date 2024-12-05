package com;



	//La herencia es ptro pilar de la programacion orientada a objetos y se realuiza
	//con la palabra reservada extends
	
	public class Empleado extends Persona {
		
		private String RFC;
		private double salario;
		private String turno;
	
		
		Empleado (){
			
		}



		public Empleado(String nombre, String genero, int edad, String RFC, double salario, String turno) {
			super(nombre, genero, edad);
			RFC = RFC;
			this.salario = salario;
			this.turno = turno;
		}



		public String getRFC() {
			return RFC;
		}



		public void setRFC(String rFC) {
			RFC = RFC;
		}



		public double getSalario() {
			return salario;
		}



		public void setSalario(double salario) {
			this.salario = salario;
		}



		public String getTurno() {
			return turno;
		}



		public void setTurno(String turno) {
			this.turno = turno;
		}



		@Override
		public String toString() {
			return "Empleado [RFC=" + RFC + ", salario=" + salario + ", turno=" + turno + ", toString()="
					+ super.toString() + "]";
		}



		@Override
		public void sumar(int a, int b) {
			// TODO Auto-generated method stub
			
		}
		
			// las clases hijas que heredan de una clase abstracta, deben definir
			//como se va a realizar esta acción
		
		
		
}
