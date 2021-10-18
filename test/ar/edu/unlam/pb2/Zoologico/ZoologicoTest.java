package ar.edu.unlam.pb2.Zoologico;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZoologicoTest {

	@Test
	public void QueSePuedaCrearUnZoologico() {
		Zoologico temaiken = new Zoologico ("Temaiken");
		
		assertEquals("Temaiken", temaiken.getNombre());
	}
	
	@Test
	public void QueSePuedaInstanciarUnMamifero() {
		Mamifero puma = new Puma(20.0, 1.2, 4, true, "rubio");

	assertEquals((Double)20.0, ((Puma)puma).getPeso());
	assertEquals((Double)1.2, puma.getAltura());
	assertEquals((Integer)4, puma.getExtremidades());
	assertEquals((Boolean)true, ((Puma)puma).getTieneHambre());
	assertEquals("rubio", ((Puma)puma).getColor());
	}
	
	@Test
	public void QueSePuedaAlimentarUnMamifero() {
		Mamifero puma = new Puma(20.0, 1.2, 4, true, "rubio");
		
		puma.alimentar();
		
		Boolean valorObtenido = puma.getTieneHambre();
		
		assertFalse(valorObtenido);
	}
	
	@Test
	public void QueSePuedaVenderUnaEntradaAlZoologico() {
		Zoologico temaiken = new Zoologico("Temaiken");
		Cliente lucas = new Cliente (39918064, "Lucas");
		
		temaiken.ventaEntrada(lucas, 1);
		
		assertEquals((Integer)1, temaiken.getCantidadDeVisitantes());
	}
}
