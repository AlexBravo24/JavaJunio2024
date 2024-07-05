package com;

public class Gpu {

	
	private String Gpu;
	private double velocidad;
	private double rendimiento;
	
	public Gpu() {
		
		
	}

	public Gpu(String gpu, double velocidad, double rendimiento) {
		super();
		Gpu = gpu;
		this.velocidad = velocidad;
		this.rendimiento = rendimiento;
	}

	public String getGpu() {
		return Gpu;
	}

	public void setGpu(String gpu) {
		Gpu = gpu;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(double rendimiento) {
		this.rendimiento = rendimiento;
	}

	@Override
	public String toString() {
		return "Gpu [Gpu=" + Gpu + ", velocidad=" + velocidad + ", rendimiento=" + rendimiento + "]";
	}
	
	
}
