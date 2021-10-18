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
		Mamifero puma = new Puma(20.0, 1.2, 4, true, "rubio","pumaDeDientesGrandes");

	assertEquals((Double)20.0, ((Puma)puma).getPeso());
	assertEquals((Double)1.2, puma.getAltura());
	assertEquals((Integer)4, puma.getExtremidades());
	assertEquals((Boolean)true, ((Puma)puma).getTieneHambre());
	assertEquals("rubio", ((Puma)puma).getColor());
	}
	
	@Test
	public void QueSePuedaAlimentarUnMamifero() {
		Mamifero puma = new Puma(20.0, 1.2, 4, true, "rubio","puma");
		
		puma.alimentar();
		
		Boolean valorObtenido = puma.getTieneHambre();
		
		assertFalse(valorObtenido);
	}

	
@Test
public void QueSepuedaIntroducirUnNuevoAnimalAlZoologico() {
	
	Boolean valorObtenido;
	Animal nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","puma");
	Zoologico temaiken = new Zoologico ("Temaiken");
	valorObtenido=temaiken.agregarNuevoAnimal(nuevoPuma);
	assertTrue(valorObtenido);
	
}
@Test
public void QueSePuedaConocerLaCantidadDeAnimalesDelZoologico() {
	Integer valorEsperado=3;
	Integer valorObtenido;
	Puma nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","pumatom");
	
	Mono nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan,"mono de peloLargo");
	Rana nuevaRana= new Rana(10.0,5.0,4,true,"verde","rana");
	Zoologico temaiken = new Zoologico ("Temaiken");
	temaiken.agregarNuevoAnimal(nuevoPuma);
	temaiken.agregarNuevoAnimal(nuevaRana);
	temaiken.agregarNuevoAnimal(nuevoMono);
	valorObtenido=temaiken.obtenerCantidadDeAnimales();
	assertEquals(valorEsperado,valorObtenido);
	
}

	
	@Test
	public void QueSePuedaVenderUnaEntradaAlZoologico() {
		Zoologico temaiken = new Zoologico("Temaiken");
		Cliente lucas = new Cliente (39918064, "Lucas");
		
		Cliente juan = new Cliente (39293734, "Juan");

		
		temaiken.ventaEntrada(lucas);
		temaiken.ventaEntrada(juan);
		
		assertEquals((Integer)2, temaiken.getCantidadDeVisitantes());
	}
	@Test
	public void QueSePuedaObtenerElTotalRecaudadoDelDia() {
		Double valorEsperado=900.0;
		Double valorObtenido;
        Cliente lucas = new Cliente (39918064, "Lucas");
		Cliente pepe=new Cliente(124567890,"pepe");
		Cliente juan = new Cliente (39293734, "Juan");
		Zoologico temaiken = new Zoologico ("Temaiken");
		temaiken.ventaEntrada(lucas);
		temaiken.ventaEntrada(juan);
        temaiken.ventaEntrada(pepe);
		valorObtenido=temaiken.obtenerElTotalRecaudadoDeVentas();
		assertEquals(valorObtenido, valorEsperado);
	}
	@Test
	public void queSePuedaEnseñarAUnAnimalUnaActividad() {
	    Boolean valorObtenido;
		Mono nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan,"mono");
		Zoologico temaiken = new Zoologico ("Temaiken");
	valorObtenido=temaiken.enseñarActividad(nuevoMono,ActividadesQueRealizan.JUGAR_CON_LA_PELOTA);
	assertTrue(valorObtenido);
	}


}
