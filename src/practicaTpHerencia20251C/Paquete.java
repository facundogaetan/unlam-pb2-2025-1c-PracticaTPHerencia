package practicaTpHerencia20251C;

public class Paquete {

	private double ancho;
	private double alto;
	private double profundo;
	private double peso;

	public Paquete(double ancho, double alto, double profundo, double peso) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
		this.peso = peso;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getProfundo() {
		return profundo;
	}

	public void setProfundo(double profundo) {
		this.profundo = profundo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double calcularVolumen() {
		return alto * ancho * profundo;
	}
	
	

}
