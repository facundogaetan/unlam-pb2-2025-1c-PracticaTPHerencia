package practicaTpHerencia20251C;

import java.util.HashSet;
import java.util.Set;

public class Automovil extends Transporte {

	private static final int MAX_PAQUETES = 10000;
	private static final double MAX_VOLUMEN_PERMITIDO = 2.0;
	private static final double MAX_PESO_PERMITIDO = 500.0;

	public Automovil() {
		super();
	}

	// Auto:
	// Abarca hasta 3 ciudades. Los destinos no se pueden repetir.
	// Puede llevar hasta 2m3 de carga y hasta 500kg

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		double volumenDisponible = MAX_VOLUMEN_PERMITIDO - calcularVolumenTotal();
		double pesoDisponible = MAX_PESO_PERMITIDO - calcularPesoTotal();

		Set<Ciudad> ciudades = new HashSet<>();

		
		for (Paquete p : paquetes) {
			ciudades.add(p.getCiudadDestino());
		}

		ciudades.add(paquete.getCiudadDestino());

		if (paquete.calcularVolumen() <= volumenDisponible && paquete.getPeso() <= pesoDisponible
				&& ciudades.size() <= 3) {
			return true;
		}

		return false;

	}

}
