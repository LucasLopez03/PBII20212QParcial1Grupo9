package ar.edu.unlam.pb2.Zoologico;

public class Zoologico {
	
	private Animal [] animales;
	private String nombre;

	public Zoologico(String nombre){
		this.nombre = nombre;
		this.animales = new Animal[20];
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
