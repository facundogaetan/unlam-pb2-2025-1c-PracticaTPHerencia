package practicaTpHerencia20251C;

public class Automovil extends Transporte {

	private static final int MAX_PAQUETES = 10000;
	private static final double MAX_VOLUMEN_PERMITIDO = 2.0;
	private static final double MAX_PESO_PERMITIDO = 500.0;

	public Automovil() {
		super();
	}

	// crear metodo que sume el peso del array de paquetes y el volumen

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
