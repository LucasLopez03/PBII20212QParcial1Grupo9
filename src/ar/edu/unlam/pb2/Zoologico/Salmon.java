package ar.edu.unlam.pb2.Zoologico;

public class Salmon extends Acuatico{
	
	private static Edad edad;
	
	public Salmon(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,Boolean aletas, Boolean traqueas,Double largo,String nombreAnimal, Edad edad) {
		super(peso, altura, extremidades, tieneHambre, aletas, traqueas, largo, nombreAnimal, edad);
		
	}

	
	@Override
	public Animal ponerHuevo() {
		Salmon nuevoPez=new Salmon(10.0,5.0, 3, false, true, true, 30.0, "salmoncito", Edad.JOVEN);
		return nuevoPez;
		
	}

	@Override
	public void alimentar() {
		if (this.getTieneHambre()==true) {
			this.setTieneHambre(false);
		}	
	}
}
