package ciclos;

public class Ciclos5_LNHT {

	public static void main(String[] args) {
		// . Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
		//tendr� al cabo de un a�o si todo el dinero lo reinvierte?TODO Auto-generated method stub
		
		Double inversion = 1000.0;
		Double tsInteres = 0.02;
		for (int i = 1; i <= 12; i++) {
			inversion = (inversion*tsInteres)+inversion;
			System.out.println("Dinero total del mes " + i +" es : $"+ inversion.intValue());
			//System.out.println("Dinero total del mes " + i +" es : $"+ inversion);
		}// for
	}// main
}
