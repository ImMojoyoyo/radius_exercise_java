package calculo_circulo;

public class calculo {
	
	// Comiezo de nuestro programa.
	public static void main(String[] args) {
	
	int r = 5; // Radio del circulo.
	double a = 3.14 * Math.pow(r, 2);
	double l = 2 * 3.14 * r;
	System.out.println("Radio :" + r);
	System.out.println("Longitud de la circumferencia :" + l);
	System.out.println("Area de la circumferencia :" + a);
	
	}	
}
