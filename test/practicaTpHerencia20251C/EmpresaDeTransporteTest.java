package practicaTpHerencia20251C;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

//inicializacion
//ejecucion
//verificacion

public class EmpresaDeTransporteTest {

	/*
	 * Se saben las dimensiones de cada paquete a distribuir y, por lo tanto, se
	 * cuenta con su alto, ancho y profundo. Dichos datos son necesarios para para
	 * calcular el volumen. Por último, se tiene el peso de este.
	 */

	@Test
	public void dadoQueExisteUnaEmpresaDeTranspotePuedoCrearUnTransporte() {
		Bicicleta nuevoTransporte = new Bicicleta();
	}

	@Test
	public void dadoQueExisteUnPaquetePuedoCalcularSuVolumen() {
		Paquete NuevoPaquete2 = new Paquete(0.3, 0.5, 0.7, 4.0);

		double volumenCalculado = NuevoPaquete2.calcularVolumen();

		assertEquals(0.105, NuevoPaquete2.calcularVolumen(), 0.0001);

	}

	@Test
	public void dadoQueExisteUnTransportePuedoSaberSiPuedeLlevarUnPaquete() {
		Paquete nuevoPaquete = new Paquete(0.1, 0.1, 0.1, 3.0); // 0,1 m3 y 3k de peso
		Bicicleta nuevaBicicleta = new Bicicleta();

		boolean puedeLlevarlo = nuevaBicicleta.puedeLlevar(nuevoPaquete);

		assertTrue(puedeLlevarlo);

	}

	@Test
	public void dadoQueExisteUnPaquetePuedoAgregarloAUnTransporte() {
		Paquete nuevoPaquete = new Paquete(0.2, 0.2, 0.2, 3.0);
		Bicicleta nuevaBicicleta = new Bicicleta();

		nuevaBicicleta.agregarPaquete(nuevoPaquete);

		assertTrue(nuevaBicicleta.getPaquetes().contains(nuevoPaquete));

	}

	// probar con mas de 2 paquetes

	@Test
	public void dadoQueExisteUnaBiciPuedoSaberSiPuedeLlevarMasDe2Paquetes() {
		Bicicleta nuevaBicicleta = new Bicicleta();

		Paquete nuevoPaquete = new Paquete(0.1, 0.1, 0.1, 3.0);
		Paquete nuevoPaquete2 = new Paquete(0.1, 0.1, 0.1, 3.0);
		Paquete nuevoPaquete3 = new Paquete(0.1, 0.1, 0.1, 3.0);

		assertTrue(nuevaBicicleta.agregarPaquete(nuevoPaquete));
		assertTrue(nuevaBicicleta.agregarPaquete(nuevoPaquete2));
		assertTrue(nuevaBicicleta.agregarPaquete(nuevoPaquete3));
		                 

	}

}
