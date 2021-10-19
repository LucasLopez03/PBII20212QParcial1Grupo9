package ar.edu.unlam.pb2.Zoologico;

public class Rana extends Anfibio{

	private String colorDePiel;
	private static Edad edad;
   
	public Rana(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,String colorDePiel,String nombreAnimal, Edad edad) {
		super(peso, altura, extremidades, tieneHambre,nombreAnimal, edad);
		this.setColorDePiel(colorDePiel);
	}

	@Override
	public Animal ponerHuevo() {
		Rana nuevaRana=new Rana(10.0,5.0,4,true,"verde","rana", Edad.ADULTO);
		return nuevaRana;
		
	}

	@Override
	public void alimentar() {
		
			if (this.getTieneHambre()==true) {
				this.setTieneHambre(false);
			}
		
	}

	public String getColorDePiel() {
		return colorDePiel;
	}

	public void setColorDePiel(String colorDePiel) {
		this.colorDePiel = colorDePiel;
	}

}
