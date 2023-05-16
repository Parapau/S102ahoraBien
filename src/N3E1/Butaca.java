package N3E1;

public class Butaca {
	private int fila, columna;
	private String sentador;
	public Butaca(int fila, int columna, String sentador) {
		this.fila = fila;
		this.columna = columna;
		this.sentador = sentador;
	}
	public int getFila() {
		return fila;
	}
	public int getColumna() {
		return columna;
	}
	public String getSentador() {
		return sentador;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	public void setSentador(String sentador) {
		this.sentador = sentador;
	}
	
	public String toString() {
		return "Fila:" + getFila() + ", Seient:" + getColumna() + ", Sentador:" + getSentador();
	}
	
}
