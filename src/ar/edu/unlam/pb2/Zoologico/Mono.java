package ar.edu.unlam.pb2.Zoologico;

public class Mono extends Mamifero {
private Double largoDeCola;
private TipoDeMono tipoDeMono;
	public Mono(Double peso, Double altura, Integer extremidades, Boolean tieneHambre, String color,Double largoDeCola,TipoDeMono tipoMono) {
		super(peso, altura, extremidades, tieneHambre, color);
	 	this.largoDeCola=largoDeCola;
	    this.tipoDeMono=tipoMono;
	}

}
