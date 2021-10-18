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
public void QueSepuedaIntroducirUnNuevoAnimalAlZoologico() {
	
	Boolean valorObtenido;
	Animal nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio");
	Zoologico temaiken = new Zoologico ("Temaiken");
	valorObtenido=temaiken.agregarNuevoAnimal(nuevoPuma);
	assertTrue(valorObtenido);
	
}
@Test
public void QueSePuedaConocerLaCantidadDeAnimalesDelZoologico() {
	Integer valorEsperado=3;
	Integer valorObtenido;
	Puma nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio");
	
	Mono nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan);
	Rana nuevaRana= new Rana(10.0,5.0,4,true,"verde");
	Zoologico temaiken = new Zoologico ("Temaiken");
	temaiken.agregarNuevoAnimal(nuevoPuma);
	temaiken.agregarNuevoAnimal(nuevaRana);
	temaiken.agregarNuevoAnimal(nuevoMono);
	valorObtenido=temaiken.obtenerCantidadDeAnimales();
	assertEquals(valorEsperado,valorObtenido);
	
}
}
