package N3E1;

import java.util.ArrayList;

public class GestioButaques {
	private ArrayList<Butaca> butaques;

	public GestioButaques() {
		this.butaques = new ArrayList<Butaca>();
	}

	public ArrayList<Butaca> getButaques() {
		return butaques;
	}


	public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
		int i = cercarButaca(butaca);

		if (i == -1) {
			this.butaques.add(butaca);
			System.out.println("Butaca afegida"); //potser eliminar
		} else {
			throw new ExcepcioButacaOcupada("Aquesta butaca ja esta ocupada.");
		}

	}


	public void eliminarButaca(Butaca butaca) throws ExcepcioButacaLliure{
		int i = cercarButaca(butaca);


		if (cercarButaca(butaca) != -1) {
			this.butaques.remove(i);
			System.out.println("Butaca eliminada"); //potser eliminar
		} else {
			throw new ExcepcioButacaLliure("Aquesta butaca ja esta lliure.");
		}

	}



	public int cercarButaca(Butaca butaca) {
		ArrayList<Butaca> array = getButaques();
		int i = 0;
		boolean seguir = true;
		while (i < array.size() && seguir) {
			if (array.get(i).getFila() == butaca.getFila() && array.get(i).getColumna() == butaca.getColumna()) {
				seguir = false;
			} else {
				i++;
			}
		}
		i = (seguir)?-1:i;
		return i;
	}

}
