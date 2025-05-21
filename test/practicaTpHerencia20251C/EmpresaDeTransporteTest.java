package practicaTpHerencia20251C;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

//inicializacion
//ejecucion
//verificacion

public class EmpresaDeTransporteTest {
	Ciudad nuevaCiudad;
	Bicicleta nuevaBici;
	Paquete nuevoPaquete;

	/*
	 * Se saben las dimensiones de cada paquete a distribuir y, por lo tanto, se
	 * cuenta con su alto, ancho y profundo. Dichos datos son necesarios para para
	 * calcular el volumen. Por último, se tiene el peso de este.
	 */

	// Bicicleta
	// • Se mueve dentro de la ciudad.
	// • Puede enviar dos paquetes de hasta 0.125 m3 y un máximo de 15 kg.
	// NOTA: Si no tengo destino, el primer paquete me define el destino hacia
	// dónde va la bicicleta.

	@BeforeEach
	public void inicializacionDeParametrosParaBicicleta() {
		Ciudad nuevaCiudad = new Ciudad("Buenos Aires");

		new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad);
		new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad);
		new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad);

		new Bicicleta();

	}

	@Test
	public void dadoQueExisteUnaBicicletaPuedoSaberSiPuedeLlevarUnPaquete() {

		Ciudad nuevaCiudad = new Ciudad("Buenos Aires");

		Paquete nuevoPaquete = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad); // 0,1 m3 y 3k de peso
		new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad);
		new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad);

		Bicicleta nuevaBici = new Bicicleta();

		assertTrue(nuevaBici.puedeLlevar(nuevoPaquete));

	}

	@Test
	public void dadoQueExisteUnPaquetePuedoCalcularSuVolumen() {
		Paquete NuevoPaquete2 = new Paquete(0.3, 0.5, 0.7, 4.0, nuevaCiudad);

		NuevoPaquete2.calcularVolumen();

		assertEquals(0.105, NuevoPaquete2.calcularVolumen(), 0.0001);

	}

	@Test
	public void dadoQueExisteUnaBiciPuedoSaberSiPuedeLlevarMasDe2Paquetes() {

		// por que agregarPaquete y no puedeLLevar? dado que si testeamos con puede
		// llevar todavia los paquetes no fueron
		// agregados entonces por cantidad siempre daria true en cambio en
		// agregarpaquete primero chequea puedeLlevar
		// y despues lo agrega

		Ciudad nuevaCiudad = new Ciudad("Buenos Aires");

		Paquete nuevoPaquete = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad); // 0,1 m3 y 3k de peso
		Paquete nuevoPaquete2 = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad); // 0,1 m3 y 3k de peso
		Paquete nuevoPaquete3 = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad); // 0,1 m3 y 3k de peso

		Bicicleta nuevaBici = new Bicicleta();

		assertTrue(nuevaBici.agregarPaquete(nuevoPaquete));
		assertTrue(nuevaBici.agregarPaquete(nuevoPaquete2));
		assertFalse(nuevaBici.agregarPaquete(nuevoPaquete3));
	}

	@Test
	public void dadoQueExisteUnPaqueteAgregadoPuedoVerificarlo() {
		Bicicleta nuevaBici = new Bicicleta();

		Ciudad nuevaCiudad = new Ciudad("Buenos Aires");

		Paquete nuevoPaquete = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad); // 0,1 m3 y 3k de peso

		nuevaBici.agregarPaquete(nuevoPaquete);

		assertTrue(nuevaBici.getPaquetes().contains(nuevoPaquete));

	}

	// Auto:
	// Abarca hasta 3 ciudades. Los destinos no se pueden repetir.
	// Puede llevar hasta 2m3 de carga y hasta 500kg

	@Test
	public void dadoQueExisteUnaEmpresaDeTransportePuedoAgregarUnAutomovil() {
		new Automovil();
	}

	@Test
	public void dadoQueExisteUnAutoNoPuedoIrA4Ciudades() {
		Automovil nuevoAuto = new Automovil();

		Ciudad nuevaCiudad = new Ciudad("Buenos Aires");
		Ciudad nuevaCiudad2 = new Ciudad("Bahia Blanca");
		Ciudad nuevaCiudad3 = new Ciudad("Palermo");
		Ciudad nuevaCiudad4 = new Ciudad("Ciudad Gotica");

		Paquete nuevoPaquete = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad); // 0,1 m3 y 3k de peso
		Paquete nuevoPaquete2 = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad2); // 0,1 m3 y 3k de peso
		Paquete nuevoPaquete3 = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad3); // 0,1 m3 y 3k de peso
		Paquete nuevoPaquete4 = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad4); // 0,1 m3 y 3k de peso

		assertTrue(nuevoAuto.agregarPaquete(nuevoPaquete));
		assertTrue(nuevoAuto.agregarPaquete(nuevoPaquete2));
		assertTrue(nuevoAuto.agregarPaquete(nuevoPaquete3));
		assertFalse(nuevoAuto.agregarPaquete(nuevoPaquete4));
	}

	@Test
	public void dadoQueExisteUnAutoNoPuedoIrALMismoDestino() {
		Automovil nuevoAuto = new Automovil();

		Ciudad nuevaCiudad = new Ciudad("Buenos Aires");
		Ciudad nuevaCiudad2 = new Ciudad("Buenos Aires");

		Paquete nuevoPaquete = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad); // 0,1 m3 y 3k de peso
		Paquete nuevoPaquete2 = new Paquete(0.1, 0.1, 0.1, 4.0, nuevaCiudad2); // 0,1 m3 y 3k de peso

		assertTrue(nuevoAuto.agregarPaquete(nuevoPaquete));
		assertFalse(nuevoAuto.agregarPaquete(nuevoPaquete2));

	}

	@Test
	public void dadoQueExisteUnCamionNoPuedoLlevarMasDeSuPesoPermitido() {
		Camion nuevoCamion = new Camion();

		Ciudad nuevaCiudad = new Ciudad("Buenos Aires");
		Ciudad nuevaCiudad2 = new Ciudad("Bahia Blanca");
		Ciudad nuevaCiudad3 = new Ciudad("Palermo");
		Ciudad nuevaCiudad4 = new Ciudad("Ciudad Gotica");

		Paquete nuevoPaquete = new Paquete(0.1, 0.1, 0.1, 5000.0, nuevaCiudad); // 0,1 m3 y 5t de peso
		Paquete nuevoPaquete2 = new Paquete(0.1, 0.1, 0.1, 5000.0, nuevaCiudad2); // 0,1 m3 y 5t de peso
		Paquete nuevoPaquete3 = new Paquete(0.1, 0.1, 0.1, 5000.0, nuevaCiudad3); // 0,1 m3 y 5t de peso
		Paquete nuevoPaquete4 = new Paquete(0.1, 0.1, 0.1, 5000.0, nuevaCiudad4); // 0,1 m3 y 5t de peso

		assertTrue(nuevoCamion.agregarPaquete(nuevoPaquete));
		assertTrue(nuevoCamion.agregarPaquete(nuevoPaquete2));
		assertTrue(nuevoCamion.agregarPaquete(nuevoPaquete3));
		assertFalse(nuevoCamion.agregarPaquete(nuevoPaquete4));

	}

}
