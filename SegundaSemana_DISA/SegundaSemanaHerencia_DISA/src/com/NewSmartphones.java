package com;

public class NewSmartphones extends OldSmartphones {
	
	private String IAasistente;
	private String BiometricData;
	private String Camaras;
	private String MpCamara;
	
	public NewSmartphones ()
	{}

	public NewSmartphones(String marca, String modelo, int memoriaGB, String internet, String iAasistente,
			String biometricData, String camaras, String mpCamara) {
		super(marca, modelo, memoriaGB, internet);
		IAasistente = iAasistente;
		BiometricData = biometricData;
		Camaras = camaras;
		MpCamara = mpCamara;
	}

	public String getIAasistente() {
		return IAasistente;
	}

	public void setIAasistente(String iAasistente) {
		IAasistente = iAasistente;
	}

	public String getBiometricData() {
		return BiometricData;
	}

	public void setBiometricData(String biometricData) {
		BiometricData = biometricData;
	}

	public String getCamaras() {
		return Camaras;
	}

	public void setCamaras(String camaras) {
		Camaras = camaras;
	}

	public String getMpCamara() {
		return MpCamara;
	}

	public void setMpCamara(String mpCamara) {
		MpCamara = mpCamara;
	}

	@Override
	public String toString() {
		return "NewSmartphones [IAasistente=" + IAasistente + ", BiometricData=" + BiometricData + ", Camaras="
				+ Camaras + ", MpCamara=" + MpCamara + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
