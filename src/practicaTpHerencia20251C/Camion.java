package practicaTpHerencia20251C;

public class Camion extends Transporte {

	
	private static final double MAX_VOLUMEN_PERMITIDO = 20.0;
	private static final double MAX_PESO_PERMITIDO = 16000.0;

	public Camion() {
		super();
	}
	
//	Abarca todas las cuidades necesarias. 
//	Puede llevar hasta 20 m3 de carga y máximo de 16 toneladas.

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		double volumenDisponible = MAX_VOLUMEN_PERMITIDO - calcularVolumenTotal();
		double pesoDisponible = MAX_PESO_PERMITIDO - calcularPesoTotal();

		if (paquete.calcularVolumen() <= volumenDisponible && paquete.getPeso() <= pesoDisponible) {
			return true;
		}
		return false;

	}

}
