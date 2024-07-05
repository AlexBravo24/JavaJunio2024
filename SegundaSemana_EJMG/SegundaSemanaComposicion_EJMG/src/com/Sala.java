package com;

public class Sala {

	
	
	private String bocina;
	private String sillones;
	private int television;
	
	
	public Sala() {}


	public Sala(String bocina, String sillones, int television) {
		super();
		this.bocina = bocina;
		this.sillones = sillones;
		this.television = television;
	}


	public String getBocina() {
		return bocina;
	}


	public void setBocina(String bocina) {
		this.bocina = bocina;
	}


	public String getSillones() {
		return sillones;
	}


	public void setSillones(String sillones) {
		this.sillones = sillones;
	}


	public int getTelevision() {
		return television;
	}


	public void setTelevision(int television) {
		this.television = television;
	}


	@Override
	public String toString() {
		return "Sala [bocina=" + bocina + ", sillones=" + sillones + ", television=" + television + "]";
	}

    
	
      
	
}
