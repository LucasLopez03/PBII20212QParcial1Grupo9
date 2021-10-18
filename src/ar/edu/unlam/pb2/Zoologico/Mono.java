package ar.edu.unlam.pb2.Zoologico;

public class Mono extends Mamifero {
private Double largoDeCola;
private TipoDeMono tipoDeMono;
	public Mono(Double peso, Double altura, Integer extremidades, Boolean tieneHambre, String color,Double largoDeCola,TipoDeMono tipoMono,String nombreAnimal) {
		super(peso, altura, extremidades, tieneHambre, color,nombreAnimal);
	 	this.largoDeCola=largoDeCola;
	    this.tipoDeMono=tipoMono;
	} 

}
