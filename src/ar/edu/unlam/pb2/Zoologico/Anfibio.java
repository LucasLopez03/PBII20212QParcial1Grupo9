package ar.edu.unlam.pb2.Zoologico;

public abstract class Anfibio extends Animal {

	private static Edad edad;
	
	public Anfibio(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,String nombreAnimal, Edad edad) {
		super(peso, altura, extremidades, tieneHambre,nombreAnimal, edad);
		}
		
public abstract Animal ponerHuevo();
}
