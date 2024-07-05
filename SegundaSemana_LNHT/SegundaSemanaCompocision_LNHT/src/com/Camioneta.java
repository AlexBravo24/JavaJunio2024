package com;

public class Camioneta {

		private String nomCamioneta;
		private Double cargaToneladas;
		private String marca;
		private String modelo;
		private int noLlantas;
		
		private Estereo estereo;
		private Amplificador ampli;
		private Llantas llanta;
		private Camara camara;
		
		public Camioneta() {}
		
		public Camioneta(String nomCamioneta, Double cargaToneladas, String marca, String modelo, int noLlantas,
				Estereo estereo, Amplificador ampli, Llantas llanta, Camara camara) {
			super();
			this.nomCamioneta = nomCamioneta;
			this.cargaToneladas = cargaToneladas;
			this.marca = marca;
			this.modelo = modelo;
			this.noLlantas = noLlantas;
			this.estereo = estereo;
			this.ampli = ampli;
			this.llanta = llanta;
			this.camara = camara;
		}

		
		public String getNomCamioneta() {
			return nomCamioneta;
		}

		public void setNomCamioneta(String nomCamioneta) {
			this.nomCamioneta = nomCamioneta;
		}

		public Double getCargaToneladas() {
			return cargaToneladas;
		}

		public void setCargaToneladas(Double cargaToneladas) {
			this.cargaToneladas = cargaToneladas;
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

		public int getNoLlantas() {
			return noLlantas;
		}

		public void setNoLlantas(int noLlantas) {
			this.noLlantas = noLlantas;
		}

		public Estereo getEstereo() {
			return estereo;
		}

		public void setEstereo(Estereo estereo) {
			this.estereo = estereo;
		}

		public Amplificador getAmpli() {
			return ampli;
		}

		public void setAmpli(Amplificador ampli) {
			this.ampli = ampli;
		}

		public Llantas getLlanta() {
			return llanta;
		}

		public void setLlanta(Llantas llanta) {
			this.llanta = llanta;
		}

		public Camara getCamara() {
			return camara;
		}

		public void setCamara(Camara camara) {
			this.camara = camara;
		}

		@Override
		public String toString() {
			return "Camioneta [nomCamioneta=" + nomCamioneta + ", cargaToneladas=" + cargaToneladas + ", marca=" + marca
					+ ", modelo=" + modelo + ", noLlantas=" + noLlantas + "\n"+"," + "estereo=" + estereo + "\n"+", ampli=" + ampli
					+ "\n"+", llanta=" + llanta +"\n"+ ", camara=" + camara + "]";
		}

	
		
		
		
		
		
	

}
