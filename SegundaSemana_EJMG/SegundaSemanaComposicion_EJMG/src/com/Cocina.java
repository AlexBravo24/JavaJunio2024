package com;

public class Cocina {
    private String estufa; 
    private String refrigerador;
    private String mesa;
    private int sillas;
    
    public Cocina() {}

	public Cocina(String estufa, String refrigerador, String mesa, int sillas) {
		super();
		this.estufa = estufa;
		this.refrigerador = refrigerador;
		this.mesa = mesa;
		this.sillas = sillas;
	}

	public String getEstufa() {
		return estufa;
	}

	public void setEstufa(String estufa) {
		this.estufa = estufa;
	}

	public String getRefrigerador() {
		return refrigerador;
	}

	public void setRefrigerador(String refrigerador) {
		this.refrigerador = refrigerador;
	}

	public String getMesa() {
		return mesa;
	}

	public void setMesa(String mesa) {
		this.mesa = mesa;
	}

	public int getSillas() {
		return sillas;
	}

	public void setSillas(int sillas) {
		this.sillas = sillas;
	}

	@Override
	public String toString() {
		return "Cocina [estufa=" + estufa + ", refrigerador=" + refrigerador + ", mesa=" + mesa + ", sillas=" + sillas
				+ "]";
	}
    
    
	
    
	
	
}
