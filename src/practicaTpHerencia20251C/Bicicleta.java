package practicaTpHerencia20251C;

public class Bicicleta extends Transporte {
	private static final int MAX_PAQUETES = 2;
	private static final double MAX_VOLUMEN_POR_PAQUETE = 0.125;
	private static final double MAX_PESO_POR_PAQUETE = 15.0;

	public Bicicleta() {
		super();
	}

	@Override
	public boolean puedeLlevar(Paquete paquete) {
		if(paquetes.size() < MAX_PAQUETES && paquete.calcularVolumen() <= MAX_VOLUMEN_POR_PAQUETE && 
				paquete.getPeso() <= MAX_PESO_POR_PAQUETE) {
			return true;
		}
		return false;
	}
	
	

}