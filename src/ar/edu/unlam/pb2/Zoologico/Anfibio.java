package ar.edu.unlam.pb2.Zoologico;

public abstract class Anfibio extends Animal {

	public Anfibio(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,String nombreAnimal) {
		super(peso, altura, extremidades, tieneHambre,nombreAnimal);
		}
		
public abstract Animal ponerHuevo();
}
