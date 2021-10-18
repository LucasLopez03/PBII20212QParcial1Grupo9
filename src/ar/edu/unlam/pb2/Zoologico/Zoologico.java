package ar.edu.unlam.pb2.Zoologico;

public class Zoologico {
	
	private Animal [] animales;
	private Cliente [] clientes;
	private String nombre;
	//private static Double valorEntrada = 300.0;
	private static Integer cantidadMaximoDeVisitantes = 20;
	private Integer contadorEntradas=0;

	public Zoologico(String nombre){
		this.nombre = nombre;
		this.animales = new Animal[20];
		this.clientes = new Cliente[cantidadMaximoDeVisitantes];
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

}
