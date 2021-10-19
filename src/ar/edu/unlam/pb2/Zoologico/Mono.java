package ar.edu.unlam.pb2.Zoologico;

public class Mono extends Mamifero {
private Double largoDeCola;
private TipoDeMono tipoDeMono;
private static Edad edad;

	public Mono(Double peso, Double altura, Integer extremidades, Boolean tieneHambre, String color,Double largoDeCola,TipoDeMono tipoMono,String nombreAnimal, Edad edad) {
		super(peso, altura, extremidades, tieneHambre, color,nombreAnimal, edad);
	 	this.setLargoDeCola(largoDeCola);
	    this.setTipoDeMono(tipoMono);
	}
	public Double getLargoDeCola() {
		return largoDeCola;
	}
	public void setLargoDeCola(Double largoDeCola) {
		this.largoDeCola = largoDeCola;
	}
	public TipoDeMono getTipoDeMono() {
		return tipoDeMono;
	}
	public void setTipoDeMono(TipoDeMono tipoDeMono) {
		this.tipoDeMono = tipoDeMono;
	}

}
