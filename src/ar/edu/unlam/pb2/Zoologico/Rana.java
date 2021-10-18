package ar.edu.unlam.pb2.Zoologico;

public class Rana extends Anfibio{

	private String colorDePiel;
   
	public Rana(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,String colorDePiel,String nombreAnimal) {
		super(peso, altura, extremidades, tieneHambre,nombreAnimal);
		this.colorDePiel=colorDePiel;
	}

	@Override
	public Animal ponerHuevo() {
		Rana nuevaRana=new Rana(10.0,5.0,4,true,"verde","rana");
		return nuevaRana;
		
	}

	@Override
	public void alimentar() {
		
			if (this.getTieneHambre()==true) {
				this.setTieneHambre(false);
			}
		
	}

}
