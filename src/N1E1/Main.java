package N1E1;

import java.util.ArrayList;


	
public class Main {
	public static void main (String args[]) {
	
	ArrayList<Producte> compra1 = new ArrayList<Producte>();
	
	Venda a = new Venda (compra1);
	
	
	
	a.calcularTotal();
	}
}
