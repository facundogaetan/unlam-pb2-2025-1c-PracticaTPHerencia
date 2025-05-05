package practicaTpHerencia20251C;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

//inicializacion
//ejecucion
//verificacion

public class EmpresaDeTransporteTest {
	
	@Before
	public void inicializacion() {
		EmpresaDeTransporte nuevaEmpresaDeTransporte = new EmpresaDeTransporte();
		
	}
	
	/*
	Se saben las dimensiones de cada paquete a distribuir y, por lo tanto, se cuenta con 
	su alto, ancho y profundo. Dichos datos son necesarios para para calcular el volumen. 
	Por último, se tiene el peso de este. 
	*/
	
	@Test
	public void dadoQueExisteUnaEmpresaDeTransportePuedoRegistrarUnPaquete() {
		Paquete nuevoPaquete = new Paquete(0.5,0.6,0.7,3.0);
		EmpresaDeTransporte nuevaEmpresaDeTransporte = new EmpresaDeTransporte();
		
		nuevaEmpresaDeTransporte.registrarPaquete(nuevoPaquete);
		
		assertTrue(nuevaEmpresaDeTransporte.getPaquetes().contains(nuevoPaquete));
		
		
	}

}
