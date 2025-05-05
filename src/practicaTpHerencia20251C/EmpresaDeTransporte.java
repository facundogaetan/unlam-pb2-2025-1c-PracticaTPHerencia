package practicaTpHerencia20251C;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeTransporte {
	private List<Paquete> paquetes = new ArrayList<>();



	public void registrarPaquete(Paquete nuevoPaquete) {
		paquetes.add(nuevoPaquete);
		
	}

	public List<Paquete> getPaquetes() {
		return paquetes;
	}
	
	

}
