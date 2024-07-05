package com;

//ACTIVIDAD - CREAR UNA CLASE PARA GENERAR ALGUN OBJETO EL QUE USTEDES GUSTEN
//EL OBJETO O CLASE DEBERÁ LLEVAR POR LO MENOS 3 ATRIBUTOS
//GENERAN CONSTRUCTORES - VACIO Y CON TODOS LOS ARGUMENTOS
//GENERAN GETTERS Y SETTERS
//GENERAN MÉTODO TOSTRING()
//EN ESTA MISMA CLASE PRINCIPAL VAN A INSTANCIAR UNO CON TODOS LOS ARGUMENTOS Y UNO
//VACIO Y LOS MANDAN A IMPRIMIR EN CONSOLA. EN EL VACIO ASIGNAN UN VALOR POR LO MENOS
//CON UN SETTER

public class Libro {


 String nombredeLibro;
 String autor;
 String editorial;
 int paginas;
 int edicion;
 
 public Libro() {
	 
 }

public Libro(String nombredeLibro, String autor, String editorial, int paginas, int edicion) {
	super();
	this.nombredeLibro = nombredeLibro;
	this.autor = autor;
	this.editorial = editorial;
	this.paginas = paginas;
	this.edicion = edicion;
  }

    public String getNombredeLibro() {
	  return nombredeLibro;
  }

    public void setNombredeLibro(String nombredeLibro) {
	   this.nombredeLibro = nombredeLibro;
  }

    public String getAutor() {
	  return autor;
  }

    public void setAutor(String autor) {
	  this.autor = autor;
  }

    public String getEditorial() {
	  return editorial;
  }

    public void setEditorial(String editorial) {
	  this.editorial = editorial;
  }

    public int getPaginas() {
	  return paginas;
  }

    public void setPaginas(int paginas) {
	  this.paginas = paginas;
  }

    public int getEdicion() {
	  return edicion;
  }

    public void setEdicion(int edicion) {
	  this.edicion = edicion;
  }

	@Override
	public String toString() {
		return "Libro [nombredeLibro=" + nombredeLibro + ", autor=" + autor + ", editorial=" + editorial + ", paginas="
				+ paginas + ", edicion=" + edicion + "]";
	}

 
	
	
}
