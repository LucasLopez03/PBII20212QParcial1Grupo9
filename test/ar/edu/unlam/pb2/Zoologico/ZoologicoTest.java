package ar.edu.unlam.pb2.Zoologico;

import static org.junit.Assert.*;

import org.junit.Test;


public class ZoologicoTest {

	@Test
	public void QueSePuedaCrearUnZoologico() {
		//Preparacion
		Zoologico temaiken = new Zoologico ("Temaiken");
		
		
		//Comprobacion
		assertEquals("Temaiken", temaiken.getNombre());
	}

	@Test
	public void QueSePuedaInstanciarUnMamifero() {
		//Preparacion

		Mamifero puma = new Puma(20.0, 1.2, 4, true, "rubio","pumaDeDientesGrandes");

		//Comprobacion
		assertEquals((Double)20.0, ((Puma)puma).getPeso());
		assertEquals((Double)1.2, puma.getAltura());
		assertEquals((Integer)4, puma.getExtremidades());
		assertEquals((Boolean)true, ((Puma)puma).getTieneHambre());
		assertEquals("rubio", ((Puma)puma).getColor());
	}
	
	@Test
	public void QueSePuedaAlimentarUnMamifero() {
		//Preparacion
		Mamifero puma = new Puma(20.0, 1.2, 4, true, "rubio","puma");
		
		//Ejecucion
		puma.alimentar();
		
		Boolean valorObtenido = puma.getTieneHambre();
		
		//Comprobacion
		assertFalse(valorObtenido);
	}

	
	@Test
	public void QueSepuedaIntroducirUnNuevoAnimalAlZoologico() {
		//Preparacion

		Boolean valorObtenido;
		Animal nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","puma");
		Zoologico temaiken = new Zoologico ("Temaiken");
		
		//Ejecucion
		valorObtenido=temaiken.agregarNuevoAnimal(nuevoPuma);
		
		//Comprobacion
		assertTrue(valorObtenido);
	}
	
	@Test
	public void QueSePuedaConocerLaCantidadDeAnimalesDelZoologico() {
		//Preparacion

		Integer valorEsperado=3;
		Integer valorObtenido;
		Puma nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","pumatom");
		Mono nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan,"mono de peloLargo");
		Rana nuevaRana= new Rana(10.0,5.0,4,true,"verde","rana");
		Zoologico temaiken = new Zoologico ("Temaiken");
		
		//Ejecucion
		temaiken.agregarNuevoAnimal(nuevoPuma);
		temaiken.agregarNuevoAnimal(nuevaRana);
		temaiken.agregarNuevoAnimal(nuevoMono);
		valorObtenido=temaiken.obtenerCantidadDeAnimales();
		//Comprobacion
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void QueSePuedaVenderUnaEntradaAlZoologico() {
		//Preparacion
		Zoologico temaiken = new Zoologico("Temaiken");
		Cliente lucas = new Cliente (39918064, "Lucas");
		Cliente juan = new Cliente (39293734, "Juan");
		
		//Ejecucion
		temaiken.ventaEntrada(lucas);
		temaiken.ventaEntrada(juan);
		
		//Comprobacion
		assertEquals((Integer)2, temaiken.getCantidadDeVisitantes());
	}
	
	@Test
	public void QueSePuedaObtenerElTotalRecaudadoDelDia() {
		//Preparacion
		Double valorEsperado=900.0;
		Double valorObtenido;
        Cliente lucas = new Cliente (39918064, "Lucas");
		Cliente pepe=new Cliente(124567890,"pepe");
		Cliente juan = new Cliente (39293734, "Juan");
		Zoologico temaiken = new Zoologico ("Temaiken");
		
		//Ejecucion
		temaiken.ventaEntrada(lucas);
		temaiken.ventaEntrada(juan);
        temaiken.ventaEntrada(pepe);
		valorObtenido=temaiken.obtenerElTotalRecaudadoDeVentas();
		
		//Comprobacion
		assertEquals(valorObtenido, valorEsperado);
	}
	
	@Test
	public void queSePuedaEnseñarAUnAnimalUnaActividad() {
		//Preparacion
	    Boolean valorObtenido;
		Animal nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan,"mono");
		Zoologico temaiken = new Zoologico ("Temaiken");
		
		//Ejecucion
		valorObtenido=temaiken.enseñarActividad(nuevoMono,ActividadesQueRealizan.JUGAR_CON_LA_PELOTA);
		
		//Comprobacion
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queSePuedaBuscarUnAnimal() {
		
	}


}
