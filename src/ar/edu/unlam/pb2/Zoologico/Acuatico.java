package ar.edu.unlam.pb2.Zoologico;

public  abstract class Acuatico extends Animal{
    Boolean aletas;
    Boolean traqueas;
    Double largo;
    Integer edad;
	public Acuatico(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,Boolean aletas, Boolean traqueas,Double largo) {
		super(peso, altura, extremidades, tieneHambre);
		this.aletas=aletas;
		this.traqueas=traqueas;
	    this.largo=largo;
	    this.edad=0;
	}
	public Boolean getAletas() {
		return aletas;
	}
	public void setAletas(Boolean aletas) {
		this.aletas = aletas;
	}
	public Boolean getTraqueas() {
		return traqueas;
	}
	public void setTraqueas(Boolean traqueas) {
		this.traqueas = traqueas;
	}
	public Double getLargo() {
		return largo;
	}
	public void crecer(Double largo) {
		this.largo = largo;
	}
public void cumplirAños() {
	this.edad++;
}
}
