package ciclos;

public class Ciclos5_CDMC {
public static void main(String[] args) {
	
	//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta 
	//persona tendr� al cabo de un a�o si todo el dinero lo reinvierte?
	
	double inversionInicial = 1000.00; // Inversi�n inicial de $1000.00
    double tasadeInteres = 0.02; // 2% de inter�s mensual
    double dinero = inversionInicial; // Inicialmente el saldo es la inversi�n inicial
    // Calcular el saldo despu�s de 12 meses
    for (int mes = 1; mes <= 12; mes++) {
        // Calcular el inter�s del mes
        double intMensual = dinero * tasadeInteres;
        
        // Sumar el inter�s al saldo actual
        dinero += intMensual;
    }
    
    // Mostrar el saldo despu�s de un a�o
    System.out.printf("Despu�s de un a�o, el saldo ser�: $%.2f\n", dinero);
}
}
