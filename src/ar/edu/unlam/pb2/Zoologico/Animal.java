package ar.edu.unlam.pb2.Zoologico;

public abstract class Animal {
	
	private Double peso;
	private String nombreDeanimal;
	private Double altura;
	private Integer extremidades;
	private Boolean tieneHambre;
    private ActividadesQueRealizan []listaDeActividades;
	public Animal(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,String nombreDeAnimal) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.extremidades = extremidades;
		this.tieneHambre= tieneHambre;
		this.listaDeActividades=new ActividadesQueRealizan[10];
	    this.nombreDeanimal=nombreDeAnimal;
	}
	
	public abstract  void  alimentar () ;
    public Boolean apreder(ActividadesQueRealizan nuevaActividad) {
    	Boolean agregado=false;
    	for (int i = 0; i < listaDeActividades.length; i++) {
			if(listaDeActividades[i]==null) {
				listaDeActividades[i]=nuevaActividad;
				agregado=true;
				break;
			}
		}
    	return agregado;
    };
	public String getNombreDeanimal() {
		return nombreDeanimal;
	}

	public void setNombreDeanimal(String nombreDeanimal) {
		this.nombreDeanimal = nombreDeanimal;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getExtremidades() {
		return extremidades;
	}

	public void setExtremidades(Integer extremidades) {
		this.extremidades = extremidades;
	}

	public Boolean getTieneHambre() {
		return tieneHambre;
	}

	public void setTieneHambre(Boolean tieneHambre) {
		this.tieneHambre = tieneHambre;
	}

}
