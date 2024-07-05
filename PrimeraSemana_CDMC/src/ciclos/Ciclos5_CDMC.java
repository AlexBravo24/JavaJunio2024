package ciclos;

public class Ciclos5_CDMC {
public static void main(String[] args) {
	
	//Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. ¿Cuál será la cantidad de dinero que esta 
	//persona tendrá al cabo de un año si todo el dinero lo reinvierte?
	
	double inversionInicial = 1000.00; // Inversión inicial de $1000.00
    double tasadeInteres = 0.02; // 2% de interés mensual
    double dinero = inversionInicial; // Inicialmente el saldo es la inversión inicial
    // Calcular el saldo después de 12 meses
    for (int mes = 1; mes <= 12; mes++) {
        // Calcular el interés del mes
        double intMensual = dinero * tasadeInteres;
        
        // Sumar el interés al saldo actual
        dinero += intMensual;
    }
    
    // Mostrar el saldo después de un año
    System.out.printf("Después de un año, el saldo será: $%.2f\n", dinero);
}
}
