package practicaTpHerencia20251C;

public class Bicicleta extends Transporte {
	private static final int MAX_PAQUETES = 2;
	private static final double MAX_VOLUMEN_POR_PAQUETE = 0.125;
	private static final double MAX_PESO_POR_PAQUETE = 15.0;

	public Bicicleta() {
		super();
	}
	
	// Bicicleta
		// • Se mueve dentro de la ciudad.
		// • Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
		// NOTA: Si no tengo destino, el primer paquete me define el destino hacia
		// dónde va la bicicleta.

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		if (paquetes.size() < MAX_PAQUETES && paquete.calcularVolumen() <= MAX_VOLUMEN_POR_PAQUETE
				&& paquete.getPeso() <= MAX_PESO_POR_PAQUETE
						&& (paquetes.isEmpty() || paquete.getCiudadDestino().equals(paquetes.get(0).getCiudadDestino()))){
			return true;
		}
		return false;
	}

}