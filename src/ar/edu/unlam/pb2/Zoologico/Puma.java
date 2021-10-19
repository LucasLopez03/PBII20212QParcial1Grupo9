package ar.edu.unlam.pb2.Zoologico;

public class Puma extends Mamifero{
	
	private static Edad edad;


	public Puma(Double peso, Double altura, Integer extremidades, Boolean tieneHambre, String color,String nombreAnimal, Edad edad) {
		super(peso, altura, extremidades, tieneHambre, color,nombreAnimal, edad);
	}


}
