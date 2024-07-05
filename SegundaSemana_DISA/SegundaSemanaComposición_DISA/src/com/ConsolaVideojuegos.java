package com;

public class ConsolaVideojuegos {
	
	private int memoria;
	private String color;
	
	private Videojuegos game;
	private Control control;
	private Desarrollador developer;
	
	public ConsolaVideojuegos () {}

	public ConsolaVideojuegos(int i, String color, Videojuegos game, Control control,
			Desarrollador developer) {
		super();
		this.memoria = i;
		this.color = color;
		this.game = game;
		this.control = control;
		this.developer = developer;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Videojuegos getGame() {
		return game;
	}

	public void setGame(Videojuegos game) {
		this.game = game;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public Desarrollador getDeveloper() {
		return developer;
	}

	public void setDeveloper(Desarrollador developer) {
		this.developer = developer;
	}

	@Override
	public String toString() {
		return "ConsolaVideojuegos [memoria=" + memoria + ", color=" + color + ", game=" + game + ", control=" + control
				+ ", developer=" + developer + "]";
	}
	
	
}
