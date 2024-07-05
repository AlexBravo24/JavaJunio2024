package com;

public class PS5 {

	
		private String marca;
		private String modelo;
		private String color;
		
		private Gpu cpu;
		private Memoria dd;
		private MemoriaRam ram;
		
		
		public PS5() {
			
	}


		public PS5(String marca, String modelo, String color, Gpu cpu, Memoria dd, MemoriaRam ram) {
			super();
			this.marca = marca;
			this.modelo = modelo;
			this.color = color;
			this.cpu = cpu;
			this.dd = dd;
			this.ram = ram;
		}


		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getModelo() {
			return modelo;
		}


		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public Gpu getCpu() {
			return cpu;
		}


		public void setCpu(Gpu cpu) {
			this.cpu = cpu;
		}


		public Memoria getDd() {
			return dd;
		}


		public void setDd(Memoria dd) {
			this.dd = dd;
		}


		public MemoriaRam getRam() {
			return ram;
		}


		public void setRam(MemoriaRam ram) {
			this.ram = ram;
		}


		@Override
		public String toString() {
			return "PS5 [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cpu=" + cpu + ", dd=" + dd
					+ ", ram=" + ram + "]";
		}
		

}
