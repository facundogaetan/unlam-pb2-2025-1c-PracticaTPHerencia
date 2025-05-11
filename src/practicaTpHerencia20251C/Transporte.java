package practicaTpHerencia20251C;

import java.util.ArrayList;
import java.util.List;

public abstract class Transporte {
	protected List<Paquete> paquetes = new ArrayList<>();



	public boolean agregarPaquete(Paquete paquete) {
		if(puedeLlevar(paquete)) {
			paquetes.add(paquete);
			return true;
		}
		return false;
		
		
	}

	public List<Paquete> getPaquetes() {
		return paquetes;
	}

    public abstract boolean puedeLlevar(Paquete paquete);
    
    

	
	

}
