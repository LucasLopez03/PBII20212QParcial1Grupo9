package ar.edu.unlam.pb2.Zoologico;

public abstract class Mamifero extends Animal{

	private String color;
	
	public Mamifero(Double peso, Double altura, Integer extremidades, Boolean tieneHambre, String color) {
		super(peso, altura, extremidades, tieneHambre);
		this.color = color;
		}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void alimentar() {
		if (this.getTieneHambre()==true) {
			this.setTieneHambre(false);
		}
	}
	

}
