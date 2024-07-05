package com;//nombre del paquete 

public class TiposDeDatos {
public static void main(String[] args) {
	//Declaracion de tipos de datos 
	//Tipos de datos primitivos- Numericos enteros 
	//ejemplo de declarar un tipo de dato entero, sin valor asignado inicialmente 
	byte numeroUno;
	numeroUno=127; //asignamos el valor a la variable 
	
	//ejemplo de asignar la variable con el valor desde el incio
	byte numero1=-128;// van desde -128 a 127, utilizan 1 byte de memoria 
	short numero2=32767; //van del -31768 al 32767 y utilizan 2 bytes de memoria
	int numero3=2147483647;//van del -2147483648 al 2147483647 y ocupan 4 bytes de memoria 
	long numero4=2147483649L; //ocupan 8 bytes de memoria y necesitan del sufijo L
	
	//Tipos de dato primitivo- Coma flotantes 
	float numero5=3.1416F; //ocupa 4 bytes y necesita del sufijo F
	double numero6=2.5412199; //ocupa 8 bytes de memoria 
boolean evalua=true; //solo admiten valores como true o false 
// y estos tipos de datos son utiles para evaluar condiciones 
// o expresiones 
char caracter= 'a';//puede contener solo un caracter a la vez  

//Tipos de dato no primitivo o tipos de dato estructurado 
//tipos de dato objeto o referenciales 


//cadena de texto 
//ejemplo de declarar un string sin valor asignado 
String nombre;
nombre="Rosa Isela";

//Ejemplo de declarar un string con un valor asignado desde el incio 
String fecha="hoy es martes 25 de Junio de 2024";

//Estos tipos de dato objeto estructurados se identifican tambien 
// por ser capaces de utilizar ciertos metodos
/*podemos encontrar tambien a los tipos de datos Wraper o envoltorio 
 * son clases o tipos de dato objetos que envuelven a los primitivos 
 * y pueden utilizar ciertos metodos
 * Ejemplo de datos Wraper
 */
byte numero11=127;

//si tuvieramos que converir el valor
//entero a decimal, ocupamos este metodo como ejemplo 

//Darle salida a los datos en consola 
System.out.println("Hola mundo");
//con println existe un salto de linea

System.out.println("Hoy es martes 25 de junio de 2024");

//Syso + ctrl+ espacio
//Sout + ctr+ espacio

System.out.println(15+8);

//ejemplo de mostrar un mensaje y una operacion
System.out.println("la suma es:" +(numeroUno + numero2));









	
	
	
	
	
}// Cierre del main 
} // cierre de la clase 
 //para fines practicos, el tipo de dato mas utilizado es el int 
