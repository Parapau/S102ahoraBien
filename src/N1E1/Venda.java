package N1E1;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Producte> productes = new ArrayList<Producte>();
	private int preu;

	public Venda(ArrayList<Producte> productes) {
		super();
		this.productes = productes;
		this.preu = 0;
	}

	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public int getPreu() {
		return preu;
	}

	public void setProductes(ArrayList<Producte> productes) {
		this.productes = productes;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}


	public void calcularTotal() {
		int preu = 0;
		try {
			if (productes.size()==0) {
				throw new VendaBuidaException ("Per fer una venda primer has d’afegir productes");
			} else {
				for (Producte i : productes) {
					preu += i.getPreu();
				}
			}
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}

		this.preu = preu;
	}

}
