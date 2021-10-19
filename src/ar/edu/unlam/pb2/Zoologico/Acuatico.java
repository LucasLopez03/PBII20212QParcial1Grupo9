package ar.edu.unlam.pb2.Zoologico;

public  abstract class Acuatico extends Animal{
    Boolean aletas;
    Boolean traqueas;
    Double largo;
	private static Edad edad;

	public Acuatico(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,Boolean aletas, Boolean traqueas,Double largo,String nombreAnimal, Edad edad) {
		super(peso, altura, extremidades, tieneHambre,nombreAnimal, edad);
		this.aletas=aletas;
		this.traqueas=traqueas;
	    this.largo=largo;
	}
	
	public abstract Animal ponerHuevo();
	
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
}
