package ar.edu.unlam.pb2.Zoologico;



public class Zoologico {
	
	private Animal [] animales;
	private Cliente [] clientes;
	private String nombre;
    private Integer contadorDeAnimales;    
	private static final Double VALOR_ENTRADA = 300.0;
	private static Integer cantidadMaximoDeVisitantes = 20;
	private Integer contadorEntradas=0;
    public Zoologico(String nombre){
		this.nombre = nombre;
		this.animales = new Animal[20];
		this.clientes = new Cliente[cantidadMaximoDeVisitantes];
		this.contadorDeAnimales=0;
	}
	
	public void ventaEntrada(Cliente cliente) {
		if (contadorEntradas!=cantidadMaximoDeVisitantes) {
			for (int i = 0; i < clientes.length; i++) {
				if (clientes[i]==null) {
					clientes[i] = cliente;
					break;
				}
			}
			contadorEntradas++;	
		}
	}
	
	public Integer getCantidadDeVisitantes() {
		return contadorEntradas++;

	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Animal[] getAnimales() {
		return animales;
	}

	public void setAnimales(Animal[] animales) {
		this.animales = animales;
	}

	public Boolean agregarNuevoAnimal(Animal nuevoAnimal) {
		Boolean agregado=false;
		for (int i = 0; i < animales.length; i++) {
			if(this.animales[i]==null) {
				this.animales[i]=nuevoAnimal;
				agregado=true;
				break;
			}
		}
		return agregado;
	}

	public Integer obtenerCantidadDeAnimales() {
		this.calcularCantidadDeAnimales();		
		
		return this.contadorDeAnimales;
	}

	private void calcularCantidadDeAnimales() {
		for (int i = 0; i < animales.length; i++) {
			if(animales[i]!=null) {
				this.contadorDeAnimales++;
			}
		}
	}
	public Double obtenerElTotalRecaudadoDeVentas() {
		return this.VALOR_ENTRADA*this.contadorEntradas;
	}

	public Boolean enseñarActividad(Animal nuevoMono, ActividadesQueRealizan jugarConLaPelota) {
		Boolean agregado=false;
		agregado=nuevoMono.apreder(jugarConLaPelota);
		return agregado;
	}

}
