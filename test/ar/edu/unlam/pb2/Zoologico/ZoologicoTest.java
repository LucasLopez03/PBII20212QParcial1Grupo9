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

		Mamifero puma = new Puma(20.0, 1.2, 4, true, "rubio","pumaDeDientesGrandes", Edad.BEBE);

		//Comprobacion
		assertEquals((Double)20.0, ((Puma)puma).getPeso());
		assertEquals((Double)1.2, puma.getAltura());
		assertEquals((Integer)4, puma.getExtremidades());
		assertEquals((Boolean)true, ((Puma)puma).getTieneHambre());
		assertEquals("rubio", ((Puma)puma).getColor());
	}
	
	@Test
	public void QueSePuedaInstanciarUnAnfibio() {
		//Preparacion

		Anfibio rana = new Rana(10.0,5.0,3,true,"verde","rana", Edad.ADULTO);

		//Comprobacion
		assertEquals((Double)10.0, ((Rana)rana).getPeso());
		assertEquals((Double)5.0, rana.getAltura());
		assertEquals((Integer)3, rana.getExtremidades());
		assertEquals((Boolean)true, ((Rana)rana).getTieneHambre());
		assertEquals("verde", ((Rana)rana).getColorDePiel());
		assertEquals("rana", ((Rana)rana).getNombreDeanimal());
	}
	
	@Test
	public void QueSePuedaInstanciarUnAcuatico() {
		//Preparacion

		Acuatico salmon = new Salmon(10.0,5.0, 3, false, true, true, 30.0, "salmoncito", Edad.JOVEN);

		//Comprobacion
		assertEquals((Double)10.0, ((Salmon)salmon).getPeso());
		assertEquals((Double)5.0, salmon.getAltura());
		assertEquals((Integer)3, salmon.getExtremidades());
		assertEquals((Boolean)false, ((Salmon)salmon).getTieneHambre());
		assertEquals((Boolean)true, salmon.getAletas());
		assertEquals((Boolean)true, salmon.getTraqueas());
		assertEquals((Double)30.0, salmon.getLargo());
		assertEquals("salmoncito", ((Salmon)salmon).getNombreDeanimal());
	}
	
	@Test
	public void QueSePuedaAlimentarUnMamifero() {
		//Preparacion
		Mamifero puma = new Puma(20.0, 1.2, 4, true, "rubio","puma", Edad.BEBE);
		
		//Ejecucion
		puma.alimentar();
		
		Boolean valorObtenido = puma.getTieneHambre();
		
		//Comprobacion
		assertFalse(valorObtenido);
	}
	
	@Test
	public void QueSePuedaAlimentarUnAnfibio() {
		//Preparacion
		Anfibio rana = new Rana(10.0,5.0,3,true,"verde","rana", Edad.ADULTO);
		
		//Ejecucion
		rana.alimentar();
		
		Boolean valorObtenido = rana.getTieneHambre();
		
		//Comprobacion
		assertFalse(valorObtenido);
	}
	
	@Test
	public void QueSePuedaAlimentarUnAcuatico() {
		//Preparacion
		Acuatico salmon = new Salmon(10.0,5.0, 3, false, true, true, 30.0, "salmoncito", Edad.JOVEN);
		
		//Ejecucion
		salmon.alimentar();
		
		Boolean valorObtenido = salmon.getTieneHambre();
		
		//Comprobacion
		assertFalse(valorObtenido);
	}

	
	@Test
	public void QueSepuedaIntroducirUnNuevoAnimalAlZoologico() {
		//Preparacion

		Boolean valorObtenido;
		Animal nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","puma", Edad.JOVEN);
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
		Puma nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","pumatom", Edad.ADULTO);
		Mono nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan,"mono de peloLargo", Edad.JOVEN);
		Rana nuevaRana= new Rana(10.0,5.0,4,true,"verde","rana", Edad.ADULTO);
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
		Animal nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan,"mono", Edad.BEBE);
		Zoologico temaiken = new Zoologico ("Temaiken");
		
		//Ejecucion
		valorObtenido=temaiken.enseñarActividad(nuevoMono,ActividadesQueRealizan.JUGAR_CON_LA_PELOTA);
		
		//Comprobacion
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queSePuedaEnseñarAOtroAnimalOtraActividad() {
		//Preparacion
	    Boolean valorObtenido;
		Animal nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","pumatom", Edad.ADULTO);

		Zoologico temaiken = new Zoologico ("Temaiken");
		
		//Ejecucion
		valorObtenido=temaiken.enseñarActividad(nuevoPuma,ActividadesQueRealizan.CAZAR);
		
		//Comprobacion
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queSePuedaBuscarUnAnimal() {
		//Preparacion
		Animal nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan,"mono", Edad.JOVEN);
		Animal nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","pumatom", Edad.ADULTO);
		Zoologico temaiken = new Zoologico ("Temaiken");
		
		//Ejecucion
		temaiken.agregarNuevoAnimal(nuevoPuma);
		temaiken.agregarNuevoAnimal(nuevoMono);
		
		Animal valorObtenido = temaiken.buscarAnimal(nuevoPuma);
	
		//Comprobacion
		assertEquals(nuevoPuma, valorObtenido);
	}
	
	@Test
	public void queUnAnimalPuedaCrecer() {
		//Preparacion
		String valorEsperado = "ADULTO";
		Animal nuevoMono= new Mono(30.0,50.0,4,true,"negro",30.0,TipoDeMono.orangutan,"mono", Edad.JOVEN);
		Animal nuevoPuma= new Puma(20.0, 1.2, 4, true, "rubio","pumatom", Edad.ADULTO);
		Zoologico temaiken = new Zoologico ("Temaiken");

		//Ejecucion
		nuevoMono.crecer();
		
		//Comprobacion
		assertEquals(valorEsperado, nuevoMono.getEdad().toString());
	}
	
}
