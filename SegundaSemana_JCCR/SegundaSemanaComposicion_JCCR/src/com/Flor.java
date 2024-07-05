package com;

public class Flor {
	
	 	private String especie;
	    private String color;
	    private String solSombra;
	    
	    public Flor() {
	    	super();
	    }
	    
		public Flor(String especie, String color, String solSombra) {
			super();
			this.especie = especie;
			this.color = color;
			this.solSombra = solSombra;
		}

		public String getEspecie() {
			return especie;
		}

		public void setEspecie(String especie) {
			this.especie = especie;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getSolSombra() {
			return solSombra;
		}

		public void setSolSombra(String solSombra) {
			this.solSombra = solSombra;
		}

		@Override
		public String toString() {
			return "Flor [especie=" + especie + ", color=" + color + ", solSombra=" + solSombra + "]";
		}
		
		
	    
	    
	
}
