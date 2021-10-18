package ar.edu.unlam.pb2.Zoologico;

public class Zoologico {
	
	private Animal [] animales;
	private String nombre;
    private Integer contadorDeAnimales;    
	public Zoologico(String nombre){
		this.nombre = nombre;
		this.animales = new Animal[20];
		this.contadorDeAnimales=0;
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

}
